/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlite;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MoMo
 */
/**************************************/
/*
class Sqlite6{
Connection conn=null;

public static Connection ConnectDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:database.sqlite");
        System.out.println("Connected");
        return conn;
    }
    catch(Exception e){
        System.out.println("Not connected");
    }
    return null;
    
}
}*/
/***********************************************/
public class Profile extends javax.swing.JFrame {
    ResultSet rs=null;
       PreparedStatement ps=null;
    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\project\\2-1\\try\\Sqlite\\icon-video.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 10, 110, 120);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Profile");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 130, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Username :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 180, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 210, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ID :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 240, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Email :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 270, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mobile :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 300, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Department :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 330, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Address :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 360, 110, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Date of Birth :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(120, 390, 110, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Gender :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(120, 420, 110, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Blood Group :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(120, 450, 110, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Password :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(120, 480, 110, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Security Key :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(120, 510, 110, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(260, 180, 320, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(260, 210, 320, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel17);
        jLabel17.setBounds(260, 240, 320, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel18);
        jLabel18.setBounds(260, 270, 320, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(260, 300, 320, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(260, 330, 320, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(260, 360, 320, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel22);
        jLabel22.setBounds(260, 390, 320, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel23);
        jLabel23.setBounds(260, 420, 320, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel24);
        jLabel24.setBounds(260, 450, 320, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel25);
        jLabel25.setBounds(260, 480, 320, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel26);
        jLabel26.setBounds(260, 510, 320, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 660, 160, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(320, 560, 160, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Purchase Details");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(320, 610, 160, 40);

        jLabel27.setIcon(new javax.swing.ImageIcon("E:\\project\\2-1\\try\\Sqlite\\1773755.jpg")); // NOI18N
        jPanel1.add(jLabel27);
        jLabel27.setBounds(0, 0, 680, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn = Sqlite.ConnectDB();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"Log Out Successfully");
        this.setVisible(false);
        Stuad s=new Stuad();
        s.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
       Update u=new Update();
       u.setVisible(true);
       String get=jLabel15.getText();
       u.jTextField1.setText(get);
       //ResultSet rs=null;
       //PreparedStatement ps=null;
       //String query=new String();
        
       //query="select * from login";
      try{
          //ResultSet rs=null;
       //PreparedStatement ps=null;
       String query=new String();
          query="select * from login where username=?";
          ps=conn.prepareStatement(query);
          ps.setString(1, get);
          rs=ps.executeQuery();
          
          
          while(rs.next()){
                  
                  //JOptionPane.showMessageDialog(null,"Login successful");
                  
                  //this.setVisible(false);
                  //Update u=new Update();
                  //u.setVisible(true);
                  
                  //u.username=jLabel5.getText();
                 // u.jTextField1.setText(u.username);
                  u.jTextField1.setText(rs.getString("username"));
                  u.jTextField2.setText(rs.getString("name"));
                  u.jTextField3.setText(rs.getString("id"));
                  u.jTextField4.setText(rs.getString("email"));
                  u.jTextField5.setText(rs.getString("mobile"));
                  u.jTextField6.setText(rs.getString("department"));
                  u.jTextField7.setText(rs.getString("address"));
                  u.jTextField8.setText(rs.getString("date_of_birth"));
                  u.jTextField9.setText(rs.getString("gender"));
                  u.jTextField10.setText(rs.getString("blood_group"));
                  u.jTextField12.setText(rs.getString("password"));
                  u.jTextField11.setText(rs.getString("security_key"));
                  
                  
                  
                
          }
          //if(flag==0)
              //JOptionPane.showMessageDialog(null,"Login failed try again");
          
      }catch(Exception e){
          
      }
      finally{
            try{
                ps.close();
                rs.close();
            }catch(Exception e) {
                
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        Purch p=new Purch();
        p.setVisible(true);
        String get1=jLabel17.getText();
        p.jTextField1a.setText(get1);
        try{
          
       String query1=new String();
          query1="select * from book where id=?";
          ps=conn.prepareStatement(query1);
          ps.setString(1, get1);
          rs=ps.executeQuery();
          
          while(rs.next()){
                  
                  //JOptionPane.showMessageDialog(null,"Login successful");
                  
                  //this.setVisible(false);
                  //Update u=new Update();
                  //u.setVisible(true);
                  
                  //u.username=jLabel5.getText();
                 // u.jTextField1.setText(u.username);
                  p.jTextField1a.setText(rs.getString("id"));
                  p.jTextField2.setText(rs.getString("book_name"));
                  p.jTextField3.setText(rs.getString("author"));
                  p.jTextField4.setText(rs.getString("publisher"));
                  p.jTextField5.setText(rs.getString("date"));
                  
          }
          //if(flag==0)
              //JOptionPane.showMessageDialog(null,"Login failed try again");
          
      }catch(Exception e){
         
      } finally{
            try{
                ps.close();
                rs.close();
            }catch(Exception e) {
                
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    public Connection conn=null;
    public String username=new String();
    public String name=new String();
    public String id=new String();
    public String email=new String();
    public String mobile=new String();
    public String department=new String();
    public String address=new String();
    public String date_of_birth=new String();
    public String gender=new String();
    public String blood_group=new String();
    public String password=new String();
    public String security_key=new String();
    public String book_name=new String();
    public String author=new String();
    public String publisher=new String();
    public String date=new String();
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
*/}
