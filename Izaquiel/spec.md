Sistema escolhido:
* Processador de Boletos

Spec

*Deve-se implementar um processador de boletos. <br>
O objetivo desse processador é verificar todos os boletos e, caso o valor da soma de todos os boletos seja maior que o valor da fatura, então essa fatura deverá ser considerada como paga. <br>
Uma fatura contém data, valor total e nome do cliente. <br>
Um boleto contém o código do boleto, data, e valor pago. <br>
O processador de boletos, ao receber uma lista de boletos, deve então, para cada boleto, criar um "pagamento" associado a essa fatura. <br>
Esse pagamento contém o valor pago, a data, e o tipo do pagamento efetuado (que nesse caso é "BOLETO").<br>
Como dito anteriormente, caso a soma de todos os boletos ultrapasse o valor da fatura, a mesma deve ser marcada como "PAGA". <br>*

**Exemplo: Fatura de 1.500,00 com 3 boletos no valor de 500,00, 400,00 e 600,00: fatura marcada como PAGA, e três pagamentos do tipo BOLETO criados.**

Doc: [Exercicio-TDD](https://docs.google.com/document/d/1Xc04sNt2q1HWb9h4LCdvHe8JkUy6PtGsOmNMoR3UoMk/edit#)