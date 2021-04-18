package Concurrency;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueInterface {
	
	//EXAMPLE
	

	    // ArrayBlockingQueue object
	    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	    //This object is thread-safe, so if we create an object from this class we can use it without synchronization
	    

	    public static void main(String[] args) throws InterruptedException {
	    	
	        Thread producerThread = new Thread(() -> {  produce();  }); // Thread 1 

	        Thread consumerThread = new Thread(() -> { consume(); }); // Thread 2

	        producerThread.start(); // start 1
	        consumerThread.start(); // start 2

	        Thread.sleep(2000);
	        
	        System.exit(1);
	    }

	    
	    
	    //METHOD 1 : this method adds random numbers to the queue
	    private static void produce() {
	        Random random = new Random();
	        while (true) {
	            try {
	                queue.put(random.nextInt(100));
	            } catch (InterruptedException e) {
	            }
	        }
	    }
	    

	    //METHOD 2 : this one is taking the numbers from queue simultaneously
	    private static void consume() {
	        while (true) {
	            try {
	                Thread.sleep(100);
	                Integer value = queue.take();
	                System.out.println("Alýnan sayý: " + value + ", Kuyruðun boyutu: " + queue.size());
	            } catch (InterruptedException e) {
	            }
	        }
	    }

	}


