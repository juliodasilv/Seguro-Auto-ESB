# Seguro-Auto-ESB

## Exemplo de utilização

1. Executar o projeto no ambiente Mule.
2. No SOAPUI criar um novo projeto apontando para o endereço do endpoint: http://localhost:8081/cotacao/proxy?wsdl
3. Exemplo de requisição:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:seg="http://seguroauto/"><br/>
&nbsp;&nbsp;<soapenv:Header/><br/>
&nbsp;&nbsp;<soapenv:Body><br/>
&nbsp;&nbsp;&nbsp;<seg:solicitaCotacao><br/>
&nbsp;&nbsp;&nbsp;&nbsp;<solicitaCotacao><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<anoModelo>2011</anoModelo><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<CEPCirculacao>04231000</CEPCirculacao><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<cidadeCirculacao>Sao Paulo</cidadeCirculacao><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<cnpjSegurado>5323244234</cnpjSegurado><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<codigoFipe>12341</codigoFipe><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<codigoProduto>311</codigoProduto><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<combustivel>G</combustivel><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<cpfSegurado>34448623658</cpfSegurado><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<dataNascimento>22101985</dataNascimento><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<estadoCirculacao>sp</estadoCirculacao><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<nomeSegurado>John Doe</nomeSegurado><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<password>123456</password><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<telefoneSegurado>11-986731056</telefoneSegurado><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<user>josilva</user><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<zeroKM>S</zeroKM><br/>
&nbsp;&nbsp;&nbsp;&nbsp;</solicitaCotacao><br/>
&nbsp;&nbsp;&nbsp;</seg:solicitaCotacao><br/>
&nbsp;&nbsp;</soapenv:Body><br/>
</soapenv:Envelope><br/>

4. Resposta

![alt tag](https://raw.githubusercontent.com/juliodasilv/Seguro-Auto-ESB/master/files/response.JPG)

## Arquitetura do Barramento

![alt tag](https://raw.githubusercontent.com/juliodasilv/Seguro-Auto-ESB/master/files/barramento.JPG)

## Resumo das tecnologias utilizadas

* [Mule ESB](https://www.mulesoft.com/) - O Mule é uma estrutura leve de integração e barramento de serviços corporativos fornecida pela MuleSoft.


## Autores

* **Julio Oliveira da Silva** - [juliodasilv](https://github.com/juliodasilv)
* **Helena Strada** - [hstrada](https://github.com/hstrada)
