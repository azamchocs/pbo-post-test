# Deskripsi Kode
Kode ini merupakan program Java sederhana yang memungkinkan pengguna untuk mengelola daftar manga. Program ini menyediakan beberapa fungsi dasar, seperti menambahkan manga baru, menampilkan daftar manga, memperbarui manga yang ada, dan menghapus manga dari daftar.

## Komponen Utama
Package dan Imports:

Program ini menggunakan package comm dan mengimpor kelas Manga dari package Manga.
Juga mengimpor beberapa kelas Java standar seperti ArrayList dan Scanner.
Variabel dan Objek:

Terdapat variabel library, yaitu ArrayList yang digunakan untuk menyimpan daftar manga.
Variabel scanner digunakan untuk menerima masukan dari pengguna.
Main Method:

Program memiliki main method yang merupakan titik masuk eksekusi program.
Pengguna diberikan pilihan untuk mengeksekusi berbagai fungsi seperti menambahkan manga, menampilkan daftar manga, memperbarui manga, atau menghapus manga.
### Fungsi-Fungsi Utama:

Program memiliki empat fungsi utama:
addManga(): Memungkinkan pengguna untuk menambahkan manga baru ke dalam daftar.
viewMangas(): Menampilkan daftar manga yang ada.
updateManga(): Memungkinkan pengguna untuk memperbarui informasi tentang manga yang sudah ada.
deleteManga(): Memungkinkan pengguna untuk menghapus manga dari daftar.
## Penggunaan Program
Pengguna dapat menjalankan program ini dengan memilih salah satu opsi yang disediakan dalam menu. Opsi tersebut termasuk menambahkan, menampilkan, memperbarui, atau menghapus manga. Program akan terus berjalan hingga pengguna memilih opsi keluar.

## Catatan Tambahan
Data manga disimpan dalam objek Manga yang memiliki atribut seperti ID, judul, pengarang, dan tahun rilis.
Program ini memanfaatkan ArrayList untuk menyimpan daftar manga, yang memungkinkan pengguna untuk dinamis menambahkan, mengakses, dan menghapus manga dari daftar.
Pastikan Anda menjelaskan cara penggunaan program ini, seperti bagaimana cara menjalankannya dan mengikuti menu pilihan, dalam README di GitHub Anda.

# Deskripsi Model
Kelas Manga adalah model yang digunakan dalam program untuk merepresentasikan manga individu. Model ini memiliki beberapa atribut dan metode untuk mengelola informasi manga.

## Atribut
id: Atribut ini merupakan ID unik untuk setiap manga dan diberikan saat manga dibuat. Nilai ID bersifat konstan dan tidak dapat diubah setelah objek manga dibuat.

title: Atribut ini merupakan judul manga dan dapat diakses atau diubah.

author: Atribut ini merepresentasikan pengarang manga dan juga dapat diakses atau diubah.

year: Atribut ini menyimpan tahun rilis manga dan bisa diakses atau diperbarui.

### Konstruktor
Terdapat satu konstruktor yang digunakan untuk membuat objek manga. Konstruktor ini menerima nilai untuk atribut id, title, author, dan year saat objek manga dibuat.
### Metode
getId(): Metode ini digunakan untuk mengambil nilai ID manga yang bersifat konstan.

getTitle(): Metode ini digunakan untuk mengambil judul manga.

setTitle(String title): Metode ini memungkinkan pengguna untuk mengubah judul manga.

getAuthor(): Metode ini digunakan untuk mengambil nama pengarang manga.

setAuthor(String author): Metode ini memungkinkan pengguna untuk mengubah nama pengarang manga.

getYear(): Metode ini digunakan untuk mengambil tahun rilis manga.

setYear(int year): Metode ini memungkinkan pengguna untuk mengubah tahun rilis manga.

Model Manga ini digunakan dalam program utama (MangaListings) untuk merepresentasikan setiap manga dalam daftar manga yang dikelola oleh program. Objek Manga digunakan untuk mengatur dan menyimpan informasi tentang manga seperti ID, judul, pengarang, dan tahun rilis.
