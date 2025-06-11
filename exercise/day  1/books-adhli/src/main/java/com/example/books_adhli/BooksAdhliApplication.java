package com.example.books_adhli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/api/books")
public class BooksAdhliApplication {
	private Map<Integer, BooksRequest> bookRepo = new HashMap<>();
	private int idCounter = 1;

	public static void main(String[] args) {
		SpringApplication.run(BooksAdhliApplication.class, args);
	}

	@GetMapping
	public BooksRequest getBooks(@RequestParam int id) {
		return bookRepo.getOrDefault(id, new BooksRequest());
	}

	@PostMapping
	public String postBooks(@RequestBody BooksRequest book){
		book.setId(idCounter++);
		bookRepo.put(book.getId(), book);
		return "Buku berhasil dibuat: " + book.getTitle();
	}

	@PutMapping("")
	public String putBooks(@RequestBody BooksRequest book){
		if (bookRepo.containsKey(book.getId())){
			bookRepo.put(book.getId(), book);
			return "Buku berhasil diperbarui: " + book.getTitle();
		} else {
			return "Buku dengan ID " + book.getId() + " tidak ditemukan.";
		}
	}

	@DeleteMapping
	public String deleteBooks(@RequestParam int id) {
		if (bookRepo.remove(id) != null) {
			return "Buku dengan ID " + id + " berhasil dihapus.";
		} else {
			return "Buku dengan ID " + id + " tidak ditemukan.";
		}
	}
}
