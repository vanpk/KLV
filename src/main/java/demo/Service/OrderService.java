package demo.Service;

import demo.Model.Orders;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface OrderService {
    Set<Orders> findAll();

    Set<Orders> searchOrders(Long number);
}
