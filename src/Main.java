import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Calculadora Simples
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        double resultado;
        switch (operador) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = num2 != 0 ? num1 / num2 : Double.NaN; break;
            default: resultado = Double.NaN;
        }
        System.out.println("Resultado: " + resultado);

        // 2. Verifica Palíndromo
        System.out.println("Digite uma palavra:");
        String palavra = scanner.next().toLowerCase();
        String invertida = new StringBuilder(palavra).reverse().toString();
        System.out.println(palavra.equals(invertida) ? "É um palíndromo!" : "Não é um palíndromo.");

        // 3. Sequência de Fibonacci
        System.out.println("Quantos números da sequência de Fibonacci deseja ver?");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
        System.out.println();

        // 4. Número invertido
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        String invertido = new StringBuilder(String.valueOf(numero)).reverse().toString();
        System.out.println("Número invertido: " + invertido);

        // 5. Verifica Anagrama
        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.next().toLowerCase();
        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.next().toLowerCase();

        char[] arr1 = palavra1.toCharArray();
        char[] arr2 = palavra2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2) ? "São anagramas!" : "Não são anagramas.");

        // 6. Jogo de adivinhação
        Random random = new Random();
        int numeroAleatorio = random.nextInt(50) + 1;
        int tentativa;

        do {
            System.out.println("Adivinhe um número entre 1 e 50:");
            tentativa = scanner.nextInt();
            if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou.");
            } else {
                System.out.println("Errado, tente novamente!");
            }
        } while (tentativa != numeroAleatorio);

        // 7. Contador de palavras em uma frase
        scanner.nextLine(); // Consumir quebra de linha pendente
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        String[] palavras = frase.trim().split("\\s+");
        System.out.println("Número de palavras: " + palavras.length);
    }
}
