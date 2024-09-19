  static int sumOfNonPrimeIndexValues(int input1[], int input2){
        int ar[] = input1;
        int n = input2,flag =0;
        for(int i = 1;i<=n;i++){
            if(i ==1 || i==0)
                continue;
            flag =1 ;
            for(int j=2; j<=i/2;++j){
                if(i % j ==0){
                    flag =0;
                    break;
                }
            }
            if(flag == 1){
                ar[i] = 0;
            }
        }
        int result=0;
        for(int i = 0;i<n;i++){
            result += ar[i];
        }
        return result;
    }
}
