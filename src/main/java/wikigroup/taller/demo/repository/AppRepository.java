package wikigroup.taller.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import wikigroup.taller.demo.entidad.contactenos;

@Repository
public interface AppRepository extends CrudRepository<contactenos, Long>{

}
