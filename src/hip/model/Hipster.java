package hip.model;

public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "this.jpeg";
		hipsterPhrases[1] = "Insert saracastic comment here.";
		hipsterPhrases[2] = "Hello";
		hipsterPhrases[3] = "Need my starbucks";
	}
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook; 
		
		firstBook = new Book();
		firstBook.setPageCount(61);
		firstBook.setAuthor("Dr Suess");
		firstBook.setSubject("Fiction");		
		firstBook.setTitle("Cat in the hat");
		firstBook.setPrice(4.99);
		
		secondBook = new Book();
		secondBook.setPageCount(61);
		secondBook.setAuthor("Dr Suess");
		secondBook.setSubject("Fiction");		
		secondBook.setTitle("Green eggs and ham");
		secondBook.setPrice(6.99);
		
		thirdBook = new Book();
		thirdBook.setPageCount(61);
		thirdBook.setAuthor("Dr Suess");
		thirdBook.setSubject("Fiction");		
		thirdBook.setTitle("1 Fish 2 Fish Red Fish Blue Fish");
		thirdBook.setPrice(5.99);
		
	}
	public Book[] getHipsterBooks() 
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks) 
	{
		this.hipsterBooks = hipsterBooks;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String[] getHipsterPhrases() 
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases) 
	{
		this.hipsterPhrases = hipsterPhrases;
	}
	

}
