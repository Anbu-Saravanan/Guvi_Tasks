package StudentManagementSysem.student;

public class AgeNotWithinRangeException extends Exception{

    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
