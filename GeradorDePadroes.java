import java.util.Scanner;

class GeradorDePadroes{
	public static void main(String[] args){

		int opc = 0;

		



		while(opc != 6){
			

		System.out.println("MENU DE OPCOES");
		System.out.println("=============================");
		System.out.println("1 - padrao");
		System.out.println("2 - padrao");
		System.out.println("3 - padrao");
		System.out.println("4 - padrao");
		System.out.println("5 - padrao");
		System.out.println("6 - padrao");
		System.out.println("=============================");

		Scanner teclado = new Scanner(System.in);
		opc = teclado.nextInt();


			if(opc == 1){

				for(int i = 1; i <= 100; i++){
					if(i%2 == 0){
						System.out.println("**");
					}else{
						System.out.println("*");
					}
				}

			}else if(opc == 2){
					for(int i = 1; i <= 100; i++){
						if(i % 4 == 0){
							System.out.println("PI");
						}else{
							System.out.println(i);
						}
					}

			}else if(opc == 3){

					for(int i = 0; i < 4; i++){
						for(int j = 0; j <= i; j++){
							System.out.print("*");
						}
						System.out.println();
					}

			}else if(opc == 4){

				for(int contador = 0; contador < 5; contador++){
					for(int i = 0; i < 4; i++){
						for(int j = 0; j <= i; j++){
							System.out.print("*");
						}
						System.out.println();
					}
					System.out.println();
				}
			}else if(opc == 5){

					int primeiro = 0;
					int ultimo = 1;
					int soma = 0;

					System.out.print(primeiro + " " + ultimo + " ");

					for(int i = 0; i < 30; i++){
						soma = primeiro + ultimo;
						System.out.print(soma + " ");
						primeiro = ultimo;
						ultimo = soma;

					}

					System.out.println();



			}


		}	



	}
}