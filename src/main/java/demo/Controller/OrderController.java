/*
package demo.Controller;

import demo.Model.Orders;
import demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// như vậy, app này từ giờ có thể quản lý được thông tin user, bike , và thong tin đặt hàng:
// có thể thống kê được số lượng và loại bike đã bán được, người nào mua bao nhiêu, mua thời gian nào, giá bán như nào.
// Vd1: muon lấy (retrieve - get) các orders lên (xem thong tin giá, user_id đã mua, bike_id): làm tuong tư như getAllBike trong BikesController.
// Vd2:giả sử muốn lấy nhieu2 thông tin hơn của user và bikes , thì cần phải join thêm bảng user, bike(do bảng orders chỉ có user_id và bike_id).
// select * from orders o, user u, bike b where o.user_id = u.user_id and o.bike_id = b.bike_id. (nếu viết sql sẽ như này, còn framework này thì nó hỗ trợ
// nhờ JPA (bản chất là hibernate framework), nên ko phải viết câu sql thuần như viết trong database)


// nếu dữ liệu mình cần tuong tác (CRUD) thuộc về Orders, thì tạo 1 luồng riêng giống như Bike vậy (OrderController -> OrderService > OrderServiceImpl -> OrderRepository
// hiện tại để a chạy thử trước xem Order đang bị lỗi gì, bữa sau a giải thích chi tiết hơn (call )
// từ giờ trở đi có code mới a sẽ đưa lên Git, có thể mn chưa biết cách quản lý git, nên tạm thời sẽ down source này về máy. để dành tgian ôn interview, sau này a chỉ Git thêm.
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Orders> list() {
        return orderService.findAll();
    }
}
*/
