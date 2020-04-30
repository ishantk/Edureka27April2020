
public class ProblemStatement {

	public static void main(String[] args) {
		
		// Vote Counts for Democratic Party for 5 Regions
		int demArizonVotes = 126;
		int demFloridaVotes = 32;
		int demVermontVotes = 230;
		int demTexasVotes = 21;
		int demGeorgiaVotes = 200;
		
		// Vote Counts for Republican Party for 5 Regions
		int repArizonVotes = 152;
		int repFloridaVotes = 85;
		int repVermontVotes = 121;
		int repTexasVotes = 215;
		int repGeorgiaVotes = 13;
		
		int demVotes = demArizonVotes + demFloridaVotes + demVermontVotes + demTexasVotes + demGeorgiaVotes;
		int repVotes = repArizonVotes + repFloridaVotes + repVermontVotes + repTexasVotes + repGeorgiaVotes; 		
		
		if(demVotes > repVotes) {
			System.out.println(">> Democratic Party Won by "+(demVotes-repVotes)+" votes");
		}else{
			System.out.println(">> Repubican Party Won by "+(repVotes-demVotes)+" votes");
		}
		
		// Challenge : For Developer its difficult to work with so many containers
		// Solution : Arrays
		
		
		System.out.println("===Arrays as Solution===");
		//						 0 	  1	  2   3    4
		int[] demRegionVotes = {126, 32, 230, 21, 200};
		int[] repRegionVotes = {152, 85, 121, 215, 13};
		
		demVotes = 0;
		repVotes = 0;
		
		for(int i=0;i<demRegionVotes.length;i++) {
			demVotes += demRegionVotes[i];	// demVotes = demVotes + demRegionVotes[i];
			repVotes += repRegionVotes[i];  // repVotes = repVotes + repRegionVotes[i];
		}
		
		if(demVotes > repVotes) {
			System.out.println(">> Democratic Party Won by "+(demVotes-repVotes)+" votes");
		}else{
			System.out.println(">> Repubican Party Won by "+(repVotes-demVotes)+" votes");
		}
		
		// Votes is Array of Arrays
		int[][] votes = {
							// 0   1   2	3   4 
							{126, 32, 230, 21, 200},	// 0	Dem
							{152, 85, 121, 215, 13}		// 1	Rep
						};
		
		// PS: To write the solution who won elections for 2-D Array
	}

}
