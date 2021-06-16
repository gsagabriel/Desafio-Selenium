	# language: pt
  # encoding: utf-8
  
  Funcionalidade: Efetuar o Cadastro no Site

	Cenário: Preencher todos os dados do Site Corretamente

        Dado que entrei no Site "http://sampleapp.tricentis.com/101/app.php"
        E preencho a aba Vehicle Data
        Entao pressiono next para a próxima aba Insurant Data
        E preencho o formulario na aba Insurant Data
        Entao pressiono next para a próxima aba Product Data
        E preencho o formulario Product Data
        Entao pressione next para Price Option
        E preencho o formulario Price Option
        Entao pressione next para Send Quote
        E preencho o formulario Send Quote
        E pressiono send
        Entao verifico na tela a mensagem Sending e-mail success!