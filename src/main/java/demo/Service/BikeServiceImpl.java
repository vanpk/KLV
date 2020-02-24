package demo.Service;

import demo.Models.Bike;
import demo.Repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BikeService")
public class BikeServiceImpl implements BikeService {


    @Autowired
    BikeRepository bikeRepository;

    @Override
    public List<Bike> findAll() {
        return bikeRepository.findAll();
    }

    @Override
    public Bike findBikeById(long id) {
        return bikeRepository.getOne(id);
    }

    @Override
    public void createBike(Bike bike){
        ///*insert into Bike (id, name, model) values (bike.getId(), bike.getName(), bike.getModel(
        bikeRepository.getOne(1l);
    }

    @Override
    public Bike getBikeById (Long id){
        return bikeRepository.getOne(id);
    }

    @Override
    public void removeBikeById (Long id){
        bikeRepository.deleteById(id);
    }
 
    public Bike updateBike(Bike bike) { // need to update name, model, ... of bike
        Bike bikeUpdated = bikeRepository.getOne(bike.getId());
        bikeUpdated.setName(bike.getName());
        bikeUpdated.setModel(bike.getModel());
        bikeUpdated.setEmail(bike.getEmail());
        bikeUpdated.setContact(bike.isContact());
        //
        return bikeUpdated; // name, model ,... are updated
    }
}
