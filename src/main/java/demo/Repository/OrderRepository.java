package demo.Repository;

import demo.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Set;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

    @Query(value = "select * from Orders", nativeQuery = true)
    Set<Orders> findAllOrders();

    @Query(value = "select * from Orders o, Bike b where o.bike_id = b.id and (?1 is null or o.number >= ?1)" +
            " and (?2 is null or b.purchase_Price >= ?2) and (?3 is null or b.name = ?3)", nativeQuery = true)
    Set<Orders> searchOrders(Long number, BigDecimal price, String name );
}
