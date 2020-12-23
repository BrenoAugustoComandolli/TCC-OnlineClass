package entidade;

/**
 * Classe contendo m�todos e atributos para o endere�o dos usu�rios cadastrados no sistema.
 * @see Usuario
 * @author 
 */
public class Endereco {
	private int idEndereco;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String cep;
    
    /**
     * Construtor usado ao instanciar a classe Endereco.
     * @param
     */
    public Endereco() {
    }

    /**
     * M�todo de retorno do id endere�o
     * @return
     */
    public int getIdEndereco() {
		return idEndereco;
	}

    /**
     * M�todo de inser��o do id endere�o
     * @param idEndereco
     */
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	/** M�todo para retorno do estado.
     * @return String - Estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * 
     */
    public void setEstado() {
        // TODO implement here
    }

    /** M�todo para retorno da cidade.
     * @return String - Cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * 
     */
    public void setCidade() {
        // TODO implement here
    }

    /** M�todo para retorno do bairro.
     * @return String - Bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * 
     */
    public void setBairro() {
        // TODO implement here
    }

    /** M�todo para retorno da rua.
     * @return String - Rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * 
     */
    public void setRua() {
        // TODO implement here
    }

    /** M�todo para retorno do n�mero.
     * @return Int - N�mero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * 
     */
    public void setNumero() {
        // TODO implement here
    }

    /** M�todo para retorno do CEP.
     * @return String - CEP
     */
    public String getCep() {
        return cep;
    }

    /**
     * 
     */
    public void setCep() {
        // TODO implement here
    }

}