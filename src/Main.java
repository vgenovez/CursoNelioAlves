import java.util.Locale;
import java.util.Scanner;

//Saída de dados em Java - Curso Nelio Alves
public class Main {
    public static void main(String[] args) {
        firstCodeCourse();
        castExample();
        usoDoScanner();
        funcoesMath();
    }

    public static void firstCodeCourse(){

        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.println(x);
        System.out.println(idade);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.printf("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
        System.out.println("Fim da funcao firstCodeCourse\n");
    }

    public static void castExample(){

        double a;
        int b;

        a = 5.0;
        b = (int) a;

        System.out.println(b);
        System.out.println("Fim da funcao castExample\n");
    }

    public static void usoDoScanner(){

        Scanner sc = new Scanner(System.in);

        int x;
        String s1,s2,s3;

        x = sc.nextInt();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados: ");
        sc.nextLine(); // para consumir a linha em branco e não bugar o println
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //x = sc.nextInt(); //digitar int

        //double x;
        //x = sc.nextDouble();

        //char x;
        //x = sc.next().charAt(0);

        //System.out.println("Voce digitou: " + x); 
        //System.out.printf("Voce digitou: %.2f%n" , x); //imprimir com a virgula

        sc.close();
    }

    public static void funcoesMath(){

        double x = 3.0;
        double y = 3.0;
        double z = 3.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

    }

}