package co.edureka.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAPI {

	public static void main(String[] args) {
		
		// Polymorphic Statement
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		
		// Direct Object Construction
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		// FIFO -> First In First Out (poll is to remove head of queue)
		// PriorityQueue will sort the added data for us :)

		for(int i=10;i>0;i--) {
			queue.add(i);	// we begin from 10 till 1
		}
		
		// Queue -> [head]10 9 8 7 6 5 4 3 2 1[tail]
		// BUT, Priority Queue will sort the data for us 
		// Queue -> [head]1 2 3 4 5 6 7 8 9 10[tail]
		
		/*
		int head = queue.peek(); // peek reads the head of queue
		System.out.println(">> head is: "+head+" and size is: "+queue.size()); // 1 | 10
		
		queue.poll();	// removes the head of queue
		
		head = queue.peek();
		System.out.println(">> now head is: "+head+" and size is: "+queue.size()); // 2 | 9
		*/
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.peek());	// 1
			queue.poll();						// remove 1 and reduce size
		}
		
		
	}

}
