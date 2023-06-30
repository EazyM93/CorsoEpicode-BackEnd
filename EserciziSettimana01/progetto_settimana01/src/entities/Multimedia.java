package entities;

public abstract class Multimedia {

	
	private String title;
	
	Multimedia(String _title){
		this.title = _title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
}
