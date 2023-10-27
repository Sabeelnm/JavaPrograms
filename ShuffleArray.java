package package1;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size=sc.nextInt();
		
		Integer[] intArray = new Integer[size];
		for(int i=0;i<size;i++) {
			intArray[i]=sc.nextInt();
		}

		List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);

		intList.toArray(intArray);

		System.out.println(Arrays.toString(intArray));
	}
}