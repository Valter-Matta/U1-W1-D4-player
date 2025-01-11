public class Immagine extends Element {

	private int brightness;

	public Immagine (String title, int time, int brightness) {
		super(title, time);
		this.brightness = brightness;
	}

	//metod for Brightness
	@Override
	public void upBrightness () {
		brightness++;
	}

	@Override
	public void downBrightness () {
		brightness--;
	}

	@Override
	public void upVolume () {
		//nada
	}

	@Override
	public void downVolume () {
		//nada
	}

	@Override
	public void play () {
		String sharp = "#";
		System.out.println("Riproduco immagine:");

		System.out.println(getTitle() + " " + sharp.repeat(brightness));
	}

}
