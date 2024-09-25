package episode10;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		String[]guns = { "AK47", "AKM","AUG", "Groza", "M416", "Scar-l","DBS"};
		System.out.println(Arrays.toString(guns));
		
		System.out.println(guns[0]);
		System.out.println(guns[5]);
		System.out.println(guns.length);
		System.out.println(guns[guns.length-1]);
		
		int[] a = new int[4];
				a[0] = 100;
				a[1] = 200;
				a[2] = 300;
				a[3] = 400;
				System.out.println(a.length);
				System.out.println(Arrays.toString(a));

	}

}
