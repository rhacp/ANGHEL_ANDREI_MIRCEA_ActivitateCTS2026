# B. Restaurant

## B.1 Crearea obiectelor din familia supelor

Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci, supă de vită etc.

Se cere implementarea unui modul care permite realizarea de obiecte din familia supelor.  
Tipurile de supă sunt reținute în cadrul unui `enum`.

---

## B.2 Crearea rezervărilor cu opțiuni suplimentare

Atunci când un client face o rezervare poate alege una dintre următoarele opțiuni:

- așezare la geam
- scaune ergonomice
- decorarea mesei
- muzică ambientală personalizată
- gen muzical

În cazul în care clientul nu specifică vreun element dintre acestea, opțiunea respectivă este setată implicit pe `false`.

Se cere implementarea unui modul care permite crearea de obiecte de tip **rezervare** cu aceste opțiuni extra.

---

## B.3 Crearea obiectelor din familia felurilor de mâncare

Restaurantul servește mai multe tipuri de supe:

- supă de legume
- supă de ciuperci
- supă de vită

De asemenea, restaurantul servește mai multe tipuri de desert:

- papanași
- clătite
- cheesecake

Se cere implementarea unui modul care permite realizarea de obiecte din familia **felurilor de mâncare**, împărțite pe două categorii:

- supe
- deserturi

---

## B.4 Reutilizarea datelor despre clienți

Restaurantul dorește să implementeze un modul în cadrul aplicației astfel încât, dacă un client a mai fost la restaurant și revine pentru a realiza o rezervare, să nu fie necesară reconstruirea unui cont pentru acel client.

Construirea unui nou obiect pentru client durează foarte mult și necesită introducerea mai multor date.

Se cere implementarea unui modul care permite reutilizarea datelor deja existente despre client.

---

## B.5 Compatibilitatea între două sisteme software

Restaurantul achiziționează un nou soft pentru gestionarea comenzilor de la bar. Acest soft nu este compatibil cu softul existent de printare a facturilor utilizat pentru produsele din bucătărie.

Vechiul soft era compatibil deoarece ambele aplicații au fost realizate de aceeași echipă.

Se cere implementarea unui **nivel intermediar** prin care noul soft să poată fi utilizat împreună cu softul existent, fără a modifica codul din niciuna dintre aplicații.

---

## B.6 Simplificarea procesului de verificare a mesei

În momentul în care un client vine la restaurant pentru a ocupa o masă, recepționistul trebuie să verifice:

- dacă există o masă liberă
- dacă masa a fost debarasată după plecarea ultimului client
- dacă au fost puse șervețele noi pe masă

Managerul restaurantului dorește realizarea unui modul care să simplifice munca recepționistului, astfel încât acesta să nu mai fie nevoit să verifice toate aceste lucruri separat, ci doar într-un singur loc.

---

## B.7 Extinderea funcționalității pentru nota de plată

Cu ocazia sărbătorilor de sfârșit de an, managerul restaurantului dorește ca atunci când este printată o notă de plată să fie printată și o felicitare de „La mulți ani” pentru client.

Se cere implementarea unei soluții prin care această funcționalitate să fie adăugată clasei **NotaDePlata** la momentul printării.

---

## B.8 Reprezentarea meniului restaurantului

Se dorește reprezentarea meniului în cadrul aplicației.

Meniul conține:

- **secțiuni** (startere, băuturi, desert etc.)
- fiecare secțiune poate conține:
    - **subsecțiuni** (sucuri, cafea etc.)
    - **item-uri individuale** (apă plată, apă minerală etc.)

Se cere realizarea unui modul care permite reprezentarea **arborescentă** a meniului restaurantului.

---

## B.9 Condiționarea rezervărilor

Managerul restaurantului dorește ca rezervările să fie permise doar dacă acestea sunt realizate pentru **minimum 4 persoane**.

În caz contrar, rezervarea nu este realizată, iar persoanele sunt rugate să se prezinte direct la restaurant, deoarece există suficiente locuri pentru mesele de două persoane.

Se cere realizarea unui **nivel intermediar** care să condiționeze realizarea rezervărilor în funcție de numărul de persoane.

---

## B.10 Optimizarea memoriei pentru rezervări

Pentru fiecare rezervare trebuie să se rețină:

### Informații despre client
- nume
- număr de telefon
- adresă de e-mail

### Informații despre masa rezervată
- număr masă
- număr persoane
- ora rezervării

Dacă un client realizează mai multe rezervări, informațiile despre client se repetă de fiecare dată, ocupând multă memorie.

Se cere implementarea unui modul de memorare a rezervărilor astfel încât consumul de memorie să fie optimizat.

---

## B.11 Modul de plată

Se dorește implementarea unui modul de plată pentru clienții restaurantului.

Modul de plată este ales de client în momentul efectuării plății. Plata se poate realiza:

- cu cardul
- cash

Se cere implementarea modulului de plată al restaurantului.

---

## B.12 Notificarea clienților fideli

Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte.

Se cere implementarea unui modul care, atunci când apare o ofertă de preț sau este introdus un nou meniu, să trimită notificări tuturor clienților abonați la notificările restaurantului.

---

## B.13 Gestionarea stării meselor

Restaurantul dorește implementarea unui modul pentru gestionarea stării meselor.

O masă poate avea una dintre următoarele stări:

- Rezervată
- Ocupată
- Liberă

Tranzițiile sunt următoarele:

- când un client face o rezervare → masa devine **Rezervată**
- când clientul ajunge și ocupă masa → masa devine **Ocupată**
- când clientul pleacă → masa devine **Liberă**

---

## B.14 Ocuparea unei mese

Procesul de ocupare a unei mese în restaurant presupune următorii pași:

1. Se curăță masa
2. Se așază șervetele
3. Se așază tacâmurile
4. Clienții sunt invitați să se așeze la masă

Se cere implementarea unui modul care să realizeze acest proces în aplicație.

---

## B.15 Modul de comenzi pentru mese

Managerul restaurantului dorește ca rezervarea sau ocuparea meselor să se realizeze prin intermediul unui modul de comenzi conținut în clasa **Operator**.

Se cere implementarea acestui modul care permite trimiterea de comenzi către mese.

---

## B.16 Trimiterea notificărilor către clienți

Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte.

Pentru unii clienți există în baza de date **numărul de telefon**, iar pentru alții există doar **adresa de e-mail**.

Se cere implementarea unei funcționalități de notificare astfel încât:

- dacă există număr de telefon → notificarea se trimite prin **SMS**
- dacă nu există număr de telefon dar există e-mail → notificarea se trimite prin **e-mail**
- dacă nu există nici număr de telefon, nici e-mail → managerul restaurantului primește o notificare cu numele clientului pentru care nu există date de contact

---

# Design Patterns utilizate

| Cerință | Design Pattern |
|--------|---------------|
| B.1 | Factory Method / Simple Factory |
| B.2 | Builder |
| B.3 | Abstract Factory |
| B.4 | Prototype |
| B.5 | Adapter |
| B.6 | Facade |
| B.7 | Decorator |
| B.8 | Composite |
| B.9 | Proxy |
| B.10 | Flyweight |
| B.11 | Strategy |
| B.12 | Observer |
| B.13 | State |
| B.14 | Template Method |
| B.15 | Command |
| B.16 | Chain of Responsibility |
