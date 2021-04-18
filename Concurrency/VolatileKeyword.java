package Concurrency;

public class VolatileKeyword {
	
	
	// When we use the "volatile" keyword on a variable, all the changes on that variable is seen by the other threads
	
	// If we don't, the other threads may not be aware of the change on that variable
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread thread1 = new MyThread();
		
		thread1.start();
		
		Thread.sleep(1000);
		
		thread1.shutdown(); //Here we make  "bl"  false.
		
	}
	

}


//THREAD FOR EXAMPLE
	
	class MyThread  extends Thread{
		
		volatile boolean bl = true; // when this value changes, the loop in the run() method stops

	@Override
	public void run() {
		
		System.out.println("running...");
		
		
	}
	
	
	void shutdown() {this.bl = false;}


}
	
	
