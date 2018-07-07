/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Security;

import java.util.Date;

/**
 *
 * @author Sheetal
 */
public class SessionLog {

    private Date startTime;
    private Date endTime;
    private ActivityDirectory activityDirectory;

    public SessionLog() {
        activityDirectory = new ActivityDirectory();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public ActivityDirectory getActivityDirectory() {
        return activityDirectory;
    }

    public void setActivityDirectory(ActivityDirectory activityDirectory) {
        this.activityDirectory = activityDirectory;
    }

    @Override
    public String toString() {
        return String.valueOf(startTime);
    }
   
    }


