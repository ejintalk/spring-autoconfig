package com.jirepos.rebase;

public class AuthService {

    public boolean isValidUser(String userId, String passwd) {
        if(userId.equals("user")) {
            return true;
        }
        return false;

    }

}
