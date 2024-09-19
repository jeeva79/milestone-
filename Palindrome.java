import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t ="";
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            t = t + s.charAt(i);
        }
        if(s.equalsIgnoreCase(t)){
            System.out.println("2");
        }
        else{
            System.out.println("1");
        }
    }
}
