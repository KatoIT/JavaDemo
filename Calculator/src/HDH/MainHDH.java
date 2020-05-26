package HDH;

public class MainHDH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrivalTime = { 0, 2, 4, 6};
		int[] executionTime = { 14, 14, 10, 7};

		lapLichCPU Example = new lapLichCPU();

		Example.FCFS(arrivalTime, executionTime);
	}

}
