package demo.Service;

import demo.Model.Bike;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BikeService {
    List<Bike> findAll();

    Bike findBikeById(long id);

    void createBike(Bike bike);

    void removeBikeById(Long id);

    Bike updateBike(Bike bike);
}
