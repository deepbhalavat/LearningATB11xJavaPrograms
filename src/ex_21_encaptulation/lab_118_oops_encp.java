package ex_21_encaptulation;

public class lab_118_oops_encp {

}

class VWOLogin{
    public String  username;
    public String  password;

   VWOLogin(String usr,String pwd){


    }


}

class GoodVWOLogin{
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}