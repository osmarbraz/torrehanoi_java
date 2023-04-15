
import javax.swing.JOptionPane;

public class Principal {

    /**
     * Método principal.
     * 
     * @param args 
     */
    public static void main(String args[]) {
        //Leitura da quantidade de discos. O valor default é 3.
        int numeroDiscos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de disco da primeira torre:", "3"));
        //Exibe a sequência de ações para mover os discos da origem para o destino.
        System.out.println("Sequência de ações para " + numeroDiscos + " discos:");
        jogar(numeroDiscos, 'A', 'B', 'C');
    }

    /**
     * Método recursivo para mostrar a sequência de ações.
     *
     * Exibe a sequência de ações para mover os discos do pino origem para o
     * pino de destino. Utiliza o pino do meio(auxiliar) para realizar as ações.
     *
     * @param numeroDiscos Quantidade de discos a serem movidos.
     * @param origem Nome do pino de origem.
     * @param meio Nome do pino de auxiliar.
     * @param destino Nome do pino de destino.
     */
    public static void jogar(int numeroDiscos, char origem, char meio, char destino) {
        //Se existe somente um disco move da origem para o destino
        if (numeroDiscos == 1) {
            System.out.println("Disco 1 de " + origem + " para " + destino);
        } else {
            //Move o disco da origem para o meio
            jogar(numeroDiscos - 1, origem, destino, meio);
            //Mostra a ação de mover o disco da origem para o destino
            System.out.println("Disco " + numeroDiscos + " de " + origem + " para " + destino);
            //Move o disco do meio para o destino
            jogar(numeroDiscos - 1, meio, origem, destino);
        }
    }
}
