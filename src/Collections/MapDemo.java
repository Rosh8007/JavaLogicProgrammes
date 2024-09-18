package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {


	public static void main(String[] args) {

		Map<String, String> MH=new HashMap<String, String>();
		MH.put("Capital", "Mumbai");
		MH.put("Famous City", "Nagpur");

		Map<String, String>GJ=new HashMap<String, String>();
		GJ.put("Capital", "Ahmedabad");
		GJ.put("Famous City", "Divya Somnath City");

		Map<String,String> UP=new HashMap<>();
		UP.put("Capital", "LuckNow");
		UP.put("Famous City", "PrayagRaj");

		Map<String, String> TN=new HashMap <String,String>();
		TN.put("Captial city", "Chennai");
		TN.put("Famous City", "Tirumalla Tirupati");

		Map<String, Map<String, String>> IND=new HashMap<String,Map<String, String>>();
		IND.put("Maharastra", MH);
		IND.put("Gujrat", GJ);
		IND.put("Uttar Pradesh", UP);
		IND.put("Tamil Nadu", TN);

		System.out.println(IND);

		System.out.println(IND.keySet());

		System.out.println(IND.get("Maharastra"));
		System.out.println("=====================================================");

		Set<String>key=IND.keySet();

		Iterator<String> itr=key.iterator();

		while(itr.hasNext()) 
		{
			String  keys=itr.next();
		
			Map<String, String> value=IND.get(keys);
			
			
			System.out.println(keys+" : "+value);

			Iterator<String> itr2=value.keySet().iterator();

			while(itr2.hasNext()) 
			{
				String  keys2=itr2.next();

				String   value2=value.get(keys2);

				System.out.println(keys2+":"+value2);
				
			}
		}
	}

}
