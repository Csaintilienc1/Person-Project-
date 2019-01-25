import java.util.Scanner;

public class TxtBooks extends ReadingMaterial {

	public TxtBooks(String thisTitle, String isbnNum) {
		super(thisTitle, isbnNum);
		// TODO Auto-generated constructor stub
	}

	public void TableOfContents(){
		String[] Chapters={"Bio","How-To's","Inner Workings","Structures","Examples","History"};
	    for(String c:Chapters){
	    	System.out.println("Here are its table of contents:");
	    	System.out.println(c);
	    }

 }


	public boolean ISBNCheck(){
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Checking ISBN: " + scan.nextLine());
		
		String ISBN=scan.nextLine();
		
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
	    	double inventory= Math.random()*2;  
	        System.out.println("Checking inventory: "+ inventory);
	    	if(inventory<1){
	        	System.out.println("We have none");
	        return false;
	    	}
	    	else if(inventory>1){
	    		System.out.print("We have some availble ");
	    	}
	     
	 return true;
	 }
	 public void RipPage(){
		  double pages=Math.random()*2;
		 System.out.println("I ripped " + pages+"by accident.");
	       if(pages>0){
	    	   System.out.println("We're costing money. We can't keep doing this");
	       }
	       else if(pages<0){
	    	   System.out.println("We are not out of business yet.");
	       }
	 } 
	 
	 public static void main(String args[]){
		  TxtBooks Math=new TxtBooks("CengageBrain Math","243676"); 
	     if(Math.CheckInventory()){
		  if(Math.ISBNCheck()){
	     Math.TableOfContents();
	     Math.RipPage();
	     }
	     }
	 }
}