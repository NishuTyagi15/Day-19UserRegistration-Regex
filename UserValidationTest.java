package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateFirstName("Nishu");
        Assert.assertTrue(res);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateFirstName("Ni");
        Assert.assertFalse(res);
    }

    @Test
    public void givenFirstName_WhenWithSpChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateFirstName("Nis@hu");
        Assert.assertFalse(res);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateLastName("Tyagi");
        Assert.assertTrue(res);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateLastName("Ty");
        Assert.assertFalse(res);
    }

    @Test
    public void givenLastName_WhenWithSpChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateLastName("Ty@gi");
        Assert.assertFalse(res);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateEmail("nishu.tyagi@gmail.com");
        Assert.assertTrue(res);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateEmail("123@");
        Assert.assertFalse(res);
    }

    @Test
    public void givenMobNumber_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateMobNumber("91 9868234313");
        Assert.assertTrue(res);
    }

    @Test
    public void givenMobNumber_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validateMobNumber("91986");
        Assert.assertFalse(res);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validatePassword("nishu@Tyagi123");
        Assert.assertTrue(res);
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean res = validator.validatePassword("nis15");
        Assert.assertFalse(res);
    }
}