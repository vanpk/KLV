package demo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private Long user_id;

    @NotNull
    private String name;

    private Long phone;

    private String address;
// sau khi tạo 2 tables mới (user, orders) và tạo quan hệ 1-n, run lại project, nó sẽ tự tạo bảng mới, dựa vào file application.properties nữa
    @OneToMany(mappedBy="user") // user và orders ( 1-n), tương tự như bike và orders
    private List<Orders> orders;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
