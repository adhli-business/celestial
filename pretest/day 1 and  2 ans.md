### **Putra Adhli Falah | 71480**

### 🔸 **A. Pilihan Ganda**

1. B. Mengelola logika aplikasi dan komunikasi data dengan database
2. A. Menyembunyikan detail implementasi dan menyediakan akses lewat method
3. C. Meng-inject dependency otomatis ke dalam beans
4. A. Agar controller lebih ringan dan fokus pada request/response
5. C. `@GetMapping("/api")`

### 🔸 **B. True / False**

6. False, karena harus ada request dulu dari front end baru diresponse oleh backend
7. True
8. True
9. False
10. True

### 🔸 **C. Jawaban Singkat Penjelasan**

11. Backend adalah bagian yang tidak terlihat pengguna, dan memiliki tanggung jawab untuk mengelola data, menjalankan logika bisnis, dan memastikan aplikasi dapat berjalan dengan baik
12. Class adalah template untuk membuat objek, sementara object adalah instansiasi dari kelas tersebut
13. Prinsip selain encapsulation dalam OOP:
- Inheritance adalah mekanisme yang bisa menurunkan attribut dan methodnya dari super class kepada kelas lain (sub class)
- Polymorphism adalah kemampuan entitas seperti class untuk memiliki berbagai bentuk
14. Anotasi `@RestController` di Spring Boot digunakan untuk membuat kelas kontroler yang menangani permintaan HTTP dan mengembalikan respons dalam bentuk data JSON atau XML
15. Spring Boot dapat mempercepat development dengan config otomatis, dependency injection, dan embedded server, sehingga tidak perlu setup manual dari nol.
16. Spring menyuntikkan dependensi (objek) secara otomatis ke class yang membutuhkannya.
17. Untuk memisahkan tanggung jawab, reusable, dan agar kode rapi, terstruktur, mudah diuji, dan dipelihara.
18. Spring tidak mengenali class sebagai bean sehingga tidak bisa di-inject.
19. `@RequestParam` digunakan untuk Mengambil data dari URL (query string).
- contoh: URL: /hello?name=Ali → output: Hello Ali
20. Buat constructor di controller dengan parameter service-nya.

### 🔸 **D. Koreksi Kode**
21. 
```java
@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }
}
```
Kesalahan: helloService tidak dideklarasikan atau di-inject.

22. 
```java
public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

```
Kesalahan: Method Person tertulis seperti constructor, tapi ada void, sehingga itu bukan constructor.

23. 
```java
@RestController
public class GreetController {
    @PostMapping("/greet")
    public String greet(@RequestBody String name) {
        return "Hello, " + name;
    }
}
```
Kesalahan: Tipe parameter name tidak ditentukan. Harus String name.

24. 
```java
@Service
public class InfoService {
    public String getInfo() {
        return "Info OK";
    }
}

@RestController
public class InfoController {
    private final InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/info")
    public String get() {
        return infoService.getInfo();
    }
}
```
Kesalahan: Jangan new service, gunakan dependency injection.

25. 
```java
@RestController
public class MathController {
    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
```
Kesalahan: Tidak menggunakan @RequestParam, sehingga parameter tidak bisa diambil dari URL.