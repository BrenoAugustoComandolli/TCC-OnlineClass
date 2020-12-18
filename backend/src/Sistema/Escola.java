package Sistema;

import java.util.*;

/**
 * Classe contendo m�todos e atributos para as devidas fun��es da escola.
 * @author 
 */
public class Escola {
    private int idEscola;
    private String nome;
    private Date dataInicioLetivo;
    private Date dataFinalLetivo;
    private Usuario usuarios[];
    private PeriodoAvaliacao periodos[];

    /**
     * Construtor usado ao instanciar a classe Escola.
     * @param
     */
    public Escola() {
    }

    
    /** M�todo para retorno do ID da escola.
     * @return Int - ID da escola
     */
    public int getIdEscola() {
        return idEscola;
    }

    /**
     * 
     */
    public void setIdEscola() {
        // TODO implement here
    }

    /** M�todo para retorno do nome da escola.
     * @return String - Nome da escola
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     */
    public void setNome() {
        // TODO implement here
    }

    /** M�todo para retorno da data de in�cio do ano letivo.
     * @return Date - Data de in�cio do ano letivo
     */
    public Date getDataInicioLetivo() {
        return dataInicioLetivo;
    }

    /**
     * 
     */
    public void setDataInicioLeitvo() {
        // TODO implement here
    }

    /** M�todo para retorno da data final do ano letivo.
     * @return Date - Data final do ano letivo
     */
    public Date getDataFinalLetivo() {
        return dataFinalLetivo;
    }

    /**
     * 
     */
    public void setDataFinalLetivo() {
        // TODO implement here
    }

    /** M�todo para retorno dos usu�rios.
     * @return Usuario - Array de usu�rios
     */
    public Usuario[] getUsuarios() {
        return usuarios;
    }

    /** M�todo para buscar um usu�rio espec�fico.
     * @param -
     * @return Usuario - Usuario a ser buscado.
     */
    public Usuario buscarUsuario() {
        return null;
    }

    /** M�todo para adicionar um usu�rio ao sistema.
     * @param -
     */
    public void adicionarUsuario() {
        // TODO implement here
    }

    /** M�todo para buscar um periodo de avalia��o espec�fico.
     * @return PeriodoAvaliacao
     */
    public PeriodoAvaliacao buscarPeriodo() {
        return null;
    }

    /** M�todo para adicionar um per�odo de avalia��o.
     * @param -
     */
    public void adicionarPeriodo() {
        // TODO implement here
    }

}