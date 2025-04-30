package StudentManagementSysem.student;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        //Age validation
        if (age < 15 || age>21){
            throw new AgeNotWithinRangeException("Age is not in Range");
        }
        //Name validate characters
        if (!name.matches("[a-zA-Z ]+")){
            throw new NameNotValidException("Name is not valid as our requirement");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

}
