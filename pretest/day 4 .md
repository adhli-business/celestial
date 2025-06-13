## 📄 **PRE-TEST** – _Java Spring Boot & Spring Security_

### ✳️ Bagian 1: Pilihan Ganda (Dasar)

1. Apa anotasi yang digunakan untuk mendefinisikan sebuah REST controller?

   - A. `@Service`
   - B. `@Component`
   - C. `@RestController`
   - D. `@Repository`

2. Di Spring, anotasi apa yang digunakan untuk menyuntikkan dependency ke dalam class?

   - A. `@Autowired`
   - B. `@Injectable`
   - C. `@Import`
   - D. `@Mapper`

3. Di lapisan arsitektur Spring, Service berfungsi untuk:

   - A. Menangani permintaan HTTP
   - B. Menyimpan data ke database langsung
   - C. Menyimpan log aplikasi
   - D. Menyimpan logika bisnis

4. Class model di Java Spring biasanya digunakan untuk:

   - A. Menyimpan konfigurasi Spring
   - B. Menyimpan logika controller
   - C. Menyimpan struktur data (seperti data user, produk, dll.)
   - D. Mengatur pemetaan URL

5. Jika kita ingin membuat method yang bisa diakses oleh endpoint `/hello`, anotasi apa yang digunakan?

   - A. `@RestEndpoint("/hello")`
   - B. `@Path("/hello")`
   - C. `@GetMapping("/hello")`
   - D. `@Route("/hello")`

---
### Jawaban Bagian 1:
1. C. `@RestController`
2. A. `@Autowired`
3. D. Menyimpan logika bisnis
4. C. Menyimpan stuktur data (seperti data user, produk, dll)
5. C. `@GetMapping("/hello")`
---
### ✳️ Bagian 2: Benar / Salah

6. `@Service` digunakan untuk menandai class sebagai lapisan Controller.
7. Kita bisa membuat class model tanpa anotasi apapun jika hanya digunakan sebagai POJO.
8. `@Autowired` bisa digunakan di constructor maupun field.
9. Spring Boot membutuhkan file `application.yml` agar bisa berjalan.
10. `@GetMapping` hanya bisa digunakan di class dengan anotasi `@Service`.

---
### Jawaban Bagian 2:
6. Salah, seharusnya untuk service layer
7. Benar
8. Benar
9. Salah, bisa menggunakan application.properties
10. Salah, `@GetMapping` digunakan dalam `@RestController`
---

### ✳️ Bagian 3: Isian Singkat

11. Anotasi apa yang digunakan agar method bisa menangani permintaan POST?
12. Apa nama file konfigurasi default di Spring Boot?
13. Apa yang dimaksud dengan Dependency Injection?
14. Bagaimana cara mendeklarasikan class `UserService` agar dikenali Spring sebagai Service?
15. Apa perbedaan `@RestController` dan `@Controller`?

---
### Jawaban Bagian 3:
11. Anotasi untuk method post adalah `@PostMapping`
12. Nama file konfigurasi default di spring boot adalah`application.properties` (atau `application.yml`)
13. Proses memasukkan (inject) dependency kedalam sebuah class secara otomatis oleh spring, bukan dibuat secara manual
14. Cara mendeklarasikan userService:
```java 
@Service
public class UserService {
}
```
15. Perbedaan `@RestController` dengan `@Controller`:
- `@Controller` mengembalikan nama view (seperti HTML/jsp). 
- `@RestController` mengembalikan data (biasanya JSON), dan otomatis menambahkan @ResponseBody.
---

### ✳️ Bagian 4: Perbaiki Kode / Output

16. Perbaiki kode berikut agar dapat dijalankan sebagai Controller:

```java
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
```

17. Perbaiki kesalahan pada model berikut:

```java
public class Product {
    private String name;
    private int price;
}
```

18. Apa output dari method berikut?

```java
@GetMapping("/sum")
public int sum() {
    return 2 + 3;
}
```

19. Kode service berikut error. Apa yang salah?

```java
@Service
public class UserService {
    private UserRepository userRepository;
}
```

20. Apa masalah pada potongan kode berikut?

```java
@RestController
public class BookController {

    @GetMapping
    public String listBooks() {
        return "books";
    }
}
```

### Jawaban Bagian 4:
16. Perbaiki Controller:
```java
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
```

17. Perbaiki model `product`:
```java
public class Product {
    private String name;
    private int price;

    // Getter dan Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}
```

18. Output dari method `/sum`: 5
19. Perbaiki Service:
```java
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
}
```
20. Masalah pada `BookController`:
```java
@RestController
public class BookController {

    @GetMapping("/books")
    public String listBooks() {
        return "books";
    }
}
```
---

### 🔐 Bagian 5: Spring Security

#### Pilihan Ganda

21. Apa anotasi yang digunakan untuk mengaktifkan Spring Security di aplikasi Spring Boot?

- A. `@EnableSecurity`
- B. `@SpringSecurity`
- C. `@EnableWebSecurity`
- D. `@ActivateSecurity`

22. Komponen mana yang bertugas mengatur izin akses berdasarkan role atau otorisasi di Spring Security?

- A. `SecurityConfig`
- B. `UserDetailsService`
- C. `AuthenticationManager`
- D. `HttpSecurity`

23. Untuk membuat otentikasi berbasis user login yang dikustomisasi, interface apa yang harus diimplementasi?

- A. `UserRepository`
- B. `UserSecurity`
- C. `UserDetailsService`
- D. `SecurityService`

---
### Jawaban Bagian 5:
21. C. `@EnableWebSecurity`
22. D. `HttpSecurity`
23. C. `UserDetailsService`
---

#### Benar / Salah

24. Spring Security hanya bisa digunakan untuk REST API yang menggunakan JWT.
25. `@PreAuthorize("hasRole('ADMIN')")` digunakan untuk membatasi method agar hanya bisa diakses oleh pengguna dengan role ADMIN.
26. `BCryptPasswordEncoder` digunakan untuk mengenkripsi password agar tidak disimpan dalam bentuk plain text.

---
### Jawaban Bagian 6:
24. Salah → juga bisa untuk web form, basic auth, dll.
25. Benar
26. Benar
---

#### Isian Singkat

27. Apa class konfigurasi yang umum dibuat untuk menyesuaikan aturan login, logout, dan authorization di Spring Security?
28. Apa anotasi yang digunakan agar method hanya bisa diakses jika pengguna memiliki hak tertentu?

---
### Jawaban Bagian 7:
27. SecurityConfig (biasanya extends WebSecurityConfigurerAdapter untuk Spring versi lama, atau gunakan SecurityFilterChain pada versi baru)
28. `@PreAuthorize`
---

#### Perbaiki Kode / Analisis

29. Perbaiki potongan konfigurasi ini:

```java
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .antMatchers("/admin").hasRole("ADMIN")
        .anyRequest().authenticated()
        .and()
        .formLogin();
    return http.build();
}
```

30. Apa yang salah dengan konfigurasi login berikut?

```java
http
  .authorizeHttpRequests()
  .anyRequest().permitAll()
  .and()
  .formLogin();
```

---
### Jawaban Bagian 8:
29. Perbaikan konfigurasi:
```java
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests(auth -> auth
            .antMatchers("/admin").hasRole("ADMIN")
            .anyRequest().authenticated()
        )
        .formLogin();
    return http.build();
}
```
30. Jika semua request di-permitAll(), maka formLogin() tidak akan pernah dipakai untuk proteksi. Harusnya anyRequest().authenticated() jika ingin login dibutuhkan.
---
