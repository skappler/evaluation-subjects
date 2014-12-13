package recursion;

public class Recursion {


	public int recursion(int i, int n){

		if(n == 42)
			throw new IllegalArgumentException("Something bad happened");

		if(i <= 0)
			return 1;

		return i* recursion(--i, ++n);

	}


}
