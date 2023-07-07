package entities;

public class Book extends ReadableElement{

	private String author;
	private Genre genres;
	
	public Book(long isbn, String title, int year, int pages, String author, Genre genres) {
		super(isbn, title, year, pages);
		this.author = author;
		this.genres = genres;
	}

	// getters
	public String getAuthor() {
		return author;
	}

	public Genre getGenres() {
		return genres;
	}

	// setters
	public void setAuthor(String author) {
		this.author = author;
	}

	public void setGenres(Genre genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "ISBN: " + getIsbn() + "\nTitolo: " + getTitle() + "\nAutore: " + getAuthor() + "\nAnno: " + getYear() + "\nPagine: " + getPages() +  "\nGenere: " + getGenres() + "\n";
	}
	
	public String toStringSave() {
		return "Book!" + getIsbn() + "!" + getTitle() + "!" + getYear() + "!" + getPages() + "!" + getAuthor() + "!" + getGenres();
	}
	
}
