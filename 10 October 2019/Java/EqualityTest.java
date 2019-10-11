class Shirt{

	String color;
	int size;

Shirt(String color, int size){
	this.color = color;

	this.size = size;
}

String getColor(){
	return this.color;
}

Integer getSize(){
	return this.size;
}


@Override
public boolean equals(Object ref){

	if(ref instanceof Shirt)
		return this.getSize().equals(((Shirt)ref).getSize());
	else
		return false;
	}
}
  

class EqualityTest{
	public static void main(String[] args) {
		Shirt first = new Shirt("blue", 38);
		Shirt second = new Shirt("black", 38);

		if(first.equals(second)){ 
			System.out.println("Same shirts");
		}
		else{
			System.out.println("Different");
		}
	}
}