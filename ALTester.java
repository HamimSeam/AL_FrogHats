import java.util.*;

public class ALTester {

	static boolean CheckOrdered(ArrayList<Integer> array) {
		for ( int i = 0; i < array.size() - 1; i++ ) 
			if ( array.get(i) > array.get(i + 1) ) 
				return false;

		return true;
	}

	static String PrintArray(ArrayList<Integer> array) {
		String arrayString = "[";
		for ( Integer num : array ) arrayString += num + " ,";
		arrayString += "]";
		return arrayString;
	}

	static boolean CheckOrdered(OrderedArrayList array) {
		for ( int i = 0; i < array._info.size() - 1; i++ ) 
			if ( array._info.get(i) > array._info.get(i + 1) ) 
				return false;

		return true;
	}

	static String PrintArray(OrderedArrayList array) {
		String arrayString = "[";
		for ( Integer num : array._info ) arrayString += num + " ,";
		arrayString += "]";
		return arrayString;
	}


	public static void main(String[] args){
		ArrayList<Integer> Bob = new ArrayList<Integer>();
		OrderedArrayList Dave = new OrderedArrayList();
		//ArrayList<Integer> Charlie = new ArrayList<Integer>();
		//Charlie.add(2);
		//Charlie.add(2);

		for ( int i = 0; i < 23; i++ ) {
			Bob.add( (int) (Math.random()*100) );
			Dave.add( (int) (Math.random()*100));
		}
		System.out.println(PrintArray(Bob));
		System.out.println(CheckOrdered(Bob));
		System.out.println(CheckOrdered(Dave));
		//System.out.println(CheckOrdered(Charlie));
		System.out.println(PrintArray(Dave));
		
	}
}
