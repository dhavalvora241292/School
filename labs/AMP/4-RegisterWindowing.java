//SUN SPARC Register WIndowing

package temp;

import java.io.*;

class RegisterWindowing {

    public static void main(String[] args) throws IOException {
        int[] ins = new int[8], outs = new int[8], locals = new int[8];
        int counter = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            ins[i] = (int) (Math.random() * 100);
            outs[i] = (int) (Math.random() * 100);
            locals[i] = (int) (Math.random() * 100);
        }
        System.out.println("Register Window Generated .... ");
        System.out.print("\n ins = { ");
        for (int i = 0; i < 7; i++) {
            System.out.print(ins[i] + " , ");
        }
        System.out.print(ins[7] + " }\n outs = { ");
        for (int i = 0; i < 7; i++) {
            System.out.print(outs[i] + " , ");
        }
        System.out.print(outs[7] + " }\n locals = { ");
        for (int i = 0; i < 7; i++) {
            System.out.print(ins[i] + " , ");
        }
        System.out.print(locals[7] + " }");
        System.out.println("\nDo you want to pass parameters from outs to ins ?[y/n]");
        while (br.readLine().equals("y")) {
            counter++;
            if(counter == 7){System.out.println("Register FULL GO HOME");System.exit(0);}
            for (int i = 0; i < 8; i++) {
                ins[i] = outs[i];
            }
            System.out.println("\nRegister Window Generated .... ");
            System.out.print("\n ins = { ");
            for (int i = 0; i < 7; i++) {
                System.out.print(ins[i] + " , ");
            }
            System.out.print(ins[7] + " }");
            for (int i = 0; i < 8; i++) {
                outs[i] = (int) (Math.random() * 100);
                locals[i] = (int) (Math.random() * 100);
            }
            System.out.print("\n outs = { ");
            for (int i = 0; i < 7; i++) {
                System.out.print(outs[i] + " , ");
            }
            System.out.print(outs[7] + " }\n locals = { ");
            for (int i = 0; i < 7; i++) {
                System.out.print(ins[i] + " , ");
            }
            System.out.print(locals[7] + " }");
            System.out.println("\nDo you want to pass parameters from outs to ins ?[y/n]");
        }

    }
}
/*
 Register Window Generated .... 

 ins = { 5 , 14 , 64 , 42 , 76 , 56 , 59 , 14 }
 outs = { 21 , 40 , 89 , 97 , 47 , 68 , 44 , 10 }
 locals = { 5 , 14 , 64 , 42 , 76 , 56 , 59 , 99 }
Do you want to pass parameters from outs to ins ?[y/n]
y

Register Window Generated .... 

 ins = { 21 , 40 , 89 , 97 , 47 , 68 , 44 , 10 }
 outs = { 47 , 25 , 74 , 81 , 80 , 4 , 25 , 91 }
 locals = { 21 , 40 , 89 , 97 , 47 , 68 , 44 , 14 }
Do you want to pass parameters from outs to ins ?[y/n]
y

Register Window Generated .... 

 ins = { 47 , 25 , 74 , 81 , 80 , 4 , 25 , 91 }
 outs = { 29 , 20 , 99 , 8 , 13 , 56 , 93 , 68 }
 locals = { 47 , 25 , 74 , 81 , 80 , 4 , 25 , 6 }
Do you want to pass parameters from outs to ins ?[y/n]
y

Register Window Generated .... 

 ins = { 29 , 20 , 99 , 8 , 13 , 56 , 93 , 68 }
 outs = { 87 , 82 , 0 , 56 , 52 , 54 , 8 , 45 }
 locals = { 29 , 20 , 99 , 8 , 13 , 56 , 93 , 47 }
Do you want to pass parameters from outs to ins ?[y/n]
y

Register Window Generated .... 

 ins = { 87 , 82 , 0 , 56 , 52 , 54 , 8 , 45 }
 outs = { 38 , 75 , 61 , 10 , 31 , 43 , 46 , 48 }
 locals = { 87 , 82 , 0 , 56 , 52 , 54 , 8 , 19 }
Do you want to pass parameters from outs to ins ?[y/n]
y

Register Window Generated .... 

 ins = { 38 , 75 , 61 , 10 , 31 , 43 , 46 , 48 }
 outs = { 29 , 32 , 22 , 61 , 43 , 75 , 9 , 91 }
 locals = { 38 , 75 , 61 , 10 , 31 , 43 , 46 , 86 }
Do you want to pass parameters from outs to ins ?[y/n]
y

Register Window Generated .... 

 ins = { 29 , 32 , 22 , 61 , 43 , 75 , 9 , 91 }
 outs = { 94 , 59 , 1 , 23 , 54 , 29 , 67 , 67 }
 locals = { 29 , 32 , 22 , 61 , 43 , 75 , 9 , 91 }
Do you want to pass parameters from outs to ins ?[y/n]
y
Register FULL GO HOME
 
 */