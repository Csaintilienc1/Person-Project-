
public abstract class Football extends PlayerStats{

	public Football(String playerName, String teamName) {
		super(playerName, teamName);
		// TODO Auto-generated constructor stub
	}
	public void HighlightReel(){
		int dunks=67;
	    int freeThrows=45;
	    int assists=80;
		
		System.out.println(player+" has made a number of " + dunks+ "dunks,");
		System.out.println(freeThrows + "freeThrows,"); 
		System.out.println("and "+ assists +"assists throughout the whole season."); 
	
	}
	
	
	public  void SuccessRate(){
		double percentage=Math.random();
		System.out.println("According to social media posting, the chances that " +player+ ""
				+ "has to beat lebron is about"+ percentage);
	if(percentage<0.50){
		System.out.println("A lot of hate for Kobe over here.");
	}
	else if(percentage>0.50){
		System.out.println("  Seems his fans don't plan on giving up Kobe just yet.");
	}
	}
	 public static void main(String args[]){
		  
	  }
}
