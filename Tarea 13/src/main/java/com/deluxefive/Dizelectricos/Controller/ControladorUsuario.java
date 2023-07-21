package com.deluxefive.Dizelectricos.Controller;

import com.deluxefive.Dizelectricos.Entity.Usuario;
import com.deluxefive.Dizelectricos.Service.UsuarioCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Usuario")
public class ControladorUsuario {
    @Autowired
    private UsuarioCrud uc;

    @GetMapping
    @RequestMapping(value = "consultarUsario",method = RequestMethod.GET )
    public ResponseEntity<?>consultarUsuario(){
        List<Usuario> usuarioList=this.uc.consultarUsuarios();
        return ResponseEntity.ok(usuarioList);
    }
    @PostMapping
    @RequestMapping(value = "crearUsuario",method = RequestMethod.POST)
    public ResponseEntity<?> crearUsuario(@RequestBody Usuario usuario){
        Usuario usuarioCrear=this.uc.crearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCrear);

    }

    @PutMapping
    @RequestMapping(value = "modificarUsuario",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioModificar=this.uc.modificarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioModificar);

    }

    @GetMapping
    @RequestMapping(value = "buscarUsuario/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarUsuario(@PathVariable int id){
        Usuario usuarioBuscar=this.uc.buscarUsuario(id);
        return ResponseEntity.ok(usuarioBuscar);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarUsuario/{id}",method = RequestMethod.DELETE)
    public  ResponseEntity<?> eliminarUsuario(@PathVariable int id){
        this.uc.eliminarUsuario(id);
        return ResponseEntity.ok().build();//.build hace que si se eliminan datos muestre la informacion actualizada

    }




}
