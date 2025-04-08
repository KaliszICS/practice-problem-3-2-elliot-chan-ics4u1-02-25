public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int hanoi(int num){
		return num == 1 ? 1 : 2*hanoi(num-1)+1;
	}
	public static int towerOfHanoi(int num) {
		return num < 3 ? -1 : hanoi(num); 
	}

}
