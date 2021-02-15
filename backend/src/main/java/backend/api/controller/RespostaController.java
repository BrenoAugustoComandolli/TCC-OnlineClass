package backend.api.controller;

import java.sql.SQLException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import backend.api.controller.form.NotasForm;
import backend.api.controller.form.RespostaForm;
import backend.api.controller.form.RespostaVisualizacaoForm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import entidade.Resposta;
import persistencia.jdbc.RespostaDAO;

/**
 * Metodo controller do resposta para consulta no banco de dados através da API Rest
 * @author Andre
 *
 */
@RestController
public class RespostaController {
	
	public static final Logger LOGGER = LoggerFactory.getLogger("backend.api");
	
	/**
	 * Retorna a resposta que corresponde ao id indicado {GET}
	 * @param int codigo
	 * @return String json
	 * @author Andre
	 */
	@GetMapping(path = "/api/resposta/{codigo}")
	public String consultar(@PathVariable("codigo") int codigo) {
		LOGGER.info("Requisição Resposta codigo {} iniciada", codigo);
		RespostaDAO respostaDao = new RespostaDAO();
		Resposta resposta;
		try {
			resposta = respostaDao.buscarId(codigo);
			Gson gson = new Gson();
			String json = gson.toJson(resposta);
			LOGGER.info("Requisição Resposta codigo {} bem sucedida",codigo);
			return json;
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.error("Requisição para Consultar Resposta Mal Sucedida - Resposta {} - erro - {}",codigo,e.toString());
			return null;
		}
	}
	
	/**
	 * Retorna a lista das respostas registrados no sistema {GET}
	 * @return lista de respostas registrados no banco
	 * @author Andre
	 */
	@GetMapping(path = "/api/respostas")
	public List<Resposta> consultar(){
		LOGGER.info("Requisição List<Resposta>");
		List<Resposta> lista;
		RespostaDAO respostaDao = new RespostaDAO();
		try {
			lista = respostaDao.buscarTodos();
			LOGGER.info("Requisição List<Resposta> bem sucedida");
			return lista;
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.error("Requisição para Consultar todos Resposta Mal Sucedida - erro - {}",e.toString());
			return null;
		}
	}
	
	/**
	 * Insere uma nova resposta no banco de dados {POST}
	 * @param String json
	 * @author Andre
	 * @return boolean situacao da operacao
	 */
	@PostMapping(path = "/api/resposta/inserir/{json}")
	public boolean inserir(@PathVariable("json") String json) {
		System.out.println("Entrou");
		LOGGER.info("Requisição Inserir Resposta - {}",json);
		Gson gson = new Gson();
		Resposta resposta = gson.fromJson(json, Resposta.class);
		RespostaDAO respostaDAO = new RespostaDAO();
		try {
			respostaDAO.insert(resposta);
			LOGGER.info("Requisição Inserir Resposta - {} - Bem Sucedida",json);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.error("Requisição para Inserir Resposta Mal Sucedida - Resposta {} - erro - {}",json,e.toString());
			return false;
		}
	}

	/**
	 * Metodo para alteração da resposta que corresponde ao codigo informado {PUT}
	 * @param int codigo
	 * @param String json
	 * @author Andre
	 * @return boolean situacao da operacao
	 */
	@PutMapping(path = "/api/resposta/alterar/{codigo}/{json}")
	public boolean alterar(@PathVariable("codigo") int codigo, @PathVariable("json") String json) {
		LOGGER.info("Requisição Atualizar Resposta - {}",json);
	    GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.setDateFormat("yyyy-MM-dd HH:mm:ss");
		Gson gson = gsonBuilder.create();
		Resposta resposta = gson.fromJson(json, Resposta.class);
		RespostaDAO respostaDAO = new RespostaDAO();
		try {
			respostaDAO.update(resposta);
			LOGGER.info("Requisição Atualizar Resposta - {} - Bem Sucedida",json);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.error("Requisição para Atualizar Resposta Mal Sucedida - Resposta {} - erro - {}",json,e.toString());
			return false;
		}
	}
	
	/**
	 * Método de exclusão da resposta que corresponde ao codigo informado {DELETE}
	 * @param int codigo
	 * @author Andre
	 * @return boolean situacao da operacao
	 */
	@DeleteMapping(path = "/api/resposta/deletar/{codigo}")
	public boolean deletar(@PathVariable("codigo") int codigo) {
		LOGGER.info("Requisição para Deletar Resposta id - {}",codigo);
		RespostaDAO respostaDAO = new RespostaDAO();
		try {
			respostaDAO.deleteId(codigo);
			LOGGER.info("Requisição para Deletar Resposta id - {} - Bem Sucedida",codigo);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Requisição para Deletar Resposta Mal Sucedida - Resposta {} - erro - {}",codigo,e.toString());
			return false;
		}
	}
	
	/**
	 * Retorna a lista das notas registradas no sistema {GET}
	 * @return lista de respostas registrados no banco
	 * @author Breno
	 */
	@GetMapping(path = "/api/notas/{idUsuario}")
	public List<NotasForm> consultarNotas(@PathVariable("idUsuario") int idUsuario){
		LOGGER.info("Requisição List<NotasForm>");
		List<NotasForm> lista;
		RespostaDAO respostaDao = new RespostaDAO();
		try {
			lista = respostaDao.buscarNotas(idUsuario);
			LOGGER.info("Requisição List<NotasForm> bem sucedida");
			return lista;
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.error("Requisição para Consultar todas as notas Mal Sucedida - erro - {}",e.toString());
			return null;
		}
	}
	
	/**
	 * Verifica se alguma resposta ja foi mandada à atividade (GET)
	 * @return resposta
	 * @param int idAtividade
	 * @author Andrey
	 */
	@GetMapping(path = "/api/atividade/resposta/{idAtividade}/{idAluno}")
	public RespostaForm consultarTurmaAtividade(@PathVariable("idAtividade") int idAtividade, @PathVariable("idAluno") int idAluno) {
		LOGGER.info("Requisição Resposta Atividade Existente");
		RespostaForm respostaForm;
		RespostaDAO respostaDao = new RespostaDAO();
		try {
			respostaForm = respostaDao.verificarResposta(idAtividade, idAluno);
			LOGGER.info("Requisição Resposta Atividade Existente bem sucedida idAtividade - {}",idAtividade);
			return respostaForm;
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.error("Requisição para verificar Resposta Atividade Existente idAtividade - {} Mal Sucedida - erro - {}",idAtividade,e.toString());
			return null;
		}
	}

	/**
	 * Retorna uma lista de respostas de uma turma em uma disciplina (GET)
	 * @return List<RespostaVisualizacaoForm> lista
	 * @param int idTurma
	 * @param int idDisciplina 
	 * @author Breno
	 */
	@GetMapping(path = "/api/atividade/resposta/turma/{idTurma}/{idDisciplina}")
	public List<RespostaVisualizacaoForm> consultarRespostasTurma(@PathVariable("idTurma") int idTurma, @PathVariable("idDisciplina") int idDisciplina) {
		LOGGER.info("Requisição List<RespostaVisualizacaoForm> iniciada");
		List<RespostaVisualizacaoForm> lista;
		RespostaDAO respostaDao = new RespostaDAO();
		try {
			lista = respostaDao.consultarRespostasTurma(idTurma, idDisciplina);
			LOGGER.info("Requisição List<RespostaVisualizacaoForm> sucedida idTurma - {} - idDisciplina - {}",idTurma, idDisciplina);
			return lista;
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.error("Requisição List<RespostaVisualizacaoForm> Mal Sucedida idTurma - {} - idDisciplina - {} - erro - {}",idTurma, idDisciplina,e.toString());
			return null;
		}
	}
	
	/**
	 * Metodo para alteração da nota da resposta que corresponde ao codigo informado {PUT}
	 * @param int codigo
	 * @param double nota
	 * @author Andre
	 * @return boolean situacao da operacao
	 */
	@PutMapping(path = "/api/resposta/alterar/nota/{codigo}/{nota}")
	public boolean alterarNota(@PathVariable("codigo") int codigo, @PathVariable("nota") double nota) {
		LOGGER.info("Requisição Atualizar Nota da Resposta - {}",codigo);
		RespostaDAO respostaDAO = new RespostaDAO();
		try {
			respostaDAO.updateNota(codigo, nota);
			LOGGER.info("Requisição Atualizar Nota da Resposta - {} - Bem Sucedida",codigo);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.error("Requisição para Atualizar Nota da Resposta Mal Sucedida - Resposta {} - erro - {}",codigo,e.toString());
			return false;
		}
	}
}
