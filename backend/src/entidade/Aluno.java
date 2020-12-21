package entidade;

import java.util.*;

/**
 * Classe contendo m�todos e atributos para o aluno.
 * Herda m�todos e atributos da classe Usuario.
 * @see Usuario
 * @author  
 */
public class Aluno extends Usuario {
    private int idAluno;
    private int ra;
    private String matricula;
    private boolean deficienciaFisica;
    private String nomeMae;
    private String nomePai;
    private String nomeResponsavel;
    private boolean situacaoAnoLetivo;
    private Resposta respostas[];

    /**
     * Construtor usado ao instanciar a classe Aluno.
     * @param
     */
    public Aluno() {
    }
    
    
    /** M�todo para retorno do ID do aluno.
     * @return Int - ID do usu�rio
     */
    public int getIdAluno() {
        return idAluno;
    }

    /**
     * 
     */
    public void setIdAluno() {
        // TODO implement here
    }

    /** M�todo para retorno do RA do aluno.
     * @return Int - RA do usu�rio
     */
    public int getRa() {
        return ra;
    }

    /**
     * 
     */
    public void setRa() {
        // TODO implement here
    }

    /** M�todo para retorno da matr�cula do aluno.
     * @return String - Matr�cula do usu�rio
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * 
     */
    public void setMatricula() {
        // TODO implement here
    }

    /** M�todo para retornar se o aluno possui alguma defici�ncia f�sica.
     * @return Boolean - Possui defici�ncia f�sica? True / False
     */
    public boolean getDeficienciaFisica() {
        return deficienciaFisica;
    }

    /**
     * 
     */
    public void setDeficienciaFisica() {
        // TODO implement here
    }

    /** M�todo para retorno do nome da m�e do aluno.
     * @return String - Nome do m�e do aluno
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * 
     */
    public void setNomeMae() {
        // TODO implement here
    }

    /** M�todo para retorno do nome do pai do aluno.
     * @return String - Nome do pai do aluno
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * 
     */
    public void setNomePai() {
        // TODO implement here
    }

    /** M�todo para retorno do nome do respons�vel pelo aluno.
     * @return String - Nome do respons�vel pelo aluno
     */
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    /**
     * 
     */
    public void setNomeResponsavel() {
        // TODO implement here
    }

    /** M�todo para retorno da situa��o do ano letivo do aluno.
     * @return Boolean - True para aprovado / False para reprovado
     */
    public boolean getSituacaoAnoLetivo() {
        return situacaoAnoLetivo;
    }

    /**
     * 
     */
    public void setSituacaoAnoLetivo() {
        // TODO implement here
    }

    /** M�todo para o envio de uma resposta � uma atividade.
     * @param Resposta - Resposta a ser enviada.
     */
    public void mandarResposta(Resposta resposta) {
        // TODO implement here
    }

    /** M�todo para visualizar as respostas enviadas, a partir do banco de dados.
     * @param -
     * @return Resposta - Retorna as respostas enviadas.
     */
    public Resposta verRespostasEnviadas() {
        return null;
    }

    /** M�todo para visualizar uma resposta enviada espec�fica, a partir do banco de dados.
     * @param -
     * @return Resposta - Retorna uma resposta.
     */
    public Resposta buscarRespostaEnviada(Resposta resposta) {
        return null;
    }

    /** M�todo para a remo��o de uma resposta.
     * @param Resposta - Resposta a ser removida.
     */
    public void removerResposta(Resposta resposta) {
        // TODO implement here
    }

    /** M�todo para visualizar as atividades recebidas, a partir do banco de dados.
     * @param -
     * @return Atividade - Retorna as atividades recebidas.
     */
    public Atividade verAtividadesRecebidas() {
        return null;
    }

    /** M�todo para visualizar uma atividade recebida espec�fica, a partir do banco de dados.
     * @param -
     * @return Atividade - retorna uma atividade.
     */
    public Atividade pesquisarAtividadeRecebida() {
        return null;
    }

    /** M�todo para a visualiza��o das notas
     * @param -
     * @return Resposta - Retorna as notas.
     */
    public Resposta verNotas() {
        return null;
    }

}