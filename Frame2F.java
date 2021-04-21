import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jayita
 */
public class Frame2F extends javax.swing.JFrame {
public Frame2F() {
        initComponents();
    }

    public Frame2F(String para){
        initComponents();
        label.setText(para);
    }
    /**
     * Creates new form Frame2F
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        categorytype = new javax.swing.JComboBox<>();
        domLB = new javax.swing.JLabel();
        snameLB = new javax.swing.JLabel();
        sdobLB = new javax.swing.JLabel();
        dom = new javax.swing.JTextField();
        sdob = new javax.swing.JTextField();
        ft3 = new javax.swing.JLabel();
        ft5 = new javax.swing.JLabel();
        ft6 = new javax.swing.JLabel();
        ft9 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        married = new javax.swing.JRadioButton();
        single = new javax.swing.JRadioButton();
        numchild = new javax.swing.JTextField();
        adopted = new javax.swing.JCheckBox();
        ft7 = new javax.swing.JLabel();
        childno = new javax.swing.JRadioButton();
        childyes = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        numchildLB = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider-3.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bebas", 0, 36)); // NOI18N
        jLabel4.setText("CENSUS   OF   INDIA - 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -10, 340, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/census-of-india-2011-logo.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Father's Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 14));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 230, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Mother's Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 100, 14));
        getContentPane().add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 230, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Category:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 100, 14));

        categorytype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "OBC", "ST/SC", "Religious Minority" }));
        getContentPane().add(categorytype, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        domLB.setText("Date of Marriage :");
        getContentPane().add(domLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, 20));

        snameLB.setText("Spouse Name :");
        getContentPane().add(snameLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 88, -1));

        sdobLB.setText("Date of Birth (YYYY-MM-DD) :");
        getContentPane().add(sdobLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 150, 20));

        dom.setToolTipText("YYYY-MM-DD");
        getContentPane().add(dom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 205, -1));

        sdob.setToolTipText("YYYY-MM-DD");
        sdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdobActionPerformed(evt);
            }
        });
        getContentPane().add(sdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 205, -1));
        getContentPane().add(ft3, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 348, 15, 13));
        getContentPane().add(ft5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 405, 28, 13));
        getContentPane().add(ft6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 423, 20, 11));
        getContentPane().add(ft9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 20, 21));
        getContentPane().add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 205, -1));

        jLabel8.setText("Marital Status :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 80, -1));

        buttonGroup1.add(married);
        married.setText("Married");
        married.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marriedActionPerformed(evt);
            }
        });
        getContentPane().add(married, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        buttonGroup1.add(single);
        single.setText("Single");
        single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleActionPerformed(evt);
            }
        });
        getContentPane().add(single, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));
        getContentPane().add(numchild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 205, -1));

        adopted.setText("Adopted");
        adopted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adoptedActionPerformed(evt);
            }
        });
        getContentPane().add(adopted, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));
        getContentPane().add(ft7, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 488, 34, 13));

        buttonGroup2.add(childno);
        childno.setText("No");
        childno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childnoActionPerformed(evt);
            }
        });
        getContentPane().add(childno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        buttonGroup2.add(childyes);
        childyes.setText("Yes ");
        childyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childyesActionPerformed(evt);
            }
        });
        getContentPane().add(childyes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        jLabel10.setText("Children Status");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 118, -1));

        numchildLB.setText("No. of Children :");
        getContentPane().add(numchildLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 118, -1));

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 130, 30));

        jButton3.setText("INSERT RECORD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 130, 30));

        label.setText(" ");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 100, -1));

        jLabel1.setText("YOUR AADHAR NUMBER:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider-3.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, -20, 910, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdobActionPerformed

    private void marriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marriedActionPerformed
        sname.setVisible(true);
        snameLB.setVisible(true);
        sdob.setVisible(true);
        sdobLB.setVisible(true);
        dom.setVisible(true);
        domLB.setVisible(true);
    }//GEN-LAST:event_marriedActionPerformed

    private void singleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleActionPerformed
        sname.setVisible(false);
        snameLB.setVisible(false);
        sdob.setVisible(false);
        sdobLB.setVisible(false);
        dom.setVisible(false);
        domLB.setVisible(false);
    }//GEN-LAST:event_singleActionPerformed

    private void adoptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adoptedActionPerformed
        numchild.setVisible(true);
        numchildLB.setVisible(true);
    }//GEN-LAST:event_adoptedActionPerformed

    private void childnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childnoActionPerformed
        numchild.setVisible(false);
        numchildLB.setVisible(false);
        adopted.setVisible(false);
    }//GEN-LAST:event_childnoActionPerformed

    private void childyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childyesActionPerformed
        numchild.setVisible(true);
        numchildLB.setVisible(true);
        adopted.setVisible(true);
    }//GEN-LAST:event_childyesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
married.setSelected(false);
childyes.setSelected(false);
childno.setSelected(false);
single.setSelected(false);
adopted.setSelected(false);
fname.setText(null);
mname.setText(null);
sname.setText(null);
sdob.setText(null);
dom.setText(null);
numchild.setText(null);
sname.setVisible(false);
snameLB.setVisible(false);
sdob.setVisible(false);
sdobLB.setVisible(false);
dom.setVisible(false);
domLB.setVisible(false);
numchild.setVisible(false);
numchildLB.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        sname.setVisible(false);
snameLB.setVisible(false);
sdob.setVisible(false);
sdobLB.setVisible(false);
dom.setVisible(false);
adopted.setVisible(false);
domLB.setVisible(false);
numchild.setVisible(false);
numchildLB.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String paaraa=label.getText();
        String father=fname.getText();
        String mother=mname.getText();
        int i=categorytype.getSelectedIndex();
        String cat="";
        if (i==0) cat="General";
        if (i==1) cat="OBC";
        if (i==2) cat="SC/ST";
        if (i==3) cat="Rel Min";
        String spou=""; String spoudob="";
        String sdom=""; String adop;
        if (adopted.isSelected()) adop="Yes";
        else adop="No";
        String numchi="";
        String marr="";
        if (married.isSelected())
        {
            spou=sname.getText();
            spoudob=sdob.getText();
            sdom=dom.getText(); marr="Married";
        }
        else if (single.isSelected())
        {
            spou="N/A";
            spoudob="N/A";
            sdom="N/A"; marr="Single";
        }
        String chil="";
        
        if (childyes.isSelected())
        {
            numchi=numchild.getText(); chil="Yes";
            adopted.setVisible(true);
            
        }
        else if (childno.isSelected())
        {
            numchi="N/A"; chil="No";
        }
        
        if(father.equals("")||mother.equals("")||(single.isSelected()==false&&married.isSelected()==false)||(childyes.isSelected()==false&&childno.isSelected()==false))
        
            JOptionPane.showMessageDialog(null,"Please fill in all the details");
        
        else{
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)
                    DriverManager.getConnection ("jdbc:mysql://localhost:3306/hoho", "root", "jayita27");
            
            Statement stmt=(Statement) con.createStatement();
            
            String query="INSERT INTO frame2 VALUES ('"+father+"','"+mother+"','"+cat+"','"
                    +marr+ "','"+spou+"','"+spoudob+"','"+sdom+"','"+chil+"','"+adop+"','"+numchi+"','"+paaraa+"');";
            stmt.executeUpdate(query);
            
            JOptionPane.showMessageDialog(this, "Record successfully entered.");
            ThanksF Q=new ThanksF();
Q.setVisible(true);
this.setVisible(false);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame2F.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2F.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2F.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2F.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2F().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adopted;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> categorytype;
    private javax.swing.JRadioButton childno;
    private javax.swing.JRadioButton childyes;
    private javax.swing.JTextField dom;
    private javax.swing.JLabel domLB;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel ft3;
    private javax.swing.JLabel ft5;
    private javax.swing.JLabel ft6;
    private javax.swing.JLabel ft7;
    private javax.swing.JLabel ft9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label;
    private javax.swing.JRadioButton married;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField numchild;
    private javax.swing.JLabel numchildLB;
    private javax.swing.JTextField sdob;
    private javax.swing.JLabel sdobLB;
    private javax.swing.JRadioButton single;
    private javax.swing.JTextField sname;
    private javax.swing.JLabel snameLB;
    // End of variables declaration//GEN-END:variables
}
