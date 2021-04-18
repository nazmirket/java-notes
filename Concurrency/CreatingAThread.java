package Concurrency;

public class CreatingAThread {
	
	//WAY I  : Normal class that extends Thread class (Not commonly used)
	
	class thread1 extends Thread{

		@Override
		public void run() {
			//Statements
		}
		
	} // A class that extends Thread class. Any object instantiated from this class is a thread.
	
	
	
	//WAY II  : Normal class that implements Runnable interface (Commonly used) !!
	
	class thread2 implements Runnable{

		@Override
		public void run() {
			//Statements
		}
		
	} // A class that implements runnable class.
	
	   Thread mythread2 = new Thread(new thread2()); // mythread2 is now a thread
	
	
	
	
	//WAY III  :  Anonymous Class (Practical way for uncomplicated situations)
	
		Thread mythread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//Statements
			}
			
		});
		
		
	 //WAY IV : Lambda expression (Most practical way)
		
		Thread mythread4 = new Thread(()->System.out.print("statements"));

}


