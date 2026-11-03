# Algoritma Modul 14
---
## 2. Algoritma dari program untuk menentukan nilai final (berupa huruf) mahasiswa berdasarkan nilai uts1, uts2 dan uas yang dimasukkan lewat keyboard
Nilai total dihitung memakai rumus nilai total = 30% * uts1 + 30% * uts2 + 40% * uas. Dengan nilai final ditentukan berdasarkan kriteria berikut:
- A : nilai total ≥ 80
- B : 65 ≤ nilai total < 80
- C : 55 ≤ nilai total < 65
- D : 50 ≤ nilai total < 55
- E : nilai total < 50

Karena nilai tidak mungkin negatif maka program harus memastikan bahwa nilai dimasukkan user terjamin benar dengan cara user meminta memasukkan lagi bila data nilainya masih negatif. Hal ini harus diimplementasikan memakai perintah do-while.

1. Mulai
2. Deklarasi variabel:
- uts1, uts2, dan uas bertipe integer
- total bertipe double
3. Di dalam perulangan do while, program meminta user untuk memasukkan nilai UTS 1, diulang selama nilai UTS 1 kurang dari 0
4. Di dalam perulangan do while, program meminta user untuk memasukkan nilai UTS 2, diulang selama nilai UTS 2 kurang dari 0
5. Di dalam perulangan do while, program meminta user untuk memasukkan nilai UAS, diulang selama nilai UAS kurang dari 0
6. Menghitung nilai total dengan rumus (30% * uts1) + (30% * uts2) + (40% * uas)
7. Melakukan percabangan:
- Jika total lebih dari sama dengan 80, maka menampilkan nilai final berupa A
- Jika tidak, jika total lebih dari sama dengan 65 dan kurang dari 80, maka menampilkan nilai final berupa B
- Jika tidak, jika total lebih dari sama dengan 55 dan kurang dari 65, maka menampilkan nilai final berupa C
- Jika tidak, jika total lebih dari sama dengan 50 dan kurang dari 55, maka menampilkan nilai final berupa D
- Jika tidak, maka menampilkan nilai final berupa E
8. Selesai

## 3. Algoritma dari program yang dapat menentukan jumlah setiap jenis kualitas mangga berdasarkan beratnya
Ada 3 jenis kualitas mangga yakni ‘BIASA’, ‘BAGUS’ dan ‘UNGGUL’. 
Berdasarkan berat tersebut program menentukan ada berapa mangga yang berkualitas BIASA, BAGUS dan UNGGUL memakai ketentuan berikut:
- BIASA : berat kurang dari 500 gram
- BAGUS : berat lebih besar atau sama dengan 500 gram tetapi kurang dari 750 gram
- UNGGUL : berat lebih dari sama dengan 750 gram.

Karena berat mangga harus positif (>0) maka program harus membuat perintah untuk mengulang pemasukan berat mangga apabila berat yang dimasukkan user masih belum positif memakai perintah do-while.

1. Mulai
2. Deklarasi variabel n, i, berat, biasa, bagus, dan unggul bertipe integer
3. Di dalam perulangan do while, program meminta user untuk memasukkan n (banyak mangga yang akan diproses) selama n kurang dari sama dengan 0
4. Di dalam perulangan while, program melakukan perulangan do while lagi untuk meminta user memasukkan berat mangga sebanyak n kali dan akan mengulangi terus jika input user masih kurang dari sama dengan 0 menggunakan percabangan if-else.
5. Jika input user atas berat mangga sudah lebih dari 0, melakukan percabangan if-else untuk menentukan kualitas mangga:
- Jika berat kurang dari 500, maka memasukkan mangga tersebut ke kategori biasa
- Jika tidak, jika berat lebih dari sama dengan 500 dan kurang dari 750, maka memasukkan mangga tersebut ke kategori bagus
- Jika tidak, jika berat lebih dari sama dengan 750, maka memasukkan mangga tersebut ke kategori unggul
6. Menampilkan jumlah mangga dengan kategori biasa, bagus, dan unggul
7. Selesai

## 4. Algoritma dari modifikasi terhadap program menghitung rata-rata dalam praktikum sebelumnya sedemikian rupa menjadi program statistic sederhana
Dalam program statistik sederhana tersebut program harus mampu membaca sejumlah (misalnya N buah) data real (double) dari keyboard. Kemudian program menampilkan hitungan statistic dari data tersebut yang meliputi data terbesar, data terkecil, rentang data, rata-rata, variansi dan deviasi standard. 

1. Mulai
2. Deklarasi variabel:
- i, N, data, jumlah, max, min, dan rentang bertipe integer
- rataRata, variansi, deviansi, jumlahKuadrat bertipe double
3. Input N (banyak data yang akan diolah)
4. Loop while i kurang dari sama dengan N{
input data;
deklarasi jumlahKuadrat = jumlahKuadrat + data$^2$;
deklarasi jumlah = jumlah + data;
melakukan percabangan:
- jika i sama dengan 1, maka max=data
- jika tidak, jika data lebih dari max, maka max=data;
melakukan percabangan:
- jika i sama dengan 1, maka min=data
- jika tidak, jika data kurang dari min, maka min=data;
increment nilai i sebesar 1}
5. Menghitung rataRata = jumlah/N
6. Menghitung rentang = max-min
7. Menghitung variansi = (jumlahKuadrat-N*(rataRata*2))/N
8. Menghitung deviasi = akar kuadrat dari variansi
9. Selesai