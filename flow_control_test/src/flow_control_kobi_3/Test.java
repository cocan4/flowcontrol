package flow_control_kobi_3;

public class Test {

	public static int[] createRandomArr() {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 21);
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

	private static int countMethod(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				count++;
			}
		}
		return count;
	}

	private static int[] createArrZugi(int[] arr) {
		int[] newArr = new int[arr.length - countMethod(arr)];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				newArr[idx++] = arr[i];
			}
		}
		return newArr;
	}

	private static int[] createDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					arr[i] = -1;
				}
			}
		}
		return arr;
	}

	private static void compareArrays(int[] arr, int[] array) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (arr[i] == array[j]) {
					arr[i] = -1;
					array[j] = -1;
				}
			}
		}
	}

	private static void findMaxZugi(int[] arr) {
		int max = 0;
		int max1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				if (max < arr[i]) {
					max = arr[i];
				}

			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				if (max1 < arr[j]) {
					max1 = arr[j];
				}
			}

		}
		System.out.println(max);
		System.out.println(max1);
	}

	public static void main(String[] args) {
		// 1.create and print 2 random arr[20]
		int[] num1 = createRandomArr();
		int[] num2 = createRandomArr();
		printMethod(num1);
		printMethod(num2);
		// 2.find biggest zugiNumber in num1
				findMaxZugi(num1);
		// 3.tag not zugi numbers
		findNotZugi(num1);
		findNotZugi(num2);
		printMethod(num1);
		printMethod(num2);
		// 4.create count method+count arr
		countMethod(num1);
		countMethod(num2);
		// 5.use count method to create new arr zugi&print them
		int[] temp1 = createArrZugi(num1);
		int[] temp2 = createArrZugi(num2);
		printMethod(temp1);
		printMethod(temp2);
		// 6.create duplicates in new arrays
		createDuplicates(temp1);
		createDuplicates(temp2);
		// 6.remove duplicates from arrays
		int[] temp3 = createArrZugi(temp1);
		int[] temp4 = createArrZugi(temp2);
		printMethod(temp3);
		printMethod(temp4);
		// 8.compare arrays to find unique
		compareArrays(temp3, temp4);
		printMethod(temp3);
		printMethod(temp4);
		// 9.unify arrays to one&print it
		int[] temp5 = new int[temp3.length + temp4.length];
		System.arraycopy(temp3, 0, temp5, 0, temp3.length);
		System.arraycopy(temp4, 0, temp5, temp3.length, temp4.length);
		printMethod(temp5);
		// 10.create unique arr without -1
		int[] temp6 = createArrZugi(temp5);
		printMethod(temp6);
		

	}

	public static void printMethod(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
