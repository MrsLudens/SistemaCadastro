package infos;

import java.util.Objects;

public class Motorista extends Funcionario {
    
    // DECLARAÇÃO DE VARIÁVEIS
    
    private String CNH;

    
    // CONSTRUTORES

    public Motorista(String nome, String CPF) {
        super(nome, CPF);
    }
    
    
    
    public Motorista(String nome, String CNH, String CPF) {
        super(nome, CPF);
        this.CNH = CNH;
    }

    
   
    
    
    //GET E SETR
    
    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    
    // TO STRING

    /**
     *
     * @return
     */
    
    @Override
    public String toString() {
        return """
               ----------
               MOTORISTA:
               CNH: """ + CNH + 
                "\nNome: " + super.getNomeFunc()+ 
                "\nCPF: " + super.getCpfFunc()+ 
                "\nCracha: " + super.getCodFunc()+
                "\n----------";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.CNH);
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
        final Motorista other = (Motorista) obj;
        return Objects.equals(this.getCpfFunc(), other.getCpfFunc());
    }
    
    
    
    
    
}
