import java.util.Scanner;

public class Magazines extends ReadingMaterial {
	
	public Magazines(String thisTitle, String isbnNum) {
		super(thisTitle, isbnNum);
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
	
	public void TableOfContents(){
		String[] Chapters={"Teens Weekly","Gum Ads","Video game Ads","Celebrties","Examples","History"};
	    for(String c:Chapters){
	    	System.out.println("Here are its table of contents:");
	    	System.out.println(c);
	    }
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
		 public boolean CheckInventory(){
		    	int inventory= (int) Math.random();  
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
		 
		 
		 public static void main(String args[]){
			 Magazines TeenReader=new Magazines("TeenReader", "123213");
			 if(TeenReader.CheckInventory()){
				 if(TeenReader.ISBNCheck()){
					 TeenReader.TableOfContents();
					 TeenReader.RipPage();
				 }
			 }
  
  }

}
