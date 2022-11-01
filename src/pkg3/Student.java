package pkg3;

public class Student {
    //Java Program to demonstrate the use of the parameterized constructor.

        int id;
        String name;
        //creating a parameterized constructor
        Student(int i,String n){
            id = i;
            name = n;
        }

        void display(){System.out.println(id+" "+name);}

        public static void main(String args[])
        {

            Student s1 = new Student(111,"Karan");
            Student s2 = new Student(222,"Aryan");

            s1.display();
            s2.display();
        }
    }


