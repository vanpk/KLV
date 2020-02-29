package demo.Repository;

import demo.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

    @Query(value = "select * from Orders b", nativeQuery = true)
    Set<Orders> findAllOrders();

    @Query(value = "select * from Orders b where b.number > ?1 ", nativeQuery = true)
    Set<Orders> searchOrders(Long number);
}
