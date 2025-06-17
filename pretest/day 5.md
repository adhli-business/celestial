## 📄 Pretest Spring Boot Security & Unit Testing\*\*

### ✅ **A. Pilihan Ganda (12 Soal)**

1. Apa tujuan utama dari Spring Security?
2. Apa anotasi untuk mengaktifkan Web Security di Spring Boot?
3. Apa fungsi `HttpSecurity` dalam konfigurasi Spring Security?
4. Apa itu prinsip _Authentication Principal_ dalam Spring Security?
5. Apa peran dari anotasi `@PreAuthorize("hasRole('ADMIN')")`?
6. Apa fungsi dari class `UserDetails` di Spring Security?
7. Apa itu BCrypt?
8. Library utama yang digunakan untuk testing unit di Spring Boot adalah:
9. Apa kegunaan dari `@MockBean` dalam Spring Boot Test?
10. Apa yang dilakukan oleh anotasi `@WithMockUser`?
11. Apa perbedaan mendasar antara `@WebMvcTest` dan `@SpringBootTest`?
12. Apa tujuan dari anotasi `@BeforeEach` dalam unit test?

---
### **Jawaban - Pilihan Ganda**
1. A. Memberikan otentikasi dan otorisasi pada aplikasi

2. B. @EnableWebSecurity

3. C. Mengonfigurasi aturan keamanan HTTP seperti otorisasi dan CSRF

4. D. Objek yang merepresentasikan user yang terotentikasi dalam method controller

5. A. Mengizinkan akses hanya untuk user dengan role ADMIN

6. B. Merepresentasikan detail user (username, password, role) untuk proses autentikasi

7. C. Algoritma hashing yang aman digunakan untuk menyimpan password

8. A. JUnit + Mockito

9. C. Untuk membuat mock bean Spring yang bisa di-inject ke context

10. B. Menyimulasikan user login saat menjalankan unit test

11. C. @WebMvcTest hanya untuk controller, @SpringBootTest untuk seluruh context

12. A. Menjalankan method setup sebelum setiap test dijalankan
---

### ✅ **B. Benar/Salah (5 Soal)**

13. `BCryptPasswordEncoder` menghasilkan hash yang sama untuk password yang sama.
14. Spring Security dapat digunakan untuk endpoint berbasis REST API maupun form login.
15. `@WebMvcTest` bisa digunakan untuk menguji layer service dan repository.
16. `Principal` adalah representasi dari user yang sedang login.
17. `@MockBean` dan `@Mock` memiliki efek yang sama dalam Spring Boot Test.

---
### **Jawaban - Benar Salah**
13. Salah — BCrypt menghasilkan hash yang berbeda setiap kali (karena salt)

14. Benar

15. Salah — @WebMvcTest hanya untuk layer controller, tidak memuat service/repo

16. Benar

17. Salah — @MockBean inject ke Spring context, @Mock tidak
---


### ✅ **C. Isian Singkat (5 Soal)**

18. Apa peran dari `AuthenticationManager` dalam Spring Security?
19. Jelaskan apa yang dilakukan oleh `PasswordEncoder` dan kenapa penting?
20. Apa yang dimaksud dengan "authorization" dalam konteks aplikasi?
21. Apa itu _test double_, dan apa perbedaannya dengan _mock_ di unit test?
22. Dalam pengujian REST API Spring Boot, apa fungsi utama `MockMvc`?

---
### **Jawaban - Isian singkat**
18. AuthenticationManager bertugas memproses autentikasi berdasarkan data (username & password) dan menentukan apakah user valid.

19. PasswordEncoder digunakan untuk meng-enkripsi password (seperti dengan BCrypt) agar tidak disimpan dalam bentuk teks asli — penting untuk keamanan.

20. Authorization adalah proses pengecekan apakah user yang sudah login memiliki izin/role untuk mengakses resource tertentu.

21. Test double adalah objek tiruan untuk testing (mock, stub, fake, dll). Mock adalah salah satu jenis test double yang memverifikasi interaksi (seperti pemanggilan method).

22. MockMvc digunakan untuk mensimulasikan permintaan HTTP terhadap controller Spring tanpa menjalankan server secara penuh (unit test controller REST API).
---

### ✅ **D. Koreksi Kode (8 Soal)**

Perhatikan kode berikut dan jelaskan apa yang salah.

23.

```java
@Autowired
private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
```

24.

```java
@WithMockUser(username = "user", roles = "USER")
@Test
void testAccessAdminEndpoint() {
    mockMvc.perform(get("/admin")).andExpect(status().isOk());
}
```

25.

```java
@Mock
UserService userService = new UserServiceImpl();
```

26.

```java
@SpringBootTest
@WebMvcTest
public class MyTest {
}
```

27.

```java
@Test
void testPasswordHash() {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    assertEquals("mypassword", encoder.encode("mypassword"));
}
```

28.

```java
@Test
void testUnauthorizedAccess() {
    mockMvc.perform(get("/secure-data"))
           .andExpect(status().isOk());
}
```

29.

```java
@BeforeAll
void setup() {
    MockitoAnnotations.openMocks(this);
}
```

30.

```java
@Test
void testLogin() {
    when(authService.login("user", "pass")).thenReturn(null);
    assertNotNull(authService.login("user", "pass"));
}
```
### **Jawaban - Koreksi kode**
23. Salah, Tidak boleh menggunakan @Autowired dan inisialisasi langsung bersamaan.

```java
private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
```
24. Salah, @WithMockUser role harus "ADMIN" jika ingin akses endpoint /admin (asumsi membutuhkan role tersebut).

```java
@WithMockUser(username = "user", roles = "ADMIN")
@Test
void testAccessAdminEndpoint() {
    mockMvc.perform(get("/admin")).andExpect(status().isOk());
}
```

25. Salah, Tidak bisa kombinasi @Mock dengan inisialisasi langsung.

```java
@Mock
UserService userService;
```

26. Salah, @SpringBootTest dan @WebMvcTest tidak boleh digabung karena mereka punya konteks yang berbeda.

```java
@WebMvcTest
public class MyTest {
}
```
27. Salah, Password yang di-hash tidak bisa dibandingkan langsung dengan plaintext.

```java
@Test
void testPasswordHash() {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    String hash = encoder.encode("mypassword");
    assertTrue(encoder.matches("mypassword", hash));
}
```

28. Salah, Endpoint secure harusnya mengembalikan 401/403 jika tidak ada user login.

```java
@Test
void testUnauthorizedAccess() {
    mockMvc.perform(get("/secure-data"))
           .andExpect(status().isUnauthorized());
}
```
29. Salah, Method @BeforeAll harus static.
```java
@BeforeAll
static void setup() {
    MockitoAnnotations.openMocks(MyTestClass.class);
}
```

30. Salah, when(...).thenReturn(null) tapi diuji assertNotNull, ini kontradiktif.

```java
@Test
void testLogin() {
    when(authService.login("user", "pass")).thenReturn(new AuthResponse());
    assertNotNull(authService.login("user", "pass"));
}
```
---