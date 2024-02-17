package checkDuplicateVariableInAString;

public class DuplicateCharString {

	public static void main(String[] args) {
    String str="carerace";
    String s=new String();
    for(int i=0;i<=str.length()-1;i++)
    {
      char c=str.charAt(i);
      if(s.contains(String.valueOf(c))==false)
      {
    	  s=s.concat(String.valueOf(c));
      }
    }
    System.out.println(s);
 }

}
