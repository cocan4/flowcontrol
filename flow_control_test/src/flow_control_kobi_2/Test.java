package flow_control_kobi_2;

public class Test {

	public static int[] createArr() {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		return arr;
	}

	public static int[] markNotZugi(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
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

	public static int[] createNewArr(int[]arr) {
		int idx=0;
		int[]newArr=new int[arr.length-count(arr)];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=-1) {
				newArr[idx++]=arr[i];
			}
		}
		return newArr;
	}
	
	public static int[] createDuplicates(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]==arr[i]) {
					arr[j]=-1;
				}
			}
		}
		return arr;
	}
	
	public static void findUniqeZugi(int[]arr,int[]array) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (arr[i]==array[j]) {
					arr[i]=-1;
					array[j]=-1;
				}
			}
		}
	
	}
	
	public static void main(String[] args) {

		int[] num1 = createArr();
		int[] num2 = createArr();
		print(num1);
		print(num2);
		markNotZugi(num1);
		markNotZugi(num2);
		print(num1);
		print(num2);
		count(num1);
		count(num2);
		int[]temp1=createNewArr(num1);
		int[]temp2=createNewArr(num2);
		print(temp1);
		print(temp2);
		createDuplicates(temp1);
		createDuplicates(temp2);
		print(temp1);
		print(temp2);
		findUniqeZugi(temp1, temp2);
		findUniqeZugi(temp2, temp1);
		print(temp1);
		print(temp2);
		int[]temp3=new int[temp1.length+temp2.length];
		System.arraycopy(temp1, 0, temp3, 0, temp1.length);
		System.arraycopy(temp2, 0, temp3, temp1.length, temp2.length);
		print(temp3);
		count(temp3);
		int[]temp4=createNewArr(temp3);
		print(temp4);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
