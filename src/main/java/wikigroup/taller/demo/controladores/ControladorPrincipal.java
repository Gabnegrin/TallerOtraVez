package wikigroup.taller.demo.controladores;

//puerto 24000

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import wikigroup.taller.demo.entidad.contactenos;
import wikigroup.taller.demo.service.servicerepo;

@Controller
@RequestMapping("/grupo25/plantillas")
public class ControladorPrincipal {

    @GetMapping("/principal")
    public String principal(){
        return "Principal";
    }
    
    @GetMapping("/presentacion")
    public String presentacion(){
        return "Presentacion";
    }
    @GetMapping("/descripcion")
    public String descripcion(){
        return "Descripcion";
    }
    @GetMapping("/requerimientos")
    public String requerimientos(){
        return "Requerimientos";
    }
    @GetMapping("/arquitectura")
    public String arquitectura(){
        return "Arquitectura";
    }
    @GetMapping("/desarrollo")
    public String desarrollo(){
        return "Desarrollo";
    }
    @GetMapping("/pruebas")
    public String pruebas(){
        return "Pruebas";
    }
    @GetMapping("/despliegue")
    public String despliegue(){
        return "Despliegue";
    }
    @GetMapping("/contactenos")
    public String contactenos(){
        return "Contactenos";
    }
    @PostMapping("/agregar")
    public contactenos add(@RequestParam String nombres, @RequestParam String apellidos, @RequestParam String correo, @RequestParam int semestre, @RequestParam String descripcion){
        contactenos datos = new contactenos(nombres,apellidos,correo,semestre,descripcion);
        return servicerepo.AgregarContacto(datos);
    }

    @GetMapping("/intento")
    public String intento(){
        return "Principal";
    }
    }

