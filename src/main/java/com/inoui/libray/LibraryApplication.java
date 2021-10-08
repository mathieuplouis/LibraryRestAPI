package com.inoui.libray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


import com.inoui.libray.model.Book;
import com.inoui.libray.repository.BookRepository;

@SpringBootApplication
public class LibraryApplication {
	
	//Injecting the BookRepository
	@Autowired
	private BookRepository  bookRepository;
	//Use a call back to setup the data
	@Component
	class DataSetup implements ApplicationRunner{

		@Override
		public void run(ApplicationArguments args) throws Exception {
			bookRepository.save(Book.builder().title("UML 2 and Design Pattern").isbn("Uml-2-10-1212").numberOfPages(1751).build());
			bookRepository.save(Book.builder().title("The Bible").isbn("Bible-600-BF-JC").numberOfPages(1861).build());
		}
		
	} 

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
