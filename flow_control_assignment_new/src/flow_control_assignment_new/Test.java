package flow_control_assignment_new;

public class Test {

	public static int[] createNewArr() {
		int[] arr = new int[15];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}

		return arr;
	}

	public static void find3numbers(int[] arr) {
		int min = 100;
		int min2 = 100;
		int min3 = 100;
		int sum = 0;
		int newSum = 100;
		for (int i = 0; i < arr.length - 2; i++) {
			if (min >= arr[i]) {
				min = arr[i];
				min2 = arr[i + 1];
				min3 = arr[i + 2];
				sum = min * 100 + min2 * 10 + min3;
				if (newSum > sum) {
					newSum = sum;
				}
			}
		}
		System.out.println("3 lowest sequential numbers in array num1 are: " + newSum);
	}

	public static int[] createDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					arr[j] = -1;
				}
			}
		}
		return arr;
	}

	public static int countMethod(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				count++;
			}
		}

		return count;
	}

	public static int[] removeDuplicates(int[] arr) {
		int[] newArr = new int[arr.length - countMethod(arr)];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				newArr[idx++] = arr[i];
			}
		}
		return newArr;
	}

	public static int[] findCommonNumbers(int[] arr, int[] array) {
		int[] newArr = new int[arr.length];
		int idx = 0;
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (arr[i] == array[j]) {
					newArr[idx++] = array[j];
				}
			}
		}
		return newArr;
	}

	public static int[] createDistinct() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		return arr;
	}

	public static void printNumbers(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != -1) {
				System.out.print(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// 1.create 2 new randoms arr & print method - print randoms arr
		int[] num1 = createNewArr();
		int[] num2 = createNewArr();
		printMethod(num1);
		printMethod(num2);
		// 2.find lowset 3 numbers in a row
		find3numbers(num1);
		// 3.createDuplicates in arrays&create count method
		createDuplicates(num1);
		createDuplicates(num2);
		printMethod(num1);
		printMethod(num2);
		countMethod(num1);
		countMethod(num2);
		// 4.remove duplictes from arrays&print them
		int[] temp1 = removeDuplicates(num1);
		int[] temp2 = removeDuplicates(num2);
		printMethod(temp1);
		printMethod(temp2);
		// 5.find common numbers in arrays
		int[] temp3 = findCommonNumbers(temp1, temp2);
		int[] temp4 = findCommonNumbers(temp2, temp1);
		printMethod(temp3);
		printMethod(temp4);
		int[] temp5 = new int[temp3.length + temp4.length];
		System.arraycopy(temp3, 0, temp5, 0, temp3.length);
		System.arraycopy(temp4, 0, temp5, temp3.length, temp4.length);
		printMethod(temp5);
		// 6.removeduplicates in new array&coppy it to new array
		createDuplicates(temp5);
		countMethod(temp5);
		printMethod(temp5);
		int[] temp6 = removeDuplicates(temp5);
		printMethod(temp6);
		// 7.create distinct array
		int[] distinct = createDistinct();
		printMethod(distinct);
		System.arraycopy(temp6, 0, distinct, 0, temp6.length);
		printMethod(distinct);
		// 8.print folllowing numbers in distinct
		printNumbers(distinct);

	}

	public static void printMethod(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
