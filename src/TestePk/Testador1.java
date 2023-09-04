//-*- coding: utf-8 -*-
package TestePk;
import infos.*;




public class Testador1 {
    
    //FUNÇÕES DE INPUT
    
    public static Motorista cadastrarMotorista() { // Função para criar Motoristas
        
        String nome = Console.lerDados("Digite o nome do motorista: ");
        
        String CNH = Console.lerDados("Digite o numero da CNH: ");

        String CPF = Console.lerDados("Digite o CPF do motorista: ");
        
        if(nome != null && CNH != null && CPF != null){
             return new Motorista(nome, CNH, CPF);
        }
        else{
            return null;
        }
    }
    
    public static Caminhao cadastrarCaminhao() { //Função para cadastrar um caminhão no sistema

        String modVeic = Console.lerDados("Digite o modelo do veiculo: ");

        String anoVeic = Console.lerDados("Digite o ano do veiculo: ");

        String placaVeic = Console.lerDados("Digite a placa do veiculo: ");
        
        if(modVeic != null && anoVeic != null && placaVeic != null){
        return new Caminhao(modVeic, anoVeic, placaVeic);
        }
        else{
            return null;
        }
    }
    
    public static Empresa cadastrarEmpresa() {

        String nomeEmpre = Console.lerDados("Digite o nome da empresa: ");

        String cnpjEmpre = Console.lerDados("Digite o CNPJ da empresa: ");
        
        
        if(nomeEmpre != null && cnpjEmpre != null){
            return new Empresa(nomeEmpre, cnpjEmpre);
        }
        else {
            return null;
        }
        
    }
    
    String resultado = "";
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       
        MotoristaDAO motoristaDao = new MotoristaDAO();
        CaminhaoDAO caminhaoDao = new CaminhaoDAO();
        EmpresaDAO empresaDao = new EmpresaDAO();
        Operacional operacional = new Operacional();
        String escolha;
        
        
        
            do{
                
                escolha = Console.lerDados("""
                                           Selecione uma opcao do menu:
                                           1 - Controle de Funcionarios
                                           2 - Controle de Frota
                                           3 - Controle de Clientes
                                           0 - Encerrar o programa""");
                
                
                if(escolha == null){
                    System.out.println("Opcao inválida. Tente novamente.");
                    Console.mostrarDados("Opcao inválida. Tente novamente.");
                }
                // Adicione ações específicas para a Opção 1 aqui
                else switch (escolha) {
                case "1" -> {
                    System.out.println("Opcao 1 selecionada.(Controle de Funcionarios)");
                    String escolha1;
                    do{
                        
                        
                        escolha1 = Console.lerDados("""
                                                                            Selecione uma opcao do menu:
                                                                            1 - Listar Motoristas
                                                                            2 - Cadastrar Motorista
                                                                            3 - Excluir Motorista
                                                                            0 - Voltar""");
                        
                        
                        if(escolha1 == null){
                            System.out.println("Opcao inválida. Tente novamente.");
                            Console.mostrarDados("Opcao inválida. Tente novamente.");
                        }
                        // Adicione ações específicas para a Opção 1 aqui
                        else switch (escolha1) {
                            case "1" ->         {
                                System.out.println("Opcao listar Motorista.");
                                motoristaDao.listar();
                            }
                            case "2" ->         {
                                System.out.println("Opcao Cadastro Motorista");
                                Funcionario motorista = cadastrarMotorista();
                                if(motoristaDao.inserir(motorista) == true)
                                    Console.mostrarDados("Cadastro do motorista " + motorista.getNomeFunc() + " realizado com sucesso");
                                else
                                    Console.mostrarDados("Falha no cadastro");
                            }
                            case "3" ->         {
                                System.out.println("Opcao Excluir motorista.");
                                motoristaDao.listar();
                                String resposta = Console.lerDados("Digite o CPF do motorista que deseja excluir:");
                                Object demitido = motoristaDao.pesquisar(resposta);
                                if (demitido != null){
                                    motoristaDao.excluir(demitido);
                                    Console.mostrarDados("Exclusão realizada");
                                }
                                else{
                                    Console.mostrarDados("CPF Não encontrado, nenhuma alteração realizada");
                                }               }
                            case "0" ->         {
                                System.out.println("Voltando");
                                escolha1 = "end";
                            }
                            default ->          {
                                System.out.println("Opcao inválida. Tente novamente.");
                                Console.mostrarDados("Opcao inválida. Tente novamente.");
                            }
                        }
                        // Adicione ações específicas para a Opção 2 aqui
                        
                        
                    } while (!"end".equals(escolha1));
                    }
                case "2" ->{ System.out.println("Opcao 2 selecionada (Controle de Frota).");
                    String escolha2;
                    do{
                        
                        
                        escolha2 = Console.lerDados("""
                                                                            Selecione uma opcao do menu:
                                                                            1 - Listar Veículos
                                                                            2 - Cadastrar Veículo
                                                                            3 - Excluir Veículo
                                                                            4 - Vincular motorista
                                                                            0 - Voltar""");
                        
                        
                        if(escolha2 == null){
                            System.out.println("Opcao inválida. Tente novamente.");
                            Console.mostrarDados("Opcao inválida. Tente novamente.");
                        }
                        // Adicione ações específicas para a Opção 1 aqui
                        else switch (escolha2) {
                            case "1" ->         {
                                System.out.println("Opcao listar Veiculos.");
                                caminhaoDao.listar();
                            }
                            case "2" ->         {
                                System.out.println("Opcao Cadastro Veiculo");
                                Caminhao caminhao = cadastrarCaminhao();
                                if(caminhaoDao.inserir(caminhao) == true)
                                    Console.mostrarDados("Cadastro do motorista " + caminhao.getPlacaVeic() + " realizado com sucesso");
                                else
                                    Console.mostrarDados("Falha no cadastro");
                            }
                            case "3" ->         {
                                System.out.println("Opcao Excluir motorista.");
                                caminhaoDao.listar();
                                String resposta = Console.lerDados("Digite a PLACA DO VEÍCULO que deseja excluir:");
                                Object excluir = caminhaoDao.pesquisar(resposta);
                                if (excluir != null){
                                    caminhaoDao.excluir(excluir);
                                    Console.mostrarDados("Exclusão realizada");
                                }
                                else{
                                    Console.mostrarDados("PLACA Não encontrada, nenhuma alteração realizada");
                                }               }
                            
                            case "4" ->{
                                System.out.println("Vincular motorista");
                                caminhaoDao.listar();
                                String resposta = Console.lerDados("Digite a PLACA DO VEÍCULO que deseja vincular");
                                Object caminhao = caminhaoDao.pesquisar(resposta);
                                motoristaDao.listar();
                                resposta = Console.lerDados("Digite o CPF do motorista que deseja vincular ao caminhao");
                                Object motorista = motoristaDao.pesquisar(resposta);
                                if (caminhao instanceof Caminhao && motorista instanceof Motorista){
                                    Caminhao caminhaoAtual = (Caminhao) caminhao;
                                    Motorista motoristaAtual = (Motorista) motorista;
                                    
                                    caminhaoAtual.setMotorista(motoristaAtual);
                                    Console.mostrarDados("Motorista cadastrado");
                                    Console.mostrarDados(caminhaoAtual.toString());
                                }
                                else{
                                    Console.mostrarDados("Falha na operação");
                                }
                                
                                
                                
                            }
                            
                            case "0" ->         {
                                System.out.println("Voltando");
                                escolha2 = "end";
                            }
                            default ->          {
                                System.out.println("Opcao inválida. Tente novamente.");
                                Console.mostrarDados("Opcao inválida. Tente novamente.");
                            }
                        }
                        
                        
                        
                    } while (!"end".equals(escolha2));
                    
                
                
                
                }
                
                case "3" -> {System.out.println("Opcao 3 selecionada (Controle de Clientes).");
                String escolha3;
                    do{
                        
                        
                        escolha3 = Console.lerDados("""
                                                                            Selecione uma opcao do menu:
                                                                            1 - Listar Empresas
                                                                            2 - Cadastrar Empresa
                                                                            3 - Excluir Empresa
                                                                            4 - Vincular Caminhao
                                                                            0 - Voltar""");
                        
                        
                        if(escolha3 == null){
                            System.out.println("Opcao inválida. Tente novamente.");
                            Console.mostrarDados("Opcao inválida. Tente novamente.");
                        }
                        // Adicione ações específicas para a Opção 1 aqui
                        else switch (escolha3) {
                            case "1" ->         {
                                System.out.println("Opcao listar empresas.");
                                empresaDao.listar();
                            }
                            case "2" ->         {
                                System.out.println("Opcao Cadastro Empresas");
                                Empresa empresa = cadastrarEmpresa();
                                if(empresaDao.inserir(empresa) == true)
                                    Console.mostrarDados("Cadastro da empresa " + empresa.getNomeEmpre() + " realizado com sucesso");
                                else
                                    Console.mostrarDados("Falha no cadastro");
                            }
                            case "3" ->         {
                                System.out.println("Opcao Excluir Empresa.");
                                empresaDao.listar();
                                String resposta = Console.lerDados("Digite o CNPJ que deseja excluir:");
                                Object excluir = empresaDao.pesquisar(resposta);
                                if (excluir != null){
                                    empresaDao.excluir(excluir);
                                    Console.mostrarDados("Exclusão realizada");
                                }
                                else{
                                    Console.mostrarDados("CNPJ Não encontrado, nenhuma alteração realizada");
                                }               }
                            
                            case "4" ->{
                                System.out.println("Vincular caminhao");
                                empresaDao.listar();
                                String resposta = Console.lerDados("Digite o CNPJ da Empresa que deseja acessar");
                                Object empresa = empresaDao.pesquisar(resposta);
                                caminhaoDao.listar();
                                resposta = Console.lerDados("Digite a placa do veiculo que deseja vincular a empresa");
                                Object veiculo = caminhaoDao.pesquisar(resposta);
                                if (empresa instanceof Empresa && veiculo instanceof Caminhao){
                                    Caminhao caminhaoAtual = (Caminhao) veiculo;
                                    Empresa empresaAtual = (Empresa) empresa;
                                    
                                    empresaAtual.setVeiculo(caminhaoAtual);
                                    Console.mostrarDados("Caminhao cadastrado");
                                    Console.mostrarDados(empresaAtual.toString());
                                }
                                else{
                                    Console.mostrarDados("Falha na operação");
                                }
                                
                                
                                
                            }
                            
                            
                            
                            case "0" ->         {
                                System.out.println("Voltando");
                                escolha3 = "end";
                            }
                            default ->          {
                                System.out.println("Opcao inválida. Tente novamente.");
                                Console.mostrarDados("Opcao inválida. Tente novamente.");
                            }
                        }
                        
                        
                        
                    } while (!"end".equals(escolha3));
                
                
                
                
                
                }
                
                case "0" -> {
                    System.out.println("Encerrando o menu.");
                    Console.mostrarDados("Encerrando o programa.");
                    escolha = "end";
                    }
                default -> {
                    System.out.println("Opcao inválida. Tente novamente.");
                    Console.mostrarDados("Opcao inválida. Tente novamente.");
                    }
            }
                // Adicione ações específicas para a Opção 2 aqui
                
         
            } while (!"end".equals(escolha));

        
    }
    
     
    
    
    
    
}
