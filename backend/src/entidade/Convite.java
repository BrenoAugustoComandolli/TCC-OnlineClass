package entidade;

import java.util.*;

/**
 * Classe contendo m�todos e atributos para a cria��o de convites de acesso �s reuni�es.
 * @author
 */
public class Convite {
    private int idConvite;
    private int destinatario;
    private int salaConvite;
    private boolean situacaoConvite;
    private int remetente;

    /**
     * Construtor usado ao instanciar a classe Convite.
     * @param
     */
    public Convite() {
    }


    /** M�todo para retorno do ID do destinat�rio.
     * @return Int - ID do destinat�rio
     */
    public int getDestinatario() {
        return destinatario;
    }

    /**
     * 
     */
    public void setDestinatario() {
        // TODO implement here
    }

    /** M�todo para retorno do ID do convite da sala.
     * @return Int - ID do convite da sala
     */
    public int getSalaConvite() {
        return salaConvite;
    }

    /**
     * 
     */
    public void setSalaConvite() {
        // TODO implement here
    }

    /** M�todo para retorno da situa��o do convite.
     * @return Boolean - Usu�rio aceitou? True / False
     */
    public boolean getSituacaoConvite() {
        return situacaoConvite;
    }

    /**
     * 
     */
    public void setSituacaoConvite() {
        // TODO implement here
    }

    /** M�todo para retorno do ID do remetente.
     * @return Int - ID do remetente
     */
    public int getRemetente() {
        return remetente;
    }

    /**
     * 
     */
    public void setRemetente() {
        // TODO implement here
    }

    /** M�todo para retorno do ID do convite.
     * @return Int - ID do convite
     */
    public int getIdConvite() {
        return idConvite;
    }

    /**
     * 
     */
    public void setIdConvite() {
        // TODO implement here
    }

}