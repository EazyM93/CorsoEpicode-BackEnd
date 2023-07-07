package entities;

public class Magazine extends ReadableElement{

	private Frequency frequency;

	public Magazine(long isbn, String title, int year, int pages, Frequency frequency) {
		super(isbn, title, year, pages);
		this.frequency = frequency;
	}

	// getters
	public Frequency getFrequency() {
		return frequency;
	}

	// setters
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	
	@Override
	public String toString() {
		return "ISBN: " + getIsbn() + "\nTitolo: " + getTitle() + "\nAnno: " + getYear() + "\nPagine: " + getPages() +  "\nFrequenza: " + getFrequency() + "\n";
	}
	
	public String toStringSave() {
		return getIsbn() + "!" + getTitle() + "!" + getYear() + "!" + getPages() + "!" + getFrequency();
	}
}
