package flow_control_test;

public class Test {

	public static int[] randomNums() {
		int[] arr = new int[15];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		return arr;
	}

	public static void find3numbers(int[] arr) {
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int sum = 0;
		int newSum = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			if (max1 <= arr[i]) {
				max1 = arr[i];
				max2 = arr[i + 1];
				max3 = arr[i + 2];
				sum = max1 * 100 + max2 * 10 + max3;
				if (newSum < sum) {
					newSum = sum;
				}
			}
		}
		System.out.println(newSum);
	}

	public static int[] findDuplicatsArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					arr[i] = -1;
				}
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

	public static int[] createNewArray(int[] arr) {
		int idx = 0;
		int[] newArr = new int[arr.length - count(arr)];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				newArr[idx++] = arr[i];
			}
		}
		return newArr;
	}

	public static int[] findUniqeNumbers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		return arr;
	}

	public static int[] createDistinct() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		return arr;
	}

	public static int[] coppyDistinct(int[] arr, int[] arr2) {
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				arr2[idx++] = arr[i];
			}
		}
		return arr2;
	}

	public static void printReverse(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != -1) {
				System.out.print(arr[i]);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] num1 = randomNums();
		int[] num2 = randomNums();
		printArr(num1);
		printArr(num2);
		find3numbers(num1);
		findDuplicatsArr(num1);
		findDuplicatsArr(num2);
		count(num1);
		count(num2);
		printArr(num1);
		printArr(num2);
		int[] temp1 = createNewArray(num1);
		int[] temp2 = createNewArray(num2);
		printArr(temp1);
		printArr(temp2);
		int[] temp3 = new int[temp1.length + temp2.length];
		System.arraycopy(temp1, 0, temp3, 0, temp1.length);
		System.arraycopy(temp2, 0, temp3, temp1.length, temp2.length);
		printArr(temp3);
		findUniqeNumbers(temp3);
		printArr(temp3);
		int[] distinct = createDistinct();
		coppyDistinct(temp3, distinct);
		printArr(distinct);
		printReverse(distinct);

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
