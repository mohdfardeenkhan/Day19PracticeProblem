package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.UserRegistrationTest;
public class UserRegistrationTest
{
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.firstNameValidate("Fardeen");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.firstNameValidate("F@rdeen");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.lastNameValidate("Khan");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.lastNameValidate("Khan");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91799983488");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.phoneNumberValidate("9713267520");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.passwordValidate("Fardee23#%");
        Assert.assertFalse(result);
    }
}