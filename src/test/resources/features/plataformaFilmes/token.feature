#language:pt

@Token
Funcionalidade: Token

	Cenario: Gera token
		Dado sejam preenchidos os valores do token
		Quando um request de POST for realizado de Token
		Entao o sistema devolve o status 201
		E guardo o valor do token
		