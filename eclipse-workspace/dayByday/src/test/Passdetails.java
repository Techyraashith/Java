package test;

enum SourceDestination {
	MS,MA,DS,DA,VRI,VRJ
}

public class Passdetails {

	private Integer pid;
	
	private String Name;
	
	private Integer PreferBerth;
	
	private Integer WaitingListLimit;
	
	private Integer AllocatedBerth;
	
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

	

