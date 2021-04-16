#language:pt

Funcionalidade: Filmes
	@CadastroFilme
	Cenario: Cadastro de Filme
		Dado que tenha realizado um Request de Token e guardado o valor do authorization
		Dado que tenha realizado um cadastro na plataforma e o valor do nome foi armazenado
		Dado que sejam preenchidos os valores de filmes
		Quando o campo "nome" for alterado para "A espera de um milagre[data]" de Filme
		Quando o campo "nome" de plataformas for alterado para o valor armazenado em Filme
		Quando um request de POST for realizado de Filme
		Entao o sistema devolve o status 201
		E armazeno o valor do campo id do response de Filme
		Quando realizo uma request de Get de filmes
		Entao valido que a lista "nome" possua o filme armazenado
		