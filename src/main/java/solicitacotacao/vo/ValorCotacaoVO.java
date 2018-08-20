package solicitacotacao.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValorCotacaoVO", propOrder = {
	    "codigoFipe",
	    "codigoProduto",
	    "cpf",
	    "nome",
	    "numeroCotacao",
	    "totalParcelas",
	    "valorDemaisParcelas",
	    "valorFipe",
	    "valorPrimeiraParcela"
	})
public class ValorCotacaoVO extends RetornoVO implements Serializable {

	private static final long serialVersionUID = 5738239352736053245L;
	
	private String	nome;
	private Integer	codigoProduto;
	private Long	cpf;
	private Integer	codigoFipe;
	private Double	valorFipe;
	private Double	valorPrimeiraParcela;
	private Double	valorDemaisParcelas;
	private Integer	totalParcelas;
	private Integer	numeroCotacao;
	
	public ValorCotacaoVO(){
	}
	
	public ValorCotacaoVO(SolicitacaoCotacaoVO solCotacao){
		this.setCodigoFipe(solCotacao.getCodigoFipe());
		this.setCodigoProduto(solCotacao.getCodigoProduto());
		this.setCpf(solCotacao.getCpfSegurado());
		this.setNome(solCotacao.getNomeSegurado());
		this.setUser(solCotacao.getUser());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Integer getCodigoFipe() {
		return codigoFipe;
	}
	public void setCodigoFipe(Integer codigoFipe) {
		this.codigoFipe = codigoFipe;
	}
	public Double getValorFipe() {
		return valorFipe;
	}
	public void setValorFipe(Double valorFipe) {
		this.valorFipe = valorFipe;
	}
	public Double getValorPrimeiraParcela() {
		return valorPrimeiraParcela;
	}
	public void setValorPrimeiraParcela(Double valorPrimeiraParcela) {
		this.valorPrimeiraParcela = valorPrimeiraParcela;
	}
	public Double getValorDemaisParcelas() {
		return valorDemaisParcelas;
	}
	public void setValorDemaisParcelas(Double valorDemaisParcelas) {
		this.valorDemaisParcelas = valorDemaisParcelas;
	}
	public Integer getTotalParcelas() {
		return totalParcelas;
	}
	public void setTotalParcelas(Integer totalParcelas) {
		this.totalParcelas = totalParcelas;
	}
	public Integer getNumeroCotacao() {
		return numeroCotacao;
	}
	public void setNumeroCotacao(Integer numeroCotacao) {
		this.numeroCotacao = numeroCotacao;
	}
}
