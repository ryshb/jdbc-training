package task_RTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RTOTool {
	
	public static List<RegNo> Task(Map<String, String> RTOMap, List<RegNo> data){
		
		List<RegNo> tmp = new ArrayList<>();	
		Collections.copy(tmp, data);
		
		Collections.sort(tmp, (a, b) -> {
		    return (RTOMap.get(a.getZone())+a.getSeqNo()).compareTo( (RTOMap.get(b.getZone())+b.getSeqNo()) );
		});
		
		return tmp;
	}

}

/*
public int compareTo(Object o) {
    return  (this.getNo() < ((Student) o).getNo() ? -1 : (this.getNo() == ((Student) o).getNo() ? 0 : 1));
}

public int compareTo(Object o) {
int result = this.getName().compareTo(((Student) o).getName());
    if(result == 0) {
        result = (this.getNo() < ((Student) o).getNo() ? -1 : (this.getNo() == ((Student) o).getNo() ? 0 : 1));
    }
    return  result;
}
*/
