package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2

public class ConnectionFactoryTest01 {
    public static void main(String[] args){
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producertoUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.save(producer);
//        ProducerService.delete(2);
//        ProducerService.update(producertoUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers not found '{}'", producers);
        ProducerService.findByNameAndDelete("A-1 pictures");
    }
}
