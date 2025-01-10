
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Creiamo 5 elementi: canzone, video o immagine, dopo potrai riprodurli");
		Element[] list = new Element[6];

		for (int i = 0; i < 5; i++) {
			System.out.println("digita cosa vuoi produrre: canzone, video o immagine");
			String select = scanner.nextLine();
			if (select.equals("canzone")) {

				System.out.println("Digita il titolo della canzone:");
				String title = scanner.nextLine();
				System.out.println("Quanto dura la canzone?");
				int time = scanner.nextInt();
				System.out.println("A che volume la riproduco?");
				int volume = scanner.nextInt();
				scanner.nextLine();
				list[i] = new Audio(title, time, volume);


			} else if (select.equals("video")) {
				System.out.println("Digita il titolo del video:");
				String title = scanner.nextLine();
				System.out.println("Quanto dura il video?");
				int time = scanner.nextInt();
				System.out.println("A che volume lo riproduco?");
				int volume = scanner.nextInt();
				scanner.nextLine();
				list[i] = new Video(title, time, volume);

			} else if (select.equals("immagine")) {
				System.out.println("Digita il titolo dell'immagine:");
				String title = scanner.nextLine();
				System.out.println("Quanta luminosità?");
				int brightness = scanner.nextInt();
				scanner.nextLine();
				list[i] = new Immagine(title, 0, brightness);

			} else {
				System.out.println("non hai digitato correttamente");
				i--;
			}
		}
		int numOfElement = 1;
		while (numOfElement != 0) {
			System.out.println("Ottimo abbiamo creato 5 elementi, digita un numero da 1 a 5 per riprodurre ciò che hai creato (0 per uscire):");
			numOfElement = scanner.nextInt();
			if (numOfElement >= 1 && numOfElement <= 5) {
				Element element = list[numOfElement - 1];
				element.play();
			} else if (numOfElement == 0) {
				System.out.println("Spero ti sia divertito, a presto");
			} else {
				System.out.println("numero non valido");
			}
		}
		scanner.close();


	}
}