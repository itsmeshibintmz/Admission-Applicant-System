
package com.sgca.bo;


import com.sgca.Exception.SGCAException;
import com.sgca.dao.ApplicationSubmissionDAO;
import com.sgca.model.Application;

/**
 * This class contains all the business logic regarding application submission
 * and registration
 * 
 * @author Shibin Thomas 
 * version 1.0
 *
 */
public class ApplicationSubmissionBO {
    // To Fetch Data
    /**
     * 
     * Method used to Accept fetch inputs from Servlet and return to DAO
     * 
     * @param argMguNo  MGU Application Number of student
     * @param argAppNo  Application number of student
     * @param argCourse Name of course
     * @return values to DAO
     */
    public Application fetchData(int argMguNo, int argAppNo, String argCourse) {
        try {
            return new ApplicationSubmissionDAO().fetchData(argMguNo, argAppNo,
                argCourse);
        } catch (SGCAException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    // Page One Applicant Registration
    /**
     * Method to Accept input values from Page One, generate Application Number,
     * and return to DAO
     * 
     * @param argData object containing Applicant MGU number and Course Name
     * @return values to DAO
     */
    public Application newApplication(Application argData) {
        int appNo = ((int) (System.currentTimeMillis() / 1000)
            + argData.getMguNumber());
        argData.setApplicationNo(appNo);
        argData.setPhase(1);
        // Set Application status as Started
        argData.setApplicationStatus("started");
        try {
            return new ApplicationSubmissionDAO()
                .applicationSubmission(argData);
        } catch (SGCAException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    // Page Two of Applicant Registration
    /**
     * Method to accept input values from Page Two of User Registration and
     * return to DAO
     * 
     * @param argData object holding student details from application page Two
     * @return values to DAO
     */
    public Application pageTwo(Application argData) {
        try {
            return new ApplicationSubmissionDAO().applicationTwo(argData);
        } catch (SGCAException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    // Page Three of Applicant Registration
    /**
     * Method to accept input values from Page Three of User Registration and
     * return to DAO
     * 
     * @param argData object holding Student details from application page Three
     * @return values to DAO
     */
    public Application pageThree(Application argData) {
        try {
            return new ApplicationSubmissionDAO().applicationThree(argData);
        } catch (SGCAException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    // Page Four of Applicant Registration
    /**
     * Method to accept input values from Page Four of User Registration and
     * return to DAO
     * 
     * @param argData object holding student details from application page Four
     * @return values to DAO
     */
    public Application pageFour(Application argData) {
        try {
            return new ApplicationSubmissionDAO().applicationFour(argData);
        } catch (SGCAException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    // Page Five of Applicant Registration
    /**
     * Method to accept input values from Page Five of User Registration and
     * return to DAO
     * 
     * @param argData object holding student details from Application page Five
     * @return values to DAO
     */
    public Application pageFive(Application argData) {
        try {
            return new ApplicationSubmissionDAO().applicationFive(argData);
        } catch (SGCAException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    // Page Six of Applicant Registration
    /**
     * Method to accept input values from Page Five of User Registration and
     * return to DAO
     * 
     * @param argData object holding student details from Application page Six
     * @return values to DAO
     */
    public Application pageSix(Application argData) {
        try {
            return new ApplicationSubmissionDAO().applicationSix(argData);
        } catch (SGCAException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    // Page Seven(Last Page) of Applicant Registration
    /**
     * Method to Accept input values from last page and Pass to DAO
     * 
     * @param argData object holding student details from Application page Seven
     * @return values to DAO
     */
    public Application pageSeven(Application argData) {
        try {
            return new ApplicationSubmissionDAO().applicationLastPage(argData);
        } catch (SGCAException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
