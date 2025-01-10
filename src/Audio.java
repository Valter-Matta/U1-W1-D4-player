public class Audio extends Element {


	private int volume;

	public Audio (String nome, int time, int volume) {
		super(nome, time);
		this.volume = volume;
	}

	//getter
	public int getVolume () {
		return volume;
	}

	public void upVolume () {
		volume++;
	}

	public void downVolume () {
		volume--;
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
