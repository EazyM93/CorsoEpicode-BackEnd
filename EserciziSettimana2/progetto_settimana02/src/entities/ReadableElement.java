package entities;

public abstract class ReadableElement {

	private long isbn;
	private String title;
	private int year;
	private int pages;
	
	public ReadableElement(long isbn, String title, int year, int pages) {
		this.isbn = isbn;
		this.title = title;
		this.year = year;
		this.pages = pages;
	}

	//getters
	public long getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public int getPages() {
		return pages;
	}

	//setters
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
