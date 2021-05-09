package POM;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestLogin {
    @Test
    public void testLogin() {
        SignInPage signInPage = new SignInPage(driver);
        HomePage homePage = signInPage.loginValidUser("userName", "password");
        assertThat(homePage.getMessageText(), is("Hello userName"));
    }
}
