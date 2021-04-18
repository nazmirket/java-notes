package Concurrency;

public class SynchronizedMethods{
	
	
	
	
	private int count = 0;

    public static void main(String[] args) {
        SynchronizedMethods application = new SynchronizedMethods();
        application.doCount();
    }

    
    
    public synchronized void increment() {
    	
    	count++;
    	
    }
    
    private synchronized void doCount() {
    	
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();
        
        try {
        	
        	thread1.join();
        	thread2.join();
        	
        }catch(Exception e) {e.printStackTrace();}
        
        
        System.out.println("Saya�: " + count);
    }

	
	
	
	
    
}