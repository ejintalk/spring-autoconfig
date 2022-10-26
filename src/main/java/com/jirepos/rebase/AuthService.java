package com.jirepos.rebase;

public class AuthService {

    public boolean isValidUser(String userId, String passwd) {
        if(userId.equals("user")) {
            return true;
        }
        return false;
    }
    public boolean checkPasswd(String passwd) {
        if (passwd.equals("1234")) {
            return true;
        }
        return false;
    }

    public String chaneUser() {
        return "normalUser";
    }

}
