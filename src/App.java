import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //declaração de variaveis
        String nome;
        int idade;
        String cpf;
        String email;
        float salario;
        char sexo;

        //atribuição de variaveis
        /*nome = "1 2 3 da Silva 4";
        idade = 40;
        cpf = "111112222333";
        email = "123@gmail.com";
        salario = 2500.00f;
        sexo = 'M';*/

        //Entrada de dados via teclado - Scancer
        /*Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US); // setar o locale
        //comando next() le o dado informado via teclado até encontrar um espaço
        System.out.println("Digite seu nome: ");
        //nome = leitor.next();
        nome = leitor.nextLine();
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite seu cpf: ");
        cpf = leitor.nextLine();
        System.out.println("Digite seu e-mail: ");
        email = leitor.nextLine();
        System.out.println("Digite seu salario: ");
        salario = leitor.nextFloat();
        System.out.println("Digite seu Sexo: ");
        sexo = (leitor.next()).charAt(0);  
        */
        
        //Entrada de dados via interface
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String temp = JOptionPane.showInputDialog(null, "Digite a idade:", "Idade", JOptionPane.QUESTION_MESSAGE);
        idade = Integer.parseInt(temp);
        cpf = JOptionPane.showInputDialog(null, "Digite o seu CPF:", "CPF", JOptionPane.QUESTION_MESSAGE);
        email = JOptionPane.showInputDialog(null, "Digite o seu e-mail:", "E-mail", JOptionPane.QUESTION_MESSAGE);        
        temp = JOptionPane.showInputDialog(null, "Digite o Salario:", "Salario", JOptionPane.QUESTION_MESSAGE);
        salario = Float.parseFloat(temp);
        temp = JOptionPane.showInputDialog(null, "Digite o sexo:", "Sexo", JOptionPane.QUESTION_MESSAGE);
        sexo =  temp.toString().trim().charAt(0);
        //int -> Interger
        //float -> Float
        //double -> Double        
        //imprimiu as variaveis
        //System.out.println("Nome: "+ nome);
        JOptionPane.showMessageDialog(null, "Nome: "+ nome, "Nome", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Idade: "+ idade);
        JOptionPane.showMessageDialog(null, "Idade: "+ idade, "Idade", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("CPF: "+ cpf);
        System.out.println("E-mail: "+ email);
        System.out.println("Salario: "+ salario);
        System.out.println("Sexo: "+ sexo);

    }
}
