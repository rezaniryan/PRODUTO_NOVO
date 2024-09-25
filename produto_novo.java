package teste;

import java.time.LocalDate;

public class produto_novo {

	    // classe atributos
	    private String nome;           
	    private double precoCusto;     
	    private double precoVenda;      
	    private LocalDate dataFabricacao; 
	    private LocalDate dataValidade;   

	    // ganha todos os atributos feitos a cima 
	    public produto_novo(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
	        this.nome = nome;                           
	        this.precoCusto = precoCusto;              
	        this.precoVenda = precoVenda;               
	        this.dataFabricacao = dataFabricacao;      
	        this.dataValidade = dataValidade;           
	    }

	    // recebe os nomes , precoCusto, precoVenda e tec
	    public produto_novo(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
	        this(nome, precoCusto, precoVenda, dataFabricacao, dataFabricacao.plusMonths(1)); // define a data de validade como 1 mes a pos a data de fabricacao
	    }

	    // recebe apenas nome e precoCusto
	    public produto_novo(String nome, double precoCusto) {
	        this(nome, precoCusto, precoCusto * 1.1, LocalDate.now()); // preço de venda é 10% maior que o custo e a data de fabricacao e a atual
	    }

	    // metodo toString
	    @Override
	    public String toString() {
	        return "Produto: " + nome + 
	               ", Preço Custo: " + precoCusto + 
	               ", Preço Venda: " + precoVenda + 
	               ", Data Fabricação: " + dataFabricacao + 
	               ", Data Validade: " + dataValidade;
	    }

	    // metodo para testar a classe (metodo main)
	    public static void main(String[] args) {
	        produto_novo produto1 = new produto_novo("Miojo", 2.59, 5.90, LocalDate.of(2023, 5, 18), LocalDate.of(2024, 7, 20));
	        produto_novo produto2 = new produto_novo("Farinha", 2.39, 7.50, LocalDate.of(2023, 1, 31));
	        produto_novo produto3 = new produto_novo("Ketchup", 5.0);

	        // mostra os produtos e suas informaçoes
	        System.out.println(produto1);
	        System.out.println(produto2);
	        System.out.println(produto3);
	    }
	}

	

