package co.edureka.threads;

// May be a Long Running Operation in case it takes more number of copies to be printed
// Further, if its a remote task it may take more time
class PrintTask{
	
	void printDocument(String document, int copies) {
		for(int i=1;i<=copies;i++) {
			System.out.println(">> [PrintTask] Prinitng "+document+" copy#"+i);
		}
	}
}

// MyTask is now a Thread :)
class MyTask extends Thread{
	
	String document;
	int copies;
	
	MyTask(String document, int copies){
		this.document = document;
		this.copies = copies;
	}
	
	// Override run method of Parent class Thread in the Child Class
	// Long Running Operation from the main goes into the run method
	// As we want the Child's definition to work
	// Whatever we write in the run method, will be executed along with main method
	public void run() {
		for(int i=1;i<=copies;i++) {
			
			try {
				Thread.sleep(1000);	// 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(">> [MyTask] Prinitng "+document+" copy#"+i);
		}
	}
}

class CA{
	
}

/*class YourTask extends CA, Thread{ // Err: Multiple Inheritance is not supported
	public void run() {
		
	}
}*/

// in case we are already inheriting and wish this to be a thread as well
// We need to use Runnable Interface instead of Thread class
class YourTask extends CA implements Runnable{
	
	String document;
	int copies;
	
	YourTask(String document, int copies){
		this.document = document;
		this.copies = copies;
	}
	
	public void run() {
		for(int i=1;i<=copies;i++) {
			
			try {
				Thread.sleep(1500);	// 1.5 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(">> [YourTask] Prinitng "+document+" copy#"+i);
		}
	}
}

public class App {

	// Whatever we write in main is executed in a Sequence :)
	// It is basically executed by main thread of the Process
	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		// Printing something by PrintTask
		//PrintTask task = new PrintTask();
		//task.printDocument("LearningJava.pdf", 10);
		
		// Every Object of MyTask is basically a Thread
		MyTask mRef = new MyTask("--LearningJava.pdf--", 10);
		
		// Write Polymorphic Statement
		Runnable r = new YourTask("^^LearningPython.pdf^^", 10);
		// Create Object of Built In Thread Class and pass the ref of Runnable
		Thread yRef = new Thread(r);
		
		mRef.setName("Java Thread");
		yRef.setName("Python Thread");
		Thread.currentThread().setName("John");
		
		mRef.setPriority(Thread.MIN_PRIORITY);						// 1
		yRef.setPriority(Thread.NORM_PRIORITY);						// 5
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);	// 10
		
		mRef.start(); // start method belongs to Thread class which internally executed the run method
		// immediately after start execute join
		try {
			mRef.join(); // join is a command which says, execute my tasks first and let all other Thread wait :)
			// Till time mRef run is not finished, below written statements in the main will be blocked
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		// Printing something by main
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(500);	// 500 milli seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(">> [Main] Prinitng **JohnsProfile.pdf** copy#"+i);
		}

		System.out.println(">> mRef Name: "+mRef.getName()+" and priority: "+mRef.getPriority());
		System.out.println(">> yRef Name: "+yRef.getName()+" and priority: "+yRef.getPriority());
		
		//Thread.currentThread() here shall give us the reference of main thread as we dont have it
		System.out.println(">> main Name: "+Thread.currentThread().getName()+" and priority: "+Thread.currentThread().getPriority());
		
		// Priority is a Request to JVM. In some JVM's occupied time, we need which Thread to be executed as per priority we tell to JVM
		
		System.out.println(">> App Finished");
		
	}

}

// PS: Identify Long Running Operation on the main
//	   Put that Operation either in class extending Thread or implementing Runnable
//	   Majorly Long Running Operations are always associated to the Internet related tasks :)
