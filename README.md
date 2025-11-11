# ✅ PAK CEK — Sistem Evaluasi Kelengkapan Paket  
**Nama:** Muhammad Syukri  
**NPM:** 2308107010060  

---

## 📌 Deskripsi Singkat
**PAK CEK** adalah aplikasi Java yang menerapkan **Decorator Pattern** untuk melakukan pemeriksaan kelengkapan paket pengiriman.

Setiap pengecekan (alamat, dokumen, segel, dll.) dibuat sebagai **decorator**, sehingga dapat ditambah atau dikurangi tanpa perlu mengubah logika utama. Sistem ini meniru proses pengecekan paket sebelum dikirim.

---

## 🎯 Tujuan Sistem
- Melakukan pemeriksaan kelengkapan paket secara modular.  
- Memudahkan penambahan aturan tanpa mengubah kode inti.  
- Menampilkan daftar masalah yang ditemukan secara jelas.  
- Menjadi contoh implementasi pola desain **Decorator Pattern** dalam Java.

---

## 🧩 Arsitektur (Decorator Pattern)
- **Component:** `PackageCheck`  
- **Concrete Component:** `BasicPackageCheck`  
- **Decorators:**  
  - `AddressCheck` – cek alamat tujuan  
  - `DocumentCheck` – cek packing list/dokumen  
  - `SealCheck` – cek segel paket  
- **Client:** `MainApp` – menjalankan rangkaian pengecekan

---

## 📁 Struktur File (8 File)
- PackageData.java
- PackageCheck.java
- BasicPackageCheck.java
- CheckDecorator.java
- AddressCheck.java
- DocumentCheck.java
- SealCheck.java
- MainApp.java
---

## ▶️ Cara Menjalankan
```bash
# Compile semua file
javac *.java

# Jalankan program
java MainApp
```

## 📌 Alur Kerja Program

1. MainApp membuat objek PackageData.
2. BasicPackageCheck menjadi fondasi pengecekan.
3. Decorator ditumpuk berurutan:
```
Basic → AddressCheck → DocumentCheck → SealCheck
```
4. Program menjalankan check() sekali.
5. Setiap decorator menampilkan log pengecekan masing-masing.
6. Hasil akhir menampilkan:
  - Status kelengkapan ✅ / ❌
  - Daftar masalah bila ada

## Contoh Output

```
=== Sistem Evaluasi Kelengkapan Paket Pengiriman (PAK CEK) ===
Nama Penerima : Rizki Maulana
Alamat Tujuan : Jl. K.H. Ahmad No. 22, Banda Aceh
Berat Paket   : 2.5 kg
--------------------------------------------
[BasicCheck] Memulai pengecekan paket...
[AddressCheck] Mengecek alamat...
[DocumentCheck] Mengecek packing list...
[SealCheck] Mengecek segel paket...

Status Kelengkapan : ✗ TIDAK LENGKAP

Masalah ditemukan:
- Daftar barang (packing list) tidak terlampir.
```

