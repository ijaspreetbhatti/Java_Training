interface R{
	void met();
}

class Other {
	void doSomething(R ref){
		ref.met();
	}
}

class AnnonymousVersion2{
	public static void main(String[] args) {
		Other other = new Other();

		other.doSomething(new R(){
			@Override
			public void met(){
				System.out.println("Inside met...");
			}
		});
	}
}