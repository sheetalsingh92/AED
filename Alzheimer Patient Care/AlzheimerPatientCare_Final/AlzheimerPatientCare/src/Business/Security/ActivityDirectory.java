/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Security;

import java.util.ArrayList;

/**
 *
 * @author Sheetal
 */
public class ActivityDirectory {
    private ArrayList<Activity> activityList;

public ActivityDirectory()
{
    activityList = new ArrayList<>();
}

    public ArrayList<Activity> getActivityList() {
        return activityList;
    }

   

    public Activity addActivity()
    {
        Activity act =  new Activity();
        activityList.add(act);
        return act;
    }
}
