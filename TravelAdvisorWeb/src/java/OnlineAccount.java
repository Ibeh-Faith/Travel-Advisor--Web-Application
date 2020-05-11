/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javax.faces.context.FacesContext;
/**
 *
 * @author ibehf
 */
public class OnlineAccount implements Serializable {
    
    private String attr_name;
     private String user_id;
    private String psw;
    private DataStorage data;
    private String selectedAttractionToView;
    private String attractions;
    private String oldPsw;
    private String newPsw1;
    private String newPsw2;
    private Float score;
    private String comment;
    private String date;
     private String attr_city, attr_state, attr_description, attr_tag;
   
    //a set of attractions
    
    private ArrayList<Attraction> youMayLike
            = new ArrayList<Attraction>();
    private ArrayList<String> attractns = new ArrayList<String>();
    
    private Attraction viewAtt = null;
    private String rev = null;
    private ArrayList<Review> att_na=new ArrayList<Review>();
    private String fav=null;
    
    
    //constructor
    public OnlineAccount(String i, String p)
    {
        user_id = i;
        psw = p;
    }
    
//    public void ShowYouMayLike(){
//        youMayLike=data.YouMayLike(user_id);
//    }
//     public void ViewAttractionByName()
//    {
//        attractions = data.ViewAttractionByName(attr_name);
//    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public DataStorage getData() {
        return data;
    }

    public void setData(DataStorage data) {
        this.data = data;
    }

    public String getSelectedAttractionToView() {
        return selectedAttractionToView;
    }

    public void setSelectedAttractionToView(String selectedAttractionToView) {
        this.selectedAttractionToView = selectedAttractionToView;
    }

    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }

  

    public ArrayList<String> getAttractns() {
        return attractns;
    }

    public void setAttractns(ArrayList<String> attractns) {
        this.attractns = attractns;
    }

    public String getAttr_name() {
        return attr_name;
    }

    public void setAttr_name(String attr_name) {
        this.attr_name = attr_name;
    }

    public ArrayList<Attraction> getYouMayLike() {
        return youMayLike;
    }

    public String getOldPsw() {
        return oldPsw;
    }

    public void setOldPsw(String oldPsw) {
        this.oldPsw = oldPsw;
    }

    public String getNewPsw1() {
        return newPsw1;
    }

    public void setNewPsw1(String newPsw1) {
        this.newPsw1 = newPsw1;
    }

    public String getNewPsw2() {
        return newPsw2;
    }

    public void setNewPsw2(String newPsw2) {
        this.newPsw2 = newPsw2;
    }

    public String getAttr_city() {
        return attr_city;
    }

    public void setAttr_city(String attr_city) {
        this.attr_city = attr_city;
    }

    public String getAttr_state() {
        return attr_state;
    }

    public void setAttr_state(String attr_state) {
        this.attr_state = attr_state;
    }

    public String getAttr_description() {
        return attr_description;
    }

    public void setAttr_description(String attr_description) {
        this.attr_description = attr_description;
    }

    public String getAttr_tag() {
        return attr_tag;
    }

    public void setAttr_tag(String attr_tag) {
        this.attr_tag = attr_tag;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Attraction getViewAtt() {
        return viewAtt;
    }

    public void setViewAtt(Attraction viewAtt) {
        this.viewAtt = viewAtt;
    }

    public ArrayList<Review> getAtt_na() {
        return att_na;
    }

    public void setAtt_na(ArrayList<Review> att_na) {
        this.att_na = att_na;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getFav() {
        return fav;
    }

    public void setFav(String fav) {
        this.fav = fav;
    }

    
    
  
public String displayAttraction(String attr_n){
    
    viewAtt=data.ViewAttractionByName(attr_n);
    
    att_na = data.viewReviews(attr_n);
    
    
    if(viewAtt==null){
        return "attNotFound";
    }
    else{
        return "viewAttractions";
    }
    
}
public String revfview(){
     
      if(score>=1 && score<=5){
           String st=data.postReview(viewAtt.getName(), user_id, score, comment, DateAndTime.DateTime());
       if(st.equals("processSuccessful")){
            data.updateAttractionAvgScore(viewAtt.getName());
       }
       return st;
       }
       else{
           
           return ("processWrong");
       }
}
public String favfview(){
    
    return data.addFavorite(user_id, viewAtt.getName());
}

 public String resetPassword()
    {
        boolean newPswOK = false; 
        boolean matchOldPsw = false;
        
        
        
        if(newPsw1.equals(newPsw2))
        {
            newPswOK = true;
        }
        
        if(oldPsw.equals(psw))
        {
            matchOldPsw = true;
        }
        
        if(!newPswOK)
        {
            return ("confirmationResetWrong.xhtml");
        }
        else if(!matchOldPsw)
        {   
            return ("confirmationResetWrong.xhtml");   
        }
        else
        {
            DataStorage data = new SQL_Database();
            return data.updatePassword(user_id, newPsw1);
        }
        
    }
  public String createAttraction()
     {
        return data.CreateAttraction(user_id, attr_name, attr_city, attr_state, attr_description, attr_tag);
 }
    
  public List<Attraction> searchCityAttraction(){
      return data.searchCityAttraction(attr_city);
  }
   public List<Attraction> searchTagAttraction(){
      return data.searchAttraction(attr_tag);
  }
   public List<Favorite> viewFavoriteDestination(){
       return data.MyFavoriteDestination(user_id);
   }
   public String addFavorites(){
       return data.addFavorite(user_id, attr_name);
   }
   public List<Attraction> adminChoose(){
       return data.adminChoose();
       
   }
   public String adminApprove(String attr_n){
       return data.adminApprove(attr_n);
   }
   public String adminDeny(String attr_n){
       return data.adminDeny(attr_n);
   }
   public List<Attraction> viewYouMayLike(){
       return data.YouMayLike(user_id);
   }
   public String postReview(){
      
       if(score>=1 && score<=5){
            String st= data.postReview(attr_name, user_id, score, comment, DateAndTime.DateTime());
       if(st.equals("processSuccessful")){
            data.updateAttractionAvgScore(attr_name);
       }
       return st;
       }
       else{
           
           return ("processWrong");
       }
   }
//   public List<Review> viewReviews(String aname){
//       att_na=data.viewReviews(aname);
//       return att_na;
//   }
  public String signOut()
    {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index.xhtml";

    }
    
}
