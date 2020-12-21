package entidade;

/**
 * Classe contendo m�todos e atributos para a sala de aula.
 * Local onde ocorre as reuni�es
 * @see Reuniao
 * @author 
 */
public class Sala {
    private int idSala;
    private String nome;
    private String descricao;
    private boolean situacaoAcesso;
    private boolean tipoSala;
    private String link;

    /**
     * Construtor usado ao instanciar a classe Sala.
     * @param
     */
    public Sala() {
    }

    /**
     * M�todo construtor que preenche todas os dados da tabela sala
     * @param nome
     * @param descricao
     * @param situacaoAcesso
     * @param tipoSala
     * @param link
     */
	public Sala(String nome, String descricao, boolean situacaoAcesso, boolean tipoSala, String link) {
		setNome(nome);
		setDescricao(descricao);
		setSituacaoAcesso(situacaoAcesso);
		setTipoSala(tipoSala);
		setLink(link);
	}
	
	/**
	 * M�todo de exbi��o de dados da classe
	 */
	@Override
	public String toString() {
		return "Sala [idSala=" + idSala + ", nome=" + nome + ", descricao=" + descricao + ", situacaoAcesso="
				+ situacaoAcesso + ", tipoSala=" + tipoSala + ", link=" + link + "]";
	}

	/** M�todo para retorno do ID da sala.
     * @return Int - ID da sala
     */
    public int getIdSala() {
        return idSala;
    }

    /** M�todo para retorno do nome da sala.
     * @return String - Nome da sala
     */
    public String getNome() {
        return nome;
    }

    /** M�todo para retorno da descri��o da sala.
     * @return String - Descri��o da sala
     */
    public String getDescricao() {
        return descricao;
    }

    /** M�todo para retorno da situa��o de acesso.
     * @return Boolean - Permitida a entrada? True / False
     */
    public boolean getSituacaoAcesso() {
        return situacaoAcesso;
    }

    /** M�todo para retorno do tipo da sala.
     * @return Boolean - True para sala padr�o / False para sala personalizada
     */
    public boolean getTipoSala() {
        return tipoSala;
    }

    /** M�todo para retorno do link da reuni�o.
     * @return String - Link da reuni�o
     */
    public String getLink() {
        return link;
    }

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setSituacaoAcesso(boolean situacaoAcesso) {
		this.situacaoAcesso = situacaoAcesso;
	}

	public void setTipoSala(boolean tipoSala) {
		this.tipoSala = tipoSala;
	}

	public void setLink(String link) {
		this.link = link;
	}
}