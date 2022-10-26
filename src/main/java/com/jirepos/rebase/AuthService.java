package com.jirepos.rebase;

public class AuthService {

    public boolean isValidUser(String userId, String passwd) {
        if(userId.equals("user")) {
            return true;
        }
        return false;
    }
    public boolean checkPasswd(String passwd) {
        if (passwd.equals("1234") || passwd != null) {
            System.out.println("passwd is not null");
            return true;
        }
        return false;
    }
    public int checkLoginFail() {
        return 1;
    }

    public String chaneUser() {
        return "normalUser";
    }


}
