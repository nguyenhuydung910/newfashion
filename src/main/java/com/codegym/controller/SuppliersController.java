//package com.codegym.controller;
//
//import com.codegym.model.Suppliers;
//import com.codegym.service.SuppliersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//import java.util.Optional;
//
//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping("/api")
//public class SuppliersController {
//   @Autowired
//   private SuppliersService suppliersService;
//
//    @GetMapping("/suppliers")
//    public ResponseEntity<Suppliers> listSuppliers(){
//        Iterable<Suppliers> suppliers = ( suppliersService.suppliersAll());
//        return new ResponseEntity<Suppliers>((Suppliers) suppliers, HttpStatus.OK);
//    }
//
//    @GetMapping("/suppliers/{id}")
//        public ResponseEntity<?> getSuppliers(@PathVariable Long id) {
//            Optional<Suppliers> suppliers = suppliersService.findById(id);
//            if (!suppliers.isPresent()){
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            }
//            return new ResponseEntity<>(suppliers, HttpStatus.OK);
//        }
//    @PostMapping("/suppliers")
//    public ResponseEntity<?> createSuppliers(@Valid @RequestBody Suppliers suppliers) {
//        suppliersService.save(suppliers);
//        return new ResponseEntity<>(suppliers, HttpStatus.CREATED);
//    }
//    @PutMapping("suppliers/{id}")
//    public ResponseEntity<?> updateSuppliers(@Valid @RequestBody Suppliers suppliers, @PathVariable Long id) {
//        Optional<Suppliers> suppliers1 = suppliersService.findById(id);
//        if (!suppliers1.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        suppliers1.get().setName(suppliers.getName());
//
//        suppliersService.save(suppliers1.get());
//        return new ResponseEntity<>(suppliers1, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/suppliers/{id}")
//    public ResponseEntity<?> deleteSuppliers(@PathVariable Long id) {
//        Optional<Suppliers> suppliers = suppliersService.findById(id);
//        if (!suppliers.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        suppliersService.delete(id);
//        return new ResponseEntity<>(suppliers, HttpStatus.OK);
//    }
//}
