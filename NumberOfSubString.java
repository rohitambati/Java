import java.util.*;
class NumberOfSubString {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        //int count=0;
        Set<String> al=new HashSet<String>();
        //al.add(s.substring(0));
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                String substr=new String();
                //if(i!=s.length()-1){
                substr = s.substring(i,j);
                //System.out.println(substr);
                al.add(substr);
                //}
                /*else{
                    substr = s.substring(i);
                    //System.out.println(substr);
                    al.add(substr);
                    break;
                }*/
               
                    //al.add(substr);
                    //System.out.println(al);
                
            }
        }
        System.out.println(al.size());
    }
}
