
package infos;

import java.io.IOException;


public class Operacional {
    
    
    
    
    
//    public void definirMotorista(Object caminhao, Object motorista){ //Função para definir um motorista para um caminhão existente
//       
//        
//        
//   }
//    
//    public static void definirVeiculo(Caminhao caminhao, Empresa empresa){ // DESIGNAR UM MOTORISTA PRA UM CAMINHÃO
//        
//        empresa.setVeiculo(caminhao);
//    }
    
    
    
    
    
    
    public static void clearConsole() {
         try {
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder processBuilder;

            if (os.contains("win")) {
                processBuilder = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                processBuilder = new ProcessBuilder("clear");
            }

            Process process = processBuilder.inheritIO().start();
            process.waitFor();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (IOException | InterruptedException e) {
            // Trate exceções, se necessário
        }
    }//FUNÇÃO PARA LIMPAR CONSOLE (NÃO FUNCIONA)

    }

