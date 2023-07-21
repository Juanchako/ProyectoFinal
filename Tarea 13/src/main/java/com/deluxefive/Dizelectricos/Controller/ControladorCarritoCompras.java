package com.deluxefive.Dizelectricos.Controller;

import com.deluxefive.Dizelectricos.Entity.CarritoCompras;
import com.deluxefive.Dizelectricos.Service.CarritoComprasCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CarritoCompras")
public class ControladorCarritoCompras {
    @Autowired
    private CarritoComprasCrud ccc;

    @GetMapping
    @RequestMapping(value = "consultarCarritoCompras",method = RequestMethod.GET )
    public ResponseEntity<?>consultarCarritoCompras(){
        List<CarritoCompras> carritocomprasList=this.ccc.consultarCarritos();
        return ResponseEntity.ok(carritocomprasList);
    }
    @PostMapping
    @RequestMapping(value = "crearCarritoCompras",method = RequestMethod.POST)
    public ResponseEntity<?> crearCarritoCompras(@RequestBody CarritoCompras carritocompras){
        CarritoCompras carritocomprasCrear=this.ccc.crearCarrito(carritocompras);
        return ResponseEntity.status(HttpStatus.CREATED).body(carritocomprasCrear);

    }

    @PutMapping
    @RequestMapping(value = "modificarCarritoCompraso",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarCarritoCompras(@RequestBody CarritoCompras carritocompras){
        CarritoCompras carritocomprasModificar=this.ccc.modificarCarrito(carritocompras);
        return ResponseEntity.status(HttpStatus.CREATED).body(carritocomprasModificar);

    }

    @GetMapping
    @RequestMapping(value = "buscarCarritoCompras/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarCarritoCompras(@PathVariable int id){
        CarritoCompras carritocomprasBuscar=this.ccc.buscarCarrito(id);
        return ResponseEntity.ok(carritocomprasBuscar);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarCarritoCompras/{id}",method = RequestMethod.DELETE)
    public  ResponseEntity<?> eliminarCarritoCompras(@PathVariable int id){
        this.ccc.eliminarCarrito(id);
        return ResponseEntity.ok().build();//.build hace que si se eliminan datos muestre la informacion actualizada

    }




}
