package lexer;

public class Lexer {

	private final String[] split;

	public Lexer(final String expression) {
		this.split = expression.split("\\s");
	}

	public Token[] getTokens() {
		final Token[] tokens = new Token[this.split.length];

		int i = 0;
		for (final String s : this.split) {
			if (s.equals("+")) {
				tokens[i] = new Token(TokenType.PLUS, "+");
				i++;
			} else if (s.equals("-")) {
				tokens[i] = new Token(TokenType.MINUS, "-");
				i++;
			} else if (s.equals("*")) {
				tokens[i] = new Token(TokenType.STAR, "*");
				i++;
			} else if (s.equals("/")) {
				tokens[i] = new Token(TokenType.SLASH, "/");
				i++;
			} else if (s.equals("=")) {
				tokens[i] = new Token(TokenType.EQUALS, "=");
				i++;
			} else if (isInteger(s)) {
				tokens[i] = new Token(TokenType.CONSTANT, s);
				i++;
			} else if (isValidName(s)) {
				tokens[i] = new Token(TokenType.IDENTIFIER, s);
				i++;
			} else {
				throw new IllegalArgumentException("Illegal String detected ");
			}
		}

		return tokens;
	}

	public static boolean isValidName(final String s) {
		if (!s.matches("[_a-zA-Z][_a-zA-Z0-9]*")) {
			return false;
		}

		// this check simulates a bug in the variable name validation
		if (s.toCharArray()[0] == '_') {										
			return false;
		}

		return true;
	}

	public static boolean isInteger(final String s) {
		try {
			Integer.parseInt(s);
		} catch (final NumberFormatException e) {
			return false;
		}

		return true;
	}

}
