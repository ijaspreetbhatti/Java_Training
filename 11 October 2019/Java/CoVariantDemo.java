
class Some{
	Some func(){
		return new Some();
	} 
}

class CoVariantDemo extends Some{

	@Override
	CoVariantDemo func(){ // Works post Java 5 : Co-Variant returns
		return new CoVariantDemo();
	}


	public static void main(String[] args) {
		
	}
}