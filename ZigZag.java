import java.util.*;
class ZigZag {
    public static String convert(String s, int numRows) {
        if(s.length()==1 || numRows==1)
            return s;
        String[] str=new String[numRows];
        for(int i=0;i<numRows;i++){
            str[i]="";
        }
        int index=0;
        for(int i=0;i<s.length();i=i+0){
            
            while(index<numRows-1 && index>=0 && i<s.length()){
                str[index]+=s.charAt(i);
                //System.out.println("i= "+i+" index = "+index);
                index++;
                i++;
            }
            while(index>0 && index<=numRows-1 && i<s.length()){
                str[index]+=s.charAt(i);
                //System.out.println("i= "+i+" index = "+index);
                index--;
                i++;
            }
        }
        String f= new String();
        for(int j=0;j<numRows;j++){
            //System.out.println(str[j]);
            f+=str[j];
        }
        //f.replaceAll("null", "");

            return f;
        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int numRows=sc.nextInt();
        System.out.println(convert(s,numRows));
    }
}