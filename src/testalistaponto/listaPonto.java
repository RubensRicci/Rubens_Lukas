package testalistaponto;
// Autores
// Rubens L. Ricci
// Lucas Matias

// classe equivalente ao ArrayList
public class listaPonto {

    private Ponto pontos[];
    private int[] X, Y;
    private int validos;
    //é responsavel por receber o resultado das funções pesquisa, removerVetor e CalculaDistância
    String Resultado;

    public listaPonto(int N) {
        this.pontos = new Ponto[N];
        this.X = new int[N];
        this.Y = new int[N];
        this.validos = 0;
    }

    public void adiciona(Ponto p) {
        // testa se o vetor nao estah cheio
        if (this.validos < pontos.length) {
            // adiciona o ponto p no vetor de  pontos[]
            // ou seja, na primeira posicao disponivel no final do vetor
            this.X[this.validos] = p.getX();
            this.Y[this.validos] = p.getY();
            this.pontos[this.validos++] = p;
        }
    }

    public void AddComPosi(Ponto p, int posi) {
        // testa se o vetor nao estah cheio
        if ((this.validos < pontos.length) && (posi <= this.validos)) {
            //recebe validos - 1
            int ValorDEi = validos - 1;
            //recebe validos +1
            //vai fazer o indice dos espacos disponiveis
            int Valor = validos++;
            //vai passar os numeros para frente
            for (int i = ValorDEi; i >= posi; i--) {
                this.pontos[Valor] = this.pontos[i];
                this.X[Valor] = this.X[i];
                this.Y[Valor] = this.Y[i];
                Valor--;
            }
            // adiciona o ponto p no vetor de  pontos[]
            // ou seja, na primeira posicao desejada no vetor
            this.pontos[posi] = p;
        }
    }

    public void pesquisa(Ponto p) {
        String b = p.toString();
        this.Resultado = "-1";
        for (int k = 0; k < this.validos; k++) {
            String a = this.pontos[k].toString();
            if (a.equals(b)) {
                this.Resultado = "\nposição : " + k + "\n";
            }
        }
    }

    public void removerVetor(int posi) {
        
        if ((this.validos > pontos.length) && (posi > this.validos)) {
            Resultado = "posicao invalida!";

        } else {
            for (int i = posi; i < this.validos - 1; i++) {
                this.pontos[i] = this.pontos[i + 1];
                this.X[i] = this.X[i + 1];
                this.Y[i] = this.Y[i + 1];
            }
            validos--;
        }
    }
    
    public void CalculaDistância(){
        int[] a = new int [2];
        float maior = 0,resultado;;
        for (int i = 0; i < validos; i++) {
            for (int t = 0; t < validos; t++) {
                if (i != t) {
                resultado = ((this.X[i] - this.X[t]) *(this.X[i] - this.X[t])) + ((this.Y[i] - this.Y[t]) * (this.Y[i] - this.Y[t]));
                resultado = (float) Math.sqrt(resultado);
                if ((resultado > maior) || (i == 0 && t == 1)) {
                    maior = resultado;
                    a[0] = i;
                    a[1] = t;
                }
                }
            }
        }
        this.Resultado = ("maior distancia é de  "+maior+"\n entre os pontos ["+pontos[a[0]]+"] e ["+pontos[a[1]]+"]");
    }
    
    public void circunferencia(Ponto p, float raio){
    int x, y;
    float raiz;
    boolean circu;
    x = p.getX();
    y = p.getY();
    Resultado = "os pontos: ";
            for (int t = 0; t < validos; t++) {
                raiz = ((x - this.X[t]) *(x - this.X[t])) + ((y - this.Y[t]) * (y - this.Y[t]));
                raiz = (float) Math.sqrt(raiz);
                circu = raiz <= raio;
                if (circu == true) {
                    Resultado += pontos[t];
                }
                    
            }
            Resultado += " estão dentro da circufarencia";
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
