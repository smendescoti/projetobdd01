#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastro de Usu�rio
	Como um usu�rio da aplica��o
	Eu quero criar uma conta de acesso
	Para que eu possa acessar a �rea restrita da aplica��o
	
Esquema do Cen�rio: Cadastro de conta de usu�rio com sucesso
	Dado Acessar a p�gina de cadastro de conta de usu�rio
	E Informar o nome do usu�rio <nome>
	E Informar o email do usu�rio <email>
	E Informar a senha do usu�rio <senha>
	E Confirmar a senha do usu�rio <senha>
	E Informar a foto do usu�rio <foto>
	Quando Solicitar a realiza��o do cadastro
	Ent�o Sistema informa que o usu�rio foi cadastrado com sucesso
							
	Exemplos:
	| nome 										 | email 								   | senha 			 | foto 							|
	| "Sergio da Silva Mendes" | "sergio.coti@gmail.com" | "@Coti123"  | "foto_usuario.jpg" |
	| "Ana Paula da Silva"     | "anapaula@gmail.com"    | "@Teste123" | "foto_usuario.jpg" |