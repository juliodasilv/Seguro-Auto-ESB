package solicitacotacao.ws;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import solicitacotacao.vo.SolicitacaoCotacaoVO;
import solicitacotacao.vo.ValorCotacaoVO;

@Path("/seguro")
public class SeguroAuto {

	/**
	 * @param solicitaCotacaoVO
	 * @return
	 */
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})	
	@Path("/solicitaCotacao")
	public ValorCotacaoVO solicita(SolicitacaoCotacaoVO solicitaCotacaoVO){
		ValorCotacaoVO valorCotacaoVO = new ValorCotacaoVO();

		//Retorna dados relevantes da requisicao para o
		valorCotacaoVO.setCodigoFipe(solicitaCotacaoVO.getCodigoFipe());
		valorCotacaoVO.setCodigoProduto(solicitaCotacaoVO.getCodigoProduto());
		valorCotacaoVO.setCpf(solicitaCotacaoVO.getCpfSegurado());
		valorCotacaoVO.setNome(solicitaCotacaoVO.getNomeSegurado());

		if(usuarioValido(solicitaCotacaoVO.getUser(), solicitaCotacaoVO.getPassword())){
			valorCotacaoVO.setNumeroCotacao((int)Math.random()*1000);
			valorCotacaoVO.setValorFipe(pesquisaValorFipe(solicitaCotacaoVO.getCodigoFipe(), solicitaCotacaoVO.getAnoModelo()));

			//mensagem de sucesso
			valorCotacaoVO.setUser(solicitaCotacaoVO.getUser());
			valorCotacaoVO.setSucesso(true);
			valorCotacaoVO.setRetorno("Sucesso");
			valorCotacaoVO.setCodRetorno(0);
			
			//preenche a quantidade e o valor das parcelas
			carregaValorParcelas(valorCotacaoVO, valorCotacaoVO.getValorFipe());
			
		}else{
			//mensagem de erro
			valorCotacaoVO.setUser(solicitaCotacaoVO.getUser());
			valorCotacaoVO.setSucesso(false);
			valorCotacaoVO.setRetorno("Usuário Inválido.");
			valorCotacaoVO.setCodRetorno(1);
		}
		
        return valorCotacaoVO;
	}

	/**
	 * @param valorCotacaoVO
	 * @param valorFipe
	 */
	private void carregaValorParcelas(ValorCotacaoVO valorCotacaoVO, Double valorFipe) {
		if(valorFipe == 0){
			valorCotacaoVO.setTotalParcelas(0);
			valorCotacaoVO.setValorDemaisParcelas(0d);
			valorCotacaoVO.setValorPrimeiraParcela(0d);
			
			valorCotacaoVO.setSucesso(false);
			valorCotacaoVO.setRetorno("Não há cotação para o veiculo com o codigo fipe e o ano do modelo informados.");
			valorCotacaoVO.setCodRetorno(2);
			
		}else if(valorFipe > 20000){
			valorCotacaoVO.setTotalParcelas(12);
			valorCotacaoVO.setValorDemaisParcelas(139d);
			valorCotacaoVO.setValorPrimeiraParcela(135d);
		}else{
			valorCotacaoVO.setTotalParcelas(1);
			valorCotacaoVO.setValorDemaisParcelas(1000d);
			valorCotacaoVO.setValorPrimeiraParcela(1000d);
		}
	}

	/**
	 * @param codigoFipe
	 * @param anoModelo
	 * @return
	 */
	private Double pesquisaValorFipe(Integer codigoFipe, Integer anoModelo) {
		Double valorFipe = null;
		switch (codigoFipe) {
		//i30
		case 1150711:
			switch (anoModelo) {
			case 2009:
				valorFipe = 30832.0d;
				break;
			case 2010:
				valorFipe = 33469.0d;
				break;
			case 2011:
				valorFipe = 35326.0d;
				break;
			case 2012:
				valorFipe = 37401.0d;
				break;
			default:
				valorFipe = 0d;
				break;
			}
			break;
		//celta
		case 1043184:
			switch (anoModelo) {
			case 2012:
				valorFipe = 17083.0d;
				break;
			case 2013:
				valorFipe = 17789.0d;
				break;
			case 2014:
				valorFipe = 19025.0d;
				break;
			default:
				valorFipe = 0d;
				break;
			}
			break;
		default:
			valorFipe = 0d;
			break;
		}
		
		return valorFipe;
	}

	/**
	 * @param user
	 * @param password
	 * @return
	 */
	private boolean usuarioValido(String user, String password) {
		if(user.equals("josilva")&&password.equals("123456")){
			return true;
		}
		else if(user.equals("hstrada")&&password.equals("123456")){
			return true;
		}else
			return false;
	}
} 