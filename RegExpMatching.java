/*
Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*' where: 

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

Input: s = "aab", p = "c*a*b"
Output: true
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".

Input: s = "mississippi", p = "mis*is*p*."
Output: false
*/
import java.util.*;
/*class RegExpMatching{
    public static boolean isMatch (String s,String p){
        if(s.equals(p)){
            return true;
        }
        else{
            for(int i=0;i<)
        }

        return true;
    }
    public static void main(String[] args){

    }

}*/
class RegExpMatching {
    public static boolean isMatch(String s, String p) {
        if(s.equals(p))
            return true;
        else{
            for(int i=0;i<p.length();i++){
                System.out.println("\ni = "+i+" \np("+i+") = "+p.charAt(i)+" \ns("+i+") = "+s.charAt(i));
                if(s.length()!=p.length()){
                    if(p.charAt(i)!='*'||p.charAt(i)!='.'){
                        return false;
                    }
                }
                //if(s.length()!=p.length()){
                    if(s.charAt(i)==p.charAt(i)){
                        System.out.println("s.charAt(i)==p.charAt(i)");
                        System.out.println("i = "+i+" \np("+i+") = "+p.charAt(i)+" \ns("+i+") = "+s.charAt(i));
                        i++;
                    }
                    else{
                        if(p.charAt(i+1)=='*'){
                            System.out.println("s.charAt(i+1)=='*'");
                            System.out.println("i = "+i+" \np("+i+") = "+p.charAt(i)+" \ns("+i+") = "+s.charAt(i));
                            if (s.charAt(i)==p.charAt(i-1))
                                i++;
                            
                            else if(p.length()-2==s.length()){
                                System.out.println("p.length()-2==s.length()");
                                i++;
                            }
                            else if (i==p.length()-1 && s.charAt(i)==p.charAt(i-1)){
                                System.out.println("i==p.length()-1 && s.charAt(i)==p.charAt(i-1)");
                                return true;
                            }
                        }
                        else if(p.charAt(i)=='.'){
                            System.out.println("s.charAt(i)=='.'");
                            System.out.println("i = "+i+" \np("+i+") = "+p.charAt(i)+" \ns("+i+") = "+s.charAt(i));
                            if(i==p.length()-1){
                                System.out.println("i==p.length()-1");
                                return true;
                            }
                            else if(p.charAt(i+1)=='*'){
                                System.out.println("p.charAt(i+1)=='*'");
                                if(p.length()==i-1){
                                    System.out.println("p.length()==i-1");
                                    return true;
                                }
                                else{
                                    System.out.println("i++         p.length()==i-1");
                                    i++;
                                }
                            }
                            else
                                i++;
                           
                        }
                                                
                    }
                //}
            }    
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        System.out.println(isMatch(s,p));
    }
}


