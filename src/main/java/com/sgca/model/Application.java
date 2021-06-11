
package com.sgca.model;


import java.time.LocalDate;

/**
 * Class is used to Define variables and also define Getters and Setters
 * 
 * @author Shibin Thomas 
 * Version 1.0
 *
 */
public class Application {
    
    // Values based on Database
    
    private int id;
    private int applicationNo;
    private String applicationStatus;
    private int phase;
    private String subject;
    private int mguNumber;
    private String studName;
    private String sex;
    private String maritalStatus;
    private String handicapped;
    private String address;
    private int pincode;
    private double phno;
    private String email;
    
    // date class in consideration
    
    private LocalDate dateOfBirth;
    private double sslcRegisNo;
    private LocalDate sslcDate;
    private String sslcBoard;
    private String sslcSchool;
    private int sslcPercentage;
    
    private String plusTwoCat;
    private LocalDate plusTwoDate;
    private double plusTwoRegNo;
    private String plusTwoSchool;
    private String plusTwoBoard;
    private int plusTwoPercentage;
    
    private String lastCourseName;
    private String lastCourseSchoolName;
    private LocalDate tcDate;
    private int tcNumber;
    
    private String religionCaste;
    private String regType;
    
    private double annualIncome;
    private String parentName;
    private String parentJob;
    private String relGuardian;
    
    private String nccNss;
    private String sportsGames;
    private String literaryCultural;
    
    /**
     * Columns used for Ranking Further
     */
    private String rejectComments;
    private String decisionTime;
    private int approverId;
    private int StudentRank;
    
    /**
     * To get ID
     * 
     * @return ID
     */
    public int getId() {
        return id;
    }
    
    /**
     * To set ID
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * To get Application Number
     * 
     * @return Application Number
     */
    public int getApplicationNo() {
        return applicationNo;
    }
    
    /**
     * To set Application Number
     * 
     * @param applicationNo Generated Application number
     */
    public void setApplicationNo(int applicationNo) {
        this.applicationNo = applicationNo;
    }
    
    /**
     * To get Application current Status
     * 
     * @return the status of Application Created
     */
    public String getApplicationStatus() {
        return applicationStatus;
    }
    
    /**
     * To set Application Status
     * 
     * @param applicationStatus Status of current Application
     */
    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
    
    /**
     * To get Phase of Application
     * 
     * @return Phase Number of current Application
     */
    public int getPhase() {
        return phase;
    }
    
    /**
     * To set the Phase of Current Application
     * 
     * @param phase Phase/Page Number of Current Application
     */
    public void setPhase(int phase) {
        this.phase = phase;
    }
    
    /**
     * To Get the course selected by the Applicant
     * 
     * @return the Course selected
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * To set the Course Selected
     * 
     * @param subject Course Selected
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * To get the MGU Application entered by Applicant
     * 
     * @return MGU application Number
     */
    public int getMguNumber() {
        return mguNumber;
    }
    
    /**
     * To set MGU Application entered by Applicant
     * 
     * @param mguNumber MGU Application Number
     */
    public void setMguNumber(int mguNumber) {
        this.mguNumber = mguNumber;
    }
    
    /**
     * To get Student Name/Name of Applicant
     * 
     * @return Student Name/Name of Applicant
     */
    public String getStudName() {
        return studName;
    }
    
    /**
     * To set Student Name/Applicant Name
     * 
     * @param studName Student/Applicant Name
     */
    public void setStudName(String studName) {
        this.studName = studName;
    }
    
    /**
     * To get Sex of the Applicant
     * 
     * @return Sex of Applicant
     */
    public String getSex() {
        return sex;
    }
    
    /**
     * To set Sex of the Applicant
     * 
     * @param sex Sex of Applicant
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    /**
     * To get Martial Status of Applicant
     * 
     * @return Martial Status of Applicant
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }
    
    /**
     * To set Marital Status of Applicant
     * 
     * @param maritalStatus Marital Status of Applicant
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    /**
     * To get Whether the Applicant is Handicapped or not
     * 
     * @return whether Applicant is Handicapped or Not
     */
    public String getHandicapped() {
        return handicapped;
    }
    
    /**
     * To set whether Applicant is Handicapped or Not
     * 
     * @param handicapped Student Handicapped or Not
     */
    public void setHandicapped(String handicapped) {
        this.handicapped = handicapped;
    }
    
    /**
     * To get the Address of the Applicant
     * 
     * @return Address of the Applicant
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * To set Address of the Applicant
     * 
     * @param address Address of Applicant
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * To get Pin code of Applicant
     * 
     * @return Pin code of Applicant
     */
    public int getPincode() {
        return pincode;
    }
    
    /**
     * To set Pin Code of Applicant
     * 
     * @param pincode Pin Code of Applicant
     */
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    
    /**
     * To get the Phone Number of the Applicant
     * 
     * @return Phone Number of Applicant
     */
    public double getPhno() {
        return phno;
    }
    
    /**
     * To set Phone Number of Applicant
     * 
     * @param phoneNo Phone Number of Applicant
     */
    public void setPhno(double phoneNo) {
        this.phno = phoneNo;
    }
    
    /**
     * To get Email Address of Applicant
     * 
     * @return Email Address of Applicant
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * To set Email Address of Applicant
     * 
     * @param email Email Address of Applicant
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * To get Date of Birth of Applicant
     * 
     * @return Date of Birth of Applicant
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
    /**
     * To set Date of Birth of Applicant
     * 
     * @param dateOfBirth Date of birth of Applicant
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    /**
     * to get SSLC Register Number of Applicant
     * 
     * @return SSLC Register Number of Applicant
     */
    public double getSslcRegisNo() {
        return sslcRegisNo;
    }
    
    /**
     * To set SSLC Register Number of Applicant
     * 
     * @param regisNumber SSLC Register Number of Applicant
     */
    public void setSslcRegisNo(double regisNumber) {
        this.sslcRegisNo = regisNumber;
    }
    
    /**
     * To get SSLC Date of Applicant
     * 
     * @return SSLC Date of Applicant
     */
    public LocalDate getSslcDate() {
        return sslcDate;
    }
    
    /**
     * To set SSLC Date of Applicant
     * 
     * @param sslcDate SSLC Date of Applicant
     */
    public void setSslcDate(LocalDate sslcDate) {
        this.sslcDate = sslcDate;
    }
    
    /**
     * To get SSLC Board of Applicant
     * 
     * @return SSLC Board of Applicant
     */
    public String getSslcBoard() {
        return sslcBoard;
    }
    
    /**
     * To set SSLC Board of Applicant
     * 
     * @param sslcBoard SSLC Board of Applicant
     */
    public void setSslcBoard(String sslcBoard) {
        this.sslcBoard = sslcBoard;
    }
    
    /**
     * To get SSLC School Name of Applicant
     * 
     * @return SSLC School Name of Applicant
     */
    public String getSslcSchool() {
        return sslcSchool;
    }
    
    /**
     * To set SSLC School Name of Applicant
     * 
     * @param sslcSchool SSLC School Name of Applicant
     */
    public void setSslcSchool(String sslcSchool) {
        this.sslcSchool = sslcSchool;
    }
    
    /**
     * To get Percentage of SSLC of Applicant
     * 
     * @return Percentage of SSLC of Applicant
     */
    public int getSslcPercentage() {
        return sslcPercentage;
    }
    
    /**
     * To set Percentage of SSLC of Applicant
     * 
     * @param sslcPercentage SSLC Percentage of Applicant
     */
    public void setSslcPercentage(int sslcPercentage) {
        this.sslcPercentage = sslcPercentage;
    }
    
    /**
     * To get Plus Two Category of Applicant
     * 
     * @return Plus Two Category of Applicant
     */
    public String getPlusTwoCat() {
        return plusTwoCat;
    }
    
    /**
     * To set Plus Two Category of Applicant
     * 
     * @param plusTwoCat Plus Two Category of Applicant
     */
    public void setPlusTwoCat(String plusTwoCat) {
        this.plusTwoCat = plusTwoCat;
    }
    
    /**
     * To get Plus Two Date of Applicant
     * 
     * @return Plus Two date of Applicant
     */
    public LocalDate getPlusTwoDate() {
        return plusTwoDate;
    }
    
    /**
     * To set Plus Two Date of Applicant
     * 
     * @param plusTwoDate Plus Two date of Applicant
     */
    public void setPlusTwoDate(LocalDate plusTwoDate) {
        this.plusTwoDate = plusTwoDate;
    }
    
    /**
     * To get Plus Two Register Number
     * 
     * @return Plus Two Register Number
     */
    public double getPlusTwoRegNo() {
        return plusTwoRegNo;
    }
    
    /**
     * To set Plus Two Register Number
     * 
     * @param plus2RegNo Plus Two Register Number
     */
    public void setPlusTwoRegNo(double plus2RegNo) {
        this.plusTwoRegNo = plus2RegNo;
    }
    
    /**
     * To get Plus Two School Name
     * 
     * @return Plus Two School Name
     */
    public String getPlusTwoSchool() {
        return plusTwoSchool;
    }
    
    /**
     * To set Plus Two School Name
     * 
     * @param plusTwoSchool Plus Two School Name
     */
    public void setPlusTwoSchool(String plusTwoSchool) {
        this.plusTwoSchool = plusTwoSchool;
    }
    
    /**
     * To get Plus Two Board Name of Applicant
     * 
     * @return Plus Two Board Name of Applicant
     */
    public String getPlusTwoBoard() {
        return plusTwoBoard;
    }
    
    /**
     * To set Plus Two Board Name of Applicant
     * 
     * @param plusTwoBoard Plus Two Board Name of Applicant
     */
    public void setPlusTwoBoard(String plusTwoBoard) {
        this.plusTwoBoard = plusTwoBoard;
    }
    
    /**
     * To get Percentage of Marks scored in Plus Two
     * 
     * @return Percentage of Marks scored in Plus Two
     */
    public int getPlusTwoPercentage() {
        return plusTwoPercentage;
    }
    
    /**
     * To set Percentage of Marks scored in Plus Two
     * 
     * @param plusTwoPercentage Percentage of Marks scored in Plus Two
     */
    public void setPlusTwoPercentage(int plusTwoPercentage) {
        this.plusTwoPercentage = plusTwoPercentage;
    }
    
    /**
     * To get Name of Last Course Applicant Studied
     * 
     * @return Name of Last Course Applicant Studied
     */
    public String getLastCourseName() {
        return lastCourseName;
    }
    
    /**
     * To set Name of Last Course Applicant Studied
     * 
     * @param lastCourseName Name of Last Course Applicant Studied
     */
    public void setLastCourseName(String lastCourseName) {
        this.lastCourseName = lastCourseName;
    }
    
    /**
     * To get School Name where Applicant studied
     * 
     * @return School Name where Applicant studied
     */
    public String getLastCourseSchoolName() {
        return lastCourseSchoolName;
    }
    
    /**
     * To set School Name where Applicant studied
     * 
     * @param lastCourseSchoolName School Name where Applicant studied
     */
    public void setLastCourseSchoolName(String lastCourseSchoolName) {
        this.lastCourseSchoolName = lastCourseSchoolName;
    }
    
    /**
     * To get TC Date of Previous Course
     * 
     * @return TC Date of Previous Course
     */
    public LocalDate getTcDate() {
        return tcDate;
    }
    
    /**
     * To set TC Date of Previous Course
     * 
     * @param tcDate TC Date of Previous Course
     */
    public void setTcDate(LocalDate tcDate) {
        this.tcDate = tcDate;
    }
    
    /**
     * To get TC Number of Applicant for Previous Course
     * 
     * @return TC Number of Applicant for Previous Course
     */
    public int getTcNumber() {
        return tcNumber;
    }
    
    /**
     * To set TC Number of Applicant for Previous Course
     * 
     * @param tcNumber TC Number of Applicant for Previous Course
     */
    public void setTcNumber(int tcNumber) {
        this.tcNumber = tcNumber;
    }
    
    /**
     * To get Religion of Applicant
     * 
     * @return Religion of Applicant
     */
    public String getReligionCaste() {
        return religionCaste;
    }
    
    /**
     * To set Religion of Applicant
     * 
     * @param religionCaste Religion of Applicant
     */
    public void setReligionCaste(String religionCaste) {
        this.religionCaste = religionCaste;
    }
    
    /**
     * To get Caste of Applicant
     * 
     * @return Caste of Applicant
     */
    public String getRegType() {
        return regType;
    }
    
    /**
     * To set Caste of Applicant
     * 
     * @param regType Caste of Applicant
     */
    public void setRegType(String regType) {
        this.regType = regType;
    }
    
    /**
     * To get Annual Income of Applicant
     * 
     * @return Annual Income of Applicant
     */
    public double getAnnualIncome() {
        return annualIncome;
    }
    
    /**
     * To set Annual Income of Applicant
     * 
     * @param annualIncome Annual Income of Applicant
     */
    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    /**
     * To get Name of Parent/Guardian
     * 
     * @return Name of Parent/Guardian
     */
    public String getParentName() {
        return parentName;
    }
    
    /**
     * To set Name of Parent/Guardian
     * 
     * @param parentName Name of Parent/Guardian
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    
    /**
     * To get Job of Parent
     * 
     * @return Job of Parent
     */
    public String getParentJob() {
        return parentJob;
    }
    
    /**
     * To set Job of Parent
     * 
     * @param parentJob Job of Parent
     */
    public void setParentJob(String parentJob) {
        this.parentJob = parentJob;
    }
    
    /**
     * To get Relationship of Applicant with Guardian
     * 
     * @return Relationship of Applicant with Guardian
     */
    public String getRelGuardian() {
        return relGuardian;
    }
    
    /**
     * To set Relationship of Applicant with Guardian
     * 
     * @param relGuardian Relationship of Applicant with Guardian
     */
    public void setRelGuardian(String relGuardian) {
        this.relGuardian = relGuardian;
    }
    
    /**
     * To get NCC/NSS Activities of Applicant
     * 
     * @return NCC/NSS Activities of Applicant
     */
    public String getNccNss() {
        return nccNss;
    }
    
    /**
     * To set NCC/NSS Activities of Applicant
     * 
     * @param nccNss NCC/NSS Activities of Applicant
     */
    public void setNccNss(String nccNss) {
        this.nccNss = nccNss;
    }
    
    /**
     * To get Sports/Games Activities of Applicant
     * 
     * @return Sports/Games Activities of Applicant
     */
    public String getSportsGames() {
        return sportsGames;
    }
    
    /**
     * To set Sports/Games Activities of Applicant
     * 
     * @param sportsGames Sports/Games Activities of Applicant
     */
    public void setSportsGames(String sportsGames) {
        this.sportsGames = sportsGames;
    }
    
    /**
     * To get Literal Cultural Activities of Applicant
     * 
     * @return Literal Cultural Activities of Applicant
     */
    public String getLiteraryCultural() {
        return literaryCultural;
    }
    
    /**
     * To set Literal Cultural Activities of Applicant
     * 
     * @param literaryCultural Literal Cultural Activities of Applicant
     */
    public void setLiteraryCultural(String literaryCultural) {
        this.literaryCultural = literaryCultural;
    }
    
    public String getRejectComments() {
        return rejectComments;
    }
    
    public void setRejectComments(String rejectComments) {
        this.rejectComments = rejectComments;
    }
    
    public String getDecisionTime() {
        return decisionTime;
    }
    
    public void setDecisionTime(String decisionTime) {
        this.decisionTime = decisionTime;
    }
    
    public int getApproverId() {
        return approverId;
    }
    
    public void setApproverId(int approverId) {
        this.approverId = approverId;
    }
    
    public int getStudentRank() {
        return StudentRank;
    }
    
    public void setStudentRank(int studentRank) {
        StudentRank = studentRank;
    }
}
