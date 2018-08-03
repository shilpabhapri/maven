import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[])throws IOException, InterruptedException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		List<Aircraft> list = new LinkedList<Aircraft>();
		System.out.println("Enter the number of aircrafts");
		int n = Integer.parseInt(buf.readLine());
		for(int i=0;i<n;i++){
			System.out.println("Enter the aircraft "+(i+1)+" details");
			list.add(new Aircraft(buf.readLine(),buf.readLine()));
		}
		Manufacturer manufacturer1 = new Manufacturer(list);
		manufacturer1.start();
	}
}
