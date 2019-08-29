import entity.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import parser.JsonParser;

import java.io.IOException;

public class TestClass {

    private static final String VALID_EMAIL_REGEX  = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    private static final String VALID_PHONE_NUMBER_REGEX  = "^[0-9]{1}-[0-9]{3}-[0-9]{3}-[0-9]{4}";
    private static final String VALID_ID_REGEX  = "^[0-9]{7}";


    @Test
    public void testUserDataValidity() throws IOException {

        UserData user = JsonParser.parseUserData();

        Assert.assertTrue(user.getData().getEmailAddress().matches(VALID_EMAIL_REGEX),"Email doesn't match correct format!");
        Assert.assertTrue(user.getData().getPhoneNumber().matches(VALID_PHONE_NUMBER_REGEX),"Phone Number doesn't match correct format!");
        Assert.assertTrue(user.getData().getUnid().matches(VALID_ID_REGEX),"User id doesn't match correct format!");
    }
}
