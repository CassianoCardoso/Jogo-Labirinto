import java.io.Console;
import java.util.Scanner;

public class Labirinto {
// criando a matriz 8 linhas 16 colunas
	static String[][] labirinto = new String[][] {
			{ "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" },
			{ "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" },
			{ "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" },
			{ "#", " ", " ", " ", " ", " ", " ", "#", "#", "#", "#", "#", " ", " ", " ", "#" },
			{ "#", " ", "#", "#", "#", "#", " ", "#", "#", "#", "#", "#", " ", "#", " ", "#" },
			{ "#", " ", "#", "#", "#", "#", " ", " ", " ", " ", " ", " ", " ", "#", " ", "F" },
/*linha 6*/	{ "#", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" },
			{ "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" }, };

	// onde inicia o jogador = &
	static String jogador = "&";
	static int posLinha = 6;
	static int posColuna = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean fimDeJogo = false;
		labirinto[6][1] = jogador; //mostra o jogador no labirinto

		
		
		
		while (!fimDeJogo) { // faz ficar repetindo o labirinto enquanto ele for falso
			
			
			// linhas
			for (int linha = 0; linha < 8; linha++) { 
				
				// colunas
				for (int coluna = 0; coluna < 16; coluna++) {

					System.out.print(labirinto[linha][coluna]);  // exibir o labirinto
				}
				System.out.println();
			}
			System.out.println("Para qual posição deseja ir? Letra *Maiuscula* ");
			System.out.println(" W = Cima ");
			System.out.println(" A = Esquerda ");
			System.out.println(" S = Baixo ");
			System.out.println(" D = Direita ");
			System.out.println();
			
			// pega a letra para o comando
			System.out.println(" Meu comando é: ");
			char comando = sc.nextLine().charAt(0); //comando pra pegar a letra digitada
			// Instruções do comando subir
			if (comando == 'W') {
				if (labirinto[posLinha - 1][posColuna] != "#") { // ele sobe uma linha = pos 6-1 =5 linha
					labirinto[posLinha][posColuna] = " ";
					posLinha--;
				}
			}
			// Instruções do comando Esquerda
			else if (comando == 'A') {
				if (labirinto[posLinha][posColuna - 1] != "#") { // volta uma coluna 
					labirinto[posLinha][posColuna] = " ";
					posColuna--;
				}
				// Instruções para baixo
			} else if (comando == 'S') {
				if (labirinto[posLinha + 1][posColuna] != "#") { //desce uma linha 
					labirinto[posLinha][posColuna] = " ";
					posLinha++;
				}
				// Instruções  direita
			} else if (comando == 'D') {
				if (labirinto[posLinha][posColuna + 1] != "#") { // soma uma coluna 
					labirinto[posLinha][posColuna] = " ";
					posColuna++;
				}
			}
			labirinto[posLinha][posColuna] = jogador;
			
		}
		
	}
	
}
