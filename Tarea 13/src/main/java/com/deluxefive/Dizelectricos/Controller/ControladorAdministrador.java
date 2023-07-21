package com.deluxefive.Dizelectricos.Controller;

import com.deluxefive.Dizelectricos.Entity.Administrador;
import com.deluxefive.Dizelectricos.Service.AdministradorCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Administrador")
public class ControladorAdministrador {
    @Autowired
    private AdministradorCrud ac;

    @GetMapping
    @RequestMapping(value = "consultarAdministrador",method = RequestMethod.GET )
    public ResponseEntity<?>consultarAdministrador(){
        List<Administrador> administradorList=this.ac.consultarAdministrador();
        return ResponseEntity.ok(administradorList);
    }
    @PostMapping
    @RequestMapping(value = "crearAdministrador",method = RequestMethod.POST)
    public ResponseEntity<?> crearAdministrador(@RequestBody Administrador administrador){
        Administrador administradorCrear=this.ac.crearAdministrador(administrador);
        return ResponseEntity.status(HttpStatus.CREATED).body(administradorCrear);

    }

    @PutMapping
    @RequestMapping(value = "modificarAdministrador",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarAdministrador(@RequestBody Administrador administrador){
        Administrador administradorModificar=this.ac.modificarAdministrador(administrador);
        return ResponseEntity.status(HttpStatus.CREATED).body(administradorModificar);

    }

    @GetMapping
    @RequestMapping(value = "buscarAdministrador/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarAdministrador(@PathVariable int id){
        Administrador administradorBuscar=this.ac.buscarAdministrador(id);
        return ResponseEntity.ok(administradorBuscar);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarUsuario/{id}",method = RequestMethod.DELETE)
    public  ResponseEntity<?> eliminarUsuario(@PathVariable int id){
        this.ac.eliminarAdministrador(id);
        return ResponseEntity.ok().build();//.build hace que si se eliminan datos muestre la informacion actualizada

    }




}
