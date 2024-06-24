public class accesspecifier {
    public static void main(String[] args) {
        BankAccount anil = new BankAccount();
        anil.AccNumber = "45798403SDFD";
        anil.username = "anilyadav4658@";
        // anil.password = "54857hglk";
        // here it'll show not visible because it is only acceseble in that class
        anil.setpass("anilnulll45"); // it is possible bcoz that fun is in class it is in private we can set pass
                                     // only

        // let's see
        System.out.println(anil.AccNumber);
        System.out.println(anil.username);
        System.out.println(anil.setpass("annilnull44"));
        // we can set but we can't show pass due to it's privacy
    }
}
// Access Specifier sets the privacy for the data like which data should be
// visible in public or not

class BankAccount {
    public String username; // created username which is visible in public
    private String password;// this is only accesseble in this class
    String AccNumber; // bydefault it can be accesed in class as well as within package

    public String setpass(String pass) {
        password = pass;
        return password;
    }
}
