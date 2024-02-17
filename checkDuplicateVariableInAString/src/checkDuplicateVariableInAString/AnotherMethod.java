package checkDuplicateVariableInAString;

import java.util.Scanner;

public class AnotherMethod {

	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Enter the String");
		        String s = scan.nextLine();
		        String res = findMaxUniqueSubstring(s);
		        System.out.println("The maximum unique substring is: " + res);
		        scan.close();
		    }

		    public static String findMaxUniqueSubstring(String str) {
		        String max = "";

		        for (int i = 0; i < str.length(); i++) {
		            for (int j = i + 1; j <= str.length(); j++) {
		                String subString = str.substring(i, j);
		                if (isSubstringUnique(subString) && subString.length() > max.length()) {
		                    max = subString;
		                }
		            }
		        }
		        return max;
		    }

		    public static boolean isSubstringUnique(String subStr) {
		        for (int i = 0; i < subStr.length(); i++) 
		        {
		            char c = subStr.charAt(i);
		            for (int j = i + 1; j < subStr.length(); j++) {
		                if (c == subStr.charAt(j)) {
		                    return false;
		                }
		            }
		        }
		        return true;
		   
		    }
		
	}


