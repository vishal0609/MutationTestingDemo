package com.dev.pkg;

public class palindromeCheck {

    public boolean checkPalindrome(String str) {
        if (str == null || str.length() < 2)
            return true;
        else {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1)))
                checkPalindrome(str.substring(1, str.length() - 1));
            else
                return false;
        }
        return true;
    }
}
