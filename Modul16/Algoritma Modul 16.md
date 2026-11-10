# Algoritma Modul 16
---
## 1. Algoritma dari program yang dapat menampilkan matrik identitas $N \times N$ yakni $N_{baris}$ dan $N_{kolom}$ di mana $N$ dimasukkan lewat keyboard. Matrik identitas adalah matrik yang semua elemennya berupa bilangan nol $(0)$ kecuali elemen diagonal utama yang bernilai $1$. Dengan kata lain jika $a_{ij}$ adalah elemen baris ke $i$ dan kolom ke $j$ matrik maka $a_{ij} = 0$ untuk $i \ne j$ dan $a_{ij} = 0$ bila $i = j$
1. Mulai
2. Deklarasi variabel n bertipe integer
3. Meminta user untuk input n
4. Melakukan perulangan

       for i<=n{
        melakukan perulangan for j<=n{
        jika i==j, maka tampilkan 1;
        jika tidak, maka tampilkan 0}
        tampilkan spasi}
5. Selesai

## 2. Algoritma dari program yang dapat menampilkan diagram batang mendatar dari data usia penduduk yang berjumlah $N$ di mana usia dan $N$ dimasukkan lewat keyboard
1. Mulai
2. Deklarasi variabel:
- n, usia, a, b, c, d, e bertipe integer
- diagram = "*" bertipe String
3. Melakukan perulangan do while untuk meminta user input n (jumlah penduduk) dan diulangi selama n masih kurang dari sama dengan 0
4. Melakukan perulangan

        for i<=n{
          do while{
            meminta input usia warga sebanyak n kali;
          } diulangi selama usia kurang dari 0
        jika usia lebih dari sama dengan 0 dan kurang dari sama dengan 20, maka tambah nilai variabel a sebesar 1;
        jika tidak, jika usia lebih dari sama dengan 21 dan kurang dari sama dengan 40, maka tambah nilai variabel b sebesar 1;
        jika tidak, jika usia lebih dari sama dengan 41 dan kurang dari sama dengan 60, maka tambah nilai variabel c sebesar 1;
        jika tidak, jika usia lebih dari sama dengan 61 dan kurang dari sama dengan 80, maka tambah nilai variabel d sebesar 1;
        jika tidak, maka tambah nilai variabel e sebesar 1;}
5. Menampilkan diagram batang:
- 0-20 = (mengulangi print variabel diagram sebanyak a kali)
- 21-40 = (mengulangi print variabel diagram sebanyak b kali)
- 41-60 = (mengulangi print variabel diagram sebanyak c kali)
- 61-80 = (mengulangi print variabel diagram sebanyak d kali)
- 81-100 = (mengulangi print variabel diagram sebanyak e kali)
6. Selesai

## 3. Algoritma dari program stop watch yang dapat menampilkan waktu yang berhenti ketika mencapai jam 12
1. Mulai
2. Melakukan perulangan

          for h<=12{
            for m<=60{
            tampilkan "Detik: "
              for s<=60{
              tampilkan s + spasi;
              }
            tampilkan spasi;
            tampilkan "Menit: "+m;
            }
          tampilkan "Jam: "+h;
          }
3. Selesai

## 4. Algoritma dari program paket statistik usia sederhana
1. Mulai
2. Deklarasi variabel:
- n=0, usia, input, jumlah=0, a=0, b=0, c=0, d=0, e=0 bertipe integer
- rataRata=0, variansi, deviasi, jumlahKuadrat=0 bertipe double
- diagram = "*" bertipe String
3. Melakukan perulangan

       do while{
        tampilkan menu(
        1. masukan data usia
        2. rata rata
        3. deviasi standard
        4. diagram batang
        5. keluar)
        menyimpan input user ke variabel input

        melakukan switch input:
        case 1:{
        do while{
          meminta user untuk input n (jumlah data yang ingin dihitung)
          }
        } diulangi selama n<=0
        do while{
          for i<=n{
            do while{
              meminta user untuk input usia warga sebanyak n kali
            } selama usia<0
            menghitung jumlah dengan menambah jumlah dengan usia tiap n;
            menghitung jumlahKuadrat dengan menambah jumlahKuadrat dengan usia^2;
            jika usia lebih dari sama dengan 0 dan kurang dari sama dengan 20, maka tambah nilai variabel a sebesar 1;
            jika tidak, jika usia lebih dari sama dengan 21 dan kurang dari sama dengan 40, maka tambah nilai variabel b sebesar 1;
            jika tidak, jika usia lebih dari sama dengan 41 dan kurang dari sama dengan 60, maka tambah nilai variabel c sebesar 1;
            jika tidak, jika usia lebih dari sama dengan 61 dan kurang dari sama dengan 80, maka tambah nilai variabel d sebesar 1;
            jika tidak, maka tambah nilai variabel e sebesar 1;
          } selama n<0
        }break

        case 2:{
          jika jumlah masih kurang dari sama dengan 0, tampilkan pesan bahwa user belum memasukkan data;
          jika tidak, menghitung rataRata dengan rumus jumlah/n dan tampilkan pada layar user;
        }break

        case 3:{
          jika rataRata<=0, tampilkan pesan bahwa user belum menghitung rata rata;
          jika tidak, menghitung variansi dengan rumus (jumlahKuadrat-n*rataRata^2)/n;
                      menghitung deviasi dengan rumus akar kuadrat variansi;
                      tampilkan hasil pada layar user;
        }break
        
        case 4:{
          jika jumlah <=0, tampilkan pesan bahwa user belum memasukkan data;
          jika tidak, tampilkan diagram batang:
          0-20 = (mengulangi print variabel diagram sebanyak a kali)
          21-40 = (mengulangi print variabel diagram sebanyak b kali)
          41-60 = (mengulangi print variabel diagram sebanyak c kali)
          61-80 = (mengulangi print variabel diagram sebanyak d kali)
          81-100 = (mengulangi print variabel diagram sebanyak e kali)
        }break

        case 5: break;
        default: menyuruh user untuk memasukkan angka antara 1 sampai 5;
    
       }selama input tidak sama dengan 5
4. Selesai