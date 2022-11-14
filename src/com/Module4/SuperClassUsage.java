package com.Module4;
/**
 super keyword can be used in the following manner
 1) Get parent class variable
 2) Get parent class method
 3) Get parent class constructor
 * */
class person{
    String occupation = "None";
    int salary;
    void modifyOccupation(){
        occupation = "Changed";

    }
    person(){
        salary =  20000;
        System.out.println("Parent Class Constructor");
    }

}

class employee extends person{
    String occupation = "Employee";
    employee(){
        super(); // (3)
        System.out.println("(3) Constructor called above using super: Child Class:"+occupation);
    }
    void modifyParentOccupation(){
        super.salary = 10000; // (1)
        System.out.println("(1) Salary modified using super: " + salary);
        super.modifyOccupation();// (2)
        System.out.println("(2) Called modifyOccupation() method using super: " + super.occupation);

    }
}

public class SuperClassUsage {
    public static void main(String[] args) {
        employee A = new employee();
        A.modifyParentOccupation();
    }
}

