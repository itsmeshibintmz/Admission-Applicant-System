
package com.sgca.controller;


import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sgca.bo.ApplicationSubmissionBO;
import com.sgca.model.Application;

/**
 * Servlet Class used to Manage Request-Response of User actions in Registration
 * 
 * @author Shibin Thomas 
 * version 1.0
 *
 */
public class ApplicationServlet extends HttpServlet {
    // Verify sender and receiver of a serialized object have loaded classes
    // that are Compatible
    private static final long serialVersionUID = 234L;
    
    /**
     * Method used to take actions according to option selected by Applicant at
     * end of submission on each Page
     */
    public void service(HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {
        // Get the hidden action on each Page
        String action = request.getParameter("action");
        // Set Next Page according to action
        String nextPage = "start.jsp";
        // Store Cancel Input by User
        String cancelStatus = request.getParameter("cancel");
        // If user input is cancel , Session object is removed
        if (cancelStatus != null || cancelStatus == "true") {
            HttpSession object = request.getSession();
            object.removeAttribute("userdata");
            nextPage = "start.jsp";
            
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);
            return;
        }
        
        String draft = request.getParameter("draft");
        // checks the value in action input and forward to next Page according
        // to input
        if (action == null) {
            System.out.println("Auto go to start.jsp");
        } else if (action.equals("fetchpage")) {
            String result = fetchPage(request, response);
            if (result != null) {
                nextPage = result;
            }
            
        } else if (action.equals("startpage")) {
            if (createApplication(request, response) && draft == null) {
                nextPage = "2.jsp";
            }
        } else if (action.equals("page2")) {
            if (updateDetailsTwo(request, response) && draft == null) {
                nextPage = "3.jsp";
            }
        } else if (action.equals("page3")) {
            if (updateDetailsThree(request, response) && draft == null) {
                nextPage = "4.jsp";
            }
        } else if (action.equals("page4")) {
            if (updateDetailsFour(request, response) && draft == null) {
                nextPage = "5.jsp";
            }
        } else if (action.equals("page5")) {
            if (updateDetailsFive(request, response) && draft == null) {
                nextPage = "6.jsp";
            }
        } else if (action.equals("page6")) {
            if (updateDetailsSix(request, response) && draft == null) {
                nextPage = "display.jsp";
            }
        } else if (action.equals("lastpage")) {
            if (updateDetailsSeven(request, response)) {
                nextPage = "submitted.jsp";
            }
        }
        
        RequestDispatcher rd = request.getRequestDispatcher(nextPage);
        rd.forward(request, response);
    }
    
    /**
     * Method to create Application and Insert according to Page One 
     * 
     * @param request sends a request to web server
     * @param response send the response back to the client.
     * @return status 
     */
    private boolean createApplication(HttpServletRequest request,
        HttpServletResponse response) {
        boolean status = false;
        String courseName = request.getParameter("course");
        int mguNumber = Integer.parseInt(request.getParameter("mguno"));
        
        Application data = new Application();
        data.setSubject(courseName);
        data.setMguNumber(mguNumber);
        
        data = new ApplicationSubmissionBO().newApplication(data);
        if (data != null) {
            status = true;
            HttpSession session = request.getSession();
            session.setAttribute("userdata", data);
        }
        return status;
    }
    
    private String fetchPage(HttpServletRequest request,
        HttpServletResponse response) {
        String result = "start.jsp";
        int mguNo = Integer.parseInt(request.getParameter("mguno"));
        int appNo = Integer.parseInt(request.getParameter("admno"));
        String subject = request.getParameter("Course");
        Application obj = new Application();
        obj = new ApplicationSubmissionBO().fetchData(mguNo, appNo, subject);
        if (obj != null) {
            int pageno = obj.getPhase();
            System.out.println(pageno);
            switch (pageno) {
                case 1:
                    result = "2.jsp";
                    break;
                // and so on
                case 2:
                    result = "3.jsp";
                    break;
                case 3:
                    result = "4.jsp";
                    break;
                case 4:
                    result = "5.jsp";
                    break;
                case 5:
                    result = "6.jsp";
                    break;
                case 6:
                    result = "display.jsp";
            }
            HttpSession session = request.getSession();
            session.setAttribute("userdata", obj);
        }
        return result;
    }
    
    private boolean updateDetailsTwo(HttpServletRequest request,
        HttpServletResponse response) {
        boolean status = false;
        String name = request.getParameter("name");
        String sex = request.getParameter("gender");
        String marital = request.getParameter("relationshipstatus");
        String address = request.getParameter("address");
        String handicapped = request.getParameter("handicapped");
        String email = request.getParameter("email");
        double phoneNo = Double.parseDouble(request.getParameter("phoneno"));
        int zip = Integer.parseInt(request.getParameter("zip"));
        
        Application data = new Application();
        HttpSession session = request.getSession();
        data = (Application) session.getAttribute("userdata");
        
        data.setStudName(name);
        data.setSex(sex);
        data.setMaritalStatus(marital);
        data.setAddress(address);
        data.setHandicapped(handicapped);
        data.setEmail(email);
        data.setPhno(phoneNo);
        data.setPincode(zip);
        
        data = new ApplicationSubmissionBO().pageTwo(data);
        if (data != null) {
            status = true;
            session.removeAttribute("userdata");
            session.setAttribute("userdata", data);
        }
        return status;
    }
    
    private boolean updateDetailsThree(HttpServletRequest request,
        HttpServletResponse response) {
        boolean status = false;
        String dob = request.getParameter("sslcdob");
        double regisNumber = Double
            .parseDouble(request.getParameter("sslcregno"));
        String sslcSchool = request.getParameter("schoolname");
        String sslcDate = request.getParameter("sslcdate");
        String sslcBoard = request.getParameter("sslcboard");
        int tenthPercentage = Integer
            .parseInt(request.getParameter("tenthpercentage"));
        
        String plus2Cat = request.getParameter("plus2cat");
        double plus2RegNo = Double
            .parseDouble(request.getParameter("plus2regno"));
        String plus2School = request.getParameter("plus2school");
        String plusdate = request.getParameter("plus2date");
        String plus2Board = request.getParameter("plus2board");
        int plus2Percentage = Integer
            .parseInt(request.getParameter("pluspercentage"));
        
        // optional
        String lastCourseName = request.getParameter("lastcname");
        String lastCourseSchoolName = request.getParameter("lastcschoolname");
        int lastCourseTcNo = Integer
            .parseInt(request.getParameter("lastctcno"));
        String dateOfTc = request.getParameter("lastcdatetc");
        
        // test
        System.out.println(dob);
        System.out.println(sslcDate);
        System.out.println(plusdate);
        
        // to get date to object
        LocalDate dateOfBirth = LocalDate.parse(dob);
        LocalDate sslcDates = LocalDate.parse(sslcDate);
        LocalDate plus2Date = LocalDate.parse(plusdate);
        
        Application data = new Application();
        HttpSession session = request.getSession();
        data = (Application) session.getAttribute("userdata");
        
        data.setDateOfBirth(dateOfBirth);// date
        data.setSslcDate(sslcDates);// date
        data = (Application) session.getAttribute("userdata");
        data.setSslcRegisNo(regisNumber);
        data.setSslcSchool(sslcSchool);
        data.setSslcBoard(sslcBoard);
        data.setSslcPercentage(tenthPercentage);
        // plus2
        data.setPlusTwoCat(plus2Cat);
        data.setPlusTwoRegNo(plus2RegNo);
        data.setPlusTwoSchool(plus2School);
        data.setPlusTwoBoard(plus2Board);
        data.setPlusTwoDate(plus2Date);// date
        data.setPlusTwoPercentage(plus2Percentage);
        
        /// last course
        if (lastCourseName != null && !(lastCourseName.equals(""))) {
            data.setLastCourseName(lastCourseName);
            data.setLastCourseSchoolName(lastCourseSchoolName);
            data.setTcNumber(lastCourseTcNo);
            data.setTcDate(LocalDate.parse(dateOfTc));
        }
        
        data = new ApplicationSubmissionBO().pageThree(data);
        if (data != null) {
            status = true;
            session.removeAttribute("userdate");
            session.setAttribute("userdata", data);
        }
        return status;
    }
    
    private boolean updateDetailsFour(HttpServletRequest request,
        HttpServletResponse response) {
        boolean status = false;
        String religionCaste = request.getParameter("relcaste");
        String relType = request.getParameter("castetype");
        double annualIncome = Double
            .parseDouble(request.getParameter("income"));
        
        Application data = new Application();
        HttpSession session = request.getSession();
        data = (Application) session.getAttribute("userdata");
        
        data.setReligionCaste(religionCaste);
        data.setRegType(relType);
        data.setAnnualIncome(annualIncome);
        
        data = new ApplicationSubmissionBO().pageFour(data);
        if (data != null) {
            status = true;
            session.removeAttribute("userdate");
            session.setAttribute("userdata", data);
        }
        return status;
    }
    
    private boolean updateDetailsFive(HttpServletRequest request,
        HttpServletResponse response) {
        boolean status = false;
        String parentName = request.getParameter("parentName");
        String occupation = request.getParameter("occupationParent");
        String relationship = request.getParameter("relationParent");
        
        Application data = new Application();
        HttpSession session = request.getSession();
        data = (Application) session.getAttribute("userdata");
        
        data.setParentName(parentName);
        data.setParentJob(occupation);
        data.setRelGuardian(relationship);
        
        data = new ApplicationSubmissionBO().pageFive(data);
        if (data != null) {
            status = true;
            session.removeAttribute("userdata");
            session.setAttribute("userdata", data);
        }
        return status;
    }
    
    /**
     * Method to accept input values from User Registration page Six and set to Application Object 
     * @param request 
     * @param response
     * @return status 
     */
    private boolean updateDetailsSix(HttpServletRequest request,
        HttpServletResponse response) {
        boolean status = false;
        String nccnss = request.getParameter("nccnss");
        String sportsGames = request.getParameter("sportsgames");
        String literal = request.getParameter("literalcultural");
        
        Application data = new Application();
        HttpSession session = request.getSession();
        data = (Application) session.getAttribute("userdata");
        
        data.setNccNss(nccnss);
        data.setSportsGames(sportsGames);
        data.setLiteraryCultural(literal);
        
        data = new ApplicationSubmissionBO().pageSix(data);
        if (data != null) {
            status = true;
            session.removeAttribute("userdata");
            session.setAttribute("userdata", data);
        }
        return status;
    }
    /**
     * 
     * @param request
     * @param response
     * @return
     */
    private boolean updateDetailsSeven(HttpServletRequest request,
        HttpServletResponse response) {
        boolean status = false;
        HttpSession session = request.getSession();
        Application data = (Application) session.getAttribute("userdata");
        data = new ApplicationSubmissionBO().pageSeven(data);
        System.out.println(data.getPhno());
        status = true;
        
        return status;
    }
}
