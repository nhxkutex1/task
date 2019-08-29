package parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.UserData;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JsonParser {

    public static UserData parseUserData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream input = new FileInputStream("user.json");

        UserData userData = objectMapper.readValue(input, UserData.class);

        return userData;
    }
}
