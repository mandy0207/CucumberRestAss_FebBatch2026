
package utils;

import com.github.javafaker.Faker;

import pojo.Book;

public class UniqueGenerator {

	
	public static Book getUniqueBookObject() {
		Faker faker= new Faker();
		String isbn=faker.internet().password();
		String aisle= faker.number().digits(4);
		String bookName= faker.book().title();
		String author=faker.book().author();
		
		Book book = new Book(bookName, isbn, aisle, author);
		return book;
	}
}
