package OOP;

class Pattern{
	void boxPattern() {
		System.out.println("Box Pattern");
		char[][] box=new char[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				box[i][j]='*';
			}
		}
		
		for(int i=1;i<4;i++) {
			for(int j=1;j<4;j++) {
				box[i][j]=' ';
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(box[i][j]);
				System.out.printf(" ");
			}
			System.out.println();
		}
	}
	
	void rightTrianglePattern() {
		System.out.println("Right Triangle Pattern");
		System.out.println();
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void invertedRightTrianglePattern() {
		System.out.println("Inverted Right Triangle Pattern");
		System.out.println();
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void leftHalfPyramidPattern() {
		System.out.println("Left Half Pyramid Pattern");
		System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void reversedLeftPyramid() {
		System.out.println("Reversed Left Pyramid Pattern");
		System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<5-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void square() {
		System.out.println("SquarePattern");
		System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void rhombus() {
		System.out.println("Rhombus pattern");
		System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void diamond() {
		System.out.println("Rhombus pattern");
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			System.out.print("  ");
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<4-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void numberChangingTriangle() {
		System.out.println("Number changing pattern");
		int n=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}
	void numberIncreasingTriangle() {
		System.out.println("Number increasing pattern");
		for(int i=1;i<6;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	void numberDecreasingTriangle() {
		System.out.println("Number increasing pattern");
		System.out.println();
		for(int i=1;i<6;i++) {
			for(int j=1;j<6-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	void numberIncreasingPyramid() {
		System.out.print("Number Increasing Pyramid");
		int n=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(n+" ");
				
			}
			n++;
			System.out.println();
		}
	}
	void palindromeTriangle() {
		System.out.println("Palindrome Triangle pattern");
		for(int i=1;i<6;i++) {
			for(int j=1;j<6-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i+2;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	void reverseNumberTraingle() {
		System.out.println("Reverse number triangle");
		for(int i=1;i<=5																																																									;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k<=5;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
}
	
public class Box {
	
	public static void main(String[] args) {
		Pattern ptn=new Pattern();
		ptn.boxPattern();
		ptn.rightTrianglePattern();
		ptn.invertedRightTrianglePattern();
		ptn.leftHalfPyramidPattern();
		ptn.reversedLeftPyramid();
		ptn.square();
		ptn.rhombus();
		ptn.diamond();
		ptn.numberChangingTriangle();
		ptn.numberIncreasingTriangle();
		ptn.numberDecreasingTriangle();
		ptn.numberIncreasingPyramid();
		ptn.palindromeTriangle();		
		ptn.reverseNumberTraingle();
		}
}
