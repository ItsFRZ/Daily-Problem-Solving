package day3;

public class StringCompression {

	public static void main(String[] args) {
		
		
		String input = "wwwwaaadexxxxxsssxxxaaatttt";
		String output = stringCompression(input);
		System.out.println(output);
	}
	
	
	public static String stringCompression(String str) {
		
		StringBuffer result = new StringBuffer();

		
		
		int count = 1;
		int idx = 0;
		for(int i = 0; i < str.length()-1;i++){
			char cur = str.charAt(i);
			char next = str.charAt(i+1);
			
			if(cur == next) {
				count += 1;
			}else {
				idx = i;
				result.append(cur+""+count);
				count = 1;
			}
			
		
		}
		
		idx++;
		count = 0;
		for (int i = idx; i < str.length(); i++) {
			count += 1;
		}
		result.append(str.charAt(idx)+""+(count));
		
		
		return result.toString();
	}
	
	
}
