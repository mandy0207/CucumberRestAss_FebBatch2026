
package utils;

import com.github.javafaker.Faker;

import pojo.Book;


public class UniqueGenerator {

	static Faker faker;
	static {
		faker= new Faker();
	}
	
	public static Book getUniqueBookObject() {
		
		String isbn=faker.internet().password();
		String aisle= faker.number().digits(4);
		String bookName= faker.book().title();
		String author=faker.book().author();
		
		Book book = new Book(bookName, isbn, aisle, author);
		return book;
	}
	
	public static String getUnqiqueString() {
		return faker.name().firstName();
	}
}
