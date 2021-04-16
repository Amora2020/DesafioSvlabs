#language:pt
@Register
Funcionalidade: Register
	Contexto:
		Dado que sejam preenchidos os valores do Register
	
	@CadRegister
	Cenario: Cadastro Register
		Quando que seja realizado o POST do Register
		Entao o sistema devolve o status 201
	
	
	@CadRegister2
	Cenario: Cadastro Register
		Quando o campo "first_name" seja alterado para "Adam Vinicius" do Register
		Quando o campo "email" seja alterado para "adamvinicius@gmail.com" do Register
		Quando o campo "phone" seja alterado para "4512457854" do Register
		Quando o campo "country" seja alterado para "Brasil" do Register
		Quando que seja realizado o POST do Register
		Entao o sistema devolve o status 201
	
	
	@CadRegister3
	Cenario: Cadastro Register
		Quando o campo "year" seja alterado para 1989 do date_of_birth de Register
		Quando o campo "month" seja alterado para 11 do date_of_birth de Register
		Quando que seja realizado o POST do Register
		Entao o sistema devolve o status 201
	
	@CadRegister4
	Cenario: Cadastro Register
		Quando o indice 0 seja alterado para "Baseball" do hobbies de Register
		Quando o indice 1 seja alterado para "Golf" do hobbies de Register
		Quando que seja realizado o POST do Register
		Entao o sistema devolve o status 201
	
	@CadRegister5
	Cenario: Cadastro Register
		Quando o indice 0 onde o campo "name" seja alterado para "Portuguese" do languages de Register
		Quando que seja realizado o POST do Register
		Entao o sistema devolve o status 201
	