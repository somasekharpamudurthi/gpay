import java.io.*;
import java.net.*;
 class Myclient
{
	public static void main(String[]args)
	{
		try
		{
			Socket s=new Socket("localHost",1234);
			ObjectOutputStream os=new ObjectOutputStream(s.getOutputStream());
			os.writeUTF("hello server");
			os.flush();
			os.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
		