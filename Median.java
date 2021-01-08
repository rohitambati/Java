import java.util.*;
class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            al.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            al.add(nums2[i]);
        }
        Collections.sort(al);
        if(al.size()%2!=0){
            int index=(al.size()-1)/2;
            return al.get(index);
        }
      
        else{
            int e1=al.get((al.size()-1)/2);
            int e2=al.get(al.size()/2);
            System.out.println("e1 = " + e1 +  " e2 = " + e2+ " "+(e1+e2)+" "+(e1+e2)/2);
            return (float)(e1+e2)/2;
        }
        
    }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String[] n=s1.split(" ");
        String[] m=s2.split(" ");
        int[] nums1=new int[n.length];
        int[] nums2=new int[m.length];
        for(int i=0;i<n.length;i++){
            nums1[i]=Integer.parseInt(n[i]);
        }
        for(int i=0;i<m.length;i++){
            nums2[i]=Integer.parseInt(m[i]);
        }
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}