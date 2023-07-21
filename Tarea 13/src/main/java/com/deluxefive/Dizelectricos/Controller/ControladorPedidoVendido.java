package com.deluxefive.Dizelectricos.Controller;

import com.deluxefive.Dizelectricos.Entity.PedidoVendido;
import com.deluxefive.Dizelectricos.Service.PedidoVendidoCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Usuario")
public class ControladorPedidoVendido {
    @Autowired
    private PedidoVendidoCrud pvc;

    @GetMapping
    @RequestMapping(value = "consultarPedidoVendido",method = RequestMethod.GET )
    public ResponseEntity<?>consultarPedidoVendido(){
        List<PedidoVendido> pedidovendidoList=this.pvc.consultarPedidosVendidos();
        return ResponseEntity.ok(pedidovendidoList);
    }
    @PostMapping
    @RequestMapping(value = "crearPedidoVendido",method = RequestMethod.POST)
    public ResponseEntity<?> crearPedidoVendido(@RequestBody PedidoVendido pedidovendido){
        PedidoVendido pedidovendidoCrear=this.pvc.crearPedidoVendido(pedidovendido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidovendidoCrear);

    }

    @PutMapping
    @RequestMapping(value = "modificarPedidoVendido",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarPedidoVendido(@RequestBody PedidoVendido pedidovendido){
        PedidoVendido pedidovendidoModificar=this.pvc.modificarPedidoVendido(pedidovendido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidovendidoModificar);

    }

    @GetMapping
    @RequestMapping(value = "buscarPedidoVendido/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarPedidoVendido(@PathVariable int id){
        PedidoVendido pedidovendidoBuscar=this.pvc.buscarPedidoVendido(id);
        return ResponseEntity.ok(pedidovendidoBuscar);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarPedidoVendido/{id}",method = RequestMethod.DELETE)
    public  ResponseEntity<?> eliminarPedidoVendido(@PathVariable int id){
        this.pvc.eliminarPedidoVendido(id);
        return ResponseEntity.ok().build();//.build hace que si se eliminan datos muestre la informacion actualizada

    }




}
