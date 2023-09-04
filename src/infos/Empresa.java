package infos;
import java.util.Objects;

public class Empresa {
    
    // DECLRAÇÃO DE VARIAVEIS
    
    private String nomeEmpre;
    private String CnpjEmpre;
    private Caminhao veiculo;

    
    // CONSTRUTOR
    
    public Empresa(String nomeEmpre, String CnpjEmpre) {
        this.nomeEmpre = nomeEmpre;
        this.CnpjEmpre = CnpjEmpre;
    }

    //FUNCÕES
    
    
//    public void definirVeiculo(Caminhao caminhao){ // DESIGNAR UM MOTORISTA PRA UM CAMINHÃO
//        this.PlacaVeic = caminhao.getPlacaVeic();
//    }
    
    // TO STRING
    
    @Override
    public String toString() {
        return """
               ----------
               
               Empresa: 
               Nome da Empresa: """ + nomeEmpre + 
                "\nCnpj Empresa: " + CnpjEmpre + 
                "\nVeiculo que faz a coleta: " + veiculo +
                "\n----------";
    }

    
    
    //GET E SET
    
    public String getNomeEmpre() {
        return nomeEmpre;
    }

    public void setNomeEmpre(String nomeEmpre) {
        this.nomeEmpre = nomeEmpre;
    }

    public String getCnpjEmpre() {
        return CnpjEmpre;
    }

    public void setCnpjEmpre(String CnpjEmpre) {
        this.CnpjEmpre = CnpjEmpre;
    }

    public Caminhao getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Caminhao veiculo) {
        this.veiculo = veiculo;
    }

    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.CnpjEmpre);
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.CnpjEmpre, other.CnpjEmpre);
    }
    
    
    
    
    
    
    
    
}
