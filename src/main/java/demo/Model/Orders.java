package demo.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table
public class Orders {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yy" )
    private Date purchaseDate; // ngày order (ngày mua)

    @NotNull
    private Long number; // số lượng sản phẩm trên 1 order

    // quan hệ giữa các bảng:
    // User - Orders:  vì 1 user có thể có n orders, trên 1 order chỉ lưu thông tin của 1 user => 1 - n
    // Bike - Orders: vì 1 bike có thể nằm trên n Orders, trên 1 order chỉ lưu thông tin của 1 bike => 1 -n
    // spring framework có thể tạo mới quan hệ này (thay cho việc tạo bằng câu sql trong database) như sau:

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne // ngược lại
    @JoinColumn(name = "bike_id", nullable = false)
    private Bike bike; // trên 1 order (1 dòng dự liệu (1 record) chỉ có thông tin về 1 bike) => trả về 1 Bike

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }
}
