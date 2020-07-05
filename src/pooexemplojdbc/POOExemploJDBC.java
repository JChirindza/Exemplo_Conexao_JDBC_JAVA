/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooexemplojdbc;

import DAO.EstudanteDAO;
import negocio.Estudante;

/**
 *
 * @author JChirindza
 */
public class POOExemploJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudanteDAO dao =  new EstudanteDAO();
        
        Estudante e = new Estudante(5, "Joao", "Chirindza");
        dao.apagar(e);
        
        
    }
    
}
