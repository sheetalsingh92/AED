/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;
import Business.VitalSign;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sheetal
 */
public class CreateVitalSignJPanel extends javax.swing.JPanel {

    
     private Person person;
     private JPanel upc;
     String a,b,c,d;
     
     
    public CreateVitalSignJPanel(Person person, JPanel upc) {
        initComponents();
        this.person=person;
        this.upc=upc;
    }
    
      public boolean vitalSignStatus(VitalSign vs)
  {
 
          if(person.getPatient().getAge()>=1 && person.getPatient().getAge()<=3)
          {
              if((vs.getRespiratoryrate()>=20 && vs.getRespiratoryrate()<=30) &&
                (vs.getBloodpressure()>=80 && vs.getBloodpressure()<=110) &&
                (vs.getHeartrate()>=80 && vs.getHeartrate()<=130)&&
                (vs.getWeight()>=22 && vs.getWeight()<=31))
              return true;
               
          }
          else if(person.getPatient().getAge()==4 || person.getPatient().getAge()==5)
          {
              if((vs.getRespiratoryrate()>=20 && vs.getRespiratoryrate()<=30) &&
                (vs.getBloodpressure()>=80 && vs.getBloodpressure()<=110) &&
                (vs.getHeartrate()>=80 && vs.getHeartrate()<=120)&&
                (vs.getWeight()>=31 && vs.getWeight()<=40))
              return true; 
              
          }
          else if(person.getPatient().getAge()>=6 && person.getPatient().getAge()<=12)
          {
              if((vs.getRespiratoryrate()>=20 && vs.getRespiratoryrate()<=30) &&
                (vs.getBloodpressure()>=80 && vs.getBloodpressure()<=120) &&
                (vs.getHeartrate()>=70 && vs.getHeartrate()<=110)&&
                (vs.getWeight()>=41 && vs.getWeight()<=92))
                return true;
          }
          else if (person.getPatient().getAge()>=13)
          {
              if((vs.getRespiratoryrate()>=12 && vs.getRespiratoryrate()<=20) &&
                (vs.getBloodpressure()>=110 && vs.getBloodpressure()<=120) &&
                (vs.getHeartrate()>=55 && vs.getHeartrate()<=105)&&
                (vs.getWeight()>=110))
                 return true;
          } 
         
              return false;   
      
    }            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtrespiratoryRate = new javax.swing.JTextField();
        txtheartRate = new javax.swing.JTextField();
        txtbloodPressure = new javax.swing.JTextField();
        txtweight = new javax.swing.JTextField();
        btncreateVitalSign = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();

        txtrespiratoryRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrespiratoryRateActionPerformed(evt);
            }
        });

        txtheartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtheartRateActionPerformed(evt);
            }
        });

        btncreateVitalSign.setText("Create Vital Sign");
        btncreateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateVitalSignActionPerformed(evt);
            }
        });

        jLabel8.setText("/lb");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Vital Sign Details");

        jLabel10.setText("Respiratory Rate");

        jLabel5.setText("Heart Rate");

        jLabel6.setText(" Blood Pressure");

        jLabel7.setText("Weight");
        jLabel7.setToolTipText("");

        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnback)
                .addContainerGap(565, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtbloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtweight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(82, 82, 82)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtrespiratoryRate)
                                        .addComponent(txtheartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(btncreateVitalSign))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(315, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(btnback)
                .addGap(164, 164, 164))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtrespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtheartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGap(18, 18, 18)
                    .addComponent(btncreateVitalSign)
                    .addContainerGap(238, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtrespiratoryRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrespiratoryRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrespiratoryRateActionPerformed

    private void txtheartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtheartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtheartRateActionPerformed

    private void btncreateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateVitalSignActionPerformed
        // TODO add your handling code here:
        try{

            a= txtrespiratoryRate.getText().trim();
            b= txtheartRate.getText().trim();
            c=txtbloodPressure.getText().trim();
            d=txtweight.getText().trim();
            VitalSign vitalSign=  new VitalSign();
            vitalSign.setRespiratoryrate(Integer.parseInt(a));
            vitalSign.setHeartrate(Integer.parseInt(b));
            vitalSign.setBloodpressure(Integer.parseInt(c));
            vitalSign.setWeight(Double.parseDouble(d));
            if(!vitalSignStatus(vitalSign))
            {
               vitalSign.setStatus("Abnormal"); 
            }
            else{
                 vitalSign.setStatus("Normal");  
            }
            
            person.getPatient().getVitalsignHistory().createVitalSign(vitalSign);
            JOptionPane.showMessageDialog(this,"Vital Sign saved sucessfully");

            txtrespiratoryRate.setText("");
            txtheartRate.setText("");
            txtbloodPressure.setText("");
            txtweight.setText("");
        }

        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Please enter numeric values for all vital sign details", "FAILURE", JOptionPane.PLAIN_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btncreateVitalSignActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
//        //userProcessContainer.remove(this);
//    Component [] componentArray = upc.getComponents();
//    Component component = componentArray [componentArray.length -1];
//    ViewPersonDetails persondetails = (ViewPersonDetails) component;
//    
//    persondetails.populateTable();
//    
//        CardLayout layout = (CardLayout)upc.getLayout();
//        layout.previous(upc);
  upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreateVitalSign;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtbloodPressure;
    private javax.swing.JTextField txtheartRate;
    private javax.swing.JTextField txtrespiratoryRate;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}