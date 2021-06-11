
package com.sgca.Exception;


/**
 * Custom exception class used to customize the exception according to user need
 * 
 * @author Shibin Thomas 
 * Version 1.0
 */
public class SGCAException extends Exception {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * Exception Method
     * 
     * @param data Exception thrown from DAO
     */
    public SGCAException(Exception data) {
        super(data);
    }
}