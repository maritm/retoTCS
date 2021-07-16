package co.com.tcs.certification.retotuya.model;

import java.util.HashMap;
import java.util.Map;

public class DataList {
    private String userName,password,contactEmail,contactName,message;
    private static Map<String,Object> responseUser=new HashMap<>();
    private static Map<String,Object> responseCart=new HashMap<>();


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static Map<String, Object> getResponseUser() {
        return responseUser;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public String getMessage() {
        return message;
    }

    public static void setResponseUser(Map<String, Object> responseUser) {
        DataList.responseUser = responseUser;
    }

    public static Map<String, Object> getResponseCart() {
        return responseCart;
    }

    public static void setResponseCart(Map<String, Object> responseCart) {
        DataList.responseCart = responseCart;
    }
}
