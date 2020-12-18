package Sistema;

import java.util.*;

/**
 * Classe contendo m�todos e atributos para a liga��o da Turma com as Atividades.
 * @see Turma
 * @see Atividade
 * @author
 */
public class TurmaAtividade {
    private int idTurmaAtividade;
    private int idTurma;
    private Atividade atividade;
    
    /**
     * Construtor usado ao instanciar a classe TurmaAtividade.
     * @param
     */
    public TurmaAtividade() {
    }


    /** M�todo para retorno do ID da TurmaAtividade.
     * @return Int - ID TurmaAtividade
     */
    public int getIdAtividade() {
        return idTurmaAtividade;
    }

    /**
     * 
     */
    public void setIdAtividade() {
        // TODO implement here
    }

    /** M�todo para retorno do ID da turma.
     * @return Int - ID da turma
     */
    public int getIdTurma() {
        return idTurma;
    }

    /**
     * 
     */
    public void setIdTurma() {
        // TODO implement here
    }

    /** M�todo para retorno da atividade.
     * @return Atividade - Atividade
     */
    public Atividade getAtividade() {
        return atividade;
    }

    /**
     * 
     */
    public void setAtividade() {
        // TODO implement here
    }

}