# Algoritma Modul 15
---
## 1. Algoritma dari program memakai for yang dapat menghitung tahanan (resistor) total dari N buah tahanan yang dimasukkan lewat keyboard
Sebelum tahanan total dihitung user ditanya oleh program apakah tahanan akan disusun seri ataukah paralel. Jika r1, r2, …., rN adalah tahanan yang dibaca komputer maka tahanan total (rt) dihitung dengan rumus:
- Jika tahanan disusun seri maka rt = r1 + r2 + . . . + rN
- Jika tahanan disusun paralel maka 1/rt = 1/r1 + . . . + 1/rN

1. Mulai
2. Deklarasi variabel:
- r (resistor) dan n (banyaknya resistor) bertipe integer
- rt (rangkaian total) bertipe double
- rangkaian bertipe String
- inputValid (bersifat false bertipe boolean
3. Meminta input user untuk n
4. Bertanya apakah disusun seri atau pararel
5. Masuk ke switch case rangkaian:
- case "seri":
for i kurang dari n{
meminta input user untuk tiap r; menambah nilai rt dengan rt + r;}
output memberitahu rt (rangkaian total)
- case "pararel":
for i kurang dari n{
meminta input user untuk tiap r; menambah nilai rt dengan rt + 1/r;}
menginisialisasi nilai rt = 1/rt
output memberitahu rt (rangkaian total)
6. Selesai

## 2. Algoritma dari program memakai perulangan for untuk menghitung beberapa nilai yang dihitung dari N buah data real (double) yang dimasukkan lewat keyboard
Beberapa nilai tersebut antara lain:
- a. Jumlah kuadrat data yakni $\Sigma x_i^2$
- b. Jumlah akar data yakni $\Sigma (\sqrt{x_i})$
- c. Jumlah 1/data untuk data yang tidak sama dengan nol yakni $\Sigma (1/x_i)$

1. Mulai
2. Deklarasi variabel:
- n bertipe integer
- data, kuadrat, akar, dan jumlah bertipe double
3. Meminta user untuk input n (berapa nilai yang akan dihitung)
4. Di dalam perulangan for (i=1; i<=n; i++){
meminta user untuk input data sebanyak N kali;
menghitung kuadrat += $data^2$;
menghitung akar += $\sqrt{data}$;
melakukan pengecekan if (data!=0){ data=1/data; jumlah +=data;}}
5. Menampilkan output untuk soal a, b, dan c

## 3. Algoritma dan program yang dapat menampilkan deret Fibonacci sebanyak N suku memakai perulangan for

1. Mulai
2. Deklarasi variabel n, n1, n2, dan jumlah bertipe integer
3. Di dalam perulangan do while, meminta user untuk memasukkan n, diulangi selama n<=0
4. Di dalam perulangan for (i=0; i<n; i++){
menampilkan nilai n1;
menambah jumlah = n1+n2;
n1=n2;
n2=jumlah;}
5. Selesai

## 4. Algoritma dari program untuk menghitung nilai $y = a x^2 + b x + c$ untuk $x$ mulai dari $x1$ sampai dengan $x2$ dengan pertambahan 0.25 di mana $x1$ dan $x2$ adalah akar dari persamaan $a x^2 + b x + c = 0$
Nilai dari koefisien a, b dan c dimasukkan lewat keyboard. Nilai $y$ hanya dihitung apabila persamaan tersebut mempunyai dua akar yakni diskriminan (D) > 0.

1. Mulai
2. Deklarasi variabel y, a, b, c, d, x1, x2, akar1, akar2 bertipe double
3. Meminta user untuk input nilai a, b, dan c
4. Menghitung D dengan rumus $D = b^2 - 4ac$
5. Masuk ke percabangan if else:
- Jika d>0, maka menghitung akar-akar dari persamaan $y = a x^2 + b x + c$ dengan rumus $x = \frac{-b \pm \sqrt{D}}{2a}$, lalu menampilkan tabel output seperti contoh. Selanjutnya masuk ke perulangan for (x=x1; jika x<=x2, menambah nilai x sebesar 0.25){menghitung $y = a x^2 + b x + c$; menampilkan tabel yang menunjukkan nilai $x$ dan $y$
- Jika tidak, menampilkan pesan bahwa D tidak lebih dari 0
6. Selesai