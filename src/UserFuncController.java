/*
 * File: UserFuncController.java
 */
package CMCProject;
import java.io.*;
import java.util.*;

/** 
 * UserFuncController is an implementation for the UserUI and an extension
 * of the account controller Feb. 24, 2017 Feb. Feb. 24, 2017 24, 2017
 * @author Tre Vazquez | Mario Party 4
 * @version February 30, 2017
 */

public class UserFuncController extends AccountController {
	
	private User user;
	
	private DBController dbc;
	
	private SearchController sc;
  /*
   * Constructor of the class: Inherited from super class: AccountController
   */
  public UserFuncController(User u){
    this.user = u;
    dbc = new DBController();
    search = new SearchController();
  }
  
  /**
   * Displays list of the Users Saved Schools
   * @return list of saved schools
   */
  public List<String> viewSavedSchools()
  { 
    return this.dbc.getSavedSchools(this.user);
  }
  Feb. 24, 2017
  /**
   * Removes desired school from the User's saved school list
   * @param schoolName the name of the school to be removed 
   */
  public void removeSavedSchool(String schoolName)
  {
    this.dbc.removeSavedSchool(this.user, schoolName);
  }
  
  /**
   * The search method which sorts known universities depending in 
   * the user's search criteria. 
   * @param schoolName name of the school
   * @param state which is searching condition
   * @param location which is searching condition
   * @param control which is searching condition
   * @param numOfStu which is number of students of searching condition
   * @param perFem which is percentage of female of searching condition
   * @param satVerbal which is sat verbal score of searching condition
   * @param satMath which is sat math score of searching condition
   * @param price which is expense of searching condition
   * @param finAid which is financial aid student can get from school of searching condition
   * @param numOfApp which is number of applicants of searching condition
   * @param perAdmit which is percentage of admit of searching condition
   * @param perEnroll which is percentage of enroll of searching condition
   * @param control which is new of searching condition
   * @param academicScale which is scale of acedmic of searching condition
   * @param socialScale which is scale of social of searching condition
   * @param lifeScale which is scale of life of searching condition
   * @param popMajor which is the emphases majors of this school of searching condition
   * @return list of schools matching search
   */
  public List<University> search(String schoolName, String state, String location, String control, int numOfStu, double perFem, int satVerbal
                       , int satMath, int price, int finAid, int numOfApp, double perAdmit, double perEnroll, int academicScale
                       , int socialScale, int lifeScale, String popMajor){
    this.sc.search(schoolName, state,location,control numOfStu, perFem, satVerbal,satMath,price, finAid, numOfApp,perAdmin,
			  perEnroll,academinScale, socialScale, lifeScale, popMajor)
  }
  
  /**
   * Displays a list of universities meeting the search criteria for the user. 
   * @return list of universities.
   */
  public List<String> viewSearchResults(University u) 
  {
    List<String> dis = new ArrayList<String>();
    
    dis.add(u.getName());
    dis.add(u.getState());
    dis.add(u.getLocation());
    dis.add(u.getControl());
    dis.add(Integer.toString(u.getName()));
    dis.add(Double.toString(s.getNumStudents()));
    dis.add(Integer.toString(s.getPerfemale()));
    dis.add(Integer.toString(s.getSATVerbal()));
    dis.add(Integer.toString(s.getSATMath()));
    dis.add(Integer.toString(s.getPrice()));
    dis.add(Integer.toString(s.getFinAid()));
    dis.add(Integer.toString(s.getNumOfApp()));
    dis.add(Double.toString(s.getPerAdmin()));
    dis.add(Double.toString(s.getPerEnroll()));
    dis.add(Integer.toString(s.getAcedmicScale()));
    dis.add(Integer.toString(s.getSocialScale()));
    dis.add(Integer.toString(s.getLifeScale()));
    dis.add(Integer.toString(s.getPopMajor()));
    
    return dis;
  }
  
  /**
   * Displays specific school selected to user.
   * @param schoolName the name which will serve as the selected university
   * @return university object containing university details
   */
  public University viewSpecificSchool(string schoolName)
  {
    return this.dbc.viewSpecificSchool(schoolName);
  }
  
  /**
   * displays reccomendations based upon university being viewed by a user
   * @param u a university object to be used as criteria for recommendations
   * @return list of universities with partial info
   */
  public List<University> viewRecommendation(University u){
    return sc.viewRecommendation(u);
  }
  
  /**
   * Grants user the ability to save a school to their saved school lists
   * @param schoolName the name of the school to be saved 
   */
  public void saveSchool(String schoolName)
  {
    this.dbc.addSavedSchool(this.user, schoolName);
  }
  
  /**
   * displays the user profile to the user.
   * @return user object to preview user details
   */
  public User viewPersonalProfile()
  {
    return this.dbc.getSpecificUser(this.user.getUserName()); //might be wrong?
  }
  
  /**
   * Grants user the ability to edit their personal profile
   * @param firstName the user's firstName
   * @param lastName the user's lastName
   * @param password the user's password
   */
  public void editPersonalProfile(String firstName, String lastName, String password)
  {
    this.dbc.editPersonalProfile(firstName, lastName, password);
  }
}