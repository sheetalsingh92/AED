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
import UserInterface.TeacherRole.TeacherWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sheetal
 */
public class YogaTeacherRole extends Role {
 
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, EnterpriseDirectory enterpriseDirectory,SessionLog session) {
       return new TeacherWorkAreaJPanel(userProcessContainer,account,organization,enterprise,session);
    }
   
}
