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

    @Query(value = "select * from Orders o, Bike b where o.bike_id = b.id and o.number >= ?1 and b.purchase_Price >= ?2 and b.name = ?3", nativeQuery = true) // ?1 (param thứ 1 truyền vào) = number
    Set<Orders> searchOrders(Long number, BigDecimal price, String name ); // number = 1 => select * from Orders where number > 1
}
