/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author ibehf
 */
@ManagedBean
@SessionScoped
public class Login implements Serializable{

    private String user_id;
    private String password;
    OnlineAccount theLoginAccount;

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

    public OnlineAccount getTheLoginAccount() {
        return theLoginAccount;
    }

    public void setTheLoginAccount(OnlineAccount theLoginAccount) {
        this.theLoginAccount = theLoginAccount;
    }
    
     public String login()
    {
        //load the Driver
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
            //return to internalError.xhtml
            return ("internalError");
        }
        
        DataStorage data = new SQL_Database();
        
        String fileName = data.login(user_id, password);
        
        if(fileName.equals("welcome"))
        {
            theLoginAccount = new OnlineAccount(user_id, password);
            theLoginAccount.setData(data);
//            String userSsn = data.getSsnByID(user_id);
//            theLoginAccount.setSsn(userSsn);
//            theLoginAccount.updateBankAccounts();
//            theLoginAccount.updateBankIDs();
            return "welcome";
        }
        else
        {
            return fileName;
        }
          
         
    }
     
      public String adminlogin()
    {
        //load the Driver
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
            //return to internalError.xhtml
            return ("internalError");
        }
        
        DataStorage data = new SQL_Database();
        
        String fileName = data.AdminLogin(user_id, password);
        
        if(fileName.equals("adminWelcome"))
        {
            theLoginAccount = new OnlineAccount(user_id, password);
            theLoginAccount.setData(data);
//            String userSsn = data.getSsnByID(user_id);
//            theLoginAccount.setSsn(userSsn);
//            theLoginAccount.updateBankAccounts();
//            theLoginAccount.updateBankIDs();
            return "adminWelcome";
        }
        else
        {
            return fileName;
        }
          
         
    }
     
}
