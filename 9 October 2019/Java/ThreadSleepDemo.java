class ThreadSleepDemo extends Thread{
	public static void main(String[] args) throws InterruptedException {
		ThreadSleepDemo t = new ThreadSleepDemo();

		t.setName("Ajay");
		
		t.start();

		t.sleep(7000); //Thread.sleep(7000);
System.out.println(Thread.currentThread().getName() + " just woke up...");

	}

	@Override
	public void run() {
System.out.println(Thread.currentThread().getName() + " running now,about to go into sleeping phase...");
		
		System.out.println(Thread.currentThread().getName() + " just woke up...");
	}
}