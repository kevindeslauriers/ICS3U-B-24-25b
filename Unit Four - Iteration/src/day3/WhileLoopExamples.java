package day3;

public class WhileLoopExamples {
    public static void main(String[] args) {

        // int start = 1;
        // int end = 1000;

        // // int sum = forLoopSum(start, end);
        // int sum = whileLoopSum(start, end);
        // System.out.println(sum);
        System.out.println(stringRemoveAndCompare("abcabcabc", "abc"));
        System.out.println(stringRemoveAndCompare("hello", "ell"));
        System.out.println(stringRemoveAndCompare("ab", "abcd"));
        System.out.println(stringRemoveAndCompare("abha", "abcd"));
    }

    private static int whileLoopSum(int start, int end) {
        int sum = 0;

        while (start <= end) {
            sum += start;
            start++;
        }

        return sum;
    }

    private static int forLoopSum(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public static String stringRemoveAndCompare(String str1, String str2){
        int bigLen = str1.length();
        String bigStr = str1;
    	int smoLen = str2.length();
        String smoStr = str2;
	if (str1.length() > str2.length()) {
    	bigLen = str1.length();
        bigStr = str1;
    	smoLen = str2.length();
        smoStr = str2;
    }else if (str2.length() > str1.length()) {
    	bigLen = str2.length();
        bigStr = str2;
        smoLen = str1.length();
        smoStr = str1;
    }else {
    	return "Equal Length";
    }
    String spaces = "";
    for (int i = 0; i <= bigLen - smoLen; i++) {
		if (bigStr.substring(i, smoLen).equals(smoStr)) {
        	for (int j = 0; j < smoLen; j++) {
            	spaces += " ";
            }
			bigStr = spaces + bigStr.substring(0, i) + bigStr.substring(smoLen);
        }
    }
	return bigStr;
    
}
}
