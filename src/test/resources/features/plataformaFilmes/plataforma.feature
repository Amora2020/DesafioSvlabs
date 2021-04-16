#language:pt

@Plataforma
Funcionalidade: Plataforma
	Cenario: Cadastro de Plataforma
		Dado que tenha realizado um Request de Token e guardado o valor do authorization
    Dado sejam preenchidos os valores de plataforma
    Quando o campo "nome" for alterado para "Disney++[data]" de Plataforma
    Quando um request de POST for realizado de Plataforma
    Entao o sistema devolve o status 201
    E armazeno o valor do campo nome do response de Plataforma
		