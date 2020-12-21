package entidade;

import java.util.*;

/**
 * Classe cont�ndo m�todos e atributos para a liga��o do Professor e sua Disciplina � Turma.
 * @see ProfessorDisciplina
 * @see Turma
 * @author
 */
public class TurmaProfessorDisciplina {
    private int idTurmaProfessorDisciplina;
    private Turma turma;
    private ProfessorDisciplina professorDisciplina;
    
    /**
     * Construtor usado ao instanciar a classe TurmaProfessorDisciplina.
     * @param
     */
    public TurmaProfessorDisciplina() {
    }


    /** M�todo para retorno do ID TurmaProfessorDisciplina
     * @return Int - TurmaProfessorDisciplina
     */
    public int getIdTurmaProfessorDisciplina() {
        return idTurmaProfessorDisciplina;
    }

    /**
     * 
     */
    public void setIdTurmaProfessorDisciplina() {
        // TODO implement here
    }

    /** M�todo para retorno da turma.
     * @return Turma - Turma
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * 
     */
    public void setTurma() {
        // TODO implement here
    }

    /** M�todo para retorno do professor da disciplina.
     * @return ProfessorDisciplina - ProfessorDisciplina
     */
    public ProfessorDisciplina getTurmaProfessorDisciplina() {
        return professorDisciplina;
    }

    /**
     * 
     */
    public void setTurmaProfessorDisciplina() {
        // TODO implement here
    }

}