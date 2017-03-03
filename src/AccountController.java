/*
 * File: AccountController.java
 */
import java.io.*;
/**
 * AccountController - Controller to control account functionality.
 * 
 * @authors Mario Party 4 - Kalila Moua
 * @version 2/24/17
 */
public class AccountController {
  
  //true if user is logged on
  public boolean isLoggedOn;
  //username of user
  public String username;
  //password of user
  private String password;
  
  /*
   * default constructor
   */
  public AccountController(){
    this.username=null;
    this.password=null;
  }
  
  /*
   * second constructor which sets username and password for object
   */
  public AccountController(String username, String password){
    this.username=username;
    this.password=password;
  }
  
  /**
   * This method is to test if the user is logged off or not. //update in class diagram
   * @return true if user is logged off, false otherwise
   */ 
  public boolean logOff(){
    return true;
  }
  
  /**
   * This method is to logon to the cmc system.
   * @param username the username the user puts in
   * @param password the password the user enters in
   * @return true if the user is logged on and authentication is confirmed, otherwise return false
   */
  public boolean logOn(String username, String password){
    return true;
  }
  
  /**
   * This method identifies the type of user the user is: 'a' or 'u'.
   * @param username the username the user puts in
   * @return the character 'a' for admin, or 'u' for user
   */
  public char typeOfUser(String username){
    return 'a';
  }
  
  /**
   * This method resets the logging in fields for the user.
   */
  public void reset(){ 
  }
}