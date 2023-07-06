package entities;

public abstract class Info {

	private Long id;
	private String name;
	
	Info(Long _id, String _name){
		this.id = _id;
		this.name = _name;
	}
	
	// getters
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
}
