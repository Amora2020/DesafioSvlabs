#language:pt
@Categoria
Funcionalidade: Categoria

  Cenario: Consulta Categorias
    Dado que tenha realizado um Request de Token e guardado o valor do authorization
    Dado sejam preenchidos os valores do categorias
    Quando um request de GET for realizado de Categoria
    Entao o sistema devolve o status 200

  Esquema do Cenario: Valida Campos tipo <tipo>
    Entao valido que a lista "tipo" tenha o valor "<tipo>"

    Exemplos: 
      | tipo          |
      | Aventura      |
      | Ação          |
      | Terror        |
      | Drama         |
      | Comédia       |
      | Sobrevivência |
      | Crime         |
      | Thriller      |
