Feature: Registro de pegada de carbono

Scenario: Registro com dados validos
Given que o usuario esta na pagina de registro
And o usuário preenche o campo "cnpj" com "12345678000190"
And o usuário preenche o campo "tipo" com "<script>alert('Ataque XSS!');</script>"
And o usuário preenche o campo "quantidade" com "10"
And o usuário clica no botão "Registrar"
Then o usuário vê a mensagem "tipo invalido"