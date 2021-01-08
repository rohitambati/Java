import java.util.*;
class NumPalindrome {
    public static long reverse(int x) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int rem=0;
        int count=0;
        while(x>0){
            rem=x%10;
            al.add(rem);
            count+=1;
            x/=10;
        }
        long ans=0;
        for(int i=count;i>0;i--){
            System.out.println(i+" "+al.get(count-i)+" "+al.get(count-i)*Math.pow(10,count-1));
            ans+=al.get(count-i)*Math.pow(10,i-1);
            if((long)ans>Math.pow(2,31)-1)
                return 0;
        }
        System.out.println(al);
        return ans;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
            System.out.println(reverse(n));
        else
            System.out.println("-"+reverse(Math.abs(n)));
    }
}