/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibehf
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Registration {
     
    private String user_id;
    private String password;
    private String name;
    private String tag1;
    private String tag2;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

  
    public String register()
    {
        //load the driver
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch (Exception e)
        {
            return ("Internal Error! Please try again later.");
        }
         if((password.length() >=3 && password.length() <= 10) && (password.matches("^(?:.*[a-z].*)(?:.*[0-9].*)$")) && (password!=user_id)){
        DataStorage data = new SQL_Database();
        return data.createUserAccount(user_id, password, name, tag1, tag2);
         } 
         return ("Password must be between 3 and 10 characters and must contain at least one number or letter and must not be the same with user id ");
    }
}
