import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Encomenda {
    public static final int CAPACIDADE_INICIAL = 10;
    private String nome;
    private int nif;
    private String morada;
    private int n_encomenda;
    private LocalDate data_encomenda;
    private int capacidade;
    private int ocupacao; // ocupacao == index
    private List<LinhaEncomenda> linhas_encomenda;

    public Encomenda() {
        this.nome = "n/a";
        this.nif = 000000000;
        this.morada = "n/a";
        this.n_encomenda = 0;
        this.data_encomenda = LocalDate.now();
        this.linhas_encomenda = new ArrayList<>();
    }

    public Encomenda(String nome, int nif, String morada, int n_encomenda,
                     LocalDate data_encomenda, List<LinhaEncomenda> linhas_encomenda){
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.n_encomenda = n_encomenda;
        this.data_encomenda = data_encomenda;
        this.linhas_encomenda = this.linhas_encomenda.stream().map(i -> i.clone()).collect(Collectors.toList());;
    }

    public Encomenda(Encomenda encomenda) {
        this.nome = encomenda.getNome();
        this.nif = encomenda.getNIF();
        this.morada = encomenda.getMorada();
        this.n_encomenda = encomenda.getNEncomenda();
        this.data_encomenda = encomenda.getData();
        this.linhas_encomenda = encomenda.getLinhas();
    }

    public String getNome(){
        return nome;
    }
    public int getNIF(){
        return nif;
    }

    public String getMorada(){
        return morada;
    }

    public int getNEncomenda(){
        return n_encomenda;
    }

    public LocalDate getData(){
        return data_encomenda;
    }
    public int getCapacidade(){
        return capacidade;
    }

    public int getOcup(){
        return ocupacao;
    }

    public List<LinhaEncomenda> getLinhas() {
        return this.linhas_encomenda.stream().map(i -> i.clone()).collect(Collectors.toList());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setN_encomenda(int n_encomenda) {
        this.n_encomenda = n_encomenda;
    }

    public void setData_encomenda(LocalDate data_encomenda) {
        this.data_encomenda = data_encomenda;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setOcupacao(int ocupacao) {
        this.ocupacao = ocupacao;
    }

    public void setLinhas_encomenda(List<LinhaEncomenda> linhas_encomenda) {
        this.linhas_encomenda = linhas_encomenda;
    }

    public void adicionaLinha(LinhaEncomenda linha) {
        this.linhas_encomenda.add(linha.clone());
    }

    public void removeProduto(String referencia){

        for(int i = 0; i < this.linhas_encomenda.size(); i++) {
            LinhaEncomenda linha = this.linhas_encomenda.get(i);
            if(linha.getReferencia().equals(referencia)){
                this.linhas_encomenda.remove(i);
            } else break;
        }
    }
}
