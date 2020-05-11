/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author ibehf
 */
public interface DataStorage {
     
    String createUserAccount(String user_id, String name, String pswd, String tag1, String tag2);
    String login(String id, String password);
    String AdminLogin(String id, String password);
    String updatePassword(String user_id, String pswd);
  String searchCity(String i);
  ArrayList<Attraction>searchCityAttraction(String i);
   ArrayList<Attraction>searchAttraction(String i);
    Attraction ViewAttractionByName(String i);
   ArrayList<Favorite> MyFavoriteDestination(String i);
    void updateAccount(String accountNumber, double balance, String statement);
   String postReview(String att_name, String user_id, float score, String comments, String date);
   String addFavorite(String user_id, String Attr_name);
    String adminApprove(String name);
    ArrayList<Attraction> adminChoose() ;
    String adminDeny(String name);
    ArrayList<Attraction> YouMayLike(String i);
    ArrayList<Review> viewReviews(String i);
    void updateAttraction(String user_id, String name, String city, String state, String description, String tag);
    String updateAttractionAvgScore(String name);
    String CreateAttraction(String user_id, String name, String city, String state, String description, String tag);
}
