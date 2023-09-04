package infos;

import java.util.Objects;

public class Caminhao {
    
    // DECLRAÇÃO DE VARIAVIES
    
    private String modVeic;
    private String anoVeic;
    private String placaVeic;
    private Motorista motorista;

    // CONSTRUTOR
    
    public Caminhao(String modVeic, String anoVeic, String placaVeic) {
        this.modVeic = modVeic;
        this.anoVeic = anoVeic;
        this.placaVeic = placaVeic;
    }
    
    //FUNCÕES
    
    
    
    
    
//    public void definirMotorista(Funcionario funcionario){ //Função para definir um motorista para um caminhão existente
//       
//        this.motoristaVeic = funcionario.getNomeFunc();
//   }
    
    
    //GET E SET//
    public String getModVeic() {
        return modVeic;
    }

    public void setModVeic(String modVeic) {
        this.modVeic = modVeic;
    }

    public String getAnoVeic() {
        return anoVeic;
    }

    public void setAnoVeic(String anoVeic) {
        this.anoVeic = anoVeic;
    }

    public String getPlacaVeic() {
        return placaVeic;
    }

    public void setPlacaVeic(String placaVeic) {
        this.placaVeic = placaVeic;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    

    
    // TO STRING
    
    @Override
    public String toString() {
        return """
               ----------
               Caminhao:
               Modelo do Veiculo:""" + modVeic + 
                "\nAno do Veiculo: " + anoVeic + 
                "\nPlaca do Veiculo: " + placaVeic + 
                "\nMotorista do Veiculo: " + motorista +
                "\n----------";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.placaVeic);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caminhao other = (Caminhao) obj;
        return Objects.equals(this.getPlacaVeic(), other.getPlacaVeic());
    }
    
    
    
    
    
    
    
    
}
