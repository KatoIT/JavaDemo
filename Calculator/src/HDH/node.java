package HDH;

public class node {

	private int arrivalTime;
	private int executionTime;

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(int executionTime) {
		this.executionTime = executionTime;
	}

	public node(int arrivalTime, int executionTime) {
		super();
		this.arrivalTime = arrivalTime;
		this.executionTime = executionTime;
	}

	public int waitingTime() {
		
		return 0;
	}
}
