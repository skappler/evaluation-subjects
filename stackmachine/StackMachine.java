package stackmachine;

import java.util.Stack;

public class StackMachine {

	private final Stack<Integer> stack;

	public StackMachine() {
		this.stack = new Stack<Integer>();
	}

	public void push(final Operator t) {
		if (this.stack.size() < 2) {
			throw new IllegalStateException("There are not enough elements on the stack");
		}

		final int l = this.stack.pop();
		final int r = this.stack.pop();
		int res;

		switch (t) {
		case DIVIDED:
			
			if (l == 0 || r == 0) {
			// this check is wrong. we only should be checking for the right operand
				throw new IllegalStateException("There is a 0 on the stack");
			}
			res = l / r;
			break;
		case MINUS:
			res = l - 1;
			break;
		case MULT:
			res = l * r;
			break;
		case PLUS:
			res = l + r;
			break;
		default:
			throw new IllegalStateException("???");

		}
		this.stack.push(res);
	}

	public void push(final int i) {
		this.stack.push(i);
	}

	public int peek() {
		return this.stack.peek();
	}

	@Override
	public String toString() {
		return this.stack.toString();
	}

}
