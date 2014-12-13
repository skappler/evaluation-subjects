package stackmachine;

public class StackMachineTest {

	public static void main(final String... args) {

		final StackMachine sm = new StackMachine();

		sm.push(0);
		sm.push(0);
		sm.push(Operator.DIVIDED);
	}

}
