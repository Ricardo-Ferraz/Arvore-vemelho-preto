package Arvore;

public class NoRN<T extends Comparable<T>>{
    private NoRN<T> esquerda;
    private NoRN<T> direita;
    private NoRN<T> pai;
    private boolean cor; // True = vermelho   ,  False = preto
    private T elemento;

    public NoRN(T carro){
        this.esquerda = null;
        this.direita = null;
        this.pai = null;
        this.cor = true;
        this.elemento = carro;
    }

    public NoRN<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoRN<T> esquerda) {
        this.esquerda = esquerda;
    }

    public NoRN<T> getDireita() {
        return direita;
    }

    public void setDireita(NoRN<T> direita) {
        this.direita = direita;
    }

    public NoRN<T> getPai() {
        return pai;
    }

    public void setPai(NoRN<T> pai) {
        this.pai = pai;
    }

    public boolean getCor() {
        return cor;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public int compareTo(T elemento){
        return this.elemento.compareTo(elemento);
    }

    @Override
    public String toString(){
        if(this.cor){
           return this.elemento.toString() + " / Cor: Vermelho";
        }
        else{
            return this.elemento.toString() + " / Cor: Preto";
        }
    }
}
