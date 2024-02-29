package wikigroup.taller.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import wikigroup.taller.demo.entidad.contactenos;
import wikigroup.taller.demo.repository.AppRepository;

@Service
public class servicerepo {
    
    private static AppRepository appRepository;

    @Autowired
    public servicerepo(AppRepository appRepository) {
        servicerepo.appRepository = appRepository;
    }

    @Transactional
    public static contactenos AgregarContacto(contactenos contacto){
        contacto = appRepository.save(contacto);
        return contacto;
    }
}
