package Matriz;

public class Matriz2 {
    public static void main(String[] args) {
        Matriz m = new Matriz();
        m.criarMatriz(2, 2);
        m.preencherMatriz(null);
        m.imprimirMatriz();
        m.multiplicarCopiaMatrizPorConstate(2);
        m.imprimirMatriz();
        m.preencherMatrizTeclado(null);
    }
}
