package com.deluxefive.Dizelectricos.Controller;

import com.deluxefive.Dizelectricos.Entity.AgregaProductoAd;
import com.deluxefive.Dizelectricos.Service.AgregaProductoAdCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("AgregaProductoAd")
public class ControladorAgregaProductoAd {
    @Autowired
    private AgregaProductoAdCrud apac;

    @GetMapping
    @RequestMapping(value = "consultarAgregaProductoAd",method = RequestMethod.GET )
    public ResponseEntity<?>consultarAgregaProductoAd(){
        List<AgregaProductoAd> productoadList=this.apac.consultarProductosAd();
        return ResponseEntity.ok(productoadList);
    }
    @PostMapping
    @RequestMapping(value = "crearAgregaProductoAd",method = RequestMethod.POST)
    public ResponseEntity<?> crearAgregaProductoAd(@RequestBody AgregaProductoAd productoad){
        AgregaProductoAd productoadCrear=this.apac.crearProductoAd(productoad);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoadCrear);

    }

    @PutMapping
    @RequestMapping(value = "modificarAgregaProductoAd",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarAgregaProductoAd(@RequestBody AgregaProductoAd productoad){
        AgregaProductoAd productoadModificar=this.apac.modificarProductoAd(productoad);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoadModificar);

    }

    @GetMapping
    @RequestMapping(value = "buscarAgregaProductoAd/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarAgregaProductoAd(@PathVariable int id){
        AgregaProductoAd productoadBuscar=this.apac.buscarProductoAd(id);
        return ResponseEntity.ok(productoadBuscar);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarAgregaProductoAd/{id}",method = RequestMethod.DELETE)
    public  ResponseEntity<?> eliminarAgregaProductoAd(@PathVariable int id){
        this.apac.eliminarProductoAd(id);
        return ResponseEntity.ok().build();//.build hace que si se eliminan datos muestre la informacion actualizada

    }




}
