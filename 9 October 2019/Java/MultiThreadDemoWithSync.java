class MultiThreadDemoWithSync extends Thread{
	public static void main(String[] args) {

		MyRunnable myRunnable = new MyRunnable();
		
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		Thread t3 = new Thread(myRunnable);


		t1.setName("Aditya");
		t2.setName("Aakash");
		t3.setName("Vaishnavi");

		t1.start();
		t2.start();
		t3.start();

	}


}

class MyRunnable implements Runnable{
	@Override
	public void run(){


		synchronized(this){
		for(int var = 1; var < 4; var++)
		 System.out.println(Thread.currentThread().getName() + " , var =" + var);
	}
}


}


// 					Shared Bank Account (50,000/-)
// 					Mayank          Gargee


// 					Mayank
// 						- Check Balance : 50,000/-
// 						- Request for Withdrawl :  40,000/-


// 					Gargee
// 						- Check Balance : 50,000/-
// 						- Request for Withdrawl :  25,000/-
// 						- Not enough cash
// 						- Check Balance : 10,000/-


// - synchronized 


