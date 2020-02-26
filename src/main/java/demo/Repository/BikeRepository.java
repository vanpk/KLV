package demo.Repository;

import demo.Model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {

    @Query(value = "select b from Bike b")
    List<Bike> findAllBikes();
}
