package solicitacotacao.vo;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "SolicitacaoCotacao", propOrder = {
	    "user",
	    "password",
	    "codigoProduto",
	    "nomeSegurado",
	    "cpfSegurado",
	    "telefoneSegurado",
	    "dataNascimento",
	    "cepSegurado",
	    "estadoCirculacao",
	    "cidadeCirculacao",
	    "codigoFipe",
	    "anoModelo",
	    "combustivel",
	    "zeroKM",
	    "cnpjSegurado"
	})
@XmlAccessorType(XmlAccessType.FIELD)
public class SolicitacaoCotacaoVO{
	private String	telefoneSegurado;
	private Date	dataNascimento;
	private String user;
	private String password;
	private Integer codigoProduto;
	private String estadoCirculacao;
	private String cidadeCirculacao;
	private Integer	codigoFipe;
	private Integer	anoModelo;
	private String combustivel;
	private String zeroKM;
	private String nomeSegurado;
	private Long cpfSegurado;
	private String	CEPCirculacao;
	private Long cnpjSegurado;
		
	public String getTelefoneSegurado() {
		return telefoneSegurado;
	}
	public void setTelefoneSegurado(String telefoneSegurado) {
		this.telefoneSegurado = telefoneSegurado;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getEstadoCirculacao() {
		return estadoCirculacao;
	}
	public void setEstadoCirculacao(String estadoCirculacao) {
		this.estadoCirculacao = estadoCirculacao;
	}
	public String getCidadeCirculacao() {
		return cidadeCirculacao;
	}
	public void setCidadeCirculacao(String cidadeCirculacao) {
		this.cidadeCirculacao = cidadeCirculacao;
	}
	public Integer getCodigoFipe() {
		return codigoFipe;
	}
	public void setCodigoFipe(Integer codigoFipe) {
		this.codigoFipe = codigoFipe;
	}
	public Integer getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getZeroKM() {
		return zeroKM;
	}
	public void setZeroKM(String zeroKM) {
		this.zeroKM = zeroKM;
	}
	public String getNomeSegurado() {
		return nomeSegurado;
	}
	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}
	public Long getCpfSegurado() {
		return cpfSegurado;
	}
	public void setCpfSegurado(Long cpfSegurado) {
		this.cpfSegurado = cpfSegurado;
	}
	public String getCEPCirculacao() {
		return CEPCirculacao;
	}
	public void setCEPCirculacao(String cEPCirculacao) {
		CEPCirculacao = cEPCirculacao;
	}
	public Long getCnpjSegurado() {
		return cnpjSegurado;
	}
	public void setCnpjSegurado(Long cnpjSegurado) {
		this.cnpjSegurado = cnpjSegurado;
	}
}
