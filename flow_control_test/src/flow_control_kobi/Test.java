package flow_control_kobi;

public class Test {

	public static int[] randomsNums() {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		return arr;
	}

	public static int[] findNotZugi(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr[i] = -1;
			}

		}
		return arr;
	}

	public static int count(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				count++;
			}
		}
		return count;
	}

	public static int[] removeNotZugi(int[] arr) {
		int[] newArr = new int[arr.length - count(arr)];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				newArr[idx++] = arr[i];
			}
		}
		return newArr;
	}

	public static int[] removeDuplicatesZugi(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					arr[j] = -1;
				}
			}
		}
		return arr;
	}

	public static void removeDuplicates(int[] arr, int[] arr2) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					arr[i] = -1;
					arr2[j] = -1;

				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] num1 = randomsNums();
		int[] num2 = randomsNums();
		printArr(num1);
		printArr(num2);
		findNotZugi(num1);
		findNotZugi(num2);
		printArr(num1);
		printArr(num2);
		count(num1);
		count(num2);
		int[] temp1 = removeNotZugi(num1);
		int[] temp2 = removeNotZugi(num2);
		printArr(temp1);
		printArr(temp2);
		removeDuplicatesZugi(temp1);
		removeDuplicatesZugi(temp2);
		printArr(temp1);
		printArr(temp2);
		removeDuplicates(temp1, temp2);
		removeDuplicates(temp2, temp1);
		printArr(temp1);
		printArr(temp2);
		int[] temp3 = new int[temp1.length + temp2.length];
		System.arraycopy(temp1, 0, temp3, 0, temp1.length);
		System.arraycopy(temp2, 0, temp3, temp1.length, temp2.length);
		count(temp3);
		int[]temp4=removeNotZugi(temp3);
		printArr(temp4);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
