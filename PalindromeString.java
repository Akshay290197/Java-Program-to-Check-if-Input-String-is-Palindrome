public class PalindromeString {
    public static void main(String[] args) {
        String str="abcba";
        System.out.println(isPalindrome(str)?"Palindrome":"Not Palindrome");
    }
    public static boolean isPalindrome(String str){
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }

        if(str.equals(revStr)){
            return true;
        }
        return false;
    }
}
