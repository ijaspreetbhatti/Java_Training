// Annonynous Inner Classes - Version 1

interface Remote{
	void doSomething();
}


class AnnonymousVersion1{
	public static void main(String[] args) {
		//
		Remote ref = new Remote(){
			@Override
			public void doSomething(){
				System.out.println("special piece of syntax...");

			}

		};
		ref.doSomething();
	}
}










// class Sub implements Remote{
// 	@Override
// 	public void doSomething(){
// 		//
// 	}
// }