
Set<Integer> st = new HashSet<>();
int last = input1[input2 -1];
for(int i = input2 -1 ;i>=0;i--){
int num = input1[i];
if(num <=0){
continue;
}
if(st.contains(num)){
return num;
}
st.add(num);
}
return (st.isEmpty() ? 0 : last;
}
}
