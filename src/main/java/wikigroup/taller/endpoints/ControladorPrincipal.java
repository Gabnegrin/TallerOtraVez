package wikigroup.taller.endpoints;

//puerto 24000

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/plantillas")
public class ControladorPrincipal {

    @GetMapping("/principal")
    public String principal(){
        return "Principal";
    }
    
    @GetMapping("/presentacion")
    public String presentacion(){
        return "Presentacion.html";
    }
    @GetMapping("/descripcion")
    public String descripcion(){
        return "Descripcion.html";
    }
    @GetMapping("/requerimientos")
    public String requerimientos(){
        return "Requerimientos.html";
    }
    @GetMapping("/arquitectura")
    public String arquitectura(){
        return "Arquitectura.html";
    }
    @GetMapping("/desarrollo")
    public String desarrollo(){
        return "Desarrollo.html";
    }
    @GetMapping("/pruebas")
    public String pruebas(){
        return "Pruebas.html";
    }
    @GetMapping("/despliegue")
    public String despliegue(){
        return "Despliegue.html";
    }
    @GetMapping("/contactenos")
    public String contactenos(){
        return "Contactenos.html";
    }

}
