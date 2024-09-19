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
	            String t = String.valueOf(in.charAt(i));
	            if(!s.contains(t)){
	                s += t;
	            }
	        }
	        StringBuilder sb = new StringBuilder();
	        sb.append(s);
	        sb = sb.reverse();
	        System.out.println(sb);
	   }
	   catch(Exception e){
	   }
	}
}
