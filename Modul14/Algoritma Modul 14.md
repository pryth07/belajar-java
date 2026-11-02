# Algoritma Modul 14
---
## 2. Algoritma dari program untuk menentukan nilai final (berupa huruf) mahasiswa berdasarkan nilai uts1, uts2 dan uas yang dimasukkan lewat keyboard
Nilai total dihitung memakai rumus nilai total = 30 % x uts1 + 30 % x uts2 + 40 % x uas. Sedang nilai final ditentukan berdasarkan kriteria berikut:
- A : nilai total ≥ 80
- B : 65 ≤ nilai total < 80
- C : 55 ≤ nilai total < 65
- D :50 ≤ nilai total < 55
- E : nilai total < 50

Karena nilai tidak mungkin negatif maka program harus memastikan bahwa nilai dimasukkan user terjamin benar dengan cara user meminta memasukkan lagi bila data nilainya masih negatif. Hal ini harus diimplementasikan memakai perintah do-while.

1. Mulai
2. Di dalam perulangan do while, program meminta user untuk memasukkan nilai UTS 1 selama nilai UTS 1 kurang dari 0
3. Di dalam perulangan do while, program meminta user untuk memasukkan nilai UTS 2 selama nilai UTS 2 kurang dari 0
4. Di dalam perulangan do while, program meminta user untuk memasukkan nilai UAS selama nilai UAS kurang dari 0
5. Menghitung nilai total dengan rumus (30 % x uts1) + (30 % x uts2) + (40 % x uas)
6. Melakukan percabangan:
- Jika total lebih dari sama dengan 80, maka menampilkan nilai final berupa A
- Jika tidak, jika total lebih dari sama dengan 65 dan kurang dari 80, maka menampilkan nilai final berupa B
- Jika tidak, jika total lebih dari sama dengan 55 dan kurang dari 65, maka menampilkan nilai final berupa C
- Jika tidak, jika total lebih dari sama dengan 50 dan kurang dari 55, maka menampilkan nilai final berupa D
- Jika tidak, jika total kurang dari 50, maka menampilkan nilai final berupa E
7. Selesai

## 3. Algoritma dari program yang dapat menentukan jumlah setiap jenis kualitas mangga berdasarkan beratnya. Ada 3 jenis kualitas mangga yakni ‘BIASA’, ‘BAGUS’ dan ‘UNGGUL’. 
Berdasarkan berat tersebut program menentukan ada berapa mangga yang berkualitas BIASA, BAGUS dan UNGGUL memakai ketentuan berikut:
- BIASA : berat kurang dari 500 gram
- BAGUS : berat lebih besar atau sama dengan 500 gram tetapi kurang dari 750 gram
- UNGGUL : berat lebih dari 750 gram.

Karena berat mangga harus positif (>0) maka program harus membuat perintah untuk mengulang pemasukan berat mangga apabila berat yang dimasukkan user masih belum positif memakai perintah do-while.

1. Mulai
2. Di dalam perulangan do while, program meminta user untuk memasukkan n (banyak mangga yang akan diproses) selama n kurang dari sama dengan 0
3. Di dalam perulangan while, program melakukan perulangan do while lagi untuk meminta user memasukkan berat mangga sebanyak n kali dan akan mengulangi terus jika input user masih kurang dari sama dengan 0 menggunakan percabangan if-else.
4. Jika input user atas berat mangga sudah lebih dari 0, melakukan percabangan if-else untuk menentukan kualitas mangga:
- Jika berat kurang dari 500, maka memasukkan mangga tersebut ke kategori biasa
- Jika tidak, jika berat lebih dari sama dengan 500 dan kurang dari 750, maka memasukkan mangga tersebut ke kategori bagus
- Jika tidak, jika berat lebih dari sama dengan 750, maka memasukkan mangga tersebut ke kategori unggul
5. Menampilkan jumlah mangga dengan kategori biasa, bagus, dan unggul
6. Selesai

## 4. Pseudocode dari modifikasi terhadap program menghitung rata-rata dalam praktikum sebelumnya sedemikian rupa menjadi program statistic sederhana. Dalam program statistik sederhana tersebut program harus mampu membaca sejumlah (misalnya N buah) data real (double) dari keyboard. Kemudian program menampilkan hitungan statistic dari data tersebut yang meliputi data terbesar, data terkecil, rentang data, rata-rata, variansi dan deviasi standard. 

1. Mulai
2. Input N (banyak data yang akan diolah)
3. 