#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastro de Usuário
	Como um usuário da aplicação
	Eu quero criar uma conta de acesso
	Para que eu possa acessar a área restrita da aplicação
	
Esquema do Cenário: Cadastro de conta de usuário com sucesso
	Dado Acessar a página de cadastro de conta de usuário
	E Informar o nome do usuário <nome>
	E Informar o email do usuário <email>
	E Informar a senha do usuário <senha>
	E Confirmar a senha do usuário <senha>
	E Informar a foto do usuário <foto>
	Quando Solicitar a realização do cadastro
	Então Sistema informa que o usuário foi cadastrado com sucesso
							
	Exemplos:
	| nome 										 | email 								   | senha 			 | foto 							|
	| "Sergio da Silva Mendes" | "sergio.coti@gmail.com" | "@Coti123"  | "foto_usuario.jpg" |
	| "Ana Paula da Silva"     | "anapaula@gmail.com"    | "@Teste123" | "foto_usuario.jpg" |