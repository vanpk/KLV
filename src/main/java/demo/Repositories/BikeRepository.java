package demo.Repositories;

import demo.Models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
    // hibernate framewore

}
