/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendbook;
import javax.swing.JTextArea;

/**
 *
 * @author shuhag
 */

public class ReadThread implements Runnable {

    private Thread thr;
    private NetworkUtil nc;
    public String t;
    JTextArea jTextArea;
    
    public ReadThread(NetworkUtil nc, JTextArea jTextArea) {
        this.nc = nc;
        this.jTextArea = jTextArea;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            while (true) {
                t = nc.read().toString();
                if (!t.isEmpty()) {
                    jTextArea.append(t);
                    jTextArea.append("\n");
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        nc.closeConnection();

    }
}
