package principal;/*
 Esse programa foi feito por Wanessa Santos em 22 de Julho de 2022.
 O desafio é criar um "Sistema de Login" que verifique se os dados inseridos pelo usuário estão corretos
 para ceder o acesso.
*/

import static javax.swing.JOptionPane.*;

public class fMain {
    public static void main(String[] args) { // Pricipal, é como se fosse o index do html, essa que busca as demais

        final String USERNAME_VERDADEIRO = "Wanessa"; // final significa constante, ou seja, nunca muda
        final String PASS_VERDADEIRO = "12345678"; // Password genérico

        for (int i = 1; i <= 3; i++){  // Estrutura de repetição para que haja apenas 3 repetições

            // Inputs do USER
            String nome = showInputDialog(null, "Digite seu nome: ");
            String sobre = showInputDialog(null, "Digite seu sobrenome: ");

            //Verificação: se o nome inputado é igual ao armazendo na constante
            if (nome.equals(USERNAME_VERDADEIRO) & sobre.equals(PASS_VERDADEIRO)){
                System.out.println("Acesso concedido!"); // retorno no console
                showMessageDialog(null, "Acesso Concedido!"); // retorno da janelinha do user
                break; // Para sair do laço for
            }

            else { // Se o lo
                System.out.println("Acesso Negado!");
                showMessageDialog(null, "Acesso Negado!\nTentativa: " + i);
                if (i == 3){
                    showMessageDialog(null, "ACESSO BLOQUEADO! ");
                }
            }
        }
    }
}
