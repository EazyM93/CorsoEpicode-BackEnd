package entities;

public class Audio extends Multimedia implements Playable_media{

	private int mediaLength;
	private int volume = 5;
	
	public Audio(String _title, int _mediaLength) {
		super(_title);
		this.mediaLength = _mediaLength;
	}
	
	public int getMediaLength() {
		return this.mediaLength;
	};
	
	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public void play() {
		String str = new String();
		
		if(getVolume() >= 10) str = "Max Volume (10)";
			
		else if(getVolume() == 0) str = "Muted";
			
		else for(int i = 0; i < getVolume(); i++) str += "!";
			
		System.out.println(getTitle() + " " + str);
	}

	@Override
	public void increaseVolume() {
		if(getVolume() < 10) this.volume++;	
	}

	@Override
	public void decreaseVolume() {
		if(getVolume() > 0) this.volume--;	
	}

}
