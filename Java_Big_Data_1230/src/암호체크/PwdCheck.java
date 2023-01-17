package 암호체크;

public class PwdCheck {
    boolean validLength(String pwd){
        if(pwd.length()>=10 && pwd.length() <=30) return true;
        return false;
    }
}
