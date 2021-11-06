package com.test.pkg;

import com.dev.pkg.palindromeCheck;
import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    palindromeCheck obj = new palindromeCheck();
    @Test
    public void TesthappyPath(){
        Assert.assertTrue(obj.checkPalindrome("teet"));
        Assert.assertTrue(obj.checkPalindrome(null));
        Assert.assertTrue(obj.checkPalindrome("aa"));
    }

    @Test
    public void TestNegativePath(){
        Assert.assertFalse(obj.checkPalindrome("happy"));
        Assert.assertFalse(obj.checkPalindrome("ab"));
    }


}
