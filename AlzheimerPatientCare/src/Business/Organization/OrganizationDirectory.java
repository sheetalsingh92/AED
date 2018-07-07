/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type)
    {
        Organization organization=null;
        if(type.getValue().equals(Type.CareGiver.getValue())){
            organization=new CaregiverOrganization();
            organizationList.add(organization);
        }
     
       else if(type.getValue().equals(Type.Receptionist.getValue())){
            organization=new ReceptionistOrganization();
            organizationList.add(organization);
        }
       else if(type.getValue().equals(Type.YogaTeacher.getValue())){
            organization=new YogaTeacherOrganization();
            organizationList.add(organization);
        }
       else if(type.getValue().equals(Type.Doctor.getValue())){
            organization=new DoctorOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.SecurityTeam.getValue())){
            organization=new SecurityOrganization();
            organizationList.add(organization);
        }
        return  organization;
          
    }
}

