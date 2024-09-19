
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        String val = br.readLine();
	        int c=0;
	        for(int i=0;i<n;i++){
	            if(val.charAt(i)=='1'){
	                c++;
	            }
	        }
	        int total = c*(c-1);
	        System.out.println(total/2);
	   }
	   catch(Exception e){
	   }
	}
}
