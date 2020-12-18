package Sistema;

import java.util.*;

/**
 * Classe contendo m�todos e atributos para o administrador.
 * Herda m�todos e atributos da classe Usuario.
 * @see Usuario
 * @author 
 */
public class Administrador extends Usuario {

    /**
     * Construtor usado ao instanciar a classe Administrador.
     * @param
     */
    public Administrador() {
    	
    }

    /** M�todo para retorno da escola.
     * @return String - Nome do usu�rio
     */
    public String getEscola() {
    	Escola escola = new Escola();
        return escola.getNome();
    }

    /** M�todo para adicionar uma escola ao sistema.
     * @param - 
     */
    public void adicionarEscola() {
        // TODO implement here
    }

    /** M�todo para a atualiza��o da escola.
     * @param Escola - Escola a ser atualizada.
     */
    public void atualizarEscola(Escola escola) {
        // TODO implement here
    }

    /** M�todo para a remo��o de uma escola.
     * @param Escola - Escola a ser removida do sistema.
     */
    public void removerEscola(Escola escola) {
        // TODO implement here
    }

    /** M�todo para retorno do ID do diretor.
     * @return Int - ID do diretor
     */
    public int getDiretor() {
    	Diretor diretor =  new Diretor();
        return diretor.getIdUsuario();
    }

    /** M�todo para adicionar um diretor.
     * @param -
     */
    public void adicionarDiretor() {
        // TODO implement here
    }

    /** M�todo para a atualiza��o do diretor.
     * @param Diretor - Diretor a ser atualizado.
     */
    public void atualizarDiretor(Diretor diretor) {
        // TODO implement here
    }

    /** M�todo para a remo��o do diretor
     * @param Diretor - Diretor a ser removido.
     */
    public void removerDiretor(Diretor diretor) {
        // TODO implement here
    }

}