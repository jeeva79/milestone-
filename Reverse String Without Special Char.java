//Reverse a String keepinf the special characters at same place
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String in = br.readLine();
	        String s ="";
	        int n = in.length();
	        for(int i=0;i<n;i++){
	            int c = (int) in.charAt(i);
	            if(c >=97 && c <= 122){
	                s += String.valueOf(in.charAt(i));
	            }
	        }
	        StringBuilder sb = new StringBuilder();
	        sb.append(s);
	        sb = sb.reverse();
	        for(int i=0;i<n;i++){
	            int c = (int) in.charAt(i);
	            if(!(c >=97 && c <= 122)){
	                sb = sb.insert(i,in.charAt(i));
	            }
	        }
	        System.out.println(sb);
	   }
	   catch(Exception e){
	   }
	}
}
