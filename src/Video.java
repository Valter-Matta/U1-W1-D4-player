public class Video extends Element {
	private int brightness;
	private int volume;

	public Video (String nome, int time, int brightness, int volume) {
		super(nome, time);
		this.brightness = brightness;
		this.volume = volume;
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

	//method for volume
	@Override
	public void upVolume () {
		volume++;
	}

	@Override
	public void downVolume () {
		volume--;
	}

	@Override
	public void play () {
		String dotEsclamation = "!";
		String sharp = "#";
		System.out.println("Riproduco video:");
		for (int i = 0; i < getTime(); i++) {
			System.out.println(getTitle() + " " + dotEsclamation.repeat(volume) + " " + sharp.repeat(brightness));
		}
	}
}
