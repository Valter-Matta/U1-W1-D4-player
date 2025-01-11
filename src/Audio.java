public class Audio extends Element {

	private int volume;

	public Audio (String nome, int time, int volume) {
		super(nome, time);
		this.volume = volume;
	}

	@Override
	public void upVolume () {
		volume++;
	}

	@Override
	public void downVolume () {
		volume--;
	}

	//metod for Brightness
	@Override
	public void upBrightness () {
		//
	}

	@Override
	public void downBrightness () {
		//
	}

	@Override
	public void play () {
		String dotEsclamation = "!";
		System.out.println("Riproduco canzone:");
		for (int i = 0; i < getTime(); i++) {
			System.out.println(getTitle() + " " + dotEsclamation.repeat(volume));
		}
	}

}
