package testdata;

import constants.Credentials;
import models.LoginSauceLab;

public class PrepareLoginData {

    public static LoginSauceLab getValidRegistration1() {
        return LoginSauceLab
                .builder()
                .username(Credentials.Username1)
                .password(Credentials.Password)
                .build();
    }
    public static LoginSauceLab getValidRegistration2() {
        return LoginSauceLab
                .builder()
                .username(Credentials.Username2)
                .password(Credentials.Password)
                .build();
    }
    public static LoginSauceLab getValidRegistration3() {
        return LoginSauceLab
                .builder()
                .username(Credentials.Username3)
                .password(Credentials.Password)
                .build();
    }
    public static LoginSauceLab getValidRegistration4() {
        return LoginSauceLab
                .builder()
                .username(Credentials.Username4)
                .password(Credentials.Password)
                .build();
    }
}
