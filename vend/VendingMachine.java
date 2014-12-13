package vend;

public class VendingMachine {
	private static final int COST = 75;

	private int currValue;

	private boolean enabled;

	public VendingMachine() {
		this.currValue = 0;
		this.enabled = false;
	}

	public void insert(final Coin coin) {
		final int value = coin.getValue();
		if (value == 0) {
			System.err.println("illegal value");
		} else {
			this.currValue += value;
			System.out.print("Current value = " + this.currValue);
			if (this.currValue >= COST) {
				this.enabled = true;
				System.out.println(" (sufficient credit)");
			} else {
				System.out.println("");
			}
		}
	}

	public void returnCoins() {
		if (this.currValue == 0) {
			System.err.println("no coins to return");
		} else {
			System.out.println("Take your coins");
			this.currValue = 0;
			this.enabled = false;
		}
	}
	
	public void vend() throws Exception {
		if (this.enabled) {
			System.out.println("Get your drink");
			this.currValue -= COST;
			if (this.currValue == 0) {
				this.enabled = false;
			}
			System.out.println("Current value = " + this.currValue);
		} else {
			System.out.println("Not enough credit: add " + (COST - this.currValue));
		}
		if (this.currValue < 0) {
			throw new Exception("Error: negative credit!");
		}
	}
}
