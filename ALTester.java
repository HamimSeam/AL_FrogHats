public class ALTester {

	public static void main(String[] args){
			OrderedArrayList Bob = new OrderedArrayList();

			for(int i = 0; i < 23; i++){
					Bob.add((int)(Math.random()*100));
			}
			for(int i = 0; i < Bob._info.size(); i++){
					System.out.print(Bob._info.get(i) + ",");
			}
	}



}
