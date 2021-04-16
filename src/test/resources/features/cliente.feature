#language:pt

@CadastroCliente
Funcionalidade: Cadastro de Cliente

  Cenario: Cadastro com Sucesso
    Dado que tenha um payload com dados validos
    Quando realizo uma request do tipo POST
    Entao valido que o campo "customerID" seja igual a 111111
    E valido que o statusCode retornou 201

  Cenario: Cadastro com Sucesso somente com campos obrigatórios
    Dado que tenha um payload com dados somente obrigatorios
    Quando realizo uma request do tipo POST
    Entao valido que o campo "customerID" seja igual a 111111
    E valido que o statusCode retornou 201

  Esquema do Cenario: Cadastro sem o campo <campo>
    Dado que tenha um payload com dados validos
    Quando removo o campo "<campo>" de address
    Quando realizo uma request do tipo POST
    Entao valido que o statusCode retornou 400
    E valido que a descricao retornou com "Campo <campo> não informado"

    Exemplos: 
      | campo   |
      | zipCode |
      | street  |
      | number  |

  Esquema do Cenario: Cadastro sem o campo <campo>
    Dado que tenha um payload com dados validos
    Quando removo o campo "<campo>" de customer
    Quando realizo uma request do tipo POST
    Entao valido que o statusCode retornou 400
    E valido que a descricao retornou com "Campo <campo> não informado"

    Exemplos: 
      | campo     |
      | birthDate |
      | cpf       |
      | name      |

  Esquema do Cenario: Cadastro com zipCode invalido
    Dado que tenha um payload com dados validos
    Quando altero o campo "zipCode" de address com "<valor>"
    Quando realizo uma request do tipo POST
    Entao valido que o statusCode retornou 400
    E valido que a descricao retornou com "Campo zipCode inválido"

    Exemplos: 
      | valor      |
      | AAAA       |
      | 4512457841 |

  Cenario: Cadastro com cpf com 12 digitos
    Dado que tenha um payload com dados validos
    Quando altero o campo "cpf" de customer com "451874512345"
    Quando realizo uma request do tipo POST
    Entao valido que o statusCode retornou 400
    E valido que a descricao retornou com "Campo CPF deve conter 11 dígitos"

  Cenario: Cadastro com birthDate menor de 16 anos
    Dado que tenha um payload com dados validos
    Quando altero o campo "birthDate" de customer com "2020-12-01"
    Quando realizo uma request do tipo POST
    Entao valido que o statusCode retornou 412
    E valido que a descricao retornou com "Permitido o cadastro somente para maiores de 16 anos"
