	

	// -Inter Thread Communication

	// wait()
	// notify()
	// notifyAll()

	// {}


class WaitNotifyExample{
	public static void main(String[] args) throws InterruptedException {
		Calculate cal = new Calculate();

		Thread thread = new Thread(cal);

		thread.start();

		synchronized(cal){
			// main About to go waiting
		cal.wait(10000);
	}

System.out.println("Addition of first 200 numbers is : " + cal.total);		
	}
}


class Calculate implements Runnable{

	int total;

	@Override
	public synchronized void run(){
		for(int var = 1; var<= 200; var++){
			total += var;
		}

// Sends the notification to waiting thread: main
		 this.notifyAll();
	}
}