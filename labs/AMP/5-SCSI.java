//SCSI Bus Simulation

package temp;

import java.io.*;

class SCSI {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        System.out.println("Enter no. of devices");
        int n = Integer.parseInt(br.readLine());
        int pri[] = new int[n] , max =0 ,maxp = 0 , bits = 0;
        System.out.println("Enter the Priorities ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter  Priorities for device  " + (i+1) +" :  " );
            pri[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            max = 0;
            for (int j = 0; j < n; j++) {
                if( max < pri[j]){ max = pri[j]; maxp = j;}
            }
            System.out.println("Arbitrating devce "+(maxp+1));
            System.out.println("Enter the no. of bits to be transmitted");
            bits = Integer.parseInt(br.readLine());
            System.out.println("Starting Transmission ....");
            for (int j = 0; j < bits; j++) {
                System.out.print( j +"  ");
            }
            System.out.println("Transmission Completed ");
            pri[maxp] = -1;
            System.out.println("The modified priorities of devices .. ");
            for (int j = 0; j < n; j++) {
                System.out.println("Device "+ (j+1) +" :  " +pri[j]);
            }            
        }
    }
}
/*
 Enter no. of devices
3
Enter the Priorities 
Enter  Priorities for device  1 :  5
Enter  Priorities for device  2 :  1
Enter  Priorities for device  3 :  3
Arbitrating devce 1
Enter the no. of bits to be transmitted
3
Starting Transmission ....
0  1  2  Transmission Completed 
The modified priorities of devices .. 
Device 1 :  -1
Device 2 :  1
Device 3 :  3
Arbitrating devce 3
Enter the no. of bits to be transmitted
5
Starting Transmission ....
0  1  2  3  4  Transmission Completed 
The modified priorities of devices .. 
Device 1 :  -1
Device 2 :  1
Device 3 :  -1
Arbitrating devce 2
Enter the no. of bits to be transmitted
8
Starting Transmission ....
0  1  2  3  4  5  6  7  Transmission Completed 
The modified priorities of devices .. 
Device 1 :  -1
Device 2 :  -1
Device 3 :  -1
 
 */