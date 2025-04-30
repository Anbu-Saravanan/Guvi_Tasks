package StudentManagementSysem.vote;

public class NotEligibleToVoteException extends Exception{

    public NotEligibleToVoteException(String message) {
        super(message);
    }
}
