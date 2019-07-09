/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.CidadesDao;
import javax.swing.JOptionPane;
import modelo.Cidades;
import tela.manutencoes.ManutencaoCidades;

/**
 *
 * @author Administrador
 */
public class ControladorCidades {

    public static void inserir(ManutencaoCidades aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
         Cidades objeto = new Cidades();
        objeto.setCodigo(man.jtfCodigo.getText());
        objeto.setNome(man.jtfNome.getText());
        
        boolean resultado = CidadesDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
