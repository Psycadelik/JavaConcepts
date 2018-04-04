/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public  class Student extends Person {
    public int numberOfCourses;
     
    public Student (String name, String gender, int dateOfBirth, int numberOfCourses){
        super.name = name;
        super.gender = gender;
        super.dateOfBirth = dateOfBirth;
        this.numberOfCourses = numberOfCourses;
    }
    
    public Student (String name, String gender, int dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    
    public int getNumberOfCourses(){
        return numberOfCourses;
    }
    
    public void setNumberOfCourses(int numberOfCourses){
        this.numberOfCourses = numberOfCourses;
    }
    @Override 
     public double processLoan(){
       double processedLoan=0;
         int age = getAge();
       
       if (age < 10){
        processedLoan = 1000;
       }else if(age >=10 && age <18){
         processedLoan = 10000;
        }else if(age>=18 && age<=24){
        processedLoan = 100000;
        }
       
       return processedLoan;
     }; 
    
     public void showAttributes(){
         double loan = this.processLoan();
         
         System.out.println("Number of Courses for student: " + numberOfCourses);
         System.out.println("The processed loan is " + loan);
     };
     public static void main(String args[]){
         Student person1 = new Student("Hillary", "Male", 1989);
         
         person1.showDetails();

          
         System.out.println("============================================================");
         
         Student student1 = new Student("Adrian", "Male", 2004, 4);
         student1.showDetails();
         student1.showAttributes();
        
                  
         
         
         
         
     }
   
}
