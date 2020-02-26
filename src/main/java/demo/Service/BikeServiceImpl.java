package demo.Service;

import demo.Model.Bike;
import demo.Repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BikeService")
public class BikeServiceImpl implements demo.Service.BikeService {
    @Autowired
    BikeRepository bikeRepository;

    @Override
    public List<Bike> findAll() {
        return bikeRepository.findAllBikes();
    }

    @Override
    public Bike findBikeById(long id) {
        return bikeRepository.getOne(id);
    }

    @Override
    public void createBike(Bike bike){
        Bike newBike = new Bike();
        newBike.setName(bike.getName());
        newBike.setModel(bike.getModel());
        newBike.setSerialNumber(bike.getSerialNumber());
        newBike.setPurchasePrice(bike.getPurchasePrice());
        bikeRepository.save(newBike);
    }

    @Override
    public void removeBikeById (Long id){
        bikeRepository.deleteById(id);
    }
 
    public Bike updateBike(Bike bike) {
        Bike bikeUpdated = bikeRepository.getOne(bike.getId());
        if (bike.getName() != null && bike.getName() != ""){
            bikeUpdated.setName(bike.getName());
        }
        if (bike.getModel() != null && bike.getModel() != ""){
            bikeUpdated.setModel(bike.getModel());
        }
        if (bike.getSerialNumber() != null && bike.getSerialNumber() != "") {
            bikeUpdated.setSerialNumber(bike.getSerialNumber());
        }
        if (bike.getPurchasePrice() != null && bike.getPurchasePrice().toString() != "") {
            bikeUpdated.setPurchasePrice(bike.getPurchasePrice());
        }
        bikeRepository.save(bikeUpdated);
        return bikeUpdated;
    }

}
