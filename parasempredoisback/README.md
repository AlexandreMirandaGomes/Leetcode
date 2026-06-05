# parasempredoisback

Backend inicial em Kotlin com Spring Boot e Gradle para o projeto Para Sempre Dois.

## Stack

- Kotlin
- Spring Boot
- Gradle (via `gradlew`)
- Java 21
- PostgreSQL

## Profiles e banco de dados

A aplicacao usa profiles do Spring para facilitar a troca entre ambiente local e PRD:

- `local`: desenvolvimento local com Postgres local
- `prod`: ambiente de producao via variaveis de ambiente

Arquivos:

- `src/main/resources/application.properties`
- `src/main/resources/application-local.properties`
- `src/main/resources/application-prod.properties`

## Configuracao local

Padrao atual:

- URL: `jdbc:postgresql://localhost:5432/parasempredois`
- Usuario: `postgres`
- Senha: `postgres`

Crie esse banco no seu Postgres local antes de subir a aplicacao.

## Como rodar

Windows (PowerShell):

```powershell
.\gradlew.bat bootRun
```

Linux/macOS:

```bash
./gradlew bootRun
```

Healthcheck:

- `GET http://localhost:8080/api/health`

## Como apontar para PRD

Defina as variaveis de ambiente:

- `SPRING_PROFILES_ACTIVE=prod`
- `DB_URL`
- `DB_USERNAME`
- `DB_PASSWORD`
- `PORT` (opcional)

Exemplo no PowerShell:

```powershell
$env:SPRING_PROFILES_ACTIVE="prod"
$env:DB_URL="jdbc:postgresql://<host>:5432/<database>"
$env:DB_USERNAME="<user>"
$env:DB_PASSWORD="<password>"
$env:PORT="8080"
.\gradlew.bat bootRun
```
