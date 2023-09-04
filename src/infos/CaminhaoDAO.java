package infos;


import java.util.Iterator;
import java.util.HashSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mk
 */
public class CaminhaoDAO implements DAO {

    
    HashSet<Caminhao> cadastro = new HashSet();

    @Override
    public boolean inserir(Object obj) {
        if (obj != null) {
            Caminhao c = (Caminhao) obj;
            return cadastro.add(c);
            
        }
        return false;
    }

    @Override
    public boolean excluir(Object obj) {
        if (obj != null) {
            Caminhao c = (Caminhao) obj;
            cadastro.remove(c);
            return true;
        }
        return false;
    }

    @Override
    //Em obj está o critério de pesquisa
    //Em obj vai estar o nome da pessoa
    public Object pesquisar(Object obj) {
        if (obj !=null){
            String Placa = (String) obj;
//            for (int i =0; i< cadastro.size(); i++){
            Iterator it = cadastro.iterator();
            while(it.hasNext()){
                Caminhao c = (Caminhao) it.next();
                if (Placa.equals(c.getPlacaVeic())){
                    return c;
                }
            }
        }
        return null;
    }

    
    
    
        
    public void listar() {
    StringBuilder lista = new StringBuilder();
    Iterator it = cadastro.iterator();
    while (it.hasNext()) {
        lista.append(it.next()).append("\n");
    }
    JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Veículos", JOptionPane.INFORMATION_MESSAGE);
}

    public HashSet<Caminhao> getCadastro() {
        return cadastro;
    }

    @Override
    public boolean editar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    

}
