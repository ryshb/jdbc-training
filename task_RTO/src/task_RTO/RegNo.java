package task_RTO;

public class RegNo {

	private String VehicleNo ;

	public RegNo(String vehicleNo) {
		super();
		VehicleNo = vehicleNo;
	}

	public String getState() {
		return this.VehicleNo.substring(0,2);
	}

	public String getZone() {
		return this.VehicleNo.substring(3,5);	
	}

	public String getSeqNo() {
		return this.VehicleNo.substring(6,this.VehicleNo.length());
	}

	public String getVehicleNo() {
		return VehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}
	
}
