package demo.Controller;

import demo.Model.Orders;
import demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
// như vậy, app này từ giờ có thể quản lý được thông tin user, bike , và thong tin đặt hàng:
// có thể thống kê được số lượng và loại bike đã bán được, người nào mua bao nhiêu, mua thời gian nào, giá bán như nào.
// Vd1: muon lấy (retrieve - get) các orders lên (xem thong tin giá, user_id đã mua, bike_id): làm tuong tư như getAllBike trong BikesController.
// Vd2:giả sử muốn lấy nhieu2 thông tin hơn của user và bikes , thì cần phải join thêm bảng user, bike(do bảng orders chỉ có user_id và bike_id).
// select * from orders o, user u, bike b where o.user_id = u.user_id and o.bike_id = b.bike_id. (nếu viết sql sẽ như này, còn framework này thì nó hỗ trợ
// và thêm dieu kiện where,... tùy theo yêu cầu muốn xử lý thông tin gì.
// nhờ JPA (bản chất là hibernate framework), nên ko phải viết câu sql thuần như viết trong database)


//khi dữ liệu mình cần tuong tác (CRUD) thuộc về Orders, thì tạo 1 luồng riêng giống như Bike vậy (OrderController -> OrderService > OrderServiceImpl -> OrderRepository

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/search")
    public Set<Orders> searchOrders(@RequestParam Long number) {
        return orderService.searchOrders(number);
    }

    @GetMapping
    public Set<Orders> list() {
        return orderService.findAll();
    }
}
