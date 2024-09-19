import java.io.*;
public class Main
{
    static int bracket(String s){
        String r = "";
	    int n = s.length();
	    int counter=0;
	    for(int i=0;i<n;i++){
	        char b = s.charAt(i);
	        if(b== '(' || b== '[' || b== '{' ){
	            r += String.valueOf(s.charAt(i));
	            counter ++;
	            continue;
	        }
	        if(r.length()==0){
	            return counter+1;
	        }
	        char l = r.charAt(r.length()-1);
	        r = r.substring(0,r.length()-1);
	        if(b=='[' && l==']'){
	           counter ++;
	           
	        }else if(b=='{' && l=='}'){
	           counter ++;
	           
	        }else if(b=='(' && l==')'){
	           counter ++;
	        }else{
	           return counter+1;
	        }
	    }
	    if(r.length()==0){
	        return 0;
	    }
	    else{
	       return counter+1;
	    }
    }
	public static void main(String[] args) {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   try{
	       String s = br.readLine();
	       System.out.println(bracket(s));
	   }
	   catch(Exception e){
	   }
	}
}
