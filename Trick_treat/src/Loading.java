/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 *
 * @author shuhag
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     * 
     * 
     */
    
    private Timer t = null;
    private int count = 0;
    public Loading() {
        initComponents();
        this.setLocationRelativeTo(null);
        t = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                count ++;
                jProgressBar1.setValue(count);
                if(jProgressBar1.getValue()<100){
                    jProgressBar1.setValue(jProgressBar1.getValue()+1);
                }
                 if(jProgressBar1.getValue()==100){
                     //System.exit(0);
                     Pantalla p = new Pantalla();
                     setVisible(false);
                     p.setVisible(true);
                     t.stop();
                 }
            }
        });
        t.start();
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(584, 590));
        setPreferredSize(new java.awt.Dimension(584, 590));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(584, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(584, 590));
        jPanel1.setLayout(null);

        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(60, 490, 460, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\d\\project_show-2\\Trick_treat\\pacman1.JPG")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 50, 400, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}