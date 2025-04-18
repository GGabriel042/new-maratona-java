package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        ProducerRepositoryRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("----------------");
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
//        log.info(producers);
    }
}
