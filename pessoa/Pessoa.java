package pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// A classe gPessoa representa uma pessoa, contendo informações como nome, sobrenome, data de nascimento, altura e email.
class gPessoa {
    // Atributos privados para armazenar as informações da pessoa.
    private String nome;
    private String sobrenome;
    private Date dataNasc;
    private double altura; // A altura é armazenada em metros.
    private String email;

    // Construtor que inicializa os atributos da classe, convertendo a altura de
    // centímetros para metros e o email para minúsculas.
    public gPessoa(String nome, String sobrenome, Date dataNasc, double altura, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.altura = altura / 100;
        this.email = email.toLowerCase();
    }

    // Método que retorna o nome completo da pessoa concatenando o nome e sobrenome.
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    // Métodos para atualizar o nome e sobrenome da pessoa.
    public void setNomeCompleto(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Método que retorna a data de nascimento da pessoa.
    public Date getDataNasc() {
        return dataNasc;
    }

    // Método que atualiza a data de nascimento, garantindo que não seja uma data
    // futura.
    public void setDataNasc(Date dataNasc) {
        if (dataNasc.after(new Date())) {
            System.out.println("Data inválida. A data de nascimento não pode ser posterior à data atual.");
        } else {
            this.dataNasc = dataNasc; // Atualiza a data se for válida.
        }
    }

    // Método que retorna a altura em metros.
    public double getAltura() {
        return altura;
    }

    // Método que atualiza a altura, convertendo de centímetros para metros.
    public void setAltura(double altura) {
        this.altura = altura / 100;
    }

    // Método que retorna o email em minúsculas.
    public String getEmail() {
        return email.toLowerCase();
    }

    // Método que gera um email com base no nome e sobrenome da pessoa.
    public void setEmail() {
        email = nome + "." + sobrenome + "@facens.br"; // Gera o email padrão.
    }

    // Método que formata a data de nascimento em um formato legível (dd/MM/yyyy).
    public String formatarDataNasc() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataNasc);
    }
}

// A classe Pessoa contém o método principal que executa o programa.
public class Pessoa {
    public static void main(String[] args) {
        // Define o formato da data e inicializa a data de nascimento a partir de uma
        // string.
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date dataNasc = null;
        try {
            dataNasc = sdf.parse("03062005"); // Tenta converter a string em uma data.
        } catch (ParseException e) {
            e.printStackTrace(); // Exibe um erro caso a conversão falhe.
        }

        // Cria uma instância da classe gPessoa com os dados iniciais.
        gPessoa gpessoa = new gPessoa("Marcelo", "Lisboa", dataNasc, 175, "");

        // Atualiza as informações da pessoa usando os métodos apropriados.
        gpessoa.setNomeCompleto("Marcelo", "Lisboa");
        gpessoa.setDataNasc(dataNasc);
        gpessoa.setAltura(175);
        gpessoa.setEmail(); // Gera o email baseado no nome e sobrenome.

        // Exibe as informações formatadas da pessoa.
        System.out.println(
                "\n\nNome: " + gpessoa.getNomeCompleto() +
                        "\nData de nascimento: " + gpessoa.formatarDataNasc() +
                        "\nAltura: " + gpessoa.getAltura() + " M" +
                        "\nEmail: " + gpessoa.getEmail());
    }
}
