//Cache Memory
// Source - internet blog

import java.util.*;

class LRUExp {
    public static int min(int[] x)
    {
        int min=x[0],i,pos=0;
        for(i=1;i<x.length;i++)
            if(min>x[i])
            {
                min=x[i];
                pos=i;
            }
            return pos;
    }
    
    public static boolean contains(int[]a,int x)
    {
        for(int i=0;i<a.length;i++)
            if(a[i]==x)
                return true;
            return false;
    }

    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);

        int count[]=new int[4];
        int a[]=new int[16];
        int b[]=new int[4];
        int m=0,i;
        System.out.print("Enter 16 elements:");
        for(i=0;i<16;i++)
            a[i]=src.nextInt();
        int f=1; //counter
        int g=0;

        for(i=0;i<4;i++)
        {
            b[i]=a[i];
            count[i]=f++;
        }

        for(int j=0;j<16;j++)
        {
            g=0;
            for(i=0;i<4;i++)
                if(b[i]==a[j]) //Page already presnt in cache
                {
                    System.out.print("\nPage Hit!\n");
                    count[i]=f++;
                    g=0;
                    break;
                }
                else
                g=1;
            if(g==1) // Page miss
            {
                System.out.print("\nPage Miss\n");
                m=min(count);
                System.out.print("\nPage "+b[m]+" replaced by "+a[j]+"\n");
                //m is INDEX of element which is least recently used
                b[m]=a[j];
                count[m]=f++;
            }
        }
    }
}