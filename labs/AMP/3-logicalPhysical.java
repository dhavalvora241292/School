//Logical Address to Physical Address Translation
//Techmax Page 2-24 (2.6.3 onwards)
//Source - sjs7007

class logicalPhysical
{
	public static void main(String args[])
	{
		//System.out.println(randString());
		String selector="0000000000110001";
		String offset="0000000000000001";
		String indexIntoDesc=selector.substring(0,13); //extract 1st 13 bits
		System.out.println("Index : "+indexIntoDesc);
		int decimalIndex = Integer.parseInt(indexIntoDesc,2); //convert from binary to decimal
		System.out.println("Decimal Index : "+decimalIndex);
		String localTable[]=new String[10];
		String globalTable[]=new String[10];
		System.out.println("Local Table :-");
		for(int i=0;i<localTable.length;i++)
		{
			localTable[i]=randString();
			System.out.println(i+" "+localTable[i]);
		}
		System.out.println("Global Table :-");
		for(int i=0;i<globalTable .length;i++)
		{
			globalTable [i]=randString();
			System.out.println(i+" "+globalTable [i]);
		}
		//0-Global Table,1-local table
		String answer="",temp32RightBits="";
		if(selector.charAt(13)=='0')
		{
			System.out.println("Global descriptor.");
			temp32RightBits=globalTable[decimalIndex].substring(32,64);
		}
		else
		{
			System.out.println("Local descriptor");
			temp32RightBits=localTable[decimalIndex].substring(32,64);
		}
		System.out.println(temp32RightBits);
		answer = Long.toBinaryString(Long.parseLong(temp32RightBits,2)+Long.parseLong(offset,2));
		System.out.println("32-bit Physical Address : "+answer);
	}

	public static String randString() 		//generate a random binary string of 64 bits
	{
		String temp="";
		for(int i=0;i<64;i++)
		{
			temp = temp + Integer.toString((int)(Math.random()*100)%2);
		}
		return temp;
	}
}
/*
Index : 0000000000110
Decimal Index : 6
Local Table :-
0 0001101111111100011001100010000011100110000001110001001011001110
1 1011110110000001001010000111101111111100011111100011011111001001
2 0111111010000100001000110001000001110011110100100011000010001110
3 0010111111111100011011111000011110000000001101011000000000011000
4 0001101011110110001010010101111010000100111010100100110001111010
5 0110000010001101111011110010100000000001101111111110101000001100
6 0110101000000101010101010000000111000111010111000111010001011000
7 1011111110100111000101111111011110011100100100001100101010011110
8 1111000011100011100100101100001011100010010010101011000100010111
9 1011011110110111111101010100011111101111010000100111001000110100
Global Table :-
0 0001110110100101001111101000100010011000100111101101101101101000
1 1000001010000011100100010100010010110000100011111111010101101000
2 1110001110101111011110010100010000011101111001000111111001100101
3 0111100010101000011010000111000011011111010000111111100101110000
4 1000000011110010100100010100011110001101011010001111000111111101
5 0001100101110001011110110001100001111001010101010110001001101000
6 0100110111010001001100000010000101011110011000011100000101101101
7 1010100010000001110101100001101001000010100001111010000110111111
8 1000111000100111111111101010010000011000111000011101011001000101
9 1011001111111110011010000010101000000101110110000001101011111000
Global descriptor.
01011110011000011100000101101101
32-bit Physical Address : 1011110011000011100000101101110
 */
