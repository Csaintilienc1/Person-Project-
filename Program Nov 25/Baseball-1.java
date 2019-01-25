
public  class Baseball extends PlayerStats{
	int homeruns=67;
    int fouls=45;
    int bases=80;
	public Baseball(String playerName, String teamName) {
		super(playerName, teamName);
	}
	
	
	public void HighlightReel(){
		
		
		System.out.println(player+ " has made a number of " +homeruns + "homeruns");
		System.out.println(fouls + "fouls,"); 
		System.out.println("and captured a grand total "+bases +"bases throughout the whole season."); 
	
	}
	
	
	
	public  Object SuccessRate(){
		double percentage=Math.random();
		System.out.println("According to recent social media postings, the chances that " +player+" "
				+ "has to beat this contender is about"+ percentage +"%");
	if(percentage<0.50){
		System.out.println("A lot of hate for "+player +" over here.");
	}
	else if(percentage>0.50){
		System.out.println(" Seems the fans don't plan on giving up "+player +" or the"+team+ "just yet.");
	}
	return null;
	}
	public void score() {
		score+=homeruns+bases*1000;
		System.out.println(player+ "has scored a grand total of " + score + "points this entire season.");
	}
	
	 public static void main(String args[]){
		   Baseball JRobinson=new Baseball("Jack Robinson","NY Devils");
		   JRobinson.HighlightReel();
		   JRobinson.SuccessRate();
		   JRobinson.score();
	 
	 }


	
}
