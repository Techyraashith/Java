package test;

/*enum Berth{
	Upper,
	Middle,
	Lower
}*/

public class Passenger {

	private Integer pid;
	
	private String Name;
	
	private Integer PreferBerth;
	
	private Integer WaitingListLimit;
	
	private Integer AllocatedBerth;
	
	//private LocalDateTime bkdTime;
	
	@Override
	public String toString() {
		return "\nPassenger Details: \npid=" + pid + "\nName=" + Name + "\nPreferBerth=" + PreferBerth + "\nWaitingListLimit="
				+ WaitingListLimit + "\nAllocatedBerth=" + AllocatedBerth + "\n";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;m
	}

	public Integer getPreferBerth() {
		return PreferBerth;
	}

	public void setPreferBerth(Integer PreferBerth) {
		PreferBerth = PreferBerth;
	}

	public Integer getWaitingListLimit() {
		return WaitingListLimit;
	}

	public void setWaitingListLimit(Integer waitingListLimit) {
		WaitingListLimit = waitingListLimit;
	}

	public Integer getAllocatedBerth() {
		return AllocatedBerth;
	}

	public void setAllocatedBerth(Integer allocatedBerth) {
		AllocatedBerth = allocatedBerth;
	}

	/*public LocalDateTime getBkdTime() {
		return bkdTime;
	}

	public void setBkdTime(LocalDateTime bkdTime) {
		this.bkdTime = bkdTime;
	}
*/
	public Passenger(Integer pid, String Name, Integer PreferBerth) {
		
		this.pid = pid;
		this.Name = Name;
		this.PreferBerth = PreferBerth;
		//this.bkdTime = bkdTime;
	}


}

