package builder;

public class BuilderTest{
	
	public static void main(String... args){
		
		Builder b = new Builder();
		
		b.set01();
		b.set11();
		b.set22();
		b.set33();
		b.set44();
		
		
		b.create();	
		
	}	

}
