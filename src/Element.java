public abstract class Element {

	private final String title;
	private final int time;


	public Element (String title, int time) {
		this.title = title;
		this.time = time;
	}

	public int getTime () {
		return time;
	}

	public String getTitle () {
		return title;
	}

	//metod for Brightness
	public abstract void upBrightness ();
	public abstract void downBrightness ();
//metod for volume
	public abstract void upVolume ();
	public abstract void downVolume ();


	public abstract void play ();


}
