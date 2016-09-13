package temp;

public class Temp {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//Temp class
		//System.out.println("test intellij UI");

		String[] arr = new String [2];
		arr[0] = "one";
		arr[1] = "two";

		for (String s: arr) {
			System.out.println(s);
		}

		Integer[] arr1 = {0,1,2,3,4};
		for (int i: arr1) {
			System.out.println("Temp.main" + i) ;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if(i<arr.length-1){
				System.out.println(i + " -" + arr.length);
				sb.append(",");
				System.out.println(i + " " + arr.length);
			}
		}

		System.out.println(sb.toString());

	} //main
} //class
