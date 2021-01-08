import java.util.*;
class LengthOfLargestSubstrAtleast2 {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                if(hm.containsKey(s.substring(i,j))){
                    int v = hm.get(s.substring(i,j));
                    hm.replace(s.substring(i,j),v+1);
                }
                else if(hm.isEmpty()){
                    hm.put(s.substring(i,j), 1);
                }
                else{
                    hm.put(s.substring(i,j),1);
                }    
            }
        }
        int max=-1;
        String largestsubstr=new String();
        Integer count;
        for(Map.Entry<String, Integer> entry : hm.entrySet()) {
            String key = entry.getKey();
            count =  entry.getValue();
            int len =key.length();
            if(count>=2){
                if(len>max){
                    max=len;
                    largestsubstr=key;
                }
            }
            /*else{
                hm.remove(key);
            }*/
            
        }
        //System.out.println(Arrays.toString(hm.entrySet().toArray()));
        System.out.println(largestsubstr.length());
        
    }
}
