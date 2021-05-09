package example;

import org.junit.Assert;

public class LoginTest {
    void loginAsUser("cbrown","cl0wn3") {

        // Now that we're logged in, do some other stuff--since we used a DSL to support
        // our testers, it's as easy as choosing from available methods.
        do.something();
        do.somethingelse();
        Assert.assertTrue("Something should have been done!", something.wasDone());

        // Note that we still haven't referred to a button or web control anywhere in this
        // script...
    }


}
