package testdata;

import constants.Credentials;
import models.LoginSauceLab;

public class PrepareLoginData {

    public static LoginSauceLab getValidRegistration1() {
        return LoginSauceLab
                .builder()
                .username(Credentials.USERNAME1)
                .password(Credentials.PASSWORD)
                .build();
    }
    public static LoginSauceLab getValidRegistration2() {
        return LoginSauceLab
                .builder()
                .username(Credentials.USERNAME2)
                .password(Credentials.PASSWORD)
                .build();
    }
    public static LoginSauceLab getValidRegistration3() {
        return LoginSauceLab
                .builder()
                .username(Credentials.USERNAME3)
                .password(Credentials.PASSWORD)
                .build();
    }
    public static LoginSauceLab getValidRegistration4() {
        return LoginSauceLab
                .builder()
                .username(Credentials.USERNAME4)
                .password(Credentials.PASSWORD)
                .build();
    }
}
