package entities;

public class Video extends Audio implements Visual_media{

	private int brightness = 5;
	private int volume = 5;
	
	public Video(String _title, int _mediaLength) {
		super(_title, _mediaLength);
		
	}
	
	@Override
	public void play() {
		String str1 = new String();
		
		if(getVolume() >= 10) str1 = "Max Volume (10)";
			
		else if(getVolume() == 0) str1 = "Muted";
			
		else for(int i = 0; i < getVolume(); i++) str1 += "!";
			
		System.out.println(getTitle() + " " + str1);
		
		String str2 = new String();
		
		if(getBrightness() >= 10) str2 = "Max Bright (10)";
		
		else if(getBrightness() == 1) str2 = "Min Bright (1)";
		
		else for(int i = 0; i < getBrightness(); i++) str2 += "*";
		
		System.out.println(getTitle() + " " + str2);
	}

	@Override
	public void increaseBrightness() {
		if(getBrightness() < 10) this.brightness++;
	}

	@Override
	public void decreaseBrightness() {
		if(getBrightness() > 1) this.brightness--;
	}

	@Override
	public int getBrightness() {
		return this.brightness;
	}
	
}
