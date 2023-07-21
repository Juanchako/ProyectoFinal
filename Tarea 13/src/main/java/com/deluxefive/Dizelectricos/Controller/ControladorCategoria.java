package com.deluxefive.Dizelectricos.Controller;

import com.deluxefive.Dizelectricos.Entity.Categoria;
import com.deluxefive.Dizelectricos.Service.CategoriaCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Categoria")
public class ControladorCategoria {
    @Autowired
    private CategoriaCrud cc;

    @GetMapping
    @RequestMapping(value = "consultarCategoria",method = RequestMethod.GET )
    public ResponseEntity<?>consultarCategoria(){
        List<Categoria> categoriaList=this.cc.consultarCategorias();
        return ResponseEntity.ok(categoriaList);
    }
    @PostMapping
    @RequestMapping(value = "crearCategoria",method = RequestMethod.POST)
    public ResponseEntity<?> crearCategoria(@RequestBody Categoria categoria){
        Categoria categoriaCrear=this.cc.crearCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaCrear);

    }

    @PutMapping
    @RequestMapping(value = "modificarCategoria",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarCategoria(@RequestBody Categoria categoria){
        Categoria categoriaModificar=this.cc.modificarCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaModificar);

    }

    @GetMapping
    @RequestMapping(value = "buscarCategoria/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarCategoria(@PathVariable int id){
        Categoria categoriaBuscar=this.cc.buscarCategoria(id);
        return ResponseEntity.ok(categoriaBuscar);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarCategoria/{id}",method = RequestMethod.DELETE)
    public  ResponseEntity<?> eliminarCategoria(@PathVariable int id){
        this.cc.eliminarCategoria(id);
        return ResponseEntity.ok().build();//.build hace que si se eliminan datos muestre la informacion actualizada

    }




}
