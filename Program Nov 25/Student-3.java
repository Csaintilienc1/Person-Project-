import java.util.Scanner;

public class Student extends Person{

	String nationality;  
	int age;
	String occupation;
	double income;
	String name;
	public Student(int personAge, String personLocation) {
		super(personAge, personLocation);
		// TODO Auto-generated constructor stub
	}
     

	public void Intro(){
		System.out.println("Hi my name is " + name);
	}
	
	  public void NationalityCheck(){
          Scanner scan = new Scanner(System.in);
        	String nationality=scan.nextLine();
        	System.out.println("What is your Nationality?" + nationality);
        
        if(nationality.equals("African American")){
        	System.out.print("According to , Your ethnicity is ranked the 4th"
        			+ "in education." );
        }
        
        else if(nationality.equals("Hispanic")){
        	System.out.println("Your Nationality is ranked to 4th in education ");
        }
        System.out.println("Your nationality is ranked in the top 50 in education.");        
        }

	  public void OccuFact(){
      	Scanner scan= new Scanner(System.in);
      	String occupation=scan.nextLine();
      	System.out.println("Enter your job title to reveal an interesting fact"+ occupation);
      
        if(occupation.equals("PreMed")){
      	  System.out.println("Did you know that certain Doctors are eligible for travel"
      	  		+ "with certain skillsets?");
        }
        else if(occupation.equals("PreLaw")){
      System.out.println("Lawyers often develop a keen sense of detail as they progress"
      		+ "with cases");
        }
 System.out.println("Your current Major title can lead you to a salary that  can increase up to as high"
 		+ "as $80000 given you perform well and  are committed");
      }

	  public void TaxRefund(){
			Scanner scan =new Scanner(System.in);
			double income=scan.nextDouble();
			
			System.out.println("What is your hourly income ?");	
		   if(income<7.50){
			   System.out.println("Please pickup you Refund check of $4000 "
			   		+ "up front");
		   }
		   else if(income>7.50){
				System.out.println("Please pickup your refund check of $2500 up front");
			
		   System.out.println("I'm Sorry, but we need to have your  income "
		   		+ "to determine Tax Refund eligibility");
		   }
	  }

public static void main(String args[]){
	Student Paul= new Student(13,"NJ");

Paul.NationalityCheck();
Paul.OccuFact();
Paul.TaxRefund();
}

}