package entities;

public class Image extends Multimedia implements Visual_media{

	private int brightness = 5;
	
	public Image(String _title) {
		super(_title);
	}
	
	public void show(){
		String str = new String();
		
		if(getBrightness() >= 10) str = "Max Bright (10)";
		
		else if(getBrightness() == 1) str = "Min Bright (1)";
		
		else for(int i = 0; i < getBrightness(); i++) str += "*";
		
		System.out.println(getTitle() + " " + str);
	}
	
	@Override
	public int getBrightness() {
		return this.brightness;
	}
	
	@Override
	public void increaseBrightness() {
		if(getBrightness() < 10) this.brightness++;
	}

	@Override
	public void decreaseBrightness() {
		if(getBrightness() > 1) this.brightness--;
	}
	
}
