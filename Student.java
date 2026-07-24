class Student
{
    String name;
    int age;
    Student(String n,int a)
{
    name=n;
    age=a;
}
    void display()
    {
        System.out.println(name+""+age);
        
    }
}
public class Main{
public static void main(String []args) 
{
    Student s=new Student("Tulasi",20);
    s.display();
}
}