package StudentManagementSysem.vote;

public class Voter {
    private int voterID;
    private String name;
    private int age;

    public Voter(int voterID, String name, int age) throws NotEligibleToVoteException {
        if (age < 18 ){
            throw new NotEligibleToVoteException("Invalid age for voter");
        }
        this.voterID = voterID;
        this.name = name;
        this.age = age;
    }
}
