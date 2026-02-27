package pojo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Book {

	@JsonAlias("book_name")
	public String name;
	
	public String isbn;
	public String aisle;
	public String author;
	
	public Book(String name, String isbn, String aisle, String author) {
		this.name = name;
		this.isbn = isbn;
		this.aisle = aisle;
		this.author = author;
	}

	public Book() {
		
	}
	public String getName() {
		return name;
	}

	public String getIsbn() {
		return isbn;
	}


	public String getAisle() {
		return aisle;
	}

	public String getAuthor() {
		return author;
	}


	
	
	
	
}
