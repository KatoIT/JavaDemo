package Sort_Algorithm;


public class Quick_Sort {

	private int partition(Double arr[], int low, int high) {

		Double pivot = arr[high]; 
		int left = low;
		int right = high - 1;
		while (true) {
			while (left <= right && arr[left] < pivot)
				left++;
			while (right >= left && arr[right] > pivot)
				right--;
			if (left >= right)
				break;
			SWAP(arr[left], arr[right]);
			left++;
			right--;
		}
		SWAP(arr[left], arr[high]);
		return left;

	}

	public void quickSort(Double arr[], int low, int high) {
		    if (low < high)
		    {
		        /* pi là chỉ số nơi phần tử này đã đứng đúng vị trí
		         và là phần tử chia mảng làm 2 mảng con trái & phải */
		        int pi = partition(arr, low, high);
		 
		        // Gọi đệ quy sắp xếp 2 mảng con trái và phải
		        quickSort(arr, low, pi - 1);
		        quickSort(arr, pi + 1, high);
		    }
		 
	}
	private void SWAP(Double a, Double b) {
		 Double t = a;
		    a = b;
		    b = t;
		
	}
}
