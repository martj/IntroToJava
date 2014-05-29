import java.util.Random;
import java.util.Scanner;

import Chapter10.Cat;

public class Chapter_11 {
	private Scanner input;

	public void zad1() {
		long secs = System.currentTimeMillis() / 1000;
		int mins = (int) (secs / 60);
		int hours = mins / 60;
		int days = hours / 24;
		System.out.println(secs);
		System.out.println(mins);
		System.out.println(hours);
		System.out.println(days);
	}

	public void zad2() {
		input = new Scanner(System.in);
		System.out.println("Vuvedete 2 kateta na pravougulen triugulnik:");
		double k1 = input.nextInt();
		double k2 = input.nextInt();
		double result = Math.sqrt(k1 * k1 + k2 * k2);
		System.out.println(result);
	}

	/*
	 * zad3 e da se suzdadat 2 packeta i da se izvikat razni neshta ot ediniq v
	 * drugiq
	 */

	public void zad4() {
		Cat[] Cats = new Cat[10];
		String name = "Cat";
		String catName = name;
		for (int i = 0; i < 10; i++) {
			catName = name;
			catName += i;
			Cats[i] = new Cat(catName, "asd");
		}
		for (int i = 0; i < 10; i++) {
			Cats[i].sayMiau();
		}
	}

	public void zad5() {
		String[] frases = { "Produktut e otlichen.",
				"Tova e strahoten produkt.", "Postoqnni polzvam tozi produkt.",
				"Tova e nai-dobriqt produkt ot tazi kategoriq." };
		String[] events = { "Veche se chuvstvam dobre.",
				"Uspqh da se promenq.", "Toi napravi chudo.",
				"Ne moga da povqrvam, no veche se chuvstvam strahnotno.",
				"Opitaite i vie. Az sum mnogo dovolna." };
		String[] fNames = { "Diana", "Petq", "Stela", "Elena", "Katq" };
		String[] lNames = { "Ivanova", "Petrova", "Kirowa" };
		String[] cityes = { "Sofia", "Plovdiv", "Varna", "Ruse", "Burgas" };
		Random rand = new Random();
		System.out.println(frases[rand.nextInt(frases.length)] + " "
				+ events[rand.nextInt(events.length)] + " - - "
				+ fNames[rand.nextInt(fNames.length)] + " "
				+ lNames[rand.nextInt(lNames.length)] + ", "
				+ cityes[rand.nextInt(cityes.length)]);
	}

	public static void main(String[] args) {
		Chapter_11 test = new Chapter_11();

		test.zad5();
	}
}
