package com.deluxefive.Dizelectricos.Controller;

import com.deluxefive.Dizelectricos.Entity.Producto;
import com.deluxefive.Dizelectricos.Service.ProductoCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Producto")
public class ControladorProducto {
    @Autowired
    private ProductoCrud pc;

    @GetMapping
    @RequestMapping(value = "consultarProductos",method = RequestMethod.GET )
    public ResponseEntity<?>consultarProductos(){
        List<Producto> productoList=this.pc.consultarProductos();
        return ResponseEntity.ok(productoList);
    }
    @PostMapping
    @RequestMapping(value = "crearProducto",method = RequestMethod.POST)
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto){
        Producto productoCrear=this.pc.crearProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoCrear);

    }

    @PutMapping
    @RequestMapping(value = "modificarProducto",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarProducto(@RequestBody Producto producto){
        Producto productoModificar=this.pc.modificarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoModificar);

    }

    @GetMapping
    @RequestMapping(value = "buscarProducto/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarProducto(@PathVariable int id){
        Producto productoBuscar=this.pc.buscarProducto(id);
        return ResponseEntity.ok(productoBuscar);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarProducto/{id}",method = RequestMethod.DELETE)
    public  ResponseEntity<?> eliminarProducto(@PathVariable int id){
        this.pc.eliminarProducto(id);
        return ResponseEntity.ok().build();//.build hace que si se eliminan datos muestre la informacion actualizada

    }




}
