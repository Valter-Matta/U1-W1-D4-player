public abstract class Element {

	private String title;
	private int time;


	public Element (String title, int time) {
		this.title = title;
		this.time = time;
	}

	public int getTime(){
		return time;
	}
	public String getTitle(){
		return title;
	}

	public abstract void play();




}
