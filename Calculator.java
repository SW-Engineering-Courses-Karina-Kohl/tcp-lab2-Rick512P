import java.util.Scanner;

public class Calculator {
    public int somar(int num1, int num2){
        return num1+num2;
    }

    public int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public float dividir(float num1, float num2) {
        try{
            return num1/num2;
        } catch (ArithmeticException e){
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

    }

    public int multiplicar(int num1, int num2){
            return num1*num2;
    }

    public int Exponenciar(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        int resultado = calc.somar(num1, num2);
        System.out.println("Resultado soma: " + resultado);

        int resultado2 = calc.subtrair(num1, num2);
        System.out.println("Resultado subtração: " + resultado2);

        float resultado3 = calc.dividir(num1, num2);
        String DivPorZero = Float.toString(resultado3);
        if (DivPorZero.compareTo("Infinity") == 0 || DivPorZero.compareTo("NaN") == 0 ){
            System.out.println("Divisão por zero não é permitida.");
        }
        else {
            System.out.println("Resultado divisão: " + String.format("%.2f", resultado3));
        }

        int resultado4 = calc.multiplicar(num1, num2);
        System.out.println("Resultado multiplicação: " + resultado4);

        int resultado5 = calc.Exponenciar(num1, num2);
        System.out.println("Resultado Exponenciação: " + resultado5);
    }
}