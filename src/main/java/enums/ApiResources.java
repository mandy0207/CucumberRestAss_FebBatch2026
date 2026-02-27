package enums;

public enum ApiResources {
	
	postBook("/Library/Addbook.php"),
	getBook("/Library/GetBook.php"),
	deleteBook("/Library/DeleteBook.php"),
	LibraryManagementBaseUrl("http://216.10.245.166");
	
	public final String resource;
	
	ApiResources(String resource){
		this.resource= resource;
	}
	
	public String getResource() {
		return resource;
	}
}
