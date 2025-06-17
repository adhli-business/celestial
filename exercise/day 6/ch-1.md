## 📘 **PRETEST**

---

### 🔹 A. **Pilihan Ganda (20 Soal)**

#### ✅ Spring Boot Security

1. Anotasi yang digunakan untuk mengaktifkan Spring Security:
   A. `@EnableSecurity`
   B. `@EnableWebSecurity`
   C. `@EnableSpringBootSecurity`
   D. `@EnableSecureApp`

    Jawaban: B. `@EnableWebSecurity`

2. Apa itu `AuthenticationManager` dalam Spring Security?
   A. Komponen untuk mengatur authorization
   B. Class yang memproses autentikasi user
   C. Konfigurasi password encoder
   D. Token parser

    Jawaban: B. Class yang memproses autentikasi user

3. Apa peran dari `@PreAuthorize("hasRole('ADMIN')")`?
   A. Mengatur login
   B. Menghindari token expiry
   C. Membatasi akses method hanya untuk ADMIN
   D. Menyimpan role ke database

    Jawaban: C. Membatasi akses method hanya untuk ADMIN

4. Class `UserDetails` diimplementasikan untuk...?
   A. Konfigurasi JPA
   B. Logging REST request
   C. Representasi user dalam security context
   D. Mapping endpoint

    Jawaban: C. Representasi user dalam security context

5. Library umum untuk hashing password di Spring Security:
   A. AES
   B. MD5
   C. BCrypt
   D. HMAC256

    Jawaban: C. BCrypt

---

#### 🌐 Basic REST API (Spring Web)

6. Anotasi `@RestController` adalah gabungan dari...?
   A. `@Controller` + `@RequestParam`
   B. `@Controller` + `@PathVariable`
   C. `@Controller` + `@ResponseBody`
   D. `@RequestMapping` + `@Service`

    Jawaban: C. `@Controller` + `@ResponseBody`


7. HTTP method `PUT` biasanya digunakan untuk...?
   A. Menghapus data
   B. Mengupdate atau mengganti resource
   C. Mengambil file
   D. Menyambungkan endpoint

    Jawaban: B. Mengupdate atau mengganti resource

8. Jika Anda ingin mengambil parameter dari `/product/{id}`, Anda akan menggunakan...?
   A. `@RequestParam`
   B. `@RequestHeader`
   C. `@PathVariable`
   D. `@PathParam`

    Jawaban: C. `@PathVariable`

9. Untuk membaca JSON body dan mengonversinya ke object Java, kita gunakan...?
   A. `@RequestMapping`
   B. `@RequestBody`
   C. `@PathVariable`
   D. `@GetMapping`

    Jawaban: B. `@RequestBody`

10. Kode status HTTP yang sesuai untuk `Resource Not Found`:
    A. 200
    B. 201
    C. 404
    D. 500

    Jawaban: C. 404
---

#### 🧩 Spring Data JPA

11. Anotasi `@Entity` di JPA digunakan untuk...?
    A. Mengatur mapping DTO
    B. Menandai class sebagai table di database
    C. Mendaftarkan bean service
    D. Mengatur konfigurasi Spring Boot

    Jawaban: b. Menandai class sebagai table di database

12. Apa tujuan dari `@Id` dalam entity class?
    A. Menandai kolom biasa
    B. Menyimpan objek transient
    C. Menandai primary key
    D. Mengatur sorting

    Jawaban: C. Menandai primary key

13. Anotasi `@GeneratedValue(strategy = GenerationType.IDENTITY)` digunakan untuk...?
    A. Menyimpan record tanpa ID
    B. Membuat kolom unik
    C. Membiarkan database membuat ID otomatis
    D. Mengatur batch update

    Jawaban: C. Membiarkan database membuat ID otomatis

14. Apa peran `JpaRepository` dalam Spring Data?
    A. Konfigurasi controller
    B. Layer service REST
    C. Abstraksi akses data CRUD
    D. Mapping response JSON

    Jawaban: C. Abstraksi akses data CRUD

15. Relasi One-to-Many di JPA ditandai dengan...?
    A. `@ManyToMany`
    B. `@OneToOne`
    C. `@OneToMany`
    D. `@Column(unique = true)`

    Jawaban: c. `@OneToMany`

---

#### 🧪 Unit Testing

16. Apa anotasi JUnit 5 untuk membuat method menjadi test unit?
    A. `@Run`
    B. `@TestCase`
    C. `@Test`
    D. `@Execute`

    Jawaban: C. `@Test`

17. Mockito digunakan untuk...?
    A. Menyimpan object ke file
    B. Menguji performance
    C. Membuat object palsu (mock)
    D. Mengatur cache object

    Jawaban: C. Membuat object palsu (mock)

18. `@MockBean` biasanya digunakan di...?
    A. Spring Boot Application utama
    B. Test berbasis Spring context
    C. File konfigurasi YAML
    D. Static class

    Jawaban: B. Test berbasis Spring context

19. `MockMvc` berguna untuk...?
    A. Testing service layer
    B. Membuat dummy API
    C. Menguji controller REST tanpa menjalankan server
    D. Logging request

    Jawaban: C. Menguji controller REST tanpa menjalankan server

20. Apa tujuan dari anotasi `@BeforeEach`?
    A. Menjalankan test terakhir
    B. Setup sebelum setiap test method
    C. Cleanup setelah test
    D. Menentukan environment

    Jawaban: B. Setup sebelum setiap test method

---

### 🔸 B. **Benar / Salah (10 Soal)**

21. Spring Security secara default memblokir semua endpoint.
Jawaban: Benar, Spring Security memblokir semua endpoint secara default kecuali dikonfigurasi.

22. `@PathVariable` digunakan untuk membaca data dari query parameter.
Jawaban: Salah, @PathVariable untuk path URI, sedangkan @RequestParam untuk query parameter.

23. `JpaRepository` menyediakan method seperti `findAll()` dan `save()`.
Jawaban: Benar, JpaRepository mewarisi method CRUD seperti findAll(), save(), dll.

24. `@GeneratedValue` dapat digunakan bersama `@Id`.
Jawaban: Benar, @GeneratedValue digunakan bersama @Id untuk auto-generate primary key.

25. Spring Boot membutuhkan konfigurasi manual untuk mapping JSON ke class.
Jawaban: Salah, Springboot secara otomatis menghandle konversi JSON dengan Jackson.

26. `@RestController` hanya bisa digunakan untuk GET request.
Jawaban: Salah, @RestController bisa menangani semua HTTP METHOD: GET, POST, PUT, DELETE. 

27. `BCryptPasswordEncoder` menghasilkan hash yang konsisten tanpa salt.
Jawaban: Salah, BCryptPasswordEncoder menggunakan salt sehingga hasl hash berbeda.

28. Penamaan variable sebaiknya camelCase.
Jawaban: Benar

29. Nama class di Java sebaiknya menggunakan PascalCase.
Jawaban: Benar

30. `assertEquals(expected, actual)` digunakan untuk membandingkan dua nilai dalam unit test.
Jawaban: Benar, assertEquals(expected, actual) digunakan untuk membandingkan dua nilai.

---

### 🧾 C. **Isian Singkat (5 Soal)**

31. Apa perbedaan antara `@RestController` dan `@Controller`?
Jawaban: @RestController menggabungkan @Controller dan @ResponseBody, digunakan untuk REST API (mengembalikan data JSON/XML).
Sedangkan @Controller digunakan untuk mengembalikan view (HTML/jsp/thymeleaf).

32. Jelaskan fungsi `@ManyToOne` dan contoh penggunaannya dalam relasi data.
Jawaban: @ManyToOne digunakan untuk merepresentasikan hubungan banyak ke satu.

```java
@ManyToOne
private Category category; // Banyak product bisa punya satu category
```

33. Apa itu `principal` dalam konteks Spring Security?
Jawaban: Principal adalah representasi user yang sedang login — biasanya digunakan untuk mendapatkan username di method controller.

34. Sebutkan dua konvensi penamaan dalam Java (untuk class dan variable).
Jawaban:
- Variable: camelCase (contoh: userName, orderList)

- Class: PascalCase (contoh: UserService, OrderController)

35. Mengapa penting menggunakan mocking saat membuat unit test?
Jawaban: Mocking memungkinkan pengujian unit secara terisolasi dengan mengganti dependency nyata (seperti database/service) dengan tiruan — sehingga cepat, stabil, dan tidak bergantung pada komponen eksternal.

---

### 🔧 D. **Koreksi Kode (5 Soal)**

36.

```java
@Entity
public class Product {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}
```

Jawaban: Salah, @Id hilang.

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```



37.

```java
@GetMapping("/user/{id}")
public User getUser(@RequestParam Long id) {
    ...
}
```

Jawaban: Salah, @RequestParam seharusnya @PathVariable karena ambil dari URL path.

```java
@GetMapping("/user/{id}")
public User getUser(@PathVariable Long id) {
    ...
}
```

38.

```java
@PostMapping("/register")
public String registerUser(User user) {
    ...
}
```

Jawaban: Salah, Tidak ada anotasi @RequestBody, sehingga tidak bisa menerima JSON body.

```java
@PostMapping("/register")
public String registerUser(@RequestBody User user) {
    ...
}
```


39.

```java
@Mock
UserService userService = new UserServiceImpl();
```

Jawaban: Salah, Tidak boleh inisialisasi manual saat menggunakan @Mock.

40.

```java
public class userService {
    public void saveUser(User user) { ... }
}
```

Jawaban: Salah, Nama class tidak mengikuti konvensi Java (seharusnya PascalCase).


```java
public class UserService {
    public void saveUser(User user) { ... }
}
``

---
