# Refatoração do Sistema de Gestão de Clientes – Aplicação do ISP

## Contexto

A TechStore possui um sistema de gerenciamento de clientes. Inicialmente foi criada uma interface chamada `GerenciadorDeClientes` que reunia várias funções, como cadastro de clientes, envio de notificações e aplicação de descontos VIP.

Porém, essa interface possuía muitas responsabilidades e acabou causando problemas de design.


## Violação do ISP

A interface `GerenciadorDeClientes` obrigava todas as classes que a implementassem a utilizar **todos os métodos**, mesmo quando não eram necessários.

Por exemplo, `ClienteComumService` precisava apenas cadastrar e buscar clientes, mas era obrigada a implementar os métodos de envio de notificação e desconto VIP.

Isso viola o **Princípio da Segregação de Interfaces (ISP)**, que afirma que **uma classe não deve depender de métodos que não utiliza**.


## Solução (Refatoração)

Para resolver o problema, a interface grande foi dividida em interfaces menores:

- **ICadastroCliente** → cadastrar e buscar cliente  
- **INotificador** → enviar notificações  
- **IGerenciadorFidelidade** → aplicar desconto VIP  

Assim, cada classe implementa apenas as interfaces necessárias.


## Implementação

- **ClienteComumService**  
  Implementa apenas `ICadastroCliente`.

- **ClienteVIPService**  
  Implementa `ICadastroCliente`, `INotificador` e `IGerenciadorFidelidade`.


## Benefícios

A refatoração trouxe melhorias como:

- código mais organizado  
- menor acoplamento  
- classes mais simples  
- facilidade de manutenção e expansão do sistema

