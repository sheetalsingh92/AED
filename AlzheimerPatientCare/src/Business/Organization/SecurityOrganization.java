/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.SecurityManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Sheetal
 */
public class SecurityOrganization extends Organization {

    public SecurityOrganization()
    {
        super(Organization.Type.SecurityTeam.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
        roles.add(new SecurityManagerRole());
        return roles;
    }   
}
