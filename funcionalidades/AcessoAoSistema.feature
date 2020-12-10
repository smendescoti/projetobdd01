#language: pt
#encoding: iso-8859-1

Funcionalidade: Acesso ao Sistema
	Como um usuário cadastrado no sistema
	Eu quero acessar minha conta de usuário
	Para que eu possa gerenciar funcionários
	
Cenário: Acesso ao sistema com sucesso
	Dado Acessar a página de autenticação de usuários
	E Informar o email de acesso "sergio.coti@gmail.com"
	E Informar a senha de acesso "@S3rg10"
	Quando Solicitar o acesso ao sistema
	Então Sistema autentica o usuário com sucesso
	E Aplicação é finalizada
	
Cenário: Acesso negado de usuário
	Dado Acessar a página de autenticação de usuários
	E Informar o email de acesso "teste@gmail.com"
	E Informar a senha de acesso "teste"
	Quando Solicitar o acesso ao sistema
	Então Sistema exibe a mensagem "Acesso Negado"
	E Aplicação é finalizada
	
Cenário: Validação de campos obrigatórios
	Dado Acessar a página de autenticação de usuários
	Quando Solicitar o acesso ao sistema
	Então Sistema informa que o campo email é de preenchimento obrigatório
	E Sistema informa que o campo senha é de preenchimento obrigatório
	E Aplicação é finalizada
	
	