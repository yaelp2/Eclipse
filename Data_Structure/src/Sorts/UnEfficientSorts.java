package Sorts;

public class UnEfficientSorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,7,5,2,4,6,9,1};
		//selectionSort(a);
		bubbleSort(a);
		print(a);

	}
	
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int index = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] <= min) {
					min = a[j];
					index = j;
				}
			}
			a[index] = a[i];
			a[i] = min;
			
		}
	}
	
	
	public static void bubbleSort(int[] a) {
		int temp;
		for (int i = a.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
	}
	
	public static void print(int[] a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
	}

}
