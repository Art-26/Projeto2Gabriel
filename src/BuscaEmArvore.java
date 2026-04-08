public class BuscaEmArvore {

    private static class No {
        int valor;
        No esquerdo, direito;

        No(int valor) {
            this.valor = valor;
        }
    }

    private No raiz;

    public void inserir(int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return;
        }

        No atual = raiz;
        while (true) {
            if (valor < atual.valor) {
                if (atual.esquerdo == null) {
                    atual.esquerdo = new No(valor);
                    return;
                }
                atual = atual.esquerdo;
            } else if (valor > atual.valor) {
                if (atual.direito == null) {
                    atual.direito = new No(valor);
                    return;
                }
                atual = atual.direito;
            } else {
                return;
            }
        }
    }

    public boolean buscar(int valor) {
        No atual = raiz;
        while (atual != null) {
            if (valor == atual.valor) return true;
            if (valor < atual.valor) atual = atual.esquerdo;
            else atual = atual.direito;
        }
        return false;
    }
}