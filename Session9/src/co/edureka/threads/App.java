package co.edureka.threads;

class PrintTask{
	
	void printDocument(String document, int copies) {
		for(int i=1;i<=copies;i++) {
			System.out.println(">> [PrintTask] Prinitng "+document+" copy#"+i);
		}
	}
}

public class App {

	// Whatever we write in main is executed in a Sequence :)
	// It is basically executed by main thread of the Process
	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		// Printing something by PrintTask
		PrintTask task = new PrintTask();
		task.printDocument("LearningJava.pdf", 100);
		
		// Printing something by main
		for(int i=1;i<=10;i++) {
			System.out.println(">> [Main] Prinitng JohnsProfile.pdf copy#"+i);
		}

		System.out.println(">> App Finished");
		
	}

}
