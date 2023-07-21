package com.deluxefive.Dizelectricos.Controller;

import com.deluxefive.Dizelectricos.Entity.MedioPago;
import com.deluxefive.Dizelectricos.Service.MedioPagoCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("MedioPago")
public class ControladorMedioPago {
    @Autowired
    private MedioPagoCrud mpc;

    @GetMapping
    @RequestMapping(value = "consultarMedioPago",method = RequestMethod.GET )
    public ResponseEntity<?>consultarMedioPago(){
        List<MedioPago> mediopagoList=this.mpc.consultarMediosPago();
        return ResponseEntity.ok(mediopagoList);
    }
    @PostMapping
    @RequestMapping(value = "crearMedioPago",method = RequestMethod.POST)
    public ResponseEntity<?> crearMedioPago(@RequestBody MedioPago mediopago){
        MedioPago mediopagoCrear=this.mpc.crearMedioPago(mediopago);
        return ResponseEntity.status(HttpStatus.CREATED).body(mediopagoCrear);

    }

    @PutMapping
    @RequestMapping(value = "modificarMedioPago",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarMedioPago(@RequestBody MedioPago mediopago){
        MedioPago mediopagoModificar=this.mpc.modificarMedioPago(mediopago);
        return ResponseEntity.status(HttpStatus.CREATED).body(mediopagoModificar);

    }

    @GetMapping
    @RequestMapping(value = "buscarMedioPago/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarMedioPago(@PathVariable int id){
        MedioPago mediopagoBuscar=this.mpc.buscarMedioPago(id);
        return ResponseEntity.ok(mediopagoBuscar);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarMedioPago/{id}",method = RequestMethod.DELETE)
    public  ResponseEntity<?> eliminarMedioPago(@PathVariable int id){
        this.mpc.eliminarMedioPago(id);
        return ResponseEntity.ok().build();//.build hace que si se eliminan datos muestre la informacion actualizada

    }




}
