package builder;

public class Builder{

	private int[] values;

	public Builder(){
	
		values = new int[5];
	}
	
	public int create(){
		
		if(values[0] == 1 && values[1] == 1 && values[2] == 2 && values[3] == 3 && values[4] == 4){
			throw new IllegalStateException();				
		}
		
		return (values[0] + values[1] + values[2]) / 3;		
		
	}
	
public void set00(){
	values[0] = 0;
}
public void set01(){
	values[0] = 1;
}
public void set02(){
	values[0] = 2;
}
public void set03(){
	values[0] = 3;
}
public void set04(){
	values[0] = 4;
}
public void set10(){
	values[1] = 0;
}
public void set11(){
	values[1] = 1;
}
public void set12(){
	values[1] = 2;
}
public void set13(){
	values[1] = 3;
}
public void set14(){
	values[1] = 4;
}
public void set20(){
	values[2] = 0;
}
public void set21(){
	values[2] = 1;
}
public void set22(){
	values[2] = 2;
}
public void set23(){
	values[2] = 3;
}
public void set24(){
	values[2] = 4;
}
public void set30(){
	values[3] = 0;
}
public void set31(){
	values[3] = 1;
}
public void set32(){
	values[3] = 2;
}
public void set33(){
	values[3] = 3;
}
public void set34(){
	values[3] = 4;
}
public void set40(){
	values[4] = 0;
}
public void set41(){
	values[4] = 1;
}
public void set42(){
	values[4] = 2;
}
public void set43(){
	values[4] = 3;
}
public void set44(){
	values[4] = 4;
}

	
}
