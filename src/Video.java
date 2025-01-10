public class Video extends Element {
	private int brightness;
	private int volume;

	public Video (String nome, int time, int brightness) {
		super(nome, time);
		this.brightness = brightness;
	}

	//getter
	public int getBrightness () {
		return brightness;
	}

	public int getVolume () {
		return volume;
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
		String dotEsclamation = "!";
		String sharp = "#";
		System.out.println("Riproduco video:");
		for (int i = 0; i < getTime(); i++) {
			System.out.println(getTitle() + " " + dotEsclamation.repeat(volume) + " " + sharp.repeat(brightness));
		}
	}
}
