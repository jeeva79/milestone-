
int a[] = new int[input2];
for(int i=0;i<input2;i++)
{
 int number = input1[i];
 a[i] =(number /(int)Math.pow(10,i)%10);
 }
 int sum =0;
 for(int i=0;i<input2;i++){
 sum+=a[i]*a[i];
 }
 return sum;
 }
 }
