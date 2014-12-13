package lexer;

public class Token {

	private final TokenType type;

	private final String value;

	public Token(final TokenType type, final String value) {
		this.type = type;
		this.value = value;
	}

	public TokenType getType() {
		return this.type;
	}

	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return "(" + this.type + " , " + this.value + ")";
	}
}
