package Concurrency;

public class JoinMethod {
	
	

	// THREAD 1
	static Thread thread1 = new Thread() {
		
		@Override
		public void run() {
			
			for(int i =0 ; i<100 ; i++) {
			
			System.out.println("thread1");}
			
		}
	};
	

	// THREAD 2
	static Thread thread2 = new Thread() {
		
		@Override
		public void run() {
			
			try {
				
				thread1.join(); // The join method keeps waiting this thread until the thread1 is done.
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();} // If the other thread is interrupted then this thread is never going to work.
			//That's why the InterrptedException is caught here
		
			
		for(int i =0 ; i<100 ; i++) {
			
			System.out.println("thread2");}
		}
	};
	
	
	
	
	public static void main(String[] args) {
		
		thread1.start(); // first the "thread1" is printed 100 times then the other one starts working
		thread2.start();
		
		
		
	}

}
