/*
 * File: DBController.java
 */
package CMCProject;
import dblibrary.project.csci230.*;
import java.io.*;
import java.util.*;
/**
 * DBController - Database controller for CMC system. This controller connects to all classes.
 * @authors Mario Party 4 - Kalila Moua
 * @version 2/24/17
 */
public class DBController {
  
//  public DBController(){
//    
//  }
  
  /**
   * This method allows the user to edit their own personal profile information.
   * @param firstName the first name to change the old first name to 
   * @param lastName the last name to change the old last name to
   * @param password the password to change the old password to
   */ 
  public void editPersonalProfile(String firstName, String lastName, String password){
  
  }

  /**
   * This method adds the user into the database -admin only.
   * @param password the password to change the old password to
   * @param username the username of the account of new added user
   * @param type the character of which represents the type of user
   */
  public void addUser(String username, String password, char type){
  
  }
  
  /**
   * This method allows the admin to edit user information.
   * @param firstName the first name to change the old first name to
   * @param lastName the last name to change the old last name to
   * @param password the password to change the old password to
   * @param type the character of which represents the type of user
   * @param status the status of the user, if active or not
   */
  public void editUser(String firstName, String lastName, String password, char type, char status){
  
  }
  
  /**
   * To deactivate user-admin only.
   */
  public void deactivateUser(String username){
  
  }
  
  /**
   * To add university to database.
   * @param u the university to add
   * 
   * @return true if add successfully
   */ 
  public boolean addUniversity(University u){
    return true;
  }
  
  /**
   * This method edits a specific university - admin only.
    * @param schoolName university to update
    * @param state which is new to update
    * @param location which is new to update
    * @param control which is new to update
    * @param numOfStu which is number of students to update
    * @param perFem which is percentage of female to update
    * @param satVerbal which is sat verbal score to update
    * @param satMath which is sat math score to update
    * @param price which is expense to update
    * @param finAid which is financial aid student can get from school to update
    * @param numOfApp which is number of applicants to update
    * @param perAdmit which is percentage of admit to update
    * @param perEnroll which is percentage of enroll to update
    * @param control which is new to update
    * @param academicScale which is scale of acedmic to update
    * @param socialScale which is scale of social to update
    * @param lifeScale which is scale of life to update
    * @param popMajor which is the emphases majors of this school to update
   */
  public void editUniversity(String state, String location, String control, int numOfStu, double perFem, int satVerbal
                       , int satMath, int price, int finAid, int numOfApp, double perAdmit, double perEnroll, int academicScale
                       , int socialScale, int lifeScale, String popMajor){

  }
  
  /**
   * Gets the list of accounts.
   * @return returns a list accounts
   */
  public List<Account> getAccountList(){
    return null;
  }
  
  /**
   * Gets a specific user.
   * @return user to return
   */
  public Account getSpecificUser(String username){
    return null;
  }
  
  /**
   * Get universities list.
   * @return list of universities in database.
   */
  public List<University> getUniversities(){
    return null;
  }
  
  /**
   * To view specific university.
   * @param university name
   * @return the university
   */
  public University viewSpecificSchool(String schoolName){
    return null;
  }
  
  /**
   * Identifies if logged on or not
   * @param username of user
   * @return the user if logged in
   */ 
  public User loggedOn(String username){
    return null;
  }
  
  /**
   * Finds the specific university and returns it.
   * @param schoolName of university
   * @param state the state in which the university is in
   * @param location to find the city of university
   * @param control the type of control
   * @param numOfStu number of students to find
   * @param perFem percentage of female to find
   * @param satVerbal sat verbal score to find
   * @param satMath sat math score to find
   * @param price expense to find
   * @param finAid financial aid student can get from school to find
   * @param numOfApp number of applicants to find
   * @param perAdmit percentage of admit to find
   * @param perEnroll percentage of enroll to find
   * @param control control to find
   * @param academicScale scale of academic to find
   * @param socialScale scale of social to find
   * @param lifeScale scale of life to find
   * @param popMajor the emphases majors of this school to find
   * @return university which needs to be found
   */ 
  public University findSpecificUniversity(String schoolName, String state, String location, String control, int numOfStu, double perFem, int satVerbal
                      , int satMath, int price, int finAid, int numOfApp, double perAdmit, double perEnroll, int academicScale
                                    , int socialScale, int lifeScale, String popMajor){
    return null;
  }
  
  /**
   * Remove selected school from user's saved school list
   * @param schoolName the school name to be removed from the saved school list
   */   
  public void removeSavedSchool(User u,String schoolName)
  {
    
  } 
  /**
   * Adds a saved school to the saved school list
   * @param schoolName the name of school to be added
   */  
  public void addSavedSchool(User u, String schoolName)
  {
    
  }
  
  /**
   * Method to retrieve list of saved schools
   * @ return list of saved schools
   */
  public List<University> getSavedSchools(User u)
  {
    return null;
  }
  
}