package pwwork;

public class Saurabh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=a;j++) {
				if(i==0||j==0||i==4||j==4) {
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
