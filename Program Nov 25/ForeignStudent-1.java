import java.util.Scanner;

public class ForeignStudent extends Person{

	
	public ForeignStudent(int personAge, String personLocation) {
		super(personAge, personLocation);
		// TODO Auto-generated constructor stub
	}
	public void NationalityCheck(){
        Scanner scan = new Scanner(System.in);
      	String nationality=scan.nextLine();
      	System.out.println("What is your Nationality?" + nationality);
      
      if(nationality.equals("German")){
      	System.out.print("According to , Your ethnicity is ranked the 8th"
      			+ "in education." );
      }
      
      else if(nationality.equals("Norweigian")){
      	System.out.println("Your Nationality is ranked  21st in education ");
      }
      System.out.println("Your nationality is ranked in the top 50 in education.");        
      }

	  public void OccuFact(){
    	Scanner scan= new Scanner(System.in);
    	String occupation=scan.nextLine();
    	System.out.println("Enter your major name to reveal an inbteresting fact"+ occupation);
    
      if(occupation.equals("PreMed")){
    	  System.out.println("Did you know that certain Doctors are eligible for travel"
    	  		+ "with certain skillsets?");
      }
      else if(occupation.equals("PreLaw")){
    System.out.println("Lawyers often develop a keen sense of detail as they pogress"
    		+ "with cases");
      }
System.out.println("Your current job title salary can increase up to as high"
		+ "as $80000 given you perform well and are committed");
    }

	  public void TaxRefund(){
			Scanner scan =new Scanner(System.in);
			double income=scan.nextDouble();
			
			System.out.println("What is your hourly income ?");	
		   if(income<8.50){
			   System.out.println("Please pickup you Refund check of $1000 "
			   		+ "up front");
		   }
		   else if(income>8.50){
				System.out.println("Please pickup your refund check of $500 up front");
			
		   System.out.println("I'm Sorry, but we need to have your  income "
		   		+ "to determine Tax Refund eligibility");
		   }
	  }


	  public static void main(String args[]){
			ForeignStudent Matt= new ForeignStudent(13,"NJ");

		Matt.NationalityCheck();
		Matt.OccuFact();
		Matt.TaxRefund();
		}
}
