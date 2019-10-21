class MyTask implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " running...");
	}
}

class RunnableDemo{
	public static void main(String[] args) {

		MyTask task = new MyTask();

		Thread theThread = new Thread(task);

		theThread.start();	
	}
}