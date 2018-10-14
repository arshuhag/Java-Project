/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendbook;

/**
 *
 * @author shuhag
 */
import javax.swing.JTextArea;


public class Client {

    String serverAddress = "127.0.0.1";
    int serverPort = 33333;
    String name = "Shuhag";
    NetworkUtil nc = null;

    public void startClient(JTextArea jTextArea) {
        try {

            nc = new NetworkUtil(serverAddress, serverPort);
            new ReadThread(this.nc,jTextArea);
            //new WriteThread(nc, "Client");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void writethread(String str){
        nc.write(name + " :  " + str);
    }
    public void closeClient(){
        nc.closeConnection();
    }
}
