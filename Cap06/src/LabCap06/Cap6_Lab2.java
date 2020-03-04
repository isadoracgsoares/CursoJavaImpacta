package LabCap06;
public class Cap6_Lab2 {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println("Métodos subtrair sobrecarregados:\n");

		double resultado = calc.subtrair(6.2, 3.1); //(double,double)
		System.out.printf("%.2f \n\n",resultado);
		
		resultado = calc.subtrair(6.2, 2); // (double,int)
		System.out.printf("%.2f \n\n",resultado);
		
		resultado = calc.subtrair(3, 0.2); // (int,double)
		System.out.printf("%.2f \n",resultado);
		
	}

}
