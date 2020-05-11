/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ibehf
 */
public class UserAccount extends Account{
    
    private String name;
    private String tag1;
    private String tag2;
    private String tag3;
    static DataStorage data=new SQL_Database();
   

    
    public UserAccount(String ui, String pw, String n, String t1, String t2, String t3){
        super(ui, pw);
        
        name = n;
        tag1=t1;
        tag2=t2;
        tag3=t3;
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
    
//    public static void createAttraction(){
//        
//        Scanner input = new Scanner(System.in);
//        String user_id,Name, City, State, Description, Tag, tag22="";
//        
//        System.out.println("Enter user id");
//        user_id=input.nextLine();
//        
//        System.out.println("Enter Attraction Name");
//        Name=input.nextLine();
//        
//        System.out.println("What City is this attraction located?");
//        City=input.nextLine();
//        
//        System.out.println("What State is this attraction located?");
//        State=input.nextLine();
//        
//        System.out.println("Give a description of this attraction");
//        Description=input.nextLine();
//        
//        System.out.println("what tag does this attaction belong in?");
//        System.out.println("1: History Buff \n 2: Shopping Fanatic \n 3: Beach Goer \n 4: Urban Explorer \n 5: Nature Lover \n 6: Family Vacationer");
//        Tag=input.nextLine();
//        switch (Tag) {
//                 case "1":
//                     tag22="History Buff";
//                     break;
//                 case "2":
//                     tag22="Shopping Fanatic";
//                     break;
//                 case "3":
//                     tag22="Beach Goer";
//                     break;
//                 case "4":
//                     tag22="Urban Explorer";
//                     break;
//                 case "5":
//                     tag22="Nature Lover";
//                     break;
//                 case "6":
//                     tag22="Family Vacationer";
//                     break;
//                 default:
//                     break;
//        }
//        data.CreateAttraction(user_id, Name, City, State, Description, tag22);
//    }
//  
//public static void searchTagAttraction(){
//    String attr, ans;
//    
//    Scanner input = new Scanner(System.in);
// 
//System.out.println("Please enter a tag:");
//        attr=input.nextLine();
//        
//                if(data.searchAttraction(attr) !=null){
//               System.out.println(data.searchAttraction(attr));
//               
//                System.out.println("Enter the name of the attraction to view by name");
//                ans=input.nextLine();
//                System.out.println(data.ViewAttractionByName(ans));
//        }
//        
//            else{
//                System.out.println("Attraction not found");
//            }
//  
//}
//public static void Favorite(){
//    
//    Scanner input = new Scanner(System.in);
//    
//    String user_id, attr;
//    System.out.println("Enter user id");
//    user_id=input.nextLine();
//    System.out.println("Enter attraction name");
//    attr=input.nextLine();
//    data.addFavorite(user_id, attr);
//}
//public static void searchCityAttraction(){
//    String city;
//    String ans;
//    
//    Scanner input = new Scanner(System.in);
//    
//    
//    System.out.println("Please enter a city:");
//        city=input.nextLine();
//        if(data.searchCity(city) !=null){
//               System.out.println(data.searchCity(city));
//               
//                System.out.println(data.searchCityAttraction(city));
//               
//               
//                System.out.println("Enter the name of the attraction to view by name");
//                ans=input.nextLine();
//                System.out.println(data.ViewAttractionByName(ans));
//        }
//            else{
//                System.out.println("Attraction not found");
//            }
//  
//}
//
//public static void MyFavoriteDestination(){
//     String id,ans;
//    
//    Scanner input = new Scanner(System.in);
//    
//    System.out.println("Please your user id:");
//    id=input.nextLine();
//    System.out.println(data.MyFavoriteDestination(id));
//    System.out.println("Enter the name of the attraction to view by name");
//                ans=input.nextLine();
//                System.out.println(data.ViewAttractionByName(ans));
//}
//public static void postReview(){
//    String attr;
//    String id;
//    String name;
//    String user_id;
//    float score;
//    String comments;
//    String date;
//    
//    Scanner input = new Scanner(System.in);
//    
//                 System.out.println("Enter the name of the attraction");
//                name=input.nextLine();
//                System.out.println("Enter your user_id");
//                user_id=input.nextLine();
//                System.out.println("Give this attraction a rating from 1 to 5");
//                score=Float.parseFloat(input.nextLine());
//                System.out.println("Leave a comment");
//                comments=input.nextLine();
//                System.out.println("What's today's date in MM-DD-YYY");
//                date=input.nextLine();
//                if(score>=1 && score<=5){
//                      data.postReview(name,user_id, score, comments, date);
//                }
//                else{
//                    System.out.println("Score must be between 1 and 5");
//                }
//                data.updateAttractionAvgScore(name);
//        }
           
            }
        





