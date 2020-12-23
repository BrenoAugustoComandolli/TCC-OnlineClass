package entidade;

/**
 * Classe contendo m�todos e atributos para a liga��o da Turma com as Atividades.
 * @see Turma
 * @see Atividade
 * @author
 */
public class TurmaAtividade {
    private int idTurmaAtividade;
    private int idTurma;
    private int idAtividade;
    
    /**
     * Construtor usado ao instanciar a classe TurmaAtividade.
     * @param
     */
    public TurmaAtividade() {
    }
    
    /**
     * M�todo construtor que preenche todas as informa��es da classe TurmaAtividade
     * @param idTurmaAtividade
     * @param idTurma
     * @param idAtividade
     */
    public TurmaAtividade(int idTurmaAtividade, int idTurma, int idAtividade) {
		setIdTurmaAtividade(idTurmaAtividade);
		setFk_Turma(idTurma);
		setFk_Atividade(idAtividade);
	}

	/** M�todo para retorno do ID da TurmaAtividade.
     * @return Int - ID TurmaAtividade
     */
	public int getIdTurmaAtividade() {
		return idTurmaAtividade;
	}
	
	/**
	 * M�todo de inser��o do idTurmaAtividade
	 * @param idTurmaAtividade
	 */
	public void setIdTurmaAtividade(int idTurmaAtividade) {
		this.idTurmaAtividade = idTurmaAtividade;
	}

    /** M�todo para retorno do ID da turma.
     * @return Int - ID da turma
     */
    public int getFk_Turma() {
        return idTurma;
    }
    
    /**
     * M�todo de inser��o do idTurma
     * @param idTurma
     */
	public void setFk_Turma(int idTurma) {
		this.idTurma = idTurma;
	}

    /** M�todo para retorno da atividade.
     * @return int - idAtividade
     */
    public int getFk_Atividade() {
        return idAtividade;
    }

    /**
     * M�todo de iser��o da atividade 
     * @param idAtividade
     */
	public void setFk_Atividade(int idAtividade) {
		this.idAtividade = idAtividade;
	}

}