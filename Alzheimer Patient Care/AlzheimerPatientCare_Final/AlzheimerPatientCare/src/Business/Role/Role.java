/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Config.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Security.SessionLog;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Prashant
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Receptionist("Receptionist"),
        Doctor("Doctor"),
        GovernmentAgency("GovernmentAgency"),
        Caregiver("Caregiver"),
        YogaTeacher("YogaTeacher");
       
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        
        }
        
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,EnterpriseDirectory enterpriseDirectory,SessionLog session);
    
    public String toString(){
        return getClass().getName();
    }
            
}
