#language: pt
#encoding: iso-8859-1

Funcionalidade: Acesso ao Sistema
	Como um usu�rio cadastrado no sistema
	Eu quero acessar minha conta de usu�rio
	Para que eu possa gerenciar funcion�rios
	
Cen�rio: Acesso ao sistema com sucesso
	Dado Acessar a p�gina de autentica��o de usu�rios
	E Informar o email de acesso "sergio.coti@gmail.com"
	E Informar a senha de acesso "@S3rg10"
	Quando Solicitar o acesso ao sistema
	Ent�o Sistema autentica o usu�rio com sucesso
	E Aplica��o � finalizada
	
Cen�rio: Acesso negado de usu�rio
	Dado Acessar a p�gina de autentica��o de usu�rios
	E Informar o email de acesso "teste@gmail.com"
	E Informar a senha de acesso "teste"
	Quando Solicitar o acesso ao sistema
	Ent�o Sistema exibe a mensagem "Acesso Negado"
	E Aplica��o � finalizada
	
Cen�rio: Valida��o de campos obrigat�rios
	Dado Acessar a p�gina de autentica��o de usu�rios
	Quando Solicitar o acesso ao sistema
	Ent�o Sistema informa que o campo email � de preenchimento obrigat�rio
	E Sistema informa que o campo senha � de preenchimento obrigat�rio
	E Aplica��o � finalizada
	
	