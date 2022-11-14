package com.Module4;

class person{
    String occupation = "None";
    int salary;
    void modifyOccupation(){
        occupation = "Changed";
    }
    person(){
        salary =  20000;
        System.out.println("Parent class:" + salary);
    }

}

class employee extends person{
    String occupation = "Employee";
    employee(){
        super();
        System.out.println("Child Class:"+occupation);
    }
    void modifyParentOccupation(){
        super.modifyOccupation();
        System.out.println(super.occupation + " and " + occupation);
    }
}

public class SuperClassUsage {
    public static void main(String[] args) {
        employee A = new employee();

    }
}

