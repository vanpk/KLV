//package demo.Service;
//
//import demo.Model.Orders;
//import demo.Model.User;
//import demo.Repository.OrderRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service("OrderService")
//public class OrderServiceImpl implements OrderService {
//    @Autowired
//    OrderRepository orderRepository;
//
//    @Override
//    public List<Orders> findAll() {
//        List<Orders> orders =  orderRepository.findAll();
//        for (Orders or: orders) {
//            User user = or.getUser();
//            // do sth more
//        }
//        return orders;
//    }
//
//}
