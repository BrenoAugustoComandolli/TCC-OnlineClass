package Sistema;

import java.sql.Time;
import java.util.*;

/**
 * Classe contendo m�todos e atributos para o usu�rio do sistema.
 * Os atributos e m�todos dessa classe s�o herdados pelas classes Administrador, Aluno, Coordenador, Diretor e Professor.
 * @see Administrador
 * @see Aluno
 * @see Coordenador
 * @see Diretor
 * @see Professor
 * @author 
 */
public class Usuario {
    private int idUsuario;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String celular;
    private byte tipoUsuario;
    private String email;
    private String senha;
    private Time horarioInicioExpediente;
    private Time horarioFinalExpediente;
    private byte fotoUsuario[];
    private Endereco endereco;
    
    /**
     * Construtor utilizado para instanciar a classe Usuario.
	 * @param nome				Nome completo do usu�rio do sistema.
	 * @param tipoUsuario		Tipo de conta do Usu�rio:
	 * 							0 - Aluno
	 * 							1 - Professor
	 * 							2 - Coordenador
	 * 							3 - Diretor
	 * 							4 - Administrador
	 * @param email				Email cadastrado pelo usu�rio.
     */
    public Usuario() {
    }


    /** M�todo para retorno do ID do usu�rio.
     * @return Int - ID do usu�rio
     */
    public int getIdUsuario() {
    	 return idUsuario;
    }

    /**
     * 
     */
    public void setIdUsuario() {
        // TODO implement here
    }

    /** M�todo para retorno do nome do usu�rio.
     * @return String - Nome do usu�rio
     */
    public void getNome() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setNome() {
        // TODO implement here
    }

    /** M�todo para retorno do sobrenome do usu�rio.
     * @return String - Sobrenome do usu�rio
     */
    public void getSobrenome() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setSobrenome() {
        // TODO implement here
    }

    /** M�todo para retorno do CPF do usu�rio.
     * @return String - CPF do usu�rio
     */
    public void getCpf() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setCpf() {
        // TODO implement here
    }

    /** M�todo para retorno do telefone do usu�rio.
     * @return String - Telefone do usu�rio
     */
    public void getTelefone() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setTelefone() {
        // TODO implement here
    }

    /** M�todo para retorno do n�mero de celular do usu�rio.
     * @return String - N�mero de celular do usu�rio
     */
    public void getCelular() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setCelular() {
        // TODO implement here
    }

    /** M�todo para retorno do tipo de conta do usu�rio.
     * @return Byte - Tipo de conta do usu�rio.
     * 							0 - Aluno
	 * 							1 - Professor
	 * 							2 - Coordenador
	 * 							3 - Diretor
	 * 							4 - Administrador
     */
    public void getTipoUsuario() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setTipoUsuario() {
        // TODO implement here
    }

    /** M�todo para retorno do email do usu�rio.
     * @return String - Email do usu�rio
     */
    public void getEmail() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setEmail() {
        // TODO implement here
    }

    /** M�todo para retorno da senha do usu�rio.
     * @return String - Senha do usu�rio
     */
    private void getSenha() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setSenha() {
        // TODO implement here
    }

    /** M�todo para retorno do hor�rio inicial do expediente do usu�rio.
     * @return Time - Hor�rio inicial do expediente do usu�rio
     */
    public void getHorarioInicioExpediente() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setHorarioInicioExpediente() {
        // TODO implement here
    }

    /** M�todo para retorno do hor�rio final do expediente do usu�rio.
     * @return Time - Hor�rio final do expediente do usu�rio
     */
    public void getHorarioFinalExpediente() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setHorarioFinalExpediente() {
        // TODO implement here
    }

    /** M�todo para retorno da foto do usu�rio.
     * @return Byte - Foto do usu�rio
     */
    public void getFoto() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setFoto() {
        // TODO implement here
    }

    /** M�todo para retorno do endere�o do usu�rio.
     * @return Endereco - Endere�o do usu�rio
     */
    public void getEndereco() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setEndereco() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verificarCpf() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verificarLogin() {
        // TODO implement here
    }

    /**
     * 
     */
    public void pesquisarUsuario() {
        // TODO implement here
    }

    /**
     * 
     */
    public void mandarRelatorio() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verRelatoriosEnviados() {
        // TODO implement here
    }

    /**
     * 
     */
    public void buscarRelatorioEnviado() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verRelatoriosRecebidos() {
        // TODO implement here
    }

    /**
     * 
     */
    public void buscarRelatorioRecebido() {
        // TODO implement here
    }

    /**
     * 
     */
    public void removerRelatorio() {
        // TODO implement here
    }

    /**
     * 
     */
    public void mandarConvite() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verConvitesEnviados() {
        // TODO implement here
    }

    /**
     * 
     */
    public void buscarConviteEnviado() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verConvitesRecebidos() {
        // TODO implement here
    }

    /**
     * 
     */
    public void buscarConviteRecebido() {
        // TODO implement here
    }

    /**
     * 
     */
    public void removerConvite() {
        // TODO implement here
    }

    /**
     * 
     */
    public void aceitarConvite() {
        // TODO implement here
    }

    /**
     * 
     */
    public void recusarConvite() {
        // TODO implement here
    }

    /**
     * 
     */
    public void mandarArquivo() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verArquivosEnviados() {
        // TODO implement here
    }

    /**
     * 
     */
    public void buscarArquivoEnviado() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verArquivosRecebidos() {
        // TODO implement here
    }

    /**
     * 
     */
    public void buscarArquivoRecebido() {
        // TODO implement here
    }

    /**
     * 
     */
    public void removerArquivo() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getSalaPersonalizada() {
        // TODO implement here
    }

    /**
     * 
     */
    public void criarSalaPersonalizada() {
        // TODO implement here
    }

    /**
     * 
     */
    public void atualizarSalaPersonalizada() {
        // TODO implement here
    }

    /**
     * 
     */
    public void removerSalaPersonalizada() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getReuniao() {
        // TODO implement here
    }

    /**
     * 
     */
    public void criarReuniao() {
        // TODO implement here
    }

    /**
     * 
     */
    public void atualizarReuniao() {
        // TODO implement here
    }

    /**
     * 
     */
    public void removerReuniao() {
        // TODO implement here
    }

    /**
     * 
     */
    public void entrarReuniao() {
        // TODO implement here
    }

    /**
     * 
     */
    public void sairReuniao() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getChamada() {
        // TODO implement here
    }

    /**
     * 
     */
    public void fazerChamada() {
        // TODO implement here
    }

    /**
     * 
     */
    public void removerChamada() {
        // TODO implement here
    }

}