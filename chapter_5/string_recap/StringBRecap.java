package string_recap;

public class StringBRecap {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(12345).append('-'));   // 12345-
		System.out.println(sb.indexOf("-"));                // 5
		System.out.println(sb.charAt(4));                   // 5
		
		StringBuilder sb2 = sb.reverse();
		System.out.println(sb);                             // -54321
		sb2.append(1234);
		System.out.println(sb2);                            // -543211234
		System.out.println(sb2 == sb);                      // true
		
		StringBuilder sb3 = new StringBuilder("abcde"); 
		sb3.insert(1, "-").delete(3, 4);                    // a-bde
		System.out.println(sb3);
		System.out.println(sb3.substring(2, 4));            // bd

	}

}
