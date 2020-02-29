package demo.Service.ServiceImpl;

import demo.Model.Orders;
import demo.Repository.OrderRepository;
import demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Set<Orders> findAll() {
//đâu hết rồi?
        // cách 1:
        //List<Orders> orders =  orderRepository.findAll();
        //cách 2:
        Set<Orders> orders = orderRepository.findAllOrders();
        return orders;
    }

    @Override
    public Set<Orders> searchOrders(Long number) {
        Set<Orders> orders = orderRepository.searchOrders(number);
        return orders;
    }

}
