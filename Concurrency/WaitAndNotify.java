package Concurrency;

public class WaitAndNotify {
	
	
	Object lock = new Object(); // lock
	
	
	//METHOD 1
	void method1() throws InterruptedException {
		
		synchronized(lock) {
			
			System.out.println("Thread 1 started running");
			
			lock.wait(); // It releases the lock and start waiting
			
			System.out.println("Thread 1 is on again");
		}
		
		
	}
	
	
    //METHOD 2
	void method2() throws InterruptedException {
		
		synchronized(lock) {
			
			System.out.println("Thread 2 started running"); // when the other method release the lock this start running
			
			lock.notify(); // this terminates the wait method invoked in the previous method
			
			System.out.println("Waiting for Thread 2 to finish...");
			Thread.sleep(2000);
			System.out.println("Thread 2 is done"); // when this method is done the other one the other method starts running again
		}
		
		
	}
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WaitAndNotify obj = new WaitAndNotify();
				
		
		
		Thread thread1 = new Thread(()-> {
			try {
				obj.method1();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread thread2 = new Thread(()-> {
			try {
				obj.method2();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
	
		
		
		
		
		
		

	}

}
