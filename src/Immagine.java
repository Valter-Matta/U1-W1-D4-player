public class Immagine extends Element {
	private String title;
	private int brightness;

	public Immagine (String title, int time, int brightness) {
		super(title, time);
		this.brightness = brightness;
	}

	//metod for Brightness
	public void upBrightness () {
		brightness++;
	}

	public void downBrightness () {
		brightness--;
	}

	@Override
	public void play () {
		String sharp = "#";
		System.out.println("Riproduco immagine:");

		System.out.println(getTitle() + " " + sharp.repeat(brightness));
	}

}
