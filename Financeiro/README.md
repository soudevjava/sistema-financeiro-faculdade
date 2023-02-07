# API (Application Programming Interface) Sistema Financeiro

### Inicializar o projeto

> * Instalar o Git local [Git Download Here](https://git-scm.com/downloads)
> * Escolher se sistema operacial - Windows ou Linux
> * Fazer o clone do
    repositório [Git Clone Sistema Financeiro](https://github.com/soudevjava/sistema-financeiro-faculdade)
> * Fazer a o download do Apache Maven - [Apache Maven 3.9.0](https://maven.apache.org/download.cgi)
> * Documentação do [Maven Install](https://maven.apache.org/install.html)
> * Tutorial de instação
    do [Maven no Linux](https://www.digitalocean.com/community/tutorials/install-maven-linux-ubuntu)
> * Download do [MySQL Download Here](https://www.mysql.com/downloads/)

### Configuração do Maven

> * Descompactar o arquivo Maven zip
> * Criar um novo diretório na raiz
> * Windows: `:C\Maven`
> * Linux:  `/opt/Maven`


> * **Comandos:**
> * `cd sistema-financeiro-faculdade`
> * `git checkout equipe-financeiro`
> * `git pull origin equipe-financeiro`

> Abrir o projeto com seu o seu Editor de
> código [Intellij Download Here](https://www.jetbrains.com/idea/download/#section=linux)

## Estrutura base 
```bash
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── api
    │   │           └── financeiro
    │   │               ├── configs
    │   │               │   └── DataConfig.java
    │   │               ├── controllers
    │   │               │   └── DespesasController.java
    │   │               ├── dtos
    │   │               │   ├── DespesasDto.java
    │   │               │   └── ResponseGeneralDto.java
    │   │               ├── entities
    │   │               │   └── DespesasEntity.java
    │   │               ├── enums
    │   │               │   ├── DespesasTiposEnum.java
    │   │               │   └── GeneralMessages.java
    │   │               ├── FinanceiroApplication.java
    │   │               ├── repositories
    │   │               │   └── DespesasRepository.java
    │   │               └── services
    │   │                   └── DespesasService.java
    │   └── resources
    │       └── application.properties
    └── test
        └── java
            └── com
                └── api
                    └── financeiro
                        └── FinanceiroApplicationTests.java
```