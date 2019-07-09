
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Spage extends javax.swing.JFrame {

    /**
     * Creates new form Spage
     */
    public Spage() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setBounds(0,0, 2000, 600);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jusn = new javax.swing.JLabel();
        jsname = new javax.swing.JLabel();
        jgender = new javax.swing.JLabel();
        jdob = new javax.swing.JLabel();
        jaddress = new javax.swing.JLabel();
        jaddress1 = new javax.swing.JLabel();
        jaddress2 = new javax.swing.JLabel();
        jaddress3 = new javax.swing.JLabel();
        jaddress4 = new javax.swing.JLabel();
        jaddress5 = new javax.swing.JLabel();
        jaddress6 = new javax.swing.JLabel();
        jaddress7 = new javax.swing.JLabel();
        jaddress8 = new javax.swing.JLabel();
        jaddress10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pphone = new javax.swing.JTextField();
        gname = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        parent = new javax.swing.JTextField();
        sphone = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        usn = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        presentsem = new javax.swing.JTextField();
        gphone = new javax.swing.JTextField();
        branchid = new javax.swing.JTextField();
        rank = new javax.swing.JTextField();
        courseid = new javax.swing.JTextField();
        aadharno = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        staytype = new javax.swing.JTextField();
        yoj = new javax.swing.JTextField();
        puc = new javax.swing.JTextField();
        tenth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jusn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jusn.setText("USN");
        jPanel2.add(jusn);
        jusn.setBounds(48, 75, 34, 22);

        jsname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jsname.setText("S_NAME");
        jPanel2.add(jsname);
        jsname.setBounds(48, 128, 67, 22);

        jgender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jgender.setText("GENDER");
        jPanel2.add(jgender);
        jgender.setBounds(140, 170, 67, 22);

        jdob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jdob.setText("DOB");
        jPanel2.add(jdob);
        jdob.setBounds(210, 230, 36, 22);

        jaddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress.setText("ADDRESS");
        jPanel2.add(jaddress);
        jaddress.setBounds(130, 290, 76, 22);

        jaddress1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress1.setText("S_PHONE");
        jPanel2.add(jaddress1);
        jaddress1.setBounds(190, 350, 77, 22);

        jaddress2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress2.setText("PARENT_NAME");
        jPanel2.add(jaddress2);
        jaddress2.setBounds(210, 410, 122, 22);

        jaddress3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress3.setText("P_PHONE");
        jPanel2.add(jaddress3);
        jaddress3.setBounds(960, 380, 77, 22);

        jaddress4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress4.setText("GUARDIAN_NAME");
        jPanel2.add(jaddress4);
        jaddress4.setBounds(460, 340, 145, 22);

        jaddress5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress5.setText("G_PHONE");
        jPanel2.add(jaddress5);
        jaddress5.setBounds(520, 410, 79, 22);

        jaddress6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress6.setText("BRANCH_ID");
        jPanel2.add(jaddress6);
        jaddress6.setBounds(962, 113, 97, 22);

        jaddress7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress7.setText("COURSE_ID");
        jPanel2.add(jaddress7);
        jaddress7.setBounds(460, 70, 96, 22);

        jaddress8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress8.setText("AADHAR_NO");
        jPanel2.add(jaddress8);
        jaddress8.setBounds(460, 113, 103, 22);

        jaddress10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress10.setText("STAY TYPE");
        jPanel2.add(jaddress10);
        jaddress10.setBounds(460, 171, 89, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("AGE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(962, 70, 33, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("YEAR OF JOIN");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(962, 162, 116, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PRESENT SEM");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(460, 232, 114, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CATEGORY OF EXAM");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(450, 290, 168, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("RANK OF EXAM");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(960, 320, 124, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("PUC%");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(962, 218, 51, 22);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("TENTH%");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(962, 265, 74, 22);

        pphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pphoneActionPerformed(evt);
            }
        });
        pphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pphoneKeyReleased(evt);
            }
        });
        jPanel2.add(pphone);
        pphone.setBounds(1140, 380, 165, 28);

        gname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gnameActionPerformed(evt);
            }
        });
        gname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gnameKeyReleased(evt);
            }
        });
        jPanel2.add(gname);
        gname.setBounds(640, 360, 176, 28);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        jPanel2.add(name);
        name.setBounds(233, 125, 165, 28);

        parent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        parent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentActionPerformed(evt);
            }
        });
        parent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                parentKeyReleased(evt);
            }
        });
        jPanel2.add(parent);
        parent.setBounds(340, 410, 165, 28);

        sphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sphoneActionPerformed(evt);
            }
        });
        sphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sphoneKeyReleased(evt);
            }
        });
        jPanel2.add(sphone);
        sphone.setBounds(280, 350, 165, 28);

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address);
        address.setBounds(233, 291, 165, 30);

        dob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        jPanel2.add(dob);
        dob.setBounds(290, 230, 165, 28);

        gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel2.add(gender);
        gender.setBounds(233, 171, 165, 28);

        usn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnActionPerformed(evt);
            }
        });
        jPanel2.add(usn);
        usn.setBounds(233, 72, 165, 28);

        category.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(category);
        category.setBounds(640, 290, 176, 28);

        presentsem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        presentsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentsemActionPerformed(evt);
            }
        });
        jPanel2.add(presentsem);
        presentsem.setBounds(632, 230, 176, 28);

        gphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gphoneKeyReleased(evt);
            }
        });
        jPanel2.add(gphone);
        gphone.setBounds(640, 410, 176, 28);

        branchid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(branchid);
        branchid.setBounds(1138, 113, 167, 28);

        rank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(rank);
        rank.setBounds(1140, 320, 170, 28);

        courseid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(courseid);
        courseid.setBounds(632, 67, 176, 28);

        aadharno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aadharno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadharnoActionPerformed(evt);
            }
        });
        aadharno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aadharnoKeyReleased(evt);
            }
        });
        jPanel2.add(aadharno);
        aadharno.setBounds(632, 113, 176, 28);

        age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel2.add(age);
        age.setBounds(1138, 67, 164, 28);

        staytype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(staytype);
        staytype.setBounds(632, 171, 176, 28);

        yoj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(yoj);
        yoj.setBounds(1138, 159, 167, 28);

        puc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(puc);
        puc.setBounds(1138, 215, 167, 28);

        tenth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tenth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenthActionPerformed(evt);
            }
        });
        jPanel2.add(tenth);
        tenth.setBounds(1138, 262, 167, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("ENTER STUDENT DETAILS");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(540, 10, 280, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(620, 490, 80, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(800, 490, 72, 25);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(480, 490, 87, 25);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(930, 600, 440, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i9.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(-10, -6, 1370, 590);

        jPanel1.add(jPanel2, "card2");

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tenthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenthActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void aadharnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadharnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadharnoActionPerformed

    private void usnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void sphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sphoneActionPerformed
        // TODO add your handling code here:
          signup c=new signup();
        c.checknumber(pphone.getText());
    }//GEN-LAST:event_sphoneActionPerformed

    private void parentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentActionPerformed
        // TODO add your handling code here:
           signup c=new signup();
       boolean a= c.checkstring(parent.getText());
       if(a)
       {
           JOptionPane.showMessageDialog(null,"Please enter characters , numbers are not allowed");
           parent.setText(null);
           parent.requestFocusInWindow();
       }
                                 
    }//GEN-LAST:event_parentActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
        
        signup c=new signup();
        c.checkstring(name.getText());
    }//GEN-LAST:event_nameActionPerformed

    private void gnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gnameActionPerformed
        // TODO add your handling code here:
          signup c=new signup();
       boolean a= c.checkstring(gname.getText());
       if(a)
       {
           JOptionPane.showMessageDialog(null,"Please enter characters , numbers are not allowed");
           gname.setText(null);
           gname.requestFocusInWindow();
       }
                                 
    }//GEN-LAST:event_gnameActionPerformed

    private void pphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pphoneActionPerformed
        // TODO add your handling code here:
         signup c=new signup();
        c.checknumber(pphone.getText());
                                 
    }//GEN-LAST:event_pphoneActionPerformed

    private void presentsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentsemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentsemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        S1page s1=new S1page();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fpage f=new fpage();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   SqlDao obj = new SqlDao();
   
        SqlDao obj2 = new SqlDao();
       /* try {
            boolean b= obj2.createTableAdmin();
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        

        int f1 = usn.getDocument().getLength();
        int f2 = name.getDocument().getLength();
        int f3 = gender.getDocument().getLength();
        int f4 =dob.getDocument().getLength();
         int f5 =address.getDocument().getLength();
          int f6 =sphone.getDocument().getLength();
          if(f6!=10)
            {
                JOptionPane.showMessageDialog(null, " Phone no has only 10 digits, please enter properly");
                sphone.setText(null);
           sphone.requestFocusInWindow();
                
            }
           int f7 =parent.getDocument().getLength();
         int f8 =pphone.getDocument().getLength(); 
          if(f8!=10)
            {
                JOptionPane.showMessageDialog(null, " Phone no has only 10 digits, please enter properly");
                pphone.setText(null);
           pphone.requestFocusInWindow();
                
            }
          int f9 =courseid.getDocument().getLength();
           int f10 =branchid.getDocument().getLength();
            int f11 =aadharno.getDocument().getLength();
           if(f11!=12)
            {
                JOptionPane.showMessageDialog(null, " Aadhar no has only 12 digits, please enter properly");
                aadharno.setText(null);
           aadharno.requestFocusInWindow();
                
            }
             int f17 =gphone.getDocument().getLength();
             if(f17!=10)
            {
                JOptionPane.showMessageDialog(null, " Phone no has only 10 digits, please enter properly");
                gphone.setText(null);
           gphone.requestFocusInWindow();
                
            }
                     int f12 =staytype.getDocument().getLength();
           int f13 =presentsem.getDocument().getLength();  
            int f14 =category.getDocument().getLength();
             int f15 =rank.getDocument().getLength();
         int f16 =gname.getDocument().getLength();  
        
         int f18 =age.getDocument().getLength();
          int f19 =yoj.getDocument().getLength();
           int f20 =puc.getDocument().getLength();
            int f21 =tenth.getDocument().getLength();
        if(f1==0||f2==0||f3==0||f4==0||f5==0||f7==0||f9==0||f10==0||f12==0||f13==0||f14==0||f15==0||f16==0||f18==0||f19==0||f20==0||f21==0){
            JOptionPane.showMessageDialog(null, "Please enter the details properly");
        }else{
            try {
              
               int n= obj2.insertStudent(usn.getText(),name.getText(),gender.getText(),dob.getText(),address.getText(),sphone.getText(),parent.getText(),pphone.getText(),gname.getText(),gphone.getText(),branchid.getText(),courseid.getText(),aadharno.getText(),staytype.getText(),age.getText(),yoj.getText(),presentsem.getText(),category.getText(),rank.getText(),puc.getText(),tenth.getText());
                if(n==0){
                   JOptionPane.showMessageDialog(null, "Data not inserted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Data inserted successfully");
                }
                }
                
            catch (Exception ex) {
               JOptionPane.showMessageDialog(null,ex);
            } 
        }
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void gnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gnameKeyReleased
        // TODO add your handling code here:
          signup c=new signup();
       boolean a= c.checkstring(gname.getText());
       if(a)
       {
           JOptionPane.showMessageDialog(null,"Please enter characters , numbers are not allowed");
           gname.setText(null);
           gname.requestFocusInWindow();
       }
    }//GEN-LAST:event_gnameKeyReleased

    private void parentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parentKeyReleased
        // TODO add your handling code here:
             signup c=new signup();
       boolean a= c.checkstring(parent.getText());
       if(a)
       {
           JOptionPane.showMessageDialog(null,"Please enter characters , numbers are not allowed");
           parent.setText(null);
           parent.requestFocusInWindow();
       }
    }//GEN-LAST:event_parentKeyReleased

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        // TODO add your handling code here:
             signup c=new signup();
       boolean a= c.checkstring(name.getText());
       if(a)
       {
           JOptionPane.showMessageDialog(null,"Please enter characters , numbers are not allowed");
           name.setText(null);
           name.requestFocusInWindow();
       }
    }//GEN-LAST:event_nameKeyReleased

    private void aadharnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadharnoKeyReleased
        // TODO add your handling code here:
         signup c=new signup();
        int f =aadharno.getDocument().getLength();
         boolean a= c.checknumber(aadharno.getText());
            
            if(a){
                 JOptionPane.showMessageDialog(null, " Characters are not allowed ,please enter numbers");
                 aadharno.setText(null);
           aadharno.requestFocusInWindow();
            }
        
    }//GEN-LAST:event_aadharnoKeyReleased

    private void sphoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sphoneKeyReleased
        // TODO add your handling code here:
         signup c=new signup();
        int f =sphone.getDocument().getLength();
         boolean a= c.checknumber(sphone.getText());
            
            if(a){
                 JOptionPane.showMessageDialog(null, " Characters are not allowed ,please enter numbers");
                 sphone.setText(null);
           sphone.requestFocusInWindow();
            }
           
    }//GEN-LAST:event_sphoneKeyReleased

    private void pphoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pphoneKeyReleased
        // TODO add your handling code here
            // TODO add your handling code here:
         signup c=new signup();
        int f =pphone.getDocument().getLength();
         boolean a= c.checknumber(pphone.getText());
           
            if(a){
                 JOptionPane.showMessageDialog(null, " Characters are not allowed ,please enter numbers");
                 pphone.setText(null);
           pphone.requestFocusInWindow();
            }
    }//GEN-LAST:event_pphoneKeyReleased

    private void gphoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gphoneKeyReleased
        // TODO add your handling code here:    // TODO add your handling code here:
         signup c=new signup();
        int f =gphone.getDocument().getLength();
         boolean a= c.checknumber(gphone.getText());
           
            if(a){
                 JOptionPane.showMessageDialog(null, " Characters are not allowed ,please enter numbers");
                 gphone.setText(null);
           gphone.requestFocusInWindow();
            }
    }//GEN-LAST:event_gphoneKeyReleased

     
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
            java.util.logging.Logger.getLogger(Spage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Spage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField aadharno;
    public javax.swing.JTextField address;
    public javax.swing.JTextField age;
    public javax.swing.JTextField branchid;
    public javax.swing.JTextField category;
    public javax.swing.JTextField courseid;
    public javax.swing.JTextField dob;
    public javax.swing.JTextField gender;
    public javax.swing.JTextField gname;
    public javax.swing.JTextField gphone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jaddress;
    private javax.swing.JLabel jaddress1;
    private javax.swing.JLabel jaddress10;
    private javax.swing.JLabel jaddress2;
    private javax.swing.JLabel jaddress3;
    private javax.swing.JLabel jaddress4;
    private javax.swing.JLabel jaddress5;
    private javax.swing.JLabel jaddress6;
    private javax.swing.JLabel jaddress7;
    private javax.swing.JLabel jaddress8;
    private javax.swing.JLabel jdob;
    private javax.swing.JLabel jgender;
    private javax.swing.JLabel jsname;
    private javax.swing.JLabel jusn;
    public javax.swing.JTextField name;
    public javax.swing.JTextField parent;
    public javax.swing.JTextField pphone;
    public javax.swing.JTextField presentsem;
    public javax.swing.JTextField puc;
    public javax.swing.JTextField rank;
    public javax.swing.JTextField sphone;
    public javax.swing.JTextField staytype;
    public javax.swing.JTextField tenth;
    public javax.swing.JTextField usn;
    public javax.swing.JTextField yoj;
    // End of variables declaration//GEN-END:variables
}