package constants;

import lombok.Getter;

import java.util.Objects;

@Getter
public final class FrameworkConstants {
    private static FrameworkConstants frameworkConstants;

    private FrameworkConstants() {
    }

    public static FrameworkConstants getInstance() {
        //if(Objects.isNull(frameworkConstants)) {
        if (Objects.isNull(frameworkConstants)) {
            frameworkConstants = new FrameworkConstants();
        }
        return frameworkConstants;
    }

    private String loginToYourAccount = "Login to your account";
    private String newUserSignup = "New User Signup!";
}
