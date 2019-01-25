import java.util.Scanner;

public class Novels extends ReadingMaterial {

	public Novels(String thisTitle, String isbnNum) {
		super(thisTitle, isbnNum);

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
	
	 public void library(){
			System.out.println("Our bookstore contains some of the top"
					+ "rated literature of all time.");
					
		      String[] Characters={"Harry Potter","Curious George","He-Man","Captain underpants","and Transformers"};
		      for(String b:Characters){
		    	  System.out.println("Some literatures include your favortite characters like");
		          System.out.println(b);
		      }
		
		}
	 
	 
	          public static void main(String args[]){
		 Novels AisleOne=new Novels("Aisle-1","1231241");
	      if(AisleOne.CheckInventory()){
	           if(AisleOne.ISBNCheck()){
	    	    AisleOne.RipPage();
	    	    AisleOne.library();
	      }
	    	  
	      }
	}
		
		}
	 



