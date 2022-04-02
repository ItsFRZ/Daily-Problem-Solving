package day2;

public class CountAndSay {

	
	public static void main(String[] args) {
		
		System.out.println(countAndSay(31));
		
	}
	
	public static String countAndSay(int n) {
		
		if(n == 1)
			return "1";
		
		String rr = countAndSay(n-1);
		return stringCompression(rr);
		
	}
	
	public static String stringCompression(String str) {
		
		StringBuffer result = new StringBuffer();
		
		int count = 1;
		for(int i = 0; i <= str.length()-2;i++){
			char cur = str.charAt(i);
			char next = str.charAt(i+1);
			
			if(cur == next) {
				count += 1;
			}else {
				result.append(count+""+cur);
				count = 1;
			}
			
		
		}
		
		result.append((count)+""+str.charAt(str.length()-1));
		
		
		return result.toString();
	}
	
	
	
}
