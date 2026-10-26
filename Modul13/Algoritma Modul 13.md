# Algoritma Praktikum Modul 13
---
## 1. Algoritma dari program yang dapat menampilkan daftar harga bensin dari 1 liter sampai dengan 20 liter

1. Mulai
2. Menampilkan harga per liter
3. Menampilkan tabel jumlah liter dan harganya (Rp)
4. Mendeklarasikan variabel jumlah liter dan harga sama dengan 0
5. Melakukan looping while (perulangan akan dihentikan sampai jumlahLiter kurang dari sama dengan 20)

`while (jumlahLiter <=20){
  harga = harga + 6500;
  System.out.println(jumlahLiter+" "+harga);
  jumlahLiter++;}`

6. Selesai

## 2. Algoritma dari program untuk menghitung rata-rata dari N buah bilangan real yang dimasukkan lewat keyboard dengan input dan output

1. Mulai
2. Meminta user untuk memasukkan input berapa banyak data yang akan diproses dan disimpan di variabel N
3. Meminta user untuk memasukkan input berapa nilai per data dari berapa N dan disimpan di variabel data (di dalam looping)
4. Menghitung rata-rata dari data tersebut dengan menambah nilai per data dan dibagi dengan N
5. Menampilkan hasil perhitungan
6. Selesai

## 3. Algoritma dari program untuk menampilkan tabel konversi suhu dari satuan Celcius ke satuan Reamur dan Fahrenheit. Data input (nilai Celcius) ditentukan berdasarkan batas minimum dan maksimum serta selisih kenaikannya. Menggunakan rumus R = 4/5 C dan F = 9/5 C + 32

1. Mulai
2. Menampilkan bahwa program ini adalah tabel konversi Celcius ke Reamur dan Fahrenheit
3. Meminta user untuk memasukkan input nilai suhu minimum
4. Meminta user untuk memasukkan input nilai suhu minimum
5. Meminta user untuk memasukkan input selisih kenaikan
6. Menampilkan tabel celcius reamur dan fahrenheit
7. Melakukan looping while

`celcius = minimum;
  while (celcius <= maksimum){
  reamur = 4/5 * celcius;
  fahrenheit = 9/5 * celcius + 32;
  System.out.println(celcius+""+reamur+""+fahrenheit);
  celcius = celcius + selisih;
}`

8. Selesai

## 4. Algoritma dari program untuk menampilkan tabel seperti di atas tetapi data input (sebanyak 10) diketik / dimasukkan oleh user

1. Mulai
2. Melakukan looping while untuk meminta user memasukkan input suhu Celcius dan langsung mengkonversikan ke Reamur dan Fahrenheit

`int n=1
  while (n<=10){
  System.out.println("Masukkan suhu Celcius ke-"+1);
  c = input.nextDouble();
  r = 4/5 * c;
  f = 9/5 * c + 32;
  System.out.println("Hasil konversi Reamur:"+r);
  System.out.println("Hasil konversi Fahrenheit:"+f);
  n++;
}`

3. Selesai

## 5. Algoritma dari program yang dapat merekam N buah berat mangga dalam gram. 

### Program menghitung jumlah buah yang masuk ke dalam 3 kategori yakni kecil, sedang dan besar dengan ketentuan sbb:
- Kecil < 200 gr
- 200 gr <= Sedang < 600 gr
- Besar >= 600 gr

1. Mulai
2. Meminta user untuk memasukkan input untuk nilai N
3. Melakukan loop while

`while (i<=N){
  System.out.print("Berat mangga "+i+": ");
  berat = sc.nextInt();
  if (berat < 200){
    kecil++;
    }
  else if (200 <= berat && berat < 600){
    sedang++;
    }
  else if (berat >= 600){
    besar++;
    }
  i++;
}`

4. Menampilkan berapa banyak mangga yang ditimbang
5. Menampilkan berapa banyak mangga tiap kategori (kecil/sedang/besar)
6. Selesai