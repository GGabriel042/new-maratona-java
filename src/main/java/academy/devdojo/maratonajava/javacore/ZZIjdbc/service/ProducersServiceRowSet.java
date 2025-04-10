package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducersServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }
}
