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
import java.util.*;
public class WriteThread implements Runnable
{

	private Thread thr;
	private NetworkUtil nc;
	String name;

	public WriteThread(NetworkUtil nc,String name)
	{
		this.nc = nc;
		this.name=name;
		this.thr = new Thread(this);
		thr.start();
	}

	public void run()
	{
		try
		{
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner input=new Scanner(System.in);

			while(true)
			{
				//String s=br.readLine();
				String s=input.nextLine();
				nc.write(name+":"+s);
			}
		}catch(Exception e)
		{
			System.out.println (e);
		}
		nc.closeConnection();
	}

}
