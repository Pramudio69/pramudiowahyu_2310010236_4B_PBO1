# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pendaftaran les privat menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, umur, dan jenis les yang dipilih oleh peserta, dan memberikan output berupa informasi pendaftaran, serta menampilkan seluruh peserta yang telah mendaftar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, LesPrivate, LesOnline, dan PendaftaranLes adalah contoh dari class.

```bash
public class LesPrivate {
    ...
}

public class LesOnline extends LesPrivate {
    ...
}

public class PendaftaranLes {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini,LesPrivate pendaftar = new LesOnline(...) adalah contoh pembuatan object.

```bash
LesPrivate pendaftar = new LesOnline("", 0, "");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini,nama, umur, dan jenisLes adalah contoh atribut.

```bash
private String nama;
private int umur;
private String jenisLes;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class LesPrivate dan LesOnline.

```bash
public LesPrivate(String nama, int umur, String jenisLes) {
    ...
}

public LesOnline(String nama, int umur, String jenisLes) {
    super(nama, umur, jenisLes);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setNama, setUmur, dan setJenisLes adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setUmur(int umur) {
    this.umur = umur;
}

public void setJenisLes(String jenisLes) {
    this.jenisLes = jenisLes;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini,getNama, getUmur, dan getJenisLes adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public int getUmur() {
    return umur;
}

public String getJenisLes() {
    return jenisLes;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut nama, umur, dan jenisLes dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int umur;
private String jenisLes;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, LesOnline mewarisi LesPrivate dengan sintaks extends.

```bash
public class LesOnline extends LesPrivate {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method tampilkanInfo() di LesOnline merupakan override dari method di class LesPrivate.

```bash
public void tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if untuk memeriksa validitas input jenis les.

```bash
if (pilihan < 1 || pilihan > 5) {
    System.out.println("Pilihan tidak valid. Ulangi.");
    continue;
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop while dan for untuk mengulang proses input dan menampilkan data peserta.

```bash
while (true) {
    ...
}

for (int i = 0; i < jumlahPendaftar; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.


```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Nama: ");
System.out.println(pendaftar.getNama());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, LesPrivate[] daftar = new LesPrivate[100]; adalah contoh penggunaan array.

```bash
LesPrivate[] daftar = new LesPrivate[100];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani input yang tidak sesuai (misalnya input huruf saat diminta angka).

```bash
try {
    ...
} catch (InputMismatchException e) {
    System.out.println("Terjadi kesalahan input. Ulangi.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Pramudio Wahyu Maryanto
NPM: 2310010236
