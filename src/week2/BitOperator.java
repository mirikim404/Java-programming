package week2;

public class BitOperator {
	public static void main(String[] args) {
		short a = 0x0011; // 2바이트 0000 0000 0001 0001
		short b = 0x1110; // 2바이트 0001 0001 0001 0000
		
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (a&b)); // 비트 AND
		System.out.printf("%04x\n", (a|b)); // 비트 OR
		System.out.printf("%04x\n", (a^b)); // 비트 XOR
		System.out.printf("%04x\n", (short)(~a)); // 비트 NOT 
		
		byte c = 20;
		byte d = -8;
		
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);
		System.out.printf("%x\n", (d>>>2));
		
	}

}
