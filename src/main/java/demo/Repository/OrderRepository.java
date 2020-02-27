//package demo.Repository;
//
//import demo.Model.Bike;
//import demo.Model.Orders;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface OrderRepository extends JpaRepository<Orders, Long> {
//
//    @Query(value = "select b from Orders b")
//    List<Orders> findAllOrders();
//}
