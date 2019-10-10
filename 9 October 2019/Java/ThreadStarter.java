class ThreadStarter extends Thread{
	public static void main(String[] args) {

		ThreadStarter theThread = new ThreadStarter();

		theThread.start(); // -> run(){}

		 // theThread.start(); //Fails


System.out.println(Thread.currentThread().getName() + " running...2");
	}

	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " running...1");
	}
}


// Lifecycle of a Thread:

//  - start (Not Alive/Not Running)
//  - runnable (Alive/Not Running) : thread of execution
//  - running (Alive/Running)
//  ---- sleeping/waiting/suspend ()
//  - dead (Not Alive / Not Running)