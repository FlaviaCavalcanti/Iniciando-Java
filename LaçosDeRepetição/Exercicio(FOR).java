package ExerciciosJava;

public class ExercicioRepeticao {

	public static void main(String[] args) {
		 System.out.println("Números de 1000-1999, que divididos por 11, teve como resto 5:\n");
		for(int x=1000;x<=1999;x++) 
		{
			if (x%11==5) 
			{
				System.out.println(x);
			}
		}

	}

}
