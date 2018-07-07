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
public class SessionDirectory {
  private ArrayList<SessionLog> sessionList;

public SessionDirectory()
{
    sessionList = new ArrayList<>();
}

    public ArrayList<SessionLog> getSessionList() {
        return sessionList;
    }

    public SessionLog add()
    { SessionLog s= new SessionLog();
        sessionList.add(s);
        return s;
    }

}
