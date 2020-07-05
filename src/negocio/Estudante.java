/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author Manhica
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
