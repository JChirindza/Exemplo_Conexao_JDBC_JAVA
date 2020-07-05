package negocio;

/**
 *
 * @author JChirindza
 */
public class Estudante {
    
    private int cartao;
    private String apelido, nome;

    public Estudante() {
    }

    public Estudante(int cartao, String apelido, String nome) {
        this.cartao = cartao;
        this.apelido = apelido;
        this.nome = nome;
    }

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
