/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author ibehf
 */
public class AdminAccount extends Account{
    private String name;
      static SQL_Database data=new SQL_Database();
    public AdminAccount(String ui, String pw, String n){
        super(ui, pw);
        name=n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//    public static void ApproveAttraction(){
//        String aname, stats;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Attraction name to approve");
//        aname=input.nextLine();
//        System.out.println(data.adminChoose(aname));
//        System.out.println("1: Approve\n 2: Deny");
//        stats=input.nextLine();
//        
//        if("1".equals(stats)){
//            data.adminApprove(aname);
//            System.out.println("Attraction Approved");
//        }
//        else if("2".equals(stats)){
//            data.adminDeny(aname);
//            System.out.println("Attraction Denied");
//        }
//        
//    }
    
}
