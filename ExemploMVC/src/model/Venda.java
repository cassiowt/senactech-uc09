package model;

public class Venda {
    private Produto produto;
    private Cliente cliente;
    private int quantidade;
    
    public Venda() {
    }

    public Venda(Produto produto, Cliente cliente, int quantidade) {
        this.produto = produto;
        this.cliente = cliente;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Venda [produto=" + produto + ", cliente=" + cliente + ", quantidade=" + quantidade + "]";
    }

    

}
