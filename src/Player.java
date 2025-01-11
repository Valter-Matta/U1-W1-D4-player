import java.util.Scanner;

public class Player {


	public void playerUse () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Creiamo 5 elementi: canzone, video o immagine, dopo potrai riprodurli");
		Element[] list = new Element[6];
		for (int i = 0; i < 5; i++) {
			System.out.println("digita cosa vuoi produrre: canzone, video o immagine");
			String select = scanner.nextLine();
			switch (select) {
				case "canzone" -> {
					System.out.println("Digita il titolo della canzone:");
					String title = scanner.nextLine();
					System.out.println("Quanto dura la canzone?");
					int time = scanner.nextInt();
					System.out.println("A che volume la riproduco?");
					int volume = scanner.nextInt();
					scanner.nextLine();
					list[i] = new Audio(title, time, volume);
				}
				case "video" -> {
					System.out.println("Digita il titolo del video:");
					String title = scanner.nextLine();
					System.out.println("Quanto dura il video?");
					int time = scanner.nextInt();
					System.out.println("A che volume lo riproduco?");
					int volume = scanner.nextInt();
					System.out.println("Che luminosità vuoi?");
					int brightness = scanner.nextInt();
					scanner.nextLine();
					list[i] = new Video(title, time, brightness, volume);
				}
				case "immagine" -> {
					System.out.println("Digita il titolo dell'immagine:");
					String title = scanner.nextLine();
					System.out.println("Quanta luminosità?");
					int brightness = scanner.nextInt();
					scanner.nextLine();
					list[i] = new Immagine(title, 0, brightness);
				}
				default -> {
					System.out.println("non hai digitato correttamente");
					i--;
				}
			}
		}

		int numOfElement = 1;
		while (numOfElement != 0) {
			System.out.println("Ottimo abbiamo creato 5 elementi, digita un numero da 1 a 5 per riprodurre ciò che hai creato (0 per uscire):");
			numOfElement = scanner.nextInt();
			scanner.nextLine();
			if (numOfElement >= 1 && numOfElement <= 5) {
				Element element = list[numOfElement - 1];
				element.play();
				if (element instanceof Video) {
					System.out.println("vuoi modificare il volume? | Digita: + o -");
					String response = scanner.nextLine();

					if (response.equals("+")) {
						element.upVolume();
					} else {
						element.downVolume();
					}
					System.out.println("Volume aggiornato, replay :)");
					element.play();

					System.out.println("vuoi modificare la luminosità? | Digita: + o -");
					response = scanner.nextLine();
					if (response.equals("+")) {
						element.upBrightness();
					} else {
						element.downBrightness();
					}
					System.out.println("Luminosità aggiornata, replay :)");
					element.play();
				}
				if (element instanceof Audio) {
					System.out.println("vuoi modificare il volume? | Digita: + o -");
					String response = scanner.nextLine();
					if (response.equals("+")) {
						element.upVolume();
					} else {
						element.downVolume();
					}
					System.out.println("Volume aggiornato, replay :)");
					element.play();
				}
				if (element instanceof Immagine) {
					System.out.println("vuoi modificare la luminosita dell'immagine? | Digita: + o -");
					String response = scanner.nextLine();
					if (response.equals("+")) {
						element.upBrightness();
					} else {
						element.downBrightness();
					}
					System.out.println("Luminusità aggiornata, replay :)");
					element.play();
				}
			} else if (numOfElement == 0) {
				System.out.println("Spero ti sia divertito, a presto");
			} else {
				System.out.println("numero non valido");
			}
		}
		scanner.close();
	}
}
