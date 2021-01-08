import java.util.*;
/*
You will be given the matrix of size R*C,
You have to return the matrix in special order as shown in the sample tescases.
 
Input Format:
-------------
Line-1 -> Two integers R and C, size of matrix.
Next R-Lines -> C space separated integers
Output Format:
--------------
Print R-Lines -> C space separated integers, in special order.
Sample Input-1:
---------------
3 3
1 2 3
4 5 6
7 8 9
Sample Output-1:
----------------
1 2 3
6 9 8
7 4 5
Sample Input-2:
---------------
3 4
1 2 3 4
5 6 7 8
9 10 11 12
Sample Output-2:
----------------
1 2 3 4
8 12 11 10
9 5 6 7
 */
class SpiralMatrix{
    public static void right(int[][] m,boolean[][] flag,int cr,int cc,int row,int col, ArrayList<Integer> al){
        System.out.println();
        for(int i=0;i<col;i++){
            if(flag[cr][i]== false) {
                al.add(m[cr][i]);
                flag[cr][i]=true;
                cc=i;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(flag[i][j]==false)
                    down(m,flag,cr,cc,row,col,al);
            }
        }
    }
    public static void down(int[][] m,boolean[][] flag,int cr,int cc,int row,int col, ArrayList<Integer> al){
        System.out.println();
        for(int i=cr+1;i<row;i++){
            if(flag[i][cc]==false){
                al.add(m[i][cc]);
                flag[i][cc]=true;
                cr=i;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(flag[i][j]==false)
                    left(m,flag,cr,cc,row,col,al);
            }
        }
    }
    public static void left(int[][] m,boolean[][] flag,int cr,int cc,int row,int col, ArrayList<Integer> al){
        System.out.println();
        for(int i=cc-1;i>=0;i--){
            if(flag[cr][i]==false){
                al.add(m[cr][i]);
                flag[cr][i]=true;
                cc=i;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(flag[i][j]==false)
                    up(m,flag,cr,cc,row,col,al);
            }
        }
    }
    public static void up(int[][] m,boolean[][] flag,int cr,int cc,int row,int col, ArrayList<Integer> al){
        System.out.println();
        for(int i=cr-1;i>=0;i--){
            if(flag[i][cc]==false){
                al.add(m[i][cc]);
                flag[i][cc]=true;
                cr=i;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(flag[i][j]==false)
                    right(m,flag,cr,cc,row,col,al);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] m=new int[row][col];
        boolean[][] flag=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m[i][j]=sc.nextInt();
                flag[i][j]=false;
            }
        }
        int cr=0,cc=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        right(m,flag,cr,cc,row,col,al);  
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(al.get(i*col+j)+" ");
            }
            System.out.println();
        }

    }
}