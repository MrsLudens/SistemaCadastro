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
public class MotoristaDAO implements DAO {

    
    HashSet<Motorista> cadastro = new HashSet();

    @Override
    public boolean inserir(Object obj) {
        if (obj != null) {
            Motorista p = (Motorista) obj;
            return cadastro.add(p);
            
        }
        return false;
    }
    
    public void listar() {
    StringBuilder lista = new StringBuilder();
    Iterator it = cadastro.iterator();
    while (it.hasNext()) {
        lista.append(it.next()).append("\n");
    }
    JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Motoristas", JOptionPane.INFORMATION_MESSAGE);
}


    @Override
    public boolean excluir(Object obj) {
        if (obj != null) {
            Motorista p = (Motorista) obj;
            cadastro.remove(p);
            return true;
        }
        return false;
    }

    @Override
    //Em obj está o critério de pesquisa
    //Em obj vai estar o nome da pessoa
    public Object pesquisar(Object obj) {
        if (obj !=null){
            String CPF = (String) obj;
//            for (int i =0; i< cadastro.size(); i++){
            Iterator it = cadastro.iterator();
            while(it.hasNext()){
                Motorista p = (Motorista) it.next();
                if (CPF.equals(p.getCpfFunc())){
                    return p;
                }
            }
        }
        return null;
    }

    

    public HashSet<Motorista> getCadastro() {
        return cadastro;
    }

    @Override
    public boolean editar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    

}
