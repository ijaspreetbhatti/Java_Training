class MultiThreadDemo extends Thread{
	public static void main(String[] args) {
		
		MultiThreadDemo t1 = new MultiThreadDemo();
		MultiThreadDemo t2 = new MultiThreadDemo();
		MultiThreadDemo t3 = new MultiThreadDemo();


		t1.setName("Aditya");
		t2.setName("Aakash");
		t3.setName("Vaishnavi");

		t1.start();
		t2.start();
		t3.start();

	}

	@Override
	public void run(){
		for(int var = 1; var < 4; var++)
		 System.out.println(Thread.currentThread().getName() + " , var =" + var);
	}


}