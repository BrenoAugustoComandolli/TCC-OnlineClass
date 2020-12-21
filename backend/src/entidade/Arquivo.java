package entidade;

import java.util.*;

/**
 * Classe contendo m�todos e atributos para a cria��o e uso de arquivos.
 * @author 
 */
public class Arquivo {
    private int idArquivo;
    private String extensao;
    private Date dataEnvio;
    private int remetente;
    private byte arquivo[];

    /**
     * Construtor usado ao instanciar a classe Arquivo.
     * @param
     */
    public Arquivo() {
    }

    
    /** M�todo para retorno do ID do arquivo.
     * @return Int - ID do arquivo
     */
    public int getIdArquivo() {
        return idArquivo;
    }

    /**
     * 
     */
    public void setIdArquivo() {
        // TODO implement here
    }

    /** M�todo para retorno da extens�o.
     * @return String - Extens�o do arquivo
     */
    public String getExtensao() {
        return extensao;
    }

    /**
     * 
     */
    public void setExtensao() {
        // TODO implement here
    }

    /** M�todo para retorno da data de envio.
     * @return Date - Data de envio
     */
    public Date getDataEnvio() {
        return dataEnvio;
    }

    /**
     * 
     */
    public void setDataEnvio() {
        // TODO implement here
    }

    /** M�todo para retorno do remetente.
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

    /** M�todo para retorno do tipo de envio.
     * @return Int - Tipo de envio 
     */
    public int getTipoEnvio() {
    	UsuarioArquivo usuarioArquivo = new UsuarioArquivo();
        return usuarioArquivo.getTipoEnvio();
    }

    /**
     * 
     */
    public void setTipoEnvio() {
        // TODO implement here
    }

    /** M�todo para retorno do arquivo.
     * @return Byte - Array de arquivos
     */
    public byte[] getArquivo() {
        return arquivo;
    }

    /**
     * 
     */
    public void setArquivo() {
        // TODO implement here
    }

}