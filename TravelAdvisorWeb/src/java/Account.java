/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibehf
 */
public abstract class Account {
    private String user_id;
    private String password;
      private SQL_Database data = new SQL_Database();
    
    public Account(String ui, String pw){
        user_id=ui;
        password=pw;
    }

    public String getUser_Id() {
        return user_id;
    }

    public void setUser_Id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   

    void setData(SQL_Database data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
   
    

