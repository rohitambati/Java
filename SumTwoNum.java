/*import java.util.*;
class SumTwoNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int[] a=new int[str.length];
        for(int i=0;i<str.length;i++){
            a[i]=Integer.parseInt(str[i]);
        }
        int target=sc.nextInt();
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
        
    }
}*/
import java.util.*;
class SumTwoNum {
    public static void twoSum(String[] str, int target) {
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
                if(Integer.parseInt(str[i])+Integer.parseInt(str[j])==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int target=sc.nextInt();
        twoSum(str,target);
        
    }
}