package HDH;

public class lapLichCPU {

	public void FCFS(int[] a, int[] b) {
		int waitingTime = 0;
		int timeSaved = 0;
		double sum = 0;

		// Waiting Time
		System.out.println("FCFS\nWaiting Time:");
		for (int i = 0; i < a.length; i++) {
//			System.out.println("P" + (i + 1) + " : " + (waitingTime - a[i]));
//			waitingTime += b[i];
			sum += (a.length - 1 - i) * b[i] - a[i];
		}
		System.out.println("TB: " + sum / a.length);

		// Time saved
		sum = 0;
		System.out.println("Time Saved:");
		for (int i = 0; i < a.length; i++) {
//			System.out.println("P" + (i + 1) + " : " + (timeSaved + b[i] - a[i] ));
//			timeSaved += b[i];
			sum += (a.length - 1 - i) * b[i] - a[i] + b[i];
		}
		System.out.println("TB: " + sum / a.length + "\nGant:");
		// Gant
		waitingTime = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(waitingTime + " [--- P" + (i + 1) + " ---] ");
			waitingTime += b[i];
		}
		System.out.print(waitingTime);
	}

	public void SJN(int[] a, int[] b) {
		int waitingTime = 0;
		int timeSaved = 0;
		double sum = 0;
		int var1 = 1000;
		int var2 = 0;

		// Waiting Time
		for (int i = 0; i < a.length; i++) {
			System.out.println(waitingTime);
			waitingTime += var1;
			for (int j = i + 1; j < b.length - 1 - i; j++) {
				if (waitingTime > a[j]) {
					if (b[j] < var1) {
						var1 = b[j];
						var2 = j;						
					}
				}
			}
			
		}
		
		
	}
}
