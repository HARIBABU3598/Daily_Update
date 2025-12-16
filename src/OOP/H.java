package OOP;

public class H {
	public static void main(String[] args) {
		char[][] h=new char[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				h[i][j]='*';
				
			}
		}
		for(int i=0;i<5;i++) {
			if(i==2) {
				continue;
			}
			for(int j=1;j<4;j++) {
				h[i][j]=' ';
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(h[i][j]);
				}
			System.out.println();
		}
	}
}
