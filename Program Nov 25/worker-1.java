import java.util.*;
public class worker extends Person {
    
	String occupation;
	double income; 
	String nationality;  
	
	public worker(int personAge, String personLocation) {
		super(personAge, personLocation);
	
	}

		public void TaxRefund(){
			Scanner scan =new Scanner(System.in);
			double income=scan.nextDouble();
			
			System.out.println("What is your household income ?");	
		   if(income<50000){
			   System.out.println("Please pickup you Refund check of $3000 "
			   		+ "up front");
		   }
		   else if(income>50000){
				System.out.println("Please pickup your refund check of $1500 up front");
			
		   System.out.println("I'm Sorry, but we need to have your  income "
		   		+ "to determine Tax Refund eligibility");
		   }
	}
        public boolean NationalityCheck(){
          Scanner scan = new Scanner(System.in);
        	System.out.println("What is your Nationality?" + nationality);
        	String nationality=scan.nextLine();
        
        	if(nationality.equals("African American")){
        	System.out.print("Your ethnicity is ranked the 4th"
        			+ "in the workforce." );
        return true;
        }
        
        else if(nationality.equals("Hispanic")){
        	System.out.println("Your Nationality is ranked to 8th in the workforce ");
        return true;
        }
        
        	System.out.println("Your nationality is ranked in the top 50 in workforce.");        
        return false;
        }

        public void OccuFact(){
        	Scanner scan= new Scanner(System.in);
        	System.out.println("Enter your job title to reveal an interesting fact"+ occupation);
        	String occupation=scan.nextLine();
         
        	if(occupation.equals("Doctor")){
        	  System.out.println("Did you know that certain Doctors are eligible for travel"
        	  		+ "with certain skillsets?");
          }
          else if(occupation.equals("Lawyer")){
        System.out.println("Lawyer often develop a keen sense of detail as they pogress"
        		+ "with cases");
          }
   System.out.println("Your current job title salary can measure up to as high"
   		+ "as $80000 given you perform well and  are committed");
        }
        public static void main(String args[]){
        	worker Paul= new worker(20,"NJ");

        Paul.NationalityCheck();
        Paul.OccuFact();
        Paul.TaxRefund();
        }
}