package task_RTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RTOClient {

	public static void main(String[] args) {

	Map<String, String> InfoMap = new HashMap<String, String>();

	InfoMap.put("KA-01","Koramangala");
	InfoMap.put("KA-02","Rajajinagar");
	InfoMap.put("KA-03","Indiranagar");
	InfoMap.put("KA-04","Yeshwanthpur");
	InfoMap.put("KA-05","Jayanagar");
	InfoMap.put("KA-50","Yelahanka");
	InfoMap.put("KA-51","Electronics City");
	InfoMap.put("KA-52","Nelamangala");
	InfoMap.put("KA-53","K.R.Puram");
	InfoMap.put("KA-54","Nagamangala");
	InfoMap.put("KA-55","Mysore East");
	InfoMap.put("KA-56","Basavakalyan");
	InfoMap.put("KA-57","Shantinagar");
	
	List<RegNo> data = new ArrayList<>();
	
	data.add(new RegNo("KA-55-AB-4555"));
	data.add(new RegNo("KKA-01-EF-4444"));
	data.add(new RegNo("KKA-01-AB-9000"));
	data.add(new RegNo("KA-56-200"));
	data.add(new RegNo("KA-50-T-3111"));
	data.add(new RegNo("KA-02-AG-9243"));
	
    List<RegNo> ans = RTOTool.Task(InfoMap, data);
	
	for(RegNo r :ans){
		System.out.println(r.getVehicleNo());
	}
		
	}

}
