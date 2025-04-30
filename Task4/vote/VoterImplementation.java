package StudentManagementSysem.vote;

public class VoterImplementation {
    public static void main(String[] args) {
        try{
            Voter voter = new Voter(1,"Saravanan",12);
        }catch (NotEligibleToVoteException e){
            System.out.println("Exception occurs! "+ e.getMessage());
        }

    }
}
