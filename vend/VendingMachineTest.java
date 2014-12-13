package vend;

public class VendingMachineTest {

	public static void main(final String... args) throws Exception {
	
		final VendingMachine vendingMachine0 = new VendingMachine();
		final String string0 = "SILVERDOLLAR";
		final Coin coin0 = Coin.create(string0);
		vendingMachine0.insert(coin0);
		vendingMachine0.vend();
		vendingMachine0.vend();
	}

}
