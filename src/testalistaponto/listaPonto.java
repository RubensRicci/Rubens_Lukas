package testalistaponto;

// classe equivalente ao ArrayList
public class listaPonto {

    Ponto pontos[];
    Ponto NumePesquisado[] = new Ponto[1];
    private int validos;
    int posi, ResulPes;

    public listaPonto(int N) {
        this.pontos = new Ponto[N];
        this.validos = 0;
    }

    //passar para 
    void local(int posicao) {
        this.posi = posicao;
    }

    public void adiciona(Ponto p) {
        // testa se o vetor nao estah cheio
        if (this.validos < pontos.length) {
            // adiciona o ponto p no vetor de  pontos[]
            // ou seja, na primeira posicao disponivel no final do vetor
            this.pontos[this.validos++] = p;
        }
    }

    public void AddComPosi(Ponto p) {
        // testa se o vetor nao estah cheio
        if ((this.validos < pontos.length) && (this.posi <= this.validos)) {
            //recebe validos - 1
            int ValorDEi = validos - 1;
            //recebe validos +1
            //vai fazer o indice dos espacos disponiveis
            int Valor = validos++;
            //vai passar os numeros para frente
            for (int i = ValorDEi; i >= posi; i--) {
                this.pontos[Valor] = this.pontos[i];
                Valor--;
            }
            // adiciona o ponto p no vetor de  pontos[]
            // ou seja, na primeira posicao desejada no vetor
            this.pontos[posi] = p;
        }
    }

    public void pesquisa(Ponto p) {
        this.NumePesquisado[0] = p;
        this.ResulPes = -1;
        for (int k = 0; k < this.pontos.length; k++) {
            this.ResulPes = k;
            if (this.pontos[k] == this.NumePesquisado[0]) {
                this.ResulPes = 1;
                k = this.pontos.length;
            }
        }
    }

    public void removerVetor(Ponto p) {
        int posicao = p.getRemover();
        if (!(this.validos < pontos.length) && (this.posi <= this.validos)) {
            System.out.println("posicao invalida!");

        }

        for (int i = posicao; posicao < this.validos - 1; i++) {
            this.pontos[i] = this.pontos[i + 1];

            this.pontos[this.validos--] = p;
        }
    }

    public void imprime() {
        System.out.println();
        for (int i = 0; i < this.validos; i++) {
            Ponto aux = pontos[i];
            System.out.print("(" + aux.getX() + "," + aux.getY() + ") ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        String resposta = "\nContainer={";
        for (int i = 0; i < this.validos; i++) {
            resposta += pontos[i] + " ";
        }
        resposta += "}\n";
        return resposta;
    }

}
