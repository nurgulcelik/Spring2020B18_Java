package OfficeHours.Practice_05_13_2020;

public class Constructor {
    public Constructor(){
        System.out.println("default constructor");
    }
    public static void main(String[] args) {
        Constructor obj= new Constructor();
        Employee employee2= new Employee("Reem",456,150000);
    }
}


class Employee{
    String name;
    long id;
    double salary;

        public Employee(String name, long id,double salary){
            this.name= name;
            this.id=id;
            this.salary=salary;
        }
        public String toString(){
            return "Name: "+name+", id: "+id+ ", salary: "+salary;
        }
}
