# Cerințe obligatorii

1. Pattern-urile implementate trebuie să respecte definiția din GoF discutată în cadrul cursurilor și laboratoarelor. Nu sunt acceptate variații sau implementări incomplete.

2. Pattern-ul trebuie implementat în totalitate corect pentru a fi luat în calcul.

3. Soluția nu trebuie să conțină erori de compilare.

4. Pattern-urile pot fi tratate distinct sau pot fi implementate pe același set de clase.

5. Implementările care nu au legătură funcțională cu cerințele din subiect nu vor fi luate în calcul. Preluarea unor exemple din alte surse nu va fi punctată.

6. Nu este permisă modificarea claselor primite.

7. Soluțiile vor fi verificate încrucișat folosind MOSS. Nu este permisă partajarea de cod între studenți. Soluțiile care au un grad de similitudine mai mare de 30% vor fi anulate.

---

# Cerințe obligatorii de Clean Code

Soluția este depunctată cu câte 2 puncte pentru fiecare cerință care nu este respectată. Se pot pierde maximum 8 puncte.

1. Pentru denumirea claselor, funcțiilor, testelor unitare, atributelor și variabilelor se respectă convenția de nume de tip Java Mixed CamelCase.

2. Pattern-urile și clasa ce conține metoda `main()` sunt definite în pachete distincte ce au forma:

```
cts.nume.prenume.gNrGrupa.denumire_pattern
cts.nume.prenume.gNrGrupa.main
```

Studenții din anul suplimentar vor utiliza `as` în loc de `gNrGrupa`.

3. Clasele și metodele sunt implementate respectând principiile KISS, DRY și SOLID (în special principiul DIP).

4. Denumirile de clase, metode, variabile și mesajele afișate la consolă trebuie să aibă legătură cu subiectul primit. Nu sunt acceptate denumiri generice. Funcțional, metodele vor afișa mesaje la consolă care să simuleze acțiunea cerută sau vor implementa prelucrări simple.

---

# Subiect

Se dezvoltă o aplicație software destinată unui magazin de pantofi.

---

# Cerință principală (7 puncte)

În cadrul aplicației de gestiune a unui magazin de pantofi, se dorește implementarea unui modul de creare personalizată de pantofi unicat. Clienții au posibilitatea de a-și parametriza pantofii în funcție de propriile nevoi și dorințe.

Fiecare cerere din partea clienților pentru o nouă pereche de pantofi trebuie să conțină obligatoriu următoarele informații:

- tipul pantofului (balerini, teniși, ghete, stiletto)
- numărul pantofului
- dimensiunea tocului
- tipul de material de bază

Suplimentar, clientul își poate parametriza cererea prin:

- alegerea unui set de materiale secundare care se pot atașa pe pantof
- definirea unei liste de mesaje text care vor fi printate pe încălțăminte

Magazinul nu permite ca cererile, odată lansate, să poată fi modificate în timp, întrucât acestea sunt trimise direct către procesul de producție.

---

# Restricții de implementare

- Numărul pantofului este o valoare întreagă cuprinsă între **35 și 45**.
- Dimensiunea tocului este o valoare numerică între **0.5 și 12.5**.
- Există restricții privind numărul de materiale suplimentare care pot fi folosite în funcție de tipul pantofului (se va defini cel puțin o restricție).
- Dimensiunea listei formate din mesajele text printate pe pantof, precum și dimensiunea fiecărui mesaj, depind de numărul pantofului. Suma lungimilor tuturor mesajelor din listă trebuie să fie **mai mică decât numărul pantofului**.
- Orice încălcare a restricțiilor de implementare trebuie să conducă la aruncarea unei **excepții custom**, însoțită de un mesaj corespunzător situației respective.

---

# Testarea soluției (3 puncte)

Soluția trebuie testată prin lansarea unui număr de **cel puțin 5 cereri de pantofi**, respectând următoarele condiții:

- cel puțin o cerere trebuie să încalce una dintre restricțiile definite
- cel puțin o cerere trebuie să conțină o listă de materiale suplimentare
- cel puțin o cerere trebuie să conțină o listă de mesaje text ce urmează a fi printate pe pantof
