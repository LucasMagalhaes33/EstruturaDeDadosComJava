

public class VetorTest {

    private String[] elementos;
    private int tamanho;

    public VetorTest(int capacidade){
        this.elementos = new String[capacidade];
    }

    public boolean adiciona(String elemento){
        if (tamanho < this.elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

}
