/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

public class ExtraHelpEnterprise extends Enterprise{

    public ExtraHelpEnterprise(String name) {
        super(name,EnterpriseType.ExtraHelp);
    }
    @Override
     public ArrayList<Role> getSupportedRole() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
