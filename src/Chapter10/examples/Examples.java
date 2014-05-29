package Chapter10.examples;

import Chapter10.Cat;
import Chapter10.Sequence;

public class Examples {
	public void example() {
		Cat gosho = new Cat();
		System.out.printf("Sequence[1..3]: %d, %d, %d%n",
				Sequence.nextValue(), Sequence.nextValue(),
				Sequence.nextValue());
		System.out.println(gosho.getName());

	}
}
