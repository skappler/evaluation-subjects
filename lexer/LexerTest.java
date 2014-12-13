package lexer;

import java.util.Arrays;

public class LexerTest {

	public static void main(final String... args) {
		String s = "bar = counter + i * baz - _foo";
		final Lexer l = new Lexer(s);
		System.out.println(Arrays.toString(l.getTokens()));
	}

}
