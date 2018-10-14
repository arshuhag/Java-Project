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
import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class Server implements Runnable {

    private ServerSocket ServSock;
    Thread th;
    JTextArea jTextArea;
    private ServerThread serverThread = null;
    String name = "Asif Sir";
    Server(JTextArea jTextArea) {
        try {
            ServSock = new ServerSocket(33333);
            this.jTextArea = jTextArea;
            th = new Thread(this, "Server Thread");
            th.start();
        } catch (Exception e) {
            System.out.println("Server starts:" + e);
        }
    }

    public void run() {
        while (true) {
            try {
                serverThread = new ServerThread(ServSock.accept(),jTextArea);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void writethread(String str){
        if(serverThread != null)
            serverThread.writeToSocket(name + " :  " + str);
    }
}

class ServerThread {
    private Socket ClientSock;
    private NetworkUtil nc;

    ServerThread(Socket client,JTextArea jTextArea) {
        this.ClientSock = client;
        this.nc = new NetworkUtil(ClientSock);
        new ReadThread(this.nc,jTextArea);
    }

    public void writeToSocket(String str){
        nc.write(str);
    }

    public void closeConnection(){
        nc.closeConnection();
    }
}
