# A. Spital

## A.1 Creare obiect Pacient cu facilități extra

Atunci când un pacient este internat în cadrul aplicației, acesta este salvat în sistem.

Fiecare pacient poate plăti extra pentru anumite facilități:

- pat rabatabil
- mic dejun inclus
- papuci de cameră
- halat pentru interior

Dacă pacientul nu alege aceste facilități extra, ele vor fi setate implicit cu valoarea **false**.

Se cere dezvoltarea modulului care permite **crearea obiectelor de tip Pacient cu opțiuni extra**.

---

## A.2 Creare obiecte PersonalSpital în funcție de tip

Personalul spitalului poate fi de mai multe tipuri, definite într-un `enum`:

```
{ Brancardier, Asistent, Medic }
```

Se cere implementarea unui modul care permite **crearea de obiecte din familia PersonalSpital în funcție de tipul primit ca parametru**.

---

## A.3 Creare personal medical și non-medical

Personalul spitalului poate fi:

- Brancardier
- Asistent
- Medic
- Secretar
- Registrator

Acesta este împărțit în două categorii:

- **Personal medical**
- **Personal non-medical**

Se cere implementarea modulului care permite **crearea obiectelor PersonalSpital în funcție de categoria din care fac parte**.

---

## A.4 Crearea rețetelor pentru medicamente

Spitalul deține un laborator unde chimiștii produc rețete pentru medicamente.

La crearea unei rețete trebuie ținut cont de **cantitățile soluțiilor utilizate**.

Dacă o rețetă a fost deja creată, este recomandat să fie reutilizată pentru medicamente viitoare **fără a recrea rețeta prin constructor**.

Se cere implementarea modulului care permite **crearea de obiecte rețetă fără apelarea constructorului**.

---

## A.5 Integrarea sistemului farmaciei

Spitalul are un magazin pentru medicamente și o aplicație pentru cumpărarea medicamentelor pe bază de rețetă.

Spitalul încheie un contract cu o farmacie externă și dorește integrarea sistemelor.

### Aplicația spitalului

Clasa `Medicament` are metodele:

- `achizitioneazaMedicament()`
- `prezintaReteta()`

Metoda `prezintaReteta()` este apelată în `achizitioneazaMedicament()` pentru verificarea rețetei.

### Aplicația farmaciei

Clasa `Medicament` conține metoda:

- `cumparaMedicament()`

În acest caz **nu se verifică rețeta**, deoarece farmacia poate vinde medicamente și fără rețetă.

Se cere implementarea **integrării între cele două sisteme**.

---

## A.6 Verificarea condițiilor pentru internare

Pentru internarea unui pacient trebuie realizate următoarele verificări:

1. Gravitatea stării pacientului (clasa `Pacient`)
2. Confirmarea medicului
3. Disponibilitatea unui pat în salon (clasa `Salon`, care conține lista paturilor)

Spitalul dorește un modul care să **realizeze aceste verificări automat**, fără ca personalul să le facă manual.

---

## A.7 Rezultate medicale online

Spitalul dorește să testeze furnizarea rezultatelor:

- online prin platformă
- printate (varianta actuală)

Există riscul revenirii la varianta inițială.

Se cere implementarea unui modul care permite **adăugarea noii funcționalități și revenirea la varianta inițială**.

---

## A.8 Structura departamentelor

Se dorește reprezentarea departamentelor spitalului.

Structura este ierarhică:

- Departamente
    - Subdepartamente
    - Secții

**Secțiile nu pot conține subsecții.**

Se cere implementarea modulului care permite **reprezentarea arborescentă a structurii spitalului**.

---

## A.9 Internare doar pentru pacienți asigurați

Din cauza supraaglomerării, spitalul acceptă internări **doar pentru persoanele cu asigurare de sănătate**.

Se cere implementarea unui **nivel intermediar care permite internarea doar pentru aceste persoane**.

---

## A.10 Optimizarea memoriei pentru internări

Pentru fiecare internare se salvează:

### Informații despre pacient

- nume
- număr telefon
- adresă
- etc.

### Informații despre internare

- număr salon
- număr pat
- număr zile spitalizare
- etc.

Dacă un pacient este internat de mai multe ori, **datele pacientului se repetă și consumă multă memorie**.

Se cere implementarea unui modul care **reduce consumul de memorie pentru internări**.

---

## A.11 Modul de plată

Pacienții pot plăti internarea folosind unul dintre următoarele moduri:

- Card
- Cash

Modul de plată este ales **în momentul efectuării plății**.

Se cere implementarea modulului de plată.

---

## A.12 Sistem de notificări pentru epidemii

Spitalul dorește să anunțe pacienții atunci când apare:

- o epidemie
- un virus nou

Se cere implementarea unui modul care **trimite notificări tuturor persoanelor abonate la notificările spitalului**.

---

## A.13 Gestionarea stărilor pacientului

Un pacient poate avea una dintre următoarele stări:

- Internat
- SubObservatie
- Externat

Fluxul este următorul:

1. Pacientul este adus la spital → Internat
2. Dacă starea este gravă → SubObservatie
3. După vindecare → Externat

Se cere implementarea modulului pentru **gestionarea stărilor pacientului**.

---

## A.14 Procesul de internare

Internarea unui pacient presupune următorii pași:

1. Analizarea dificultății stării pacientului
2. Verificarea disponibilității saloanelor
3. Emiterea fișei de internare

Se cere implementarea modulului care realizează **internarea pacienților conform acestui flux**.

---

## A.15 Sistem de comenzi pentru triaj

Managerul spitalului dorește să accelereze procesul de la **primiri urgențe**.

Operatorul de la triaj:

- decide internarea sau tratamentul imediat
- trimite comenzi către medici
- poate continua primirea altor pacienți rapid

Se cere implementarea modulului care permite **trimiterea comenzilor către medici de către operatorul de primire**.

---

---

## Design Patterns utilizate

| Cerinta | Design Pattern |
|--------|---------------|
| A.1 | Builder |
| A.2 | Simple Factory |
| A.3 | Abstract Factory |
| A.4 | Prototype |
| A.5 | Adapter |
| A.6 | Facade |
| A.7 | Decorator |
| A.8 | Composite |
| A.9 | Proxy |
| A.10 | Flyweight |
| A.11 | Strategy |
| A.12 | Observer |
| A.13 | State |
| A.14 | Template Method |
| A.15 | Command |