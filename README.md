## Desafio QA Inmetrics - Vinicius Souza de Brito ##

Ferramentas utilizadas:

-Java 1.8.0_271
-Intellij IDE
-Maven
-Chrome Webdriver (versão para Chrome 88.0)
-Selenium
-Gherkin 
-Cucumber
-JUnit


Todas as dependências estão configuradas através do Maven, então não imagino que ocorra algum outro problema referente as mesmas.

Qualquer problema não mencionado nesse readme, por favor, me contate em vsdbpessoal@gmail.com

Possível problema ao executar o projeto web:

1) Versão do ChromeDriver não compatível com o seu Google Chrome (Ou google chrome não instalado)
Primeiramente, se não possuir o google chrome instalado, peço que instale. 

Caso os testes Web iniciarem seu chrome mas não fazerem nada além de abrir uma página chamada "data", por favor verifique qual versão está seu google chrome e baixe o Chromedriver compatível com a mesma, no link a seguir:https://chromedriver.chromium.org/downloads.
Eu utilizei a versão 88. Caso precise utilizar outra versão, é muito simples:

-Baixe o chromedriver correto do site https://chromedriver.chromium.org/downloads
-No projeto baixado em sua máquina, navegue até: teste-inmetrics/chromedriver_windows. Dentro dessa pasta terá o chromedriver que eu utilizei, basta substituí-lo pelo que você baixou do site.

Como executar o projeto:

Como utilizei o cucumber, todos os testes possuem tags específicas para serem executados, basta selecionar uma tag de qualquer arquivo .feature das pastas "featuresApi" e "featuresWeb", que se encontram no caminho src/test/resources. Após selecionar uma tag, vá até a pasta src/test/java/br/com/inmetrics/teste/runner, abra a classe "RunCucumberTest" e insira a tag previamente escolhida entre as aspas, como exemplificado abaixo:

tags = {"alterarCadastroSucesso"} -> tags = {"cadastrarSucesso"}

Após trocar a tag, basta utilizar a opção de executar a classe RunCucumberTest. Essa opção é um pouco diferente para cada IDE, mas no geral está presente. (Não cheguei a executar por linha de comando, mas é completamente plausível também.)

As tags disponíveis para execução são:

Automação API: 
@cadastrarApiSucesso - POST no endpoint inm-test-api.herokuapp.com/empregado/cadastrar - Cadastra um empregado usando dados obtidos do site 4devs, que gera pessoas com dados válidos gratuitamente (explico mais abaixo na seção de automação web)

@alterarCadastroSucesso - PUT no endpoint inm-test-api.herokuapp.com/empregado/alterar/{empregadoId}, que altera um cadastro previamente realizado. 

@listarEmpregadosSucesso - GET no endpoint inm-test-api.herokuapp.com/empregado/list_all - Retorna lista com todos os empregados cadastrados.

@listarEmpregadoSelecionado - GET no endpoint inm-test-api.herokuapp.com/empregado/list/{empregadoId} - Lista um empregado específico cadastrado, através do ID do mesmo.

Automação WEB:
@obterSucesso - Por questões puramente estéticas e de criatividade, ao invés de gerar nomes, CPF e datas aleatoriamente via código, decidi usar um método mais "visual" através do site https://www.4devs.com.br/gerador_de_pessoas. Essa tag abre o site mencionado, clica no botão de gerar pessoa e grava todos os dados necessários nos outros testes em um arquivo txt denominado "dados.txt", que se encontra na raiz do projeto. Assim, posso apenas "ler" esse arquivo (como fiz em diversos pontos do projeto) para obter dados novos e válidos para cadastros.

@loginSucesso - Abre o site do desafio, https://inm-test-app.herokuapp.com/accounts/login/, insere o usuário (inmetrics) e senha (automacao) e clica no botão de login. Reutilizado constantemente nos outros testes, já que todos os fluxos começam após efetuado o login com sucesso.

@cadastroSucesso - Começa reutilizando o login mencionado anteriormente e navega até a tela de cadastro de funcionário. Insere os dados obtidos do site 4devs (ordem de execução ideal: @obtersucesso -> @cadastroSucesso para ver os dados obtidos sendo usados. Entretanto, também funciona independentemente, já que os dados da ultima vez que o 4devs foi consultado ficam salvos no arquivo dados.txt até serem reescritos. Como o site do desafio não valida dados duplicados, decidi manter assim: Se no futuro essa atualização de validação ser feita, a alteração para que antes de um cadastro ser feito  obtenha novos dados com o 4devs, seria uma alteração fácil de ser implementada.

@excluirSucesso - Também recicla o login e exclui o primeiro registro de empregado exibido no site.

@editarSucesso - Também recicla o login e edita o primeiro registro de empregado exibido no site, usando os dados do arquivo dados.txt.

