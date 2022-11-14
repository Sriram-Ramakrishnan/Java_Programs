package com.Module3;

/**
 Static Keyword is used to declare a static variable
 * Static variables and methods are class based, not object based
 *
 */

class employee{
    String emp_name;
    static int count = 0;
    employee(String emp_name){
        // this keyword used to get reference to object
        this.emp_name = emp_name;
        incrementCount();

    }
    static void incrementCount(){
        count++;
    }

    static void showCount(){
        System.out.println(count);
    }
}

public class staticOp {
    public static void main(String[] args) {
        employee A  = new employee("Emp1");
        employee b  = new employee("Emp2");
        employee.showCount();
    }

}
