# Seguro-Auto-ESB

## Exemplo de utilização

1. Executar o projeto no ambiente Mule.
2. No SOAPUI criar um novo projeto apontando para o endereço do endpoint: http://localhost:8081/cotacao/proxy?wsdl
3. Exemplo de requisição:

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:seg="http://seguroauto/"><br/>
  <soapenv:Header/><br/>
  <soapenv:Body><br/>
   <seg:solicitaCotacao><br/>
    <solicitaCotacao><br/>
     <anoModelo>2011</anoModelo><br/>
     <CEPCirculacao>04231000</CEPCirculacao><br/>
     <cidadeCirculacao>Sao Paulo</cidadeCirculacao><br/>
     <cnpjSegurado>5323244234</cnpjSegurado><br/>
     <codigoFipe>12341</codigoFipe><br/>
     <codigoProduto>311</codigoProduto><br/>
     <combustivel>G</combustivel><br/>
     <cpfSegurado>34448623658</cpfSegurado><br/>
     <dataNascimento>22101985</dataNascimento><br/>
     <estadoCirculacao>sp</estadoCirculacao><br/>
     <nomeSegurado>John Doe</nomeSegurado><br/>
     <password>123456</password><br/>
     <telefoneSegurado>11-986731056</telefoneSegurado><br/>
     <user>josilva</user><br/>
     <zeroKM>S</zeroKM><br/>
    </solicitaCotacao><br/>
   </seg:solicitaCotacao><br/>
  </soapenv:Body><br/>
</soapenv:Envelope><br/>
```

4. Resposta

![alt tag](https://raw.githubusercontent.com/juliodasilv/Seguro-Auto-ESB/master/files/response.JPG)

## Arquitetura do Barramento

![alt tag](https://raw.githubusercontent.com/juliodasilv/Seguro-Auto-ESB/master/files/barramento.JPG)

## Resumo das tecnologias utilizadas

* [Mule ESB](https://www.mulesoft.com/) - O Mule é uma estrutura leve de integração e barramento de serviços corporativos fornecida pela MuleSoft.


## Autores

* **Julio Oliveira da Silva** - [juliodasilv](https://github.com/juliodasilv)
* **Helena Strada** - [hstrada](https://github.com/hstrada)
