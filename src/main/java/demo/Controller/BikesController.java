package demo.Controller;

import demo.Models.Bike;
import demo.Repositories.BikeRepository;
import demo.Service.BikeService;
import demo.Service.BikeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;
// Mo hinh MVC
@RestController // tang C : xu ly du lieu (nhận url,
@RequestMapping("/api/v1/bikes") // url
public class BikesController {
    @Autowired
    private BikeRepository bikeRepository;
    @Autowired
    private BikeService bikeService; // khoi tao instance cua lop

    @GetMapping
    public List<Bike> list() {
        return bikeService.findAll(); // tu instance khoi tao, goi phuong thuc ben trong
    }

    @PostMapping // post
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike) { // Bike: kiểu object
        bikeService.createBike(bike);
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id) { // id = 1000, 1, 2
        return bikeService.findBikeById(id);
    }

    @GetMapping("get/{id}")
    public Bike getBikeById(@PathVariable("id") Long id) {
        return bikeService.getBikeById(id);
    }

    @GetMapping("/delete/{id}")
    public void deleteBikeById(@PathVariable("id") Long id){
         bikeService.removeBikeById(id);
    }
}
