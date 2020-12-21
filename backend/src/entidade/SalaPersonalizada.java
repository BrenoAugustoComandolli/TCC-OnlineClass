package entidade;

import java.util.*;

/**
 * Herda m�todos e atributos da classe Sala.
 * Salas personalizadas podem ser criadas pelo Usuario.
 * @see Sala
 * @see Usuario
 * @author
 */
public class SalaPersonalizada extends Sala {
    private int idSalaPersonalizada;
    private int dono;
    private UsuarioSalaPersonalizada usuariosSalaPersonalizada[];

    /**
     * Construtor usado ao instanciar a classe SalaPersonalizada.
     * @param
     */
    public SalaPersonalizada() {
    }
    
    
    /** M�todo para retorno do ID da sala personalizada.
     * @return Int - ID da sala personalizada
     */
    public int getIdSalaPersonalizada() {
        return idSalaPersonalizada;
    }

    /**
     * 
     */
    public void setIdSalaPersonalizada() {
        // TODO implement here
    }

    /** M�todo para retorno do ID do dono da sala.
     * @return Int - ID do dono da sala
     */
    public int getDono() {
        return dono;
    }

    /**
     * 
     */
    public void setDono() {
        // TODO implement here
    }

    /** M�todo para retorno do UsuarioSalaPersonalizada
     * @return UsuarioSalaPersonalizada - UsuarioSalaPersonalizada
     */
    public UsuarioSalaPersonalizada[] getUsuariosSalaPersonalizada() {
        return usuariosSalaPersonalizada;
    }

    /** M�todo para pesquisar o usu�rio da sala personalizada
     * @param -
     * @return UsuarioSalaPersonalizada
     */
    public UsuarioSalaPersonalizada pesquisarUsuarioSalaPersonalizada() {
    	return null;
    }

    /**
     * 
     */
    public void setUsuarioSalaPersonalizada() {
        // TODO implement here
    }

}