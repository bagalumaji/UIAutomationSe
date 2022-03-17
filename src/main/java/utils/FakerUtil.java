package utils;

import com.github.javafaker.Faker;

public final class FakerUtil {
    private FakerUtil(){}
    private static Faker faker = new Faker();

    public static String getFirstName(){
        return faker.name().firstName();
    }

    public static String getLastName(){
        return faker.name().lastName();
    }

    public static String getFullName(){
        return faker.name().fullName();
    }
    public static String getEmail(){
        return faker.internet().emailAddress();
    }

    public static String getAddress(){
        return faker.address().fullAddress();
    }
    public static String getUserName(){
        return faker.name().username();
    }

    public static String getPassword(){
        return faker.internet().password();
    }

}
