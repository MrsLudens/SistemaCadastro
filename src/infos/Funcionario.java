package infos;

import java.util.Objects;


public class Funcionario {
    
    // DECLARAÇÃO DE VARIAVEIS
    
    private int codFunc;
    private String nomeFunc;
    private String CpfFunc;
    
    // VARIÁVEL DE CONTROLE
    private static int codigoAtual = 1;
    
    
    // CONSTRUTORES
    
    public Funcionario(String nome, String CPF) {
        this.nomeFunc = nome;
        this.CpfFunc = CPF;
        this.codFunc = codigoAtual;
        incrementarContador(); 
    }
    
    //FUNCOES
    
    public void incrementarContador(){ // INCREMENTA O CONTADOR PARA GERAR O CRACHÁ
        codigoAtual++;
    }
    
    public void demitirFuncionario(){ // FUNÇÃO MÃE PARA GERAR APAGAR OS DADOS DE UM FUNCIONARIO
        this.CpfFunc = null;
        this.codFunc = 0;
        this.nomeFunc = null;
    }
    
    
    //GETTER E SEETER//
    
    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCpfFunc() {
        return CpfFunc;
    }

    public void setCpfFunc(String CpfFunc) {
        this.CpfFunc = CpfFunc;
    }

    public int getCodFunc() {
        return codFunc;
    }

    public int getCodigoAtual() {
        return codigoAtual;
    }
    
    
    // TO STRING

    @Override
    public String toString() {
        return "Funcionario{" + "codFunc=" + codFunc + ", nome=" + nomeFunc + ", CPF=" + CpfFunc + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nomeFunc);
        hash = 53 * hash + Objects.hashCode(this.CpfFunc);
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
        final Funcionario other = (Funcionario) obj;
        return Objects.equals(this.CpfFunc, other.CpfFunc);
    }
    
    
    
}
