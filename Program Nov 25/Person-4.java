//********************************************************************
//  Person.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 9.5 
//********************************************************************

public class Person
{
   private int age;
   private String location;

   //------------------------------------------------------------------
   //  Creates a person with the specified age and location.
   //------------------------------------------------------------------
   public Person(int personAge, String personLocation)
   {
      age = personAge;
      location = personLocation;
   }

   //------------------------------------------------------------------
   //  Returns a string summary of this person.
   //------------------------------------------------------------------
   public String toString()
   {
      return "Age: " + age + "\nLocation: " + location;
   }
}
