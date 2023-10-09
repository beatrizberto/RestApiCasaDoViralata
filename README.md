# Projeto API Rest - Casa Do Viralata

Projeto de API para o Módulo Programação Web II da Trilha Java da Ada Tech em parceria com o BTG Pactual &lt;womandev> #btgfaztech, utilizando Java e Spring.

## Descrição do Projeto

Criação de API REST utilizando Spring Boot. 
O projeto é de tema livre, porém, deve preencher alguns requisitos:

- Um endpoint de cadastro, leitura, atualização e deleção (lógica ou física) de usuário, que será usado no login da aplicação;
- Endpoints de buscas que recebem filtros opcionais e realizam consultas na camada de dados (de acordo com o tema do projeto);
- Requisitos Não Funcionais:
    - Deve ser uma aplicação Spring Boot
    - Utilização do banco de dados H2
    - Linguagem Java 11 - 17
    - Deve ser inicializado a base de dados para utilização dos endpoints
    - Deve conter autenticação básica utilizando Spring Security

 ## Sobre a Casa do Viralata

Abrigo para animais localizado na Zona Sul de São Paulo-SP que resgata cães e gatos da rua, muitas vezes doentes e feridos. Fornece alimentação, abrigo, tratamento veterinário, castração, vacina etc, e os disponibiliza para adoção responsável.

Os adotantes passam por entrevistas e são cuidadosamente selecionados, com o objetivo de minimizar devoluções e/ou maus tratos.

O abrigo sobrevive por meio de planos de assinatura mensal por plataformas do tipo Apoia.se, além de doações avulsas e campanhas, no caso de algum animal em estado especialmente grave que precise de atendimento especial.

## Estrutura da aplicação

Para este projeto, foram criadas as seguintes funcionalidades:

## Aplicação
- Gerada com Spring Boot
- Banco de dados mockado H2
- Autenticação via Spring Security com Token JWT

### User
- Usuário responsável por inserir os dados. A princípio, um nível de acesso é o suficiente, mas a API será criada de modo a permitir a inclusão de outros perfis conforme o projeto se expanda.
- Atributos: id, email, name e password
- O email serve como login para acesso aos dados do sistema
- Permite busca por id e name
- Senha de acesso criptografada com BCrypt

### Dog
- Atributos: id, name, color, sex, age, size, admissionDate;
- A exibição de todos os cães esté configurada com Pageable

## Implementações futuras
- Adicionar model Cat para cadastro de gatos, com atributos específicos
- Refinar buscas dos animais por filtros (cor, porte, necessidades especiais etc)
- Adicionar model Adopter, para cadastrar dados básicos das pessoas que adotaram animais da casa
- Integrar tabelas de Adopter às dos animais e fazer as implementações necessárias
- Criar perfis de acesso para expansão do número de funcionários e serviços (a Casa prevê instalação de Canil, Clínica Veterinária, Banho e Tosa)
- Integração com banco de dados na nuvem


