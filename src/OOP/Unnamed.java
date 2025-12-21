package OOP;

public class Unnamed {
	
	public static void main(String[] args) {
		
		String s1="hari";
		String s2="irah";
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		int l1=c1.length;
		int l2=c2.length;
		int count=0;
		
		if(l1==l2) {
			for(int i=0;i<l1;i++) {
				for(int j=0;j<l2;j++) {
					if(c1[i]==c2[j]) {
						count++;
						break;
					}
				}
			}
			if(count==l1) {
				System.out.println("Anagram");
			}
			else {
				System.out.print("Not an anagram");
			}
		}
		else {
			System.out.println("Not an Anagram");
		}
		
		
		
	}

}
