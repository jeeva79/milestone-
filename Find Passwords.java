import java.util.*;
class Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];
        ar[0] = sc.nextInt();
        ar[1] = sc.nextInt();
        ar[2] = sc.nextInt();
        ar[3] = sc.nextInt();
        ar[4] = sc.nextInt();
        int[] c = new int[]{ 0,0,0,0,0 };
        for(int i=0;i<ar.length ; i++){
            int b=Integer.toString(ar[i]).length();
            if(b<=2){
                c[i]=1;
            }else{
                c[i] = checkStable(ar[i]);
            }
        }
        int sumStable =0, sunUnstable =0;
        for(int i=0;i<c.length ; i++){
            if(c[i] == 1){
                sumStable += ar[i];
            }else{
                sunUnstable += ar[i];
            }
        }
        System.out.println( (sumStable - sunUnstable));
        
    }
    static int checkStable(int m){
        int n = m,flag =0,r=0;
        int[] digitCount = new int[10];
        while (n != 0)
        {
            int lastDigit = n % 10;
            digitCount[lastDigit]++;
            n = n / 10;
        }
        int temp =0;
        for(int i=0;i<digitCount.length;i++){
            if(digitCount[i] != 0){
                temp = digitCount[i];
                break;
            }
        }      
        for(int i=0;i<digitCount.length;i++){
            if(digitCount[i] != 0){
                if(temp != digitCount[i]){
                    flag = 0;
                    break;
                }
                else{
                    flag =1;
                }
            }
        }
            
        if(flag == 0 ){
            r = 0;
        }else{
            r = 1;
        }
        return r;
    }
}
