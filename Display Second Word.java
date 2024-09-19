import java.util.*;
class SecondWord{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] temp = s.split("\\s+");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = temp[i].replaceAll("[^\\w]", "");
        }
        if(temp.length == 1){
            System.out.println("LESS");
        }else{
            System.out.println(temp[1].toUpperCase());
        }
    }
}
