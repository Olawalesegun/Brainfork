package GettingStarted;

public class GettingStarted {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			if(i == 0 || i == 4) {
				System.out.print("*****");
				System.out.println();
			}
			else {
				for(int j = 0; j<5; j++) {
					if(j==0 || j==4) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}

}
