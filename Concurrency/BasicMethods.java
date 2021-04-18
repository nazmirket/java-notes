package Concurrency;

public class BasicMethods {

	public static void main(String[] args) throws Exception {
		
		
		
		// START : to start
		
		thread1.start(); // it starts the thread
		
		
		
		// SLEEP : to suspend the thread for a time interval
		
		Thread.sleep(1000); // waits for 1 second
		
		
		// INTERRUPT  : to terminate the thread
		
		Thread.interrupted(); // returns a boolean value if the all threads are interrupted or not
		thread1.isInterrupted(); // returns a boolean value if the specified thread is interrupted or not 
		thread1.interrupt(); // interruptes the thread pointed out
		
		
		
		
		

	}
	
	
	
	
	
	// THREADS FOR EXAMPLES
	static Thread thread1 = new Thread() {
		
		@Override
		public void run() {}
	};
	

	static Thread thread2 = new Thread() {
		
		@Override
		public void run() {}
	};

}
