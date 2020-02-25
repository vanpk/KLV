package demo.Controller;

import demo.Model.Bike;
import demo.Repository.BikeRepository;
import demo.Service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {
    @Autowired
    private BikeRepository bikeRepository;
    @Autowired
    private BikeService bikeService;

    @GetMapping
    public List<Bike> list() {
        return bikeService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike) { // Bike: kiểu object
        bikeService.createBike(bike);
    }

    @PostMapping("/update")
    public Bike update(@RequestBody Bike bike){
        return bikeService.updateBike(bike);
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id) { // id = 1000, 1, 2
        return bikeService.findBikeById(id);
    }

    @GetMapping("/delete/{id}")
    public void deleteBikeById(@PathVariable("id") Long id){
         bikeService.removeBikeById(id);
    }
}
