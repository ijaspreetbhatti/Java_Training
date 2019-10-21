class ThreadPriorityDemo extends Thread{

public static final Integer MY_PRIORITY = 9;

	public static void main(String[] args) throws InterruptedException {


		ThreadPriorityDemo theThread = new ThreadPriorityDemo();
		theThread.setPriority(ThreadPriorityDemo.MY_PRIORITY);


		theThread.start(); 

//System.out.println(Thread.currentThread().getName() + " has priority "  + Thread.currentThread().getPriority());
	}

	@Override
	public void run(){
		System.out.println("Thread Priority : " + Thread.currentThread());
	}
}



	// Thread.yield();


	// runnable -> t1(7), t4(2), t6(8), t67(8)

	// running ->  t67 ---- Thread.yield();









