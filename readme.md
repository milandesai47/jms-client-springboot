# SpringBoot application runs as a JMS client
## Configuration
* ``activemq.broker-url=tcp://localhost:61617``
* ``activemq.username=admin``
* ``activemq.username=admin``

## default queues 
* ``helloworld.q1``
* ``helloworld.q2``

## To test jms connection
* Run a test case @SpringJmsApplicationTest
* Use postman equivalent HTTP tool and `GET` request to `/send` endpoint with or without string message as payload 
