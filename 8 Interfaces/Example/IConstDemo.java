// An interface that contains constants.
interface IConst {
	int MIN = 0;
	int MAX = 10;
	String ERRORMSG = "Boundary Error";
}

class IConstDemo implements IConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[MAX];
		
		for(int i = MIN; i < (MAX + 1) ; i++) {
			if(i > MAX) {
				System.out.println(ERRORMSG);
			}
			else {
				nums[i] = i;
				System.out.print(nums[i] + " ");
			}
		}
	}

}
