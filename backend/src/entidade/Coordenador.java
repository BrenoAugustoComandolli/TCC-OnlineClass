package entidade;

import java.util.*;

/**
 * Classe contendo m�todos e atributos para o coordenador.
 * Herda m�todos e atributos da classe Usuario.
 * @see Usuario
 * @author 
 */
public class Coordenador extends Usuario {

	/**
     * Construtor usado ao instanciar a classe Coordenador.
     * @param
     */
    public Coordenador() {
    }

    /** M�todo para retorno do ID da turma.
     * @return Int - ID da turma
     */
    public int getTurma() {
    	Turma turma = new Turma();
        return turma.getIdTurma();
    }

    /** M�todo para adicionar uma turma.
     * @param -
     */
    public void adicionarTurma() {
        // TODO implement here
    }

    /** M�todo para atualizar uma turma.
     * @param Turma - Turma a ser atualizada.
     */
    public void atualizarTurma(Turma turma) {
        // TODO implement here
    }

    /** M�todo para a remo��o de uma turma.
     * @param Turma - Turma a ser removida.
     */
    public void removerTurma(Turma turma) {
        // TODO implement here
    }

    /** M�todo para retorno do ID da disciplina.
     * @return Int - ID da disciplina
     */
    public int getDisciplina() {
    	Disciplina disciplina = new Disciplina();
    	return disciplina.getIdDisciplina();
    }

    /** M�todo para adicionar uma disciplina.
     * @param -
     */
    public void adicionarDisciplina() {
        // TODO implement here
    }

    /** M�todo para atualizar uma disciplina.
     * @param Disciplina - Disciplina a ser atualizada.
     */
    public void atualizarDisciplina(Disciplina disciplina) {
        // TODO implement here
    }

    /** M�todo para a remo��o de uma disciplina.
     * @param Disciplina - Disciplina a ser removida.
     */
    public void removerDisciplina(Disciplina disciplina) {
        // TODO implement here
    }

    /** M�todo para retorno do ID do aluno.
     * @return Int - ID do aluno
     */
    public int getAluno() {
        Aluno aluno =  new Aluno();
        return aluno.getIdAluno();		
    }

    /** M�todo para atualizar um aluno.
     * @param Aluno - Aluno a ser atualizado
     */
    public void atualizarAluno(Aluno aluno) {
        // TODO implement here
    }

    /** M�todo para a remo��o de um aluno.
     * @param Aluno - Aluno a ser removido.
     */
    public void removerAluno(Aluno aluno) {
        // TODO implement here
    }

    /** M�todo para adicionar um aluno.
     * @param -
     */
    public void adicionarAluno() {
        // TODO implement here
    }

    /** M�todo para retorno do ID do professor.
     * @return Int - ID do professor
     */
    public int getProfessor() {
        Professor professor = new Professor();
        return professor.getIdProfessor();
    }

    /** M�todo para adicionar um professor.
     * @param -
     */
    public void adicionarProfessor() {
        // TODO implement here
    }

    /** M�todo para atualizar um professor.
     * @param Professor - Professor a ser atualizado.
     */
    public void atualizarProfessor(Professor professor) {
        // TODO implement here
    }

    /** M�todo para a remo��o de um professor.
     * @param Professor - Professor a ser removido.
     */
    public void removerProfessor() {
        // TODO implement here
    }

    /** M�todo para retorno do ID do ProfessorDisciplina.
     * @return Int - ID ProfessorDisciplina
     */
    public int getProfessorDisciplina() {
        ProfessorDisciplina profDisci = new ProfessorDisciplina();
        return profDisci.getIdProfessorDisciplina();
    }

    /** M�todo para a atribui��o de um professor � uma disciplina.
     * @param -
     */
    public void adicionarProfessorDisciplina() {
        // TODO implement here
    }

    /** M�todo para atualizar a liga��o do professor � uma disciplina.
     * @param ProfessorDisciplina
     */
    public void atualizarProfessotDisciplina() {
        // TODO implement here
    }

    /** M�todo para a remo��o de uma liga��o do professor � uma disciplina.
     * @param
     */
    public void removerProfessorDisciplina() {
        // TODO implement here
    }

    /** M�todo para retorno do ID TurmaProfessorDisciplina.
     * @return Int - ID TurmaProfessorDisciplina
     */
    public int getTurmaProfessorDisciplina() {
        TurmaProfessorDisciplina turmaPD = new TurmaProfessorDisciplina();
        return turmaPD.getIdTurmaProfessorDisciplina();
    }

    /** M�todo para adicionar a liga��o entre a turma, professor e disciplina.
     * @param -
     */
    public void adicionarTurmaProfessorDisciplina() {
        // TODO implement here
    }

    /** M�todo para remover a liga��o entre a turma, professor e disciplina.
     * @param TurmaProfessorDisciplinaDAO
     */
    public void removerTurmaProfessorDisciplina(TurmaProfessorDisciplina turmaPD) {
        // TODO implement here
    }

    /** M�todo para retorno do ID da sala padr�o de cada turma.
     * @return Int - ID da sala padr�o
     */
    public int getSalaPadrao() {
        SalaPadrao salaPadrao = new SalaPadrao();
        return salaPadrao.getIdSala();
    }

    /** M�todo para adicionar uma sala padr�o � uma turma.
     * @param Turma - Turma a ser atribuida � sala padr�o.
     */
    public void adicionarSalaPadrao(Turma turma) {
        // TODO implement here
    }

    /** M�todo para atualizar a sala padr�o.
     * @param SalaPadrao - Sala a ser atualizada
     */
    public void atualizarSalaPadrao(SalaPadrao salaP) {
        // TODO implement here
    }

    /** M�todo para a remo��o de uma sala padr�o.
     * @param SalaPadrao - Sala a ser removida.
     * @param Turma - Turma a ter a sala padr�o removida.
     */
    public void removerSalaPadrao(SalaPadrao salaP, Turma turma) {
        // TODO implement here
    }

}