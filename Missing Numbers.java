import java.io.*;
public class Main
{
	public static void main(String[] args) {
		try{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        String val= br.readLine();
	        int res=0;
	        for(int i=1;i<=n;i++){
	            int t = Integer.parseInt(String.valueOf(val.charAt(i-1)));
	            if(t!=i){
	                res = i;
	            }
	        }
	        System.out.println(res);
		}catch(Exception e){
		    
		}
	}
}
