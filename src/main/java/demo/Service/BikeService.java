package demo.Service;

import demo.Models.Bike;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BikeService {
    List<Bike> findAll();

    Bike findBikeById(long id);

    void createBike(Bike bike);

    Bike getBikeById(Long id);

    void removeBikeById(Long id);
}
