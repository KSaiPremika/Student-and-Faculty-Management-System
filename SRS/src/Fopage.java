
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Fopage extends javax.swing.JFrame {

    /**
     * Creates new form Fopage
     */
    public Fopage() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("RETRIEVE STUDENT DETAILS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(273, 12, 315, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("USN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(273, 90, 34, 22);

        usn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usnKeyPressed(evt);
            }
        });
        jPanel1.add(usn);
        usn.setBounds(454, 91, 134, 23);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("RETRIEVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(329, 145, 113, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(488, 146, 100, 31);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 257, 790, 47);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(table2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 315, 790, 46);

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane3.setViewportView(table3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(0, 367, 790, 47);

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane4.setViewportView(table4);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(0, 425, 790, 46);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i9.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -20, 820, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
              Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","dolly");

        } catch (Exception ex) {
            System.out.println(ex);
        }
        try{
            
           // student s=new student();
            ResultSet rs=null;
            ResultSet rs1=null;
            ResultSet rs2=null;
            ResultSet rs3=null;
            String m=usn.getText();
            
        String sql="SELECT usn,s_name,gender,dob,address,s_phone,parent_name,p_phone FROM student WHERE usn='"+m+"'";
        String sql1="SELECT guardian_name,g_phone,branch_id,course_id,aadhar_no,stay_type,age,year_of_join FROM student WHERE usn='"+m+"'";
        String sql2="SELECT s.present_sem,s.category_of_exam,s.cet_comedk_other_rank,s.puc,s.tenth,e.sgpa1,e.sgpa2,e.sgpa3 FROM student s ,exams e WHERE s.usn='"+m+"'"+"and s.usn=e.usn and s.branch_id=e.branch_id";
        String sql3="SELECT e.sgpa4,e.sgpa5,e.sgpa6,e.sgpa7,e.sgpa8,e.cgpa,f.receipt_id,f.total_amtpaid,f.paid_by,f.due_amt FROM exams e ,fees f WHERE e.usn='"+m+"'"+"and e.usn=f.usn";
        PreparedStatement pst=con.prepareStatement(sql);  
        PreparedStatement pst1=con.prepareStatement(sql1);  
        PreparedStatement pst2=con.prepareStatement(sql2);  
        PreparedStatement pst3=con.prepareStatement(sql3);  
       // pst.setString(1,FID.getText());
        rs=pst.executeQuery();
        table1.setModel(DbUtils.resultSetToTableModel(rs));
         rs=pst.executeQuery();
        if(!rs.next())
        {
            System.out.print(rs.getString("usn"));
           
              JOptionPane.showMessageDialog(null, "Search  not found");
              usn.setText(null);
              usn.requestFocusInWindow();
        }
        rs1=pst1.executeQuery();
        table2.setModel(DbUtils.resultSetToTableModel(rs1));
         rs1=pst1.executeQuery();
        if(!rs1.next())
        {
            System.out.print(rs.getString("usn"));
           
              JOptionPane.showMessageDialog(null, "Search  not found");
              usn.setText(null);
              usn.requestFocusInWindow();
        }
         rs2=pst2.executeQuery();
        table3.setModel(DbUtils.resultSetToTableModel(rs2));
         rs2=pst2.executeQuery();
        if(!rs2.next())
        {
            System.out.print(rs.getString("usn"));
           
              JOptionPane.showMessageDialog(null, "Search  not found");
              usn.setText(null);
              usn.requestFocusInWindow();
        }
       
        rs3=pst3.executeQuery();
        table4.setModel(DbUtils.resultSetToTableModel(rs3));
         rs3=pst3.executeQuery();
        if(!rs3.next())
        {
            System.out.print(rs.getString("usn"));
           
              JOptionPane.showMessageDialog(null, "Search  not found");
              usn.setText(null);
              usn.requestFocusInWindow();
        }
       
       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usnKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
                    Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","dolly");

        } catch (Exception ex) {
            System.out.println(ex);
        }
        try{
            ResultSet rs=null;
            ResultSet rs1=null;
            ResultSet rs2=null;
            ResultSet rs3=null;
            String m=usn.getText();
            
        String sql="SELECT usn,s_name,gender,dob,address,s_phone,parent_name,p_phone FROM student WHERE usn='"+m+"'";
        String sql1="SELECT guardian_name,g_phone,branch_id,course_id,aadhar_no,stay_type,age,year_of_join FROM student WHERE usn='"+m+"'";
        String sql2="SELECT s.present_sem,s.category_of_exam,s.cet_comedk_other_rank,s.puc,s.tenth,e.sgpa1,e.sgpa2,e.sgpa3 FROM student s ,exams e WHERE s.usn='"+m+"'"+"and s.usn=e.usn and s.branch_id=e.branch_id";
        String sql3="SELECT e.sgpa4,e.sgpa5,e.sgpa6,e.sgpa7,e.sgpa8,e.cgpa,f.receipt_id,f.total_amtpaid,f.paid_by,f.due_amt FROM exams e ,fees f WHERE e.usn='"+m+"'"+"and e.usn=f.usn";
        PreparedStatement pst=con.prepareStatement(sql);  
        PreparedStatement pst1=con.prepareStatement(sql1);  
        PreparedStatement pst2=con.prepareStatement(sql2);  
        PreparedStatement pst3=con.prepareStatement(sql3);  
       // pst.setString(1,FID.getText());
        rs=pst.executeQuery();
        table1.setModel(DbUtils.resultSetToTableModel(rs));
         rs=pst.executeQuery();
        if(!rs.next())
        {
            System.out.print(rs.getString("usn"));
           
              JOptionPane.showMessageDialog(null, "Search  not found");
              usn.setText(null);
              usn.requestFocusInWindow();
        }
        rs1=pst1.executeQuery();
        table2.setModel(DbUtils.resultSetToTableModel(rs1));
         rs1=pst1.executeQuery();
        if(!rs1.next())
        {
            System.out.print(rs.getString("usn"));
           
              JOptionPane.showMessageDialog(null, "Search  not found");
              usn.setText(null);
              usn.requestFocusInWindow();
        }
         rs2=pst2.executeQuery();
        table3.setModel(DbUtils.resultSetToTableModel(rs2));
         rs2=pst2.executeQuery();
        if(!rs2.next())
        {
            System.out.print(rs.getString("usn"));
           
              JOptionPane.showMessageDialog(null, "Search  not found");
              usn.setText(null);
              usn.requestFocusInWindow();
        }
       
        rs3=pst3.executeQuery();
        table4.setModel(DbUtils.resultSetToTableModel(rs3));
         rs3=pst3.executeQuery();
        if(!rs3.next())
        {
            System.out.print(rs.getString("usn"));
           
              JOptionPane.showMessageDialog(null, "Search  not found");
              usn.setText(null);
              usn.requestFocusInWindow();
        }
       
       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_usnKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fpage f=new fpage();
        f.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Fopage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fopage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fopage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fopage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fopage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables
}