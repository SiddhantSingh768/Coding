// Access Modifiers
public class Acess_Modifiers{
    BankAccount myAcc=new BankAccount();
    myAcc.username="siddhantsingh";
    myAcc.setpassword("asdfghjk");
}

class BankAccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password=pwd;

    }
}