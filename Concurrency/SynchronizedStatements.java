package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedStatements {
	
//EXAMPLE  : 
	
	// - create two list
	// - add 100 random integers to both in two different threads
	
	List<Integer> list1 = new ArrayList<>();  // first list
	
	List<Integer> list2 = new ArrayList<>();  // second list
	
	Object lock1 = new Object(); // lock 1
	
	Object lock2 = new Object(); // lock 2
	
	
	void addToList1(){  // method 1;
		
		synchronized(lock1) { // locked block 1
			
			list1.add(new Random().nextInt());
	    	}
	   }
	
	void addToList2(){  // method 2;
		
		synchronized(lock2) { // locked block 2
			
			list2.add(new Random().nextInt());
			}
		}
	
	
	void proccess() { // the method that adds one ýnteger to both lists
		
		for (int i = 0; i <50; i++) {
			
			addToList1();
			addToList2();
			
		}
	}
	
	
	public static void main(String[] args) {
		
		SynchronizedStatements obj = new SynchronizedStatements();
		
		
		Thread thread1 = new Thread(()-> obj.proccess()); // Thread 1
		
		Thread thread2 = new Thread(()-> obj.proccess()); // Thread 2
		
		
		thread1.start();
		thread2.start();
		
		
		try {
			
			thread1.join();
			thread2.join();
		}catch(Exception e) {e.printStackTrace();}
		
		
		System.out.println("List 1 has " + obj.list1.size() + " objects");
		
		System.out.println("List 2 has " + obj.list2.size() + " objects");
		
	/*  If we've done this with synchronized method that would have been correct either
 	    But the difference is that, this way is more efficient because when the one is using list1
 	    the other one can use list2 since they have seperate locks 
	 */
		
		
		
		
		
		
	}
    

}
