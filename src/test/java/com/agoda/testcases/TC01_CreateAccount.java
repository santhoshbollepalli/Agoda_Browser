package com.agoda.testcases;

import com.agoda.pages.CreateAccount;
import com.agoda.utility.Baseclass;
import org.testng.annotations.Test;

public class TC01_CreateAccount {
    @Test
    public static void CreateAccount() throws Exception{
        Baseclass.openBrowser();
        CreateAccount.Createacc();
        Baseclass.closeBroswer();
    }
}
