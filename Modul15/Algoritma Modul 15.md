# Algoritma Modul 15
---
## 1. Algoritma dari program memakai for yang dapat menghitung tahanan (resistor) total dari N buah tahanan yang dimasukkan lewat keyboard
Sebelum tahanan total dihitung user ditanya oleh program apakah tahanan akan disusun seri ataukah paralel. Jika r1, r2, …., rN adalah tahanan yang dibaca komputer maka tahanan total (rt) dihitung dengan rumus:
- Jika tahanan disusun seri maka rt = r1 + r2 + . . . + rN
- Jika tahanan disusun paralel maka 1/rt = 1/r1 + . . . + 1/rN

1. Mulai
2. Meminta input user untuk N (banyaknya resistor)
3. Bertanya apakah disusun seri atau pararel
4. Masuk ke switch case rangkaian:
- case "seri":
for i kurang dari n{
meminta input user untuk tiap r; menambah nilai rt dengan rt + r;}
output memberitahu rt (rangkaian total)
- case "pararel"
for i kurang dari n{
meminta input user untuk tiap r; menambah nilai rt dengan rt + 1/r;}
menginisialisasi nilai rt = 1/rt
output memberitahu rt (rangkaian total)
5. Selesai

## 2. Algoritma dari program memakai perulangan for untuk menghitung beberapa nilai yang dihitung dari N buah data real (double) yang dimasukkan lewat keyboard
Beberapa nilai tersebut antara lain:
- a. Jumlah kuadrat data yakni $\Sigma x_i^2$
- b. Jumlah akar data yakni $\Sigma (\sqrt{x_i})$
- c. Jumlah 1/data untuk data yang tidak sama dengan nol yakni $\Sigma (1/x_i)$

## 3. Algoritma dan program yang dapat menampilkan deret Fibonacci sebanyak N suku memakai perulangan for

## 4. Algoritma dari program untuk menghitung nilai $y = a x^2 + b x + c$ untuk $x$ mulai dari $x1$ sampai dengan $x2$ dengan pertambahan 0.25 di mana $x1$ dan $x2$ adalah akar dari persamaan $a x^2 + b x + c = 0$
Nilai dari koefisien a, b dan c dimasukkan lewat keyboard. Nilai $y$ hanya dihitung apabila persamaan tersebut mempunyai dua akar yakni diskriminan (D) > 0.
