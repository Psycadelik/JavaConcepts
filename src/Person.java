/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francis Adrian Nduva
 * Student Number: 090237
 * Date: 6/03/2018
 */
public abstract class Person {
    public String name;
    public String gender;
    public int dateOfBirth;
    
    public int currentYear=2018;
//    public Person(String name, String gender, int dateOfBirth){
//        this.name = name;
//        this.gender = gender;
//        this.dateOfBirth = dateOfBirth;
//    }
    
    public final int getAge(){
       return currentYear - dateOfBirth;
    };
    
    
    public abstract double processLoan();
    
    public void showDetails(){
        System.out.println("The name is " + name);
        System.out.println("The gender is " + gender);
      
        
    }
    
    
    
}
