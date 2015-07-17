class Fibonacci{
	public static void main(String[] args){
		int anterior = 0;
		int proximo = 1;
		int soma = 0;

		System.out.print(anterior + " " + proximo+ " ");

		for(int i = 0; i < 30; i++){


			soma = anterior + proximo;
			System.out.print(soma + " ");
			anterior = proximo;
			proximo=soma;
			
			

		}


	}
}