/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;

/**
 *
 * @author Divine K
 */
public class DivProgram {

   private String name;
    private long studentNumber;
    private double loanAmount;
    
    
    public DivProgram(String name, long studentNumber, double loanAmount){
        this.name= name;
        this.studentNumber= studentNumber;
        this.loanAmount= loanAmount;   
    }

    DivProgram() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    public String getName(){
        return this.name;
    }
    public long getStudentNumber(){
        return this.studentNumber;
    }
    public double getLoanAmount(){
        return this.loanAmount;
    }
    public void setName(String name){
        this.name= name;
    }
    public double setStudentNumber(long studentNumber){
        this.studentNumber= studentNumber;
        return this.studentNumber;  
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount= loanAmount;
    }
    public String toString(){
        String all= String.format("Name: "+this.name, "Student Number: "
                +this.studentNumber, "Loant Amount: "+this.loanAmount);
        return all;  
    }
    public void show(){
        System.out.println("Student details");
        System.out.println("Name: "+getName()+"\n Student Number: "+getStudentNumber()+
                "\n Loan Amount: "+getLoanAmount());
        
    }
    public double interest(){
        return getLoanAmount()*.05;
        
    }
    public static void main(String[] args) {
     
        System.out.println("Successfull");
    }
}

