# roma-srv-cadastro-prod
Microserviço producer

### Instalação e execução Kafka
  1 - Executar comando docker:
  
    docker exec -it kafka-kafka-1 kafka-topics.sh --create --topic roma-topico --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
  2 - Com o kafka baixado e instalado basta rodar o comando abaixo para rodar os containers que possuem o kafka e o zookeeper.
    
    docker-compose up
  
  3 - Para parar a execução e deletar os containers basta executar.

    docker-compose down

Obs: Utilizar arquivo docker-compose no diretório "src/main/resources/kafka"
