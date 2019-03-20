package com.example.kafka.democonsumer.config;



import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author hx
 * @date 2019/3/20 21:43
 */
public class Listener {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    int a = 1;
    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?, ?> record) {
        logger.info("kafka的key: " + record.key() + a++);
        logger.info("kafka的value: " + record.value().toString());
    }
}
