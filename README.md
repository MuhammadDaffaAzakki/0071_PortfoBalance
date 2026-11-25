# PortfoBalance
**Aplikasi Manajemen Portofolio Multi-Aset dan Perencanaan Rebalancing**

Proyek Tugas Akhir Mata Kuliah Pengembangan Aplikasi Mobile (2026) — Program Studi Teknologi Informasi, Universitas Muhammadiyah Yogyakarta (UMY).

* **Nama:** Muhammad Daffa Azakki
* **NIM:** 20240140071
* **Tema:** Keuangan
* **API Repository:** [0071_API_PortfoBalance](https://github.com/MuhammadDaffaAzakki/0071_API_PortfoBalance)

---

## 1. Deskripsi Singkat
PortfoBalance adalah aplikasi mobile Android berbasis **100% Jetpack Compose** dan arsitektur **MVVM** yang membantu investor ritel mencatat kepemilikan aset investasi lintas platform sekuritas secara terpusat serta menghitung selisih (*gap*) dan saran *rebalancing* portofolio secara mandiri.

## 2. Teknologi yang Digunakan
* **Bahasa & UI:** Kotlin, 100% Jetpack Compose, Material Design 3
* **Arsitektur & Navigasi:** MVVM (Model-View-ViewModel), Navigation Compose
* **Jaringan & API:** Retrofit, Gson Converter, OkHttp Logging Interceptor
* **Keamanan:** AndroidX Security Crypto (penyimpanan JWT terenkripsi)
* **Backend & Database:** REST API (JWT & RBAC) + PostgreSQL (Cloud)
* **External API:** Frankfurter API (kurs nilai tukar USD ke IDR)

## 3. Cara Menjalankan Aplikasi
1. Clone repositori ini:
   ```bash
   git clone https://github.com/MuhammadDaffaAzakki/0071_PortfoBalance.git
   ```
2. Buka folder proyek menggunakan **Android Studio**.
3. Tunggu proses **Gradle Sync** selesai hingga seluruh *dependencies* terunduh.
4. Jalankan aplikasi pada emulator Android (minimal Android 8.0 / API 26) atau perangkat fisik.

---

## 4. Progress Mingguan (Weekly Progress)

Berikut adalah linimasa pengembangan proyek **PortfoBalance** yang direkonstruksi secara riil berdasarkan riwayat git commit:

### 🗓️ Minggu 1 — Pertemuan 9 (24 November 2026 - 25 November 2026)
* **Inisialisasi & Setup Lingkungan** ( `ae120be`, `944b401`, `32f78c1` ): Initial commit repositori, inisialisasi proyek Android Jetpack Compose, penambahan izin jaringan internet (`INTERNET`), serta registrasi *dependencies* MVVM (`lifecycle-viewmodel-compose`), `navigation-compose`, Retrofit, dan `security-crypto`.