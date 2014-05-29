public class Chapter_10 {
	public void zad1(int n, int k) {
		int[] domain = new int[n];
		for (int i = 0; i < n; i++) {
			domain[i] = i + 1;
		}
		
		int count = 0;
		for (int x= 0; x< domain.length;x++){
			
		for (int y= count; y < domain.length;y++){
			for (int i = 0; i < k-1; i++) {
				System.out.print(domain[x]);
			}
			System.out.print(domain[y]);
			System.out.print(" ");
		}
		count ++;
		}
	}
	
// zad 2
	public void zad2(int n, int k) {
		int[] domain = new int[n];
		for (int i = 0; i < n; i++) {
			domain[i] = i + 1;
		}
		for (int x = 0; x < domain.length; x++) {
			for (int y = 0; y < domain.length; y++) {
				for (int i = 0; i < k - 1; i++) {
					System.out.print(domain[x]);
				}
				System.out.print(domain[y]);
				System.out.print(" ");
			}
		}
	}
	
//zad3
	
//	for (int x = element; x < asd.length;x++){
//		for (int y= 0; y<k-1;y++){
//			System.out.print("("+asd[i+1]+" ");
//		}
//		System.out.print(asd[x]+")");
//		System.out.print(" ");
//	}
	
	public void zad3(String[] string, int k){
		//int[] temp = new int[k];
		for (int i=0; i<string.length;i++){
			
		}
	}
	/* MAIN */
	public static void main(String[] args) {
		Chapter_10 test = new Chapter_10();
//		test.zad1(3,2);
//		System.out.println();
//		test.zad2(3,2);
		String[] asd = {"test", "rock","fun"};
		test.zad3(asd, 2);
		
	}
}
