/*** @author Mr. Ahmed Elmasry 
 *   Mr_el_masry@yahoo.com  *Date:Aug 13, 2014  */

package One;
import java.util.ArrayList;
import java.util.Date;

public class Person {
    //Instance Variables
    private String fName;
    private String lName;
    private Date birthDate;

    public Person() {
        
    }

    public Person(String fName, String lName, Date birthDate) {
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setfName(String fName) {
        if(fName.matches("[a-z]+"))
        this.fName = fName;
    }

    public void setlName(String lName) {
        if(fName.matches("[a-z]+"))
        this.lName = lName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    /**
     * this method must calculate The Person Age: in Years
     * @return
     * @throws Exception 
     */
    public int age() throws Exception{
    throw new Exception("Not Implemented Exception!");
    }
    
    public  String fullName(){
        return this.fName .concat(" ").concat(this.lName);    
    }
 
}
class Teacher extends Person implements Salary{
    private double salary;

    public Teacher() {
    }
    
    public Teacher(String fName, String lName, Date birthDate) {
        super(fName, lName, birthDate);
    }
    @Override
    public String fullName(){
        return "Mr.".concat(super.fullName());        
}

    public void setSalary(double salary) {
        if(salary > 1200)
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }    

    @Override
    public double salary() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

class Student extends Person{
    
    public Student(String fName, String lName, Date birthDate) {
        super(fName, lName, birthDate);
    }

} 
class Team {
    // Team Class [Has A] Teacher Object.
    private Teacher leader;
    // Team Class [Has A] Students Object.
    private ArrayList<Student> members;

    public Team() {
    }   

    public Teacher getLeader() {
        return leader;
    }

    public ArrayList<Student> getMembers() {
        return members;
    }

    public void setLeader(Teacher leader) {
        this.leader = leader;
    }

    public void setMembers(ArrayList<Student>  members) {
        this.members = members;
    }

}
 interface Salary 
{
    public double salary();
}

class Tester {
    public static void main(String[] args) {
        //Teacher p = new Person // Big Mistake : Any Teacher is Person
        Person p = new Teacher
             ("Ahmed", "Mahmod", new Date("05/31/1972"));
        System.out.println(p.fullName());
        System.out.println(p.getBirthDate());
       
    }
}