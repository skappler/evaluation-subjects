package vend;

public class Coin {
	public static final int DIME = 10;

	public static final int HALFDOLLAR = 50;

	public static final int INVALID = 0;

	public static final int NICKEL = 5;

	public static final int PENNY = 1;

	public static final int QUARTER = 25;

	public static final int SILVERDOLLAR = 100;

	private int value;

	public static Coin create(final String value) {
		return new Coin(value);
	}

	private Coin(final String coin) {
		final String toUpperCoin = coin.toUpperCase();
		if (toUpperCoin.equals("PENNY")) {
			this.value = PENNY;
		} else if (toUpperCoin.equals("NICKEL")) {
			this.value = NICKEL;
		} else if (toUpperCoin.equals("DIME")) {
			this.value = DIME;
		} else if (toUpperCoin.equals("QUARTER")) {
			this.value = QUARTER;
		} else if (toUpperCoin.equals("HALFDOLLAR")) {
			this.value = HALFDOLLAR;
		} else if (toUpperCoin.equals("SILVERDOLLAR")) {
			this.value = SILVERDOLLAR;
		} else {
			this.value = INVALID;
		}
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return Integer.toString(this.value);
	}
}
