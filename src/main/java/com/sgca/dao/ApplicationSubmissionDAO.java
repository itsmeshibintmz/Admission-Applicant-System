
package com.sgca.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sgca.Exception.SGCAException;
import com.sgca.model.Application;

/**
 * Class used to Submit,Fetch and Update data entered by Applicant from and to
 * Database
 * 
 * @author Shibin Thomas 
 * version 1.0
 *
 */
public class ApplicationSubmissionDAO {
    /**
     * Method used to Fetch Data from Database
     * 
     * @param argMguNo  MGU Application Number of Applicant
     * @param argAppno  Application Number of Applicant
     * @param argCourse Course of Applicant
     * @return Object holding details regarding the user
     */
    public Application fetchData(int argMguNo, int argAppno, String argCourse)
        throws SGCAException {
        Application data = null;
        try {
            // Connection
            Connection conn = DBConnection.getConnection();
            // Fetching values from Student Registration Database
            PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM STUDENTREG WHERE mguno =? "
                    + "and appno = ? and sub = ?");
            ps.setInt(1, argMguNo);
            ps.setInt(2, argAppno);
            ps.setString(3, argCourse);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                data = new Application();
                data.setPhase(rs.getInt("phase"));
                data.setId(rs.getInt("id"));
                data.setApplicationNo(rs.getInt("appno"));
                data.setSubject(rs.getString("sub"));
                data.setMguNumber(rs.getInt("mguno"));
                data.setStudName(rs.getString("nameOfStudent"));
                data.setSex(rs.getString("sex"));
                data.setMaritalStatus(rs.getString("maritalStatus"));
                data.setHandicapped(rs.getString("handicapped"));
                data.setAddress(rs.getString("address"));
                data.setPincode(rs.getInt("pincode"));
                data.setPhno(rs.getDouble("phno"));
                data.setEmail(rs.getString("email"));
                data.setDateOfBirth(rs.getDate("tcdate").toLocalDate());// date
                data.setSslcRegisNo(rs.getDouble("regnosslc"));
                data.setSslcDate(rs.getDate("tcdate").toLocalDate());// date
                data.setSslcBoard(rs.getString("sslcboard"));
                data.setSslcSchool(rs.getString("sslcschool"));
                data.setSslcPercentage(rs.getInt("sslc_percentage"));
                data.setPlusTwoCat(rs.getString("pluscat"));
                data.setPlusTwoDate(rs.getDate("tcdate").toLocalDate());// date
                data.setPlusTwoRegNo(rs.getDouble("plusregno"));
                data.setPlusTwoSchool(rs.getString("plusschool"));
                data.setPlusTwoBoard(rs.getString("plusboard"));
                data.setPlusTwoPercentage(rs.getInt("plustwo_percentage"));
                data.setLastCourseName(rs.getString("lastcoursename"));
                data.setLastCourseSchoolName(
                    rs.getString("lastcoursesccolname"));
                data.setTcDate(rs.getDate("tcdate").toLocalDate());// date
                data.setTcNumber(rs.getInt("tcnumber"));
                data.setReligionCaste(rs.getString("religioncaste"));
                data.setRegType(rs.getString("regtype"));
                data.setAnnualIncome(rs.getDouble("annualincome"));
                data.setParentName(rs.getString("nameparent"));
                data.setParentJob(rs.getString("parentoccupation"));
                data.setRelGuardian(rs.getString("relguardian"));
                data.setNccNss(rs.getString("nccnss"));
                data.setSportsGames(rs.getString("sportsgames"));
                data.setLiteraryCultural(rs.getString("literarycultural"));
            }
            
        } catch (SQLException e) {
            // Prints the throwable along with other details like the line
            // number and class name where the exception occurred.
            e.printStackTrace();
            throw new SGCAException(e);
        }
        return data;
    }
    
    /**
     * Method used to Create Application based on values entered by User on
     * First Page
     * 
     * @param data Object holding values from First Page
     * @return Object data
     * @throws SGCAException Exception created by User
     */
    // Page One Create Application
    public Application applicationSubmission(Application data)
        throws SGCAException {
        try {
            // Getting current date
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            // Connection to database
            Connection conn = DBConnection.getConnection();
            // Inserting values to Student Registration Database
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO `STUDENTREG` (`appno`, `phase`, `sub`, `mguno`,"
                    + "`application_status`,`created_date`) VALUES"
                    + " (?, ?, ?, ?, ?,?);");
            ps.setInt(1, data.getApplicationNo());
            ps.setInt(2, data.getPhase());
            ps.setString(3, data.getSubject());
            ps.setInt(4, data.getMguNumber());
            ps.setString(5, data.getApplicationStatus());
            ps.setDate(6, date);
            // Executes the SQL query in this PreparedStatement
            ps.execute();
            
        } catch (SQLException e) {
            // Prints the throwable along with other details like the line
            // number and class name where the exception occurred.
            e.printStackTrace();
            throw new SGCAException(e);
        }
        return data;
    }
    
    /**
     * Method used to update values to database based on values entered by
     * Applicant on second page of Registration
     * 
     * @param data Object holding details from Page Two
     * @return Data Object
     * @throws SGCAException Exception created by User
     */
    // Page Two of Registration
    public Application applicationTwo(Application data) throws SGCAException {
        try {
            // Connection to Database
            Connection conn = DBConnection.getConnection();
            // Updating values of Student Registration Database
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE `STUDENTREG` SET `phase` = 2, `nameOfStudent` = ?,"
                    + " `sex` = ?, `maritalStatus` = ?, `handicapped` = ?,"
                    + " `address` = ?, `pincode` = ?, `phno` = ?,"
                    + " `email` = ? WHERE (`appno` = ?);");
            ps.setString(1, data.getStudName());
            ps.setString(2, data.getSex());
            ps.setString(3, data.getMaritalStatus());
            ps.setString(4, data.getHandicapped());
            ps.setString(5, data.getAddress());
            ps.setInt(6, data.getPincode());
            ps.setDouble(7, data.getPhno());
            ps.setString(8, data.getEmail());
            ps.setInt(9, data.getApplicationNo());
            // Executes the SQL query in this PreparedStatement
            ps.execute();
            
        } catch (SQLException e) {
            // Prints the throwable along with other details like the line
            // number and class name where the exception occurred.
            e.printStackTrace();
            throw new SGCAException(e);
            
        }
        return data;
    }
    
    /**
     * Method used to update values to database based on values entered by
     * Applicant on Third page of Registration
     * 
     * @param data data Object holding details from Page Three
     * @return Data Object
     * @throws SGCAException Exception created by User
     */
    // Page Three of Student Registration
    public Application applicationThree(Application data) throws SGCAException {
        try {
            // Connection to Database
            Connection conn = DBConnection.getConnection();
            // Updating values of Student Registration Database
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE `STUDENTREG` SET `phase` = 3, `dob` = ?, "
                    + "`regnosslc` = ?, `sslcyearmonth` = ?, `sslcboard` = ?,"
                    + " `sslcschool` = ?, `sslc_percentage` = ?, "
                    + "`pluscat` = ?,`plusyearmonth` = ?, `plusregno` = ?, "
                    + "`plusschool` = ?,`plusboard` = ?, "
                    + "`plustwo_percentage` = ?,`lastcoursename` = ?,"
                    + " `lastcoursesccolname` = ?,`tcdate` = ?, `tcnumber` = ?"
                    + " WHERE (`appno` = ?);");
            
            ps.setDate(1, Date.valueOf(data.getDateOfBirth()));
            ps.setDouble(2, data.getSslcRegisNo());
            ps.setDate(3, Date.valueOf(data.getSslcDate()));
            ps.setString(4, data.getSslcBoard());
            ps.setString(5, data.getSslcSchool());
            ps.setInt(6, data.getSslcPercentage());
            ps.setString(7, data.getPlusTwoCat());
            ps.setDate(8, Date.valueOf(data.getPlusTwoDate()));
            ps.setDouble(9, data.getPlusTwoRegNo());
            ps.setString(10, data.getPlusTwoSchool());
            ps.setString(11, data.getPlusTwoBoard());
            ps.setInt(12, data.getPlusTwoPercentage());
            ps.setString(13, data.getLastCourseName());
            ps.setString(14, data.getLastCourseSchoolName());
            ps.setDate(15, data.getTcDate() == null ? null
                : Date.valueOf(data.getTcDate()));
            ps.setInt(16, data.getTcNumber());
            ps.setInt(17, data.getApplicationNo());
            // Executes the SQL query in this PreparedStatement
            ps.executeUpdate();
            
        } catch (SQLException e) {
            // Prints the throwable along with other details like the line
            // number and class name where the exception occurred.
            e.printStackTrace();
            throw new SGCAException(e);
        }
        return data;
    }
    
    /**
     * Method used to update values to database based on values entered by
     * Applicant on Fourth page of Registration
     * 
     * @param data data Object holding details from Page Four
     * @return Data Object
     * @throws SGCAException Exception created by User
     */
    // Page Four of Student Registration
    public Application applicationFour(Application data) throws SGCAException {
        try {
            // Connection to Database
            Connection conn = DBConnection.getConnection();
            // Updating values of Student Registration Database
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE `studentreg` SET `phase` = 4, `religioncaste` = ?,"
                    + " `regtype` = ?, `annualincome` = ? "
                    + "WHERE (`appno` = ?);");
            ps.setString(1, data.getReligionCaste());
            ps.setString(2, data.getRegType());
            ps.setDouble(3, data.getAnnualIncome());
            ps.setInt(4, data.getApplicationNo());
            // Executes the SQL query in this PreparedStatement
            ps.executeUpdate();
            
        } catch (SQLException e) {
            // Prints the throwable along with other details like the line
            // number and class name where the exception occurred.
            e.printStackTrace();
            throw new SGCAException(e);
        }
        return data;
    }
    
    /**
     * Method used to update values to database based on values entered by
     * Applicant on Fifth page of Registration
     * 
     * @param data data Object holding details from Page Five
     * @return Data Object
     * @throws SGCAException Exception created by User
     */
    // Page Five of Student Registration
    public Application applicationFive(Application data) throws SGCAException {
        try {
            // Connection to Database
            Connection conn = DBConnection.getConnection();
            // Updating values of Student Registration Database
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE `STUDENTREG` SET `phase` = 5,"
                    + " `nameparent` = ?, `parentoccupation` = ?, "
                    + "`relguardian` = ? WHERE (`appno` = ?);");
            ps.setString(1, data.getParentName());
            ps.setString(2, data.getParentJob());
            ps.setString(3, data.getRelGuardian());
            ps.setInt(4, data.getApplicationNo());
            // Executes the SQL query in this PreparedStatement
            ps.executeUpdate();
            
        } catch (SQLException e) {
            // Prints the throwable along with other details like the line
            // number and class name where the exception occurred.
            e.printStackTrace();
            throw new SGCAException(e);
        }
        return data;
    }
    
    /**
     * Method used to update values to database based on values entered by
     * Applicant on Sixth page of Registration
     * 
     * @param data data Object holding details from Page Six
     * @return Data Object
     * @throws SGCAException Exception created by User
     */
    // Page Six of Student Registration
    public Application applicationSix(Application data) throws SGCAException {
        try {
            // Getting current date
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            // Connection to Database
            Connection conn = DBConnection.getConnection();
            // Updating values of Student Registration Database
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE `STUDENTREG` SET `phase` = 6, "
                    + " `nccnss` = ?, "
                    + "`sportsgames` = ?, `literarycultural` = ?,"
                    + " `submitted_date` = ? WHERE (`appno` = ?);");
            ps.setString(1, data.getNccNss());
            ps.setString(2, data.getSportsGames());
            ps.setString(3, data.getLiteraryCultural());
            ps.setDate(4, date);
            ps.setInt(5, data.getApplicationNo());
            // Executes the SQL query in this PreparedStatement
            ps.executeUpdate();
            
        } catch (SQLException e) {
            // Prints the throwable along with other details like the line
            // number and class name where the exception occurred.
            e.printStackTrace();
            throw new SGCAException(e);
        }
        return data;
    }
    
    /**
     * Method used to set Status of Application to be submitted
     * 
     * @param data data Object holding details from Page Seven
     * @return Data Object
     * @throws SGCAException Exception created by User
     */
    // Last(Display) Page of Student Registration
    public Application applicationLastPage(Application data)
        throws SGCAException {
        try {
            // Connection to Database
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE `STUDENTREG` SET `phase` = 7, "
                    + "`application_status` = 'submitted'"
                    + " WHERE (`appno` = ?);");
            ps.setInt(1, data.getApplicationNo());
            // Executes the SQL query in this PreparedStatement
            ps.executeUpdate();
            
        } catch (SQLException e) {
            // Prints the throwable along with other details like the line
            // number and class name where the exception occurred.
            e.printStackTrace();
            throw new SGCAException(e);
        }
        return data;
    }
}
