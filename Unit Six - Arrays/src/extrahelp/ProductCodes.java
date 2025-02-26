package extrahelp;

import java.util.*;

public class ProductCodes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String s = in.nextLine();
            String preFix = "";
            int finalNum = 0;

            // iterate through characters
            for (int j = 0; j < s.length(); j++) {
                int asciiVal = (int)s.charAt(j);

                if (asciiVal >=65 && asciiVal <= 90){
                    preFix += s.substring(j, j+1);
                } else if (asciiVal>=48 && asciiVal <= 57){
                    int tempNum = asciiVal - 48;;
                    while(j<s.length()-1 && (int)s.charAt(j+1) >= 48 && (int)s.charAt(j+1) <=57){
                        tempNum = tempNum * 10 + ((int)s.charAt(j+1) - 48);
                        j++;
                    }
                    finalNum += tempNum;
                }
            }

            System.out.println(preFix + finalNum);
        }

        
    }
}
