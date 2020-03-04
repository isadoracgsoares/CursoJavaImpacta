
public class ExemploCasting {
	
	public static void main(String[] args) {
		
		byte a1 = 15;
		int a2 = a1; //promoção de tipos automatica
		System.out.println("a2 = " + a2);
		
		//int 32 bits e byte 8 bits
		int a3 = 20;
		byte a4 = (byte) a3; //rebaixamento (cast) explicito!
		System.out.println("a4 = " + a4);
		
		int a5 = 200;
		byte a6 = (byte) a5; //rebaixamento (cast) explicito!
		System.out.println("a6 = " + a6);
		
	}

}
