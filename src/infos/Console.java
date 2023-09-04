package infos;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mk
 */
public class Console {

    public static String lerDados(String mensagem)  {
        String s = null;
        
        try{
            do {
            
            s = JOptionPane.showInputDialog(null, mensagem);
        } while (s.isEmpty());
        
        }catch(Exception e){
            if (e instanceof InterruptedException) {
                System.out.println("Botão Cancel pressionado.");
        }
    }
        return s;
    }
    
 

    public static void mostrarDados(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
