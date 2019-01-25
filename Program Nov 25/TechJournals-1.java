import java.util.*;
public class TechJournals extends ReadingMaterial {

int pages=100;	
public TechJournals(String thisTitle, String isbnNum) {
	super(thisTitle, isbnNum);
}
		
public void TableOfContents(){
	String[] Chapters={"Bio","How-To's","Inner Workings","Structures","Examples","History"};
    for(String c:Chapters){
    	System.out.println("Table of Contents:");
    	System.out.println(c);
    }
}
public boolean ISBNCheck(){
	Scanner scan=new Scanner(System.in);
	String ISBN=scan.nextLine();
	
	System.out.println("Checking ISBN: " + scan.nextLine());
	
	if(ISBN.equals(getISBN())){
		System.out.println("This is the right ISBN");
		return true;
	}
	else
	  {
	   System.out.println("This is the wrong ISBN ");
	   
	   return false;
	  }
}
public boolean CheckInventory(){
	int inventory=(int) Math.random();  
    System.out.println("Checking inventory: "+ inventory);
	if(inventory<1){
    	System.out.println("We have none.");
         return false;
	}
	else if(inventory>1){
		System.out.print("We have some availble ");
	}
	return true;
}
     public void RipPage(){
		  double pages=Math.random();
		 System.out.println("I ripped " + pages+"by accident.");
	       if(pages>0){
	    	   System.out.println("We're costing money. We can't keep doing this");
	       }
	       else if(pages<0){
	    	   System.out.println("We are not out of business yet.");
	       }
	 } 
 
     
public static void main(String args[]){
	TechJournals AirplaneINC = new TechJournals("AirPlane weekly", "34224342");
		if(AirplaneINC.CheckInventory()){
			if(AirplaneINC.ISBNCheck()){
				AirplaneINC.TableOfContents();
				AirplaneINC.RipPage();
			}
		}

}
}