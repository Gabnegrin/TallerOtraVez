package wikigroup.taller.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wikigroup.taller.demo.entidad.contactenos;
import wikigroup.taller.demo.repository.AppRepository;

@Service
public class servicerepo {
    
    @Autowired
    static
    AppRepository AppRepository;

    public static contactenos AgregarContacto(contactenos contacto){
        contacto = AppRepository.save(contacto);
        return contacto;
    }
}
