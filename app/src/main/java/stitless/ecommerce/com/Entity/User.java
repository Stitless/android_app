package stitless.ecommerce.com.Entity;

import java.io.Serializable;
import java.util.HashMap;

public class User implements Serializable
{
    private String name, phone, password;

    public User()
    {

    }


    public User(String name, String phone, String password) {
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap<String, Object> getMap ()
    {
        HashMap<String, Object> userdataMap = new HashMap<>();
        userdataMap.put("phone", phone);
        userdataMap.put("password", password);
        userdataMap.put("name", name);
        return userdataMap;
    }
}
