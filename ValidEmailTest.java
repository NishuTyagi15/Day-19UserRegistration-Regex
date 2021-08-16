package com.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String emailTest;
    private boolean expectedResult;

    public ValidEmailTest(String email, boolean expectedResult) {
        this.emailTest = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {   { "abc@yahoo.com", true },
                                                { "abc-100@yahoo.com", true },
                                                { "abc.100@yahoo.com", true },
                                                { "abc111@abc.com", true },
                                                { "abc-100@abc.net", true },
                                                { "abc.100@abc.com.av", true },
                                                { "abc@1.com", true },
                                                { "abc@gmail.com.com", true },
                                                { "abc+100@gmail.com", true },
                                                { "abc-100@yahoo-test.com", true },
                                                { "abc", false },
                                                { "abc@.com.my", false },
                                                { "abc123@gmail.a", false },
                                                { "abc123@.com", false },
                                                { "abc123@.com.com", false },
                                                { "_abc@abc.com", false },
                                                { "abc()+@gmail.com", false },
                                                { "abc+ve.com", false },
                                                { "abc._2442@gmail.com", false },
                                                { "abc.@gmail.com", false },
                                                { "abc123@gmail.a", false },
                                                { "abc@gmail.com.1a", false }
        } );
    }

    @Test
    public void givenEmailAsVar_ShouldReturnAsPerTheParameterizedResult() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateEmail(this.emailTest);
        Assert.assertEquals(this.expectedResult, res);
    }
}