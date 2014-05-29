public class Chapter_13 {
	public void zad1(String str) {
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		System.out.println(reversed);
	}

	public void zad2(String str) {
		int count = 0;
		int index = str.indexOf("in");
		if (index != -1) {
			count = 1;
		}
		while (index != -1) {
			index = str.indexOf("in", index + 1);
			count++;
		}
		System.out.println(count);
	}

	public void zad3(String str) {
		int count = 0; // za borq sreshtaniq na <upcase> v teksta
		StringBuilder temp = new StringBuilder();
		int indexS = str.indexOf("<upcase>");
		int indexE = str.indexOf("</upcase>");
		if (indexS != -1) {
			temp.append(str, 0, indexS);
			temp.append(str.toUpperCase(), indexS + 8, indexE - 1);
			count++;
		}

		while (indexS != -1) {
			indexS = str.indexOf("<upcase>", indexS + 1);
			indexE = str.indexOf("</upcase>", indexE + 1);
			if (indexS != -1) {
				temp.append(str, temp.length() + 18, indexS); // 18 idva ot
																// duljinata na
																// <upcase> +
																// </upcase> +1
				temp.append(str.toUpperCase(), indexS + 8, indexE);
				count++;
			}
			temp.append(str, temp.length() + (18 * count - 1), str.length());
		}
		System.out.println(temp);
	}

	public void zad41(String str, String[] forbidenWords) {
		StringBuilder fixed = new StringBuilder();
		StringBuilder tempString = new StringBuilder();
		StringBuilder fixedWord = new StringBuilder();

		for (int y = 0; y < forbidenWords.length; y++) {
			/* ......................................................... */
			for (int a = 0; a < forbidenWords[y].length(); a++) {
				fixedWord.append("*"); // problemut e che vseki put apendvam i
										// ne izchistvam prednoto kolichestvo *
			}

			String[] tmp = str.split(forbidenWords[y]);
			for (int i = 0; i < tmp.length; i++) {
				fixed.append(tmp[i]);
				if (i != tmp.length - 1) {
					fixed.append(fixedWord);
				}
			}
			tempString = fixed;
			System.out.println(tempString);

			/* ......................................................... */
		}
	}

	public void zad4(String str, String[] forbidenWords) {
		StringBuilder tmpFixed = new StringBuilder();
		for (int a = 0; a < forbidenWords.length; a++) {
			String tmp[] = str.split(forbidenWords[a]);
			for (int i = 1; i < tmp.length; i++) { // obhojdam vsichki podmasivi
													// sled splitvaneto ot
													// dumata
				for (int x = 0; x < forbidenWords[a].length(); x++) {
					tmpFixed.append("*"); // dobavqm tolkova zvezdichki kolkoto
											// e razmera na stringa koito
											// podavam
				}
				tmpFixed.append(tmp[i]);
				System.out.println(tmpFixed);
			}
		}
	}

	public void zad5(String str) {
		StringBuilder protocol = new StringBuilder();
		StringBuilder server = new StringBuilder();
		StringBuilder resource = new StringBuilder();
		String tmp[] = str.split("[//:]+");
		protocol.append(tmp[0]);
		server.append(tmp[1]);
		for (int i = 2; i < tmp.length; i++) {
			resource.append(tmp[i]);
			if (i != tmp.length - 1) {
				resource.append("/");
			}
		}
		System.out.println(protocol);
		System.out.println(server);
		System.out.println(resource);
	}

	public void zad6(String str) {
		String tmp[] = str.split("[ ]");
		for (int i = tmp.length - 1; i >= 0; i--) {
			System.out.print(tmp[i] + " ");
		}
		System.out.print("\n");
	}
	

	public static void main(String[] args) {
		Chapter_13 test = new Chapter_13();
		// test.zad1("Introduction");
		// test.zad2("We are living in a yellow submarine. We don't have anything else. "
		// +
		// "Inside the submarine is very tight. So we are drinkingall the day. "
		// + "We will move out of it in 5 days.");
		// test.zad3("We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.");
		// String[] forbidenWords = { "Java", "JVM","Microsoft" };
		// test.zad41(
		// "Microsoft announced its next generation Java compiler today. It uses advanced parser and special optimizer for the Microsoft JVM.",
		// forbidenWords);
		// test.zad5(" http://www.devbg.org/forum/zadachi/index.php");
		test.zad6("C# is not C++ and PHP is not Delphi");
	}

}
