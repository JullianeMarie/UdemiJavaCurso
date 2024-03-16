public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

	int Hf = sc.nextInt(); 
	int Hi = sc.nextInt();
	int duracao;
		 
	if ( Hf > Hi) {
		duracao = Hf - Hi;	
			System.out.println(" O jogo durou " + duracao + " horas ");		
	}
	
	else if ( Hf < Hi) {
		duracao = ( 24 + Hf - Hi);
			System.out.println(" O jogo durou " + duracao + " horas ");
	}	

	else  		
			System.out.println(" O jogo durou 24 horas ");
	
		
	
	
sc.close();
		}	
	}

/*
CONSOLE:
0
0
O jogo durou 24 horas 
*/