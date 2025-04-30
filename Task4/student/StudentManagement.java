package StudentManagementSysem.student;

public class StudentManagement {
    public static void main(String[] args) throws AgeNotWithinRangeException,NameNotValidException {

        try {
            Student student= new Student(1,"Saravanan",22,"Java course");
        }catch (AgeNotWithinRangeException | NameNotValidException exception){
            System.out.println("Exception occurs! "+ exception.getMessage());

        }


    }
}
