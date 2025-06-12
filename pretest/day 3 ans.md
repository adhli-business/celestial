### 📌 **Jawaban Pre Test | Putra Adhli Falah**

#### **Bagian A - Pilihan Ganda**

1. b. `@Entity`
2. c. Menyediakan endpoint berbasis REST
3. a. Menangani request GET ke endpoint `/user`
4. c. `findAll()`
5. a. `@ManyToOne`
6. c. `application.properties`
7. b. `@Autowired`
8. c. `@Query`
9. b. Mengambil data JSON dari body request
10. c. Mengambil data dari path endpoint

#### **Bagian B - Benar / Salah**

11. Benar – @Service digunakan untuk menandai class yang berisi logika bisnis.
12. Benar – Jika application.properties telah dikonfigurasi dengan benar, Spring Boot akan otomatis mengatur koneksi database.
13. Salah – @PostMapping digunakan untuk menerima data, bukan mengambil.
14. Benar – JpaRepository memperluas CrudRepository.
15. Salah – @Entity wajib, tetapi @Table hanya opsional jika nama tabel sama dengan nama class.

#### **Bagian C - Jawaban Singkat**


16. @Controller digunakan untuk aplikasi web tradisional (mengembalikan view/HTML), sedangkan @RestController adalah gabungan dari @Controller + @ResponseBody untuk API REST (mengembalikan data JSON/XML).

17. @GeneratedValue digunakan untuk menentukan strategi pembuatan nilai otomatis untuk primary key, seperti auto increment.

18. DTO digunakan untuk membatasi dan mengontrol data yang dikirim/diperoleh dari API, menghindari eksposur langsung entitas dan meningkatkan keamanan serta fleksibilitas.

19. Spring Data JPA secara otomatis mengimplementasikan method seperti findByUsername dengan menggunakan konvensi penamaan method dan menganalisis nama field di entitas.

20. @Column(name = "full_name") memberi tahu JPA bahwa field tersebut harus dipetakan ke kolom bernama full_name di tabel database.

#### **Bagian D - Analisis Kode dan Kelemahan**


21. Kesalahan: Tidak ada anotasi @Id untuk menandai primary key. Sebaiknya juga gunakan @GeneratedValue untuk membuat ID otomatis.

```java
import jakarta.persistence.*;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Getter dan Setter
}
```

22. Kekurangan: Parameter name tidak memiliki anotasi @RequestParam, sehingga tidak akan bisa menangkap nilai dari query parameter secara eksplisit.
```java
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
```

23. Gunakan anotasi @OneToMany di entitas Customer dan @ManyToOne di Order. Contoh:

```java
//customer
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;

    // Getter dan Setter
}
```

```java
//order
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Getter dan Setter
}
```
24. Output-nya adalah:
User ID: 123
Karena @PathVariable menangkap nilai 123 dari URL dan menggunakannya sebagai parameter method.


25. Gunakan @ResponseStatus(HttpStatus.NOT_FOUND) atau buat custom exception (misalnya UserNotFoundException) dan tangani dengan @ExceptionHandler atau @ControllerAdvice.