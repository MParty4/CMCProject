/*
 * File: AdminUI.java
 */

import java.io.*;
import java.util.*;
/**
 * class for a Admin extends AccountUI
 * 
 * @author Yidan Zhang
 * @version Feb. 24, 2017
 */

public class AdminUI extends AccountUI{
  
  /*
   * Constructor of the class: Inherited from super class: AccountUI
   */
  public AdminUI(){
    super();
  }
  /*
   * view the list of users
   * 
   * @return list of users
   */  
  public List<User> viewUsers(){
    return null;
  }
  
  /*
   * Add a new user to database
   * 
   * @param username the username of new user
   * @param password which is created by the new user
   * 
   * @return true if add successfully
   */
  public boolean addUser(String username, String password){
  return false;
  }
  
  /*
   * view a specific user profile including first name, last name, username, password, type, status
   * 
   * @param userName of the user
   * @param password of the user
   * 
   * @return user including personal profile
   */   
  public User viewSpecificUser(String username){
  return null;
  }
  /*
   * edit a specific user profile including first name, last name, username, password, type, status
   * 
   * @param firstName which is new to update
   * @param lastName which is new to update
   * @param password which is new to update
   * @param type which is new to update
   * @param status which is new to update
   * 
   */  
  public void editUser(String firstName, String lastName, String password, char type, char status){}
  /*
   * view a specific user profile including first name, last name, username, password, type, status
   * 
   * @param userName of the user
   * 
   */ 
  public void deactivateUser(String username){}
  
  /*
   * view the list of universities
   * 
   * @return list of universities
   */   
  public List<University> viewUniversities(){
  return null;
  }
  /*
   * add a university
   * 
   * @param u the instance of University which will be added to database
   * 
   * @return true if add successfully
   * 
   */   
  public boolean addUniversity(University u){return false;}
  
  /*
   * view a specific university information 
   * 
   * @param universityName which admin wants to view
   * 
   * @return university including its detailed information
   */    
  public University viewSpecificUniversity(String univeristyName){return null;}
  
  /*
   * edit a specific university information including 
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
   * 
   */   
  public void editUniversity(String state, String location, String control, int numOfStu, double perFem, int satVerbal
                               , int satMath, int price, int finAid, int numOfApp, double perAdmit, double perEnroll, int academicScale
                               , int socialScale, int lifeScale, String popMajor){}
  
}