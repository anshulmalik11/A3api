package numberProgramming;

public class NthFibanacci {
	public static void main (String []args) {
		int n1=0,n2=1,n3;
		int target = 4;
		for(int i=1;i<target;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(n1);
	}

}
