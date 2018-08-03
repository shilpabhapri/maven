import java.util.*;
public class Manufacturer extends Thread{
	
		List<Aircraft> list;
		String[] manu = {"AirAsia","Boeing","Bombardier"};
		
		public Manufacturer(List<Aircraft> list) {
			this.list = list;
		}
		
		public void run(){
			Aircraft a;
			int count=0;
			for(int i=0;i<manu.length;i++){
				Iterator<Aircraft> itr = list.iterator();
				System.out.println(manu[i]);
				while(itr.hasNext()){
					a = itr.next();
					if(a.manufacturerName.equals(manu[i])){
						System.out.println(a.name);
						count++;
					}
				}
				if(count==list.size())
					break;
			}
		}
}
