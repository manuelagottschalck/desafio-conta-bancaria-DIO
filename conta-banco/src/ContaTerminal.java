import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia, nome;
        float saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, insira o número da agência:");
        agencia = scanner.next();

        System.out.println("Por favor, insira o número");
        numero = scanner.nextInt();

        scanner.nextLine(); ///adionado pois a classe scanner le uma nova linha como um caracter, com a classe adiconada neste ponto do codigo, ele lera o caracetr"\n"
    
        System.out.println("Por favor, digite seu nome completo");
        nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo de sua conta");
        saldo = scanner.nextFloat();
        
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
