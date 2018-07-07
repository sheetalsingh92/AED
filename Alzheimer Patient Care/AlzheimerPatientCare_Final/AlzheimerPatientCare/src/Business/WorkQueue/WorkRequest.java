/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Sheetal
 */
public class WorkRequest  {
     private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String statusatDoctor;
    private String statusatCaretaker;
    private String statusatTeacher;
    private Date requestDate;
    private Date resolveDate;
   
    
     public WorkRequest(){
        requestDate = new Date();
    }

    public String getStatusatTeacher() {
        return statusatTeacher;
    }

    public void setStatusatTeacher(String statusatTeacher) {
        this.statusatTeacher = statusatTeacher;
    }

   
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatusatDoctor() {
        return statusatDoctor;
    }

    public void setStatusatDoctor(String statusatDoctor) {
        this.statusatDoctor = statusatDoctor;
    }

    public String getStatusatCaretaker() {
        return statusatCaretaker;
    }

    public void setStatusatCaretaker(String statusatCaretaker) {
        this.statusatCaretaker = statusatCaretaker;
    }


    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

 
    public  String toString()
    {
        return message;
    }
    
}
