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
import UserInterface.DoctorRole.DoctorWorkAreasJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Prashant
 */
public class DoctorRole extends Role{

    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, EnterpriseDirectory enterpriseDirectory,SessionLog session) {
       return new DoctorWorkAreasJPanel(userProcessContainer, account, organization,enterprise,enterpriseDirectory,session);
    }
    
}
