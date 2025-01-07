package dayByday;

public class Sliding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,2,7,8,1,5,6,7,9};
		int l = 0;
		int r = 0;
		int sum = 0;
		int target = 9;
		
		
		while(r<a.length) {
			sum = sum + a[r];
			
			while(sum > target) {
				sum = sum -a[l];
				l++;
			}
			
			if(sum == target) {
				System.out.println(r-l+1);
			}
			
			r++;
		}
		
		
	}

}
