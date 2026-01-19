# Produtos API

API REST para gerenciamento de produtos.

## Tecnologias
- Java
- Spring Boot
- Spring Data JPA
- Maven

POSTMAN:

(POST - Salvar)
postman request POST 'http://localhost:8080/produtos' \
  --header 'Content-Type: application/json' \
  --body '{
    "nome": "Computador",
    "marca": "Apple",
    "preco": 5000
}'

(PUT - Atualizar)
postman request PUT 'http://localhost:8080/produtos/0ccfce29-14d6-4ad5-ae9e-f062e806c003' \
  --header 'Content-Type: application/json' \
  --body '{
    "nome": "Notebook Atualizado",
    "marca": "Dell Inspiron 15 5510",
    "preco": 4200
}'

(GET - Obter por Id)
postman request 'http://localhost:8080/produtos/:id'

(GET - Busca)
postman request 'http://localhost:8080/produtos?nome=Computador'

(DELETE - Deletar)
postman request DELETE 'http://localhost:8080/produtos/01272118-0c39-41cc-97ce-29e95d974a06'
