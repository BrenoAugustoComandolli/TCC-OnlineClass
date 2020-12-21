package entidade;

import java.util.*;

/**
 * Classe contendo m�todos e atributos para a liga��o do Usuario � Sala Personalizada.
 * @see Usuario
 * @see SalaPersonalizada
 * @author
 */
public class UsuarioSalaPersonalizada {
    private int idUsuarioSalaPersonalizada;
    private int codSalaPersonalizada;
    private Usuario usuario;
    
    /**
     * Construtor usado ao instanciar a classe UsuarioSalaPersonalizada.
     * @param
     */
    public UsuarioSalaPersonalizada() {
    }


    /** M�todo para retorno do ID do UsuarioSalaPersonalizada.
     * @return Int - ID UsuarioSalaPersonalizada
     */
    public int getIdUsuarioSalaPersonalizada() {
        return idUsuarioSalaPersonalizada;
    }

    /**
     * 
     */
    public void setIdUsuarioSalaPersonalizada() {
        // TODO implement here
    }

    /** M�todo para retorno do c�digo da sala personalizada.
     * @return Int - C�digo da sala personalizada
     */
    public int getCodSalaPersonalizada() {
        return codSalaPersonalizada;
    }

    /**
     * 
     */
    public void setCodSalaPersonalizada() {
        // TODO implement here
    }

    /** M�todo para retorno do usu�rio.
     * @return Usuario - Usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * 
     */
    public void setUsuario() {
        // TODO implement here
    }

}