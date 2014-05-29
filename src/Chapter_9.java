import java.util.Scanner;

//import com.sun.corba.se.spi.orbutil.fsm.Input;
//import com.sun.xml.internal.ws.api.pipe.NextAction;

//import com.sun.org.apache.xpath.internal.operations.And;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Chapter_9 {
	private Scanner input;

	// zad1
	public void printName(String name) {
		System.out.println("Hello, " + name + "!\n");
	}

	// zad2
	public int getMax(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	// zad3
	public void printNumbName(int a) {
		int b = a % 10;
		switch (b) {
		case 1:
			System.out.print("one\n");
			break;
		case 2:
			System.out.print("two\n");
			break;
		case 3:
			System.out.print("three\n");
			break;
		case 4:
			System.out.print("four\n");
			break;
		case 5:
			System.out.print("five\n");
			break;
		case 6:
			System.out.print("six\n");
			break;
		case 7:
			System.out.print("seven\n");
			break;
		case 8:
			System.out.print("eight\n");
			break;
		case 9:
			System.out.print("nine\n");
			break;

		default:
			System.out.print("zero\n");
			break;
		}
	}

	// zad4
	public void countNinMassive(int[] array, int n) {
		int counter = 0;
		for (int num : array) {
			if (n == num) {
				counter += 1;
			}
		}
		System.out.println(counter);
	}

	// zad5
	public void checkNeighborsSize(int[] array, int position) {
		if (position == 0 || position == array.length) {
			System.out.println("This element has only one neighbor\n");
		} else if (position < 0 || position > array.length) {
			System.out.println("Invalid position\n");
		} else if ((getMax(array[position], array[position + 1]) == array[position])
				&& (getMax(array[position], array[position - 1]) == array[position])) {
			System.out.println("This element is bigger then his neighbors\n");
		} else if ((getMax(array[position], array[position + 1]) == array[position + 1])
				&& (getMax(array[position], array[position - 1]) == array[position - 1])) {
			System.out.println("This element is smaller then his neighbors\n");
		} else {
			System.out.println("This element is undefined of his neighbors\n");
		}
	}

	// zad6
	public int returnPosition(int[] array) {
		int position = -1;
		for (int i = 1; i < array.length - 1; i++) {
			if ((getMax(array[i], array[i + 1]) == array[i])
					&& (getMax(array[i], array[i - 1]) == array[i])) {
				return position = i;
			}
		}
		return position;
	}

	// zad7
	public void printReversNumber(int num) {
		while (num != 0) {
			System.out.println(num % 10);
			num = num / 10;

		}
	}

	// zad8
	public long nFacturiel(long  num) {
		if (num == 0) {
			return 1;
		} else
			num = num * nFacturiel(num - 1);

		return num;
	}

	// zad9a
	public int reversNumber(int num) {
		int rNumb = 0;
		while (num != 0) {
			rNumb += num % 10;
			num = num / 10;
			rNumb = rNumb * 10;
		}
		return rNumb / 10;
	}

	// zad9b
	public double average(int intArray[]) {
		double sum = 0;
		for (int i : intArray) {
			sum += i;
		}
		return sum / intArray.length;
	}

	// zad9c
	public double linearEquation(int a, int b) {
		double x = 0;
		x = -b / a;
		return x;
	}

	// zad9
	public void zad9() {
		input = new Scanner(System.in);
		System.out.println("if you want to revers number chose 1");
		System.out.println("if you want to average of 4 numbers chose 2");
		System.out.println("if you want linear quation of a*x+b=0 chose 3");
		int i = input.nextInt();
		switch (i) {
		case 1:
			System.out.println("Enter one number:");
			int num = input.nextInt();
			System.out.println(reversNumber(num));
			break;
		case 2:
			System.out.println("Enter 4 numbers:");
			int intArray[] = new int[4];
			intArray[0] = input.nextInt();
			intArray[1] = input.nextInt();
			intArray[2] = input.nextInt();
			intArray[3] = input.nextInt();
			System.out.println(average(intArray));
		case 3:
			System.out.println("Enter a=:");
			int a = input.nextInt();
			if (a == 0) {
				System.out.println("a have to be diferent from 0 !");
				System.out.println("Enter a=:");
				a = input.nextInt();
			}
			System.out.println("Enter b=:");
			int b = input.nextInt();
			System.out.println(linearEquation(a, b));
		default:
			break;
		}
	}

	// zad10
	public void asd() {

	}

	/* MAIN */
	public static void main(String[] args) {
		Chapter_9 zad = new Chapter_9();

		zad.printName("Pesho");
		int max = zad.getMax(zad.getMax(9, 7), 6);
		System.out.println(max);
		zad.printNumbName(54375);
		int[] array = { 1, 2, 4, 2, 1, 5, 1, 2, 5, 4, 2, 3, 2 };
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		zad.countNinMassive(array, 2);
		zad.checkNeighborsSize(array, 14);
		System.out.println(zad.returnPosition(array));
		System.out.println(zad.returnPosition(array1));
		zad.printReversNumber(1234567890);
		System.out.println(zad.linearEquation(1, 2));
		System.out.println(zad.nFacturiel(10));
	}
}
