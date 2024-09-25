package produto;

// Classe que representa um produto e calcula seu lucro
class Lucro {

    private String nome; // Nome do produto
    private String marca; // Marca do produto
    private double precoCusto; // Preço de custo do produto
    private double precoVenda; // Preço de venda do produto
    private double lucro; // Lucro calculado do produto

    // Construtor da classe Lucro que inicializa os atributos
    public Lucro(String nome, String marca, double precoCusto, double precoVenda, double lucro) {
        this.nome = nome; // Inicializa o nome
        this.marca = marca; // Inicializa a marca
        this.precoCusto = precoCusto; // Inicializa o preço de custo
        this.precoVenda = precoVenda; // Inicializa o preço de venda
        this.lucro = lucro; // Inicializa o lucro (pode ser calculado depois)
    }

    // Métodos getter e setter para acessar e modificar os atributos

    public String getNome() {
        return nome; // Retorna o nome do produto
    }

    public void setNome(String nome) {
        nome = nome; // Define um novo nome para o produto
    }

    public String getMarca() {
        return marca; // Retorna a marca do produto
    }

    public void setMarca(String marca) {
        marca = marca; // Define uma nova marca para o produto
    }

    public double getPrecoCusto() {
        return precoCusto; // Retorna o preço de custo
    }

    public void setPrecoCusto(double precoCusto) {
        precoCusto = precoCusto; // Define um novo preço de custo
    }

    public double getPrecoVenda() {
        return precoVenda; // Retorna o preço de venda
    }

    public void setPrecoVenda(double precoVenda) {
        precoVenda = precoVenda; // Define um novo preço de venda
    }

    public double getLucro() {
        return lucro; // Retorna o lucro calculado
    }

    // Método que calcula e atualiza o lucro com base nos preços
    public void setLucro() {
        lucro = precoVenda - precoCusto; // Calcula o lucro
    }
}

// Classe principal que contém o método main
public class Produto {
    public static void main(String[] args) {

        // Cria um novo objeto Lucro para um produto específico
        Lucro lucro = new Lucro("Refrigerante", "Pepsi", 1.20, 5.99, 0);

        // Calcula o lucro do produto
        lucro.setLucro();

        // Exibe as informações do produto no console
        System.out.println(
                "\n\nNome: " + lucro.getNome() +
                        "\nMarca: " + lucro.getMarca() +
                        "\nPreço de Custo: R$" + lucro.getPrecoCusto() +
                        "\nPreço de Venda: R$" + lucro.getPrecoVenda() +
                        "\n\nLucro sobre o Produto: R$" + lucro.getLucro());
    }
}
