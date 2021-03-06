package entidade;

import java.sql.Timestamp;

/**
 * Classe contendo metodos e atributos para o professor.
 * Herda metodos e atributos da classe Usuario
 * @see Usuario
 * @author Andrey 
 */
public class Professor extends Usuario {

	/**
     * Construtor padrao
     * @param
     */
    public Professor() {
    	//Nenhum atributo inicializado
    }

    /**
     * Metodo construtor que preenche os atributos da classe 
     * @param idUsuario
     * @param nome
     * @param sobrenome
     * @param cpf
     * @param telefone
     * @param celular
     * @param email
     * @param senha
     * @param horarioInicioExpediente
     * @param horarioFinalExpediente
     * @param fotoUsuario
     * @param fk_endereco
     * @param fk_escola
     */
	public Professor(int idUsuario, String nome, String sobrenome, String cpf, String telefone, String celular,
					 String email, String senha, Timestamp horarioInicioExpediente, Timestamp horarioFinalExpediente,
					 String fotoUsuario, int fk_endereco, int fk_escola) {
		
		super(idUsuario, nome, sobrenome, cpf, telefone, celular, 4, email, senha, horarioInicioExpediente,
				horarioFinalExpediente, fotoUsuario, fk_endereco, fk_escola);
	}
}