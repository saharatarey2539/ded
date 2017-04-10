package ss;

public class dd {

	public dd() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] exAr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		int ans = 0;
		for (int i = 0; i < exAr.length; i++) {
			if(exAr[i]%2 == 0) {
				ans += 1;
			}
		}
		System.out.println(ans);
	}
}
