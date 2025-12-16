package transformations;

import enums.LoginStatus;
import io.cucumber.java.ParameterType;

public class CustomTypes {

    @ParameterType("успешном|неуспешном")
    public static LoginStatus status(String status) {
        if (status.equals("успешном")) {
            return LoginStatus.SUCCESS;
        } else {
            return LoginStatus.FAILURE;
        }
    }
}