package Programs.easy.leetcode;

public class Pattern {

	public static void main(String[] args) {
		
		String str = "java";
//		int n = str.length();
//		String e = "";
//		int i = 0;
//		for(i=0;i<n;i++) {
			// d = e.concat(str.substring(i, i+1));
			//System.out.println(d);
			//e = e + str.substring(i, i+1);
			//e =  e.concat(str.substring(i, i+1));
		//	System.out.println(e);
		//}
		for (int i=1;i<=str.length();i++){
			System.out.println(str.substring(0,i));
		}
	}

}
