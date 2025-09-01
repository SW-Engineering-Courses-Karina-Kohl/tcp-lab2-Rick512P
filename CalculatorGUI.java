import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class CalculatorGUI {
    public String Operacao = "";
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        JPanel panel = new JPanel();

        JTextField campoNum1 = new JTextField(10);
        JTextField campoNum2 = new JTextField(10);
        JButton botaoSomar = new JButton("Somar");
        JButton botaoSubtrair = new JButton("Subtrair");
        JButton botaoDividir = new JButton("Dividir");
        JButton botaoMultiplicar = new JButton("Multiplicar");
        JButton botaoExponenciar = new JButton("Exponenciação");
        JLabel labelResultado = new JLabel("Resultado: ");
        JLabel labelOperacao = new JLabel("");

        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    Calculator calc = new Calculator();
                    int resultado = calc.somar(num1, num2);
                    labelOperacao.setText("+");
                    labelResultado.setText("Resultado: " + resultado);
            }
        });

        botaoSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(campoNum1.getText());
                int num2 = Integer.parseInt(campoNum2.getText());
                Calculator calc = new Calculator();
                int resultado2 = calc.subtrair(num1, num2);
                labelOperacao.setText("-");
                labelResultado.setText("Resultado: " + resultado2);
            }
        });

        botaoMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(campoNum1.getText());
                int num2 = Integer.parseInt(campoNum2.getText());
                Calculator calc = new Calculator();
                int resultado3 = calc.multiplicar(num1, num2);
                labelOperacao.setText("*");
                labelResultado.setText("Resultado: " + resultado3);
            }
        });

        botaoDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelOperacao.setText("/");
                try {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    Calculator calc = new Calculator();
                    float resultado4 = calc.dividir(num1, num2);
                    String DivPorZero = Float.toString(resultado4);
                    if (DivPorZero.compareTo("Infinity") == 0 || DivPorZero.compareTo("NaN") == 0 ){
                        labelResultado.setText("Resultado: Error");
                    }
                    else {
                        labelResultado.setText("Resultado: " + String.format("%.2f", resultado4));
                    }
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Error");
                }
            }
        });

        botaoExponenciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(campoNum1.getText());
                int num2 = Integer.parseInt(campoNum2.getText());
                Calculator calc = new Calculator();
                int resultado5 = calc.Exponenciar(num1, num2);
                labelOperacao.setText("^");
                labelResultado.setText("Resultado: " + resultado5);
            }
        });
        
        panel.add(campoNum1);
        panel.add(labelOperacao);
        panel.add(campoNum2);
        panel.add(botaoSomar);
        panel.add(botaoSubtrair);
        panel.add(botaoMultiplicar);
        panel.add(botaoDividir);
        panel.add(botaoExponenciar);
        panel.add(labelResultado);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}