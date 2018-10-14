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
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class NetworkUtil
{
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	Object o;
	

		
	public NetworkUtil(String s,int port)
	{
		try
		{
			this.socket=new Socket(s,port);  
			oos=new ObjectOutputStream(socket.getOutputStream());
			ois=new ObjectInputStream(socket.getInputStream());
		} 
		catch (Exception e) 
		{
			System.out.println("In NetworkUtil : " + e.toString());
			//System.exit(0);
		}
	}
		
	public NetworkUtil(Socket s)
	{
		try
		{
			this.socket = s;
			oos=new ObjectOutputStream(socket.getOutputStream());
			ois=new ObjectInputStream(socket.getInputStream());
		} 
		catch (Exception e) 
		{
			System.out.println("In NetworkUtil : " + e.toString());
			//System.exit(0);
			
		}
	}
	
	public Object read() 
	{
		try 
		{	o=ois.readObject();
		} 
		catch (Exception e) 
		{
		  System.out.println("Reading Error in network : " + e.toString());
		  //System.exit(0);
		}
		return o;
	}
	
	public void write(Object o)
	{
		try
		{
			oos.writeObject(o);                        
		}
		catch (IOException e) 
		{
			System.out.println("Writing  Error in network : " + e.toString());
			//System.exit(0);
		}
	}
	public void closeConnection() {
		try {
			
			ois.close();
			oos.close();
		} 
		catch (Exception e) {
			System.out.println("Closing Error in network : "  + e.toString());
			//System.exit(0);
		}
	}
	
	public Socket getSocket()
	{
		return this.socket;
	}
}
