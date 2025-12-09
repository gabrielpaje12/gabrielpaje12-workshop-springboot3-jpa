package com.APIweb.course.entities.pk;

import com.APIweb.course.entities.Order;
import com.APIweb.course.entities.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;


@Embeddable
@Getter
@Setter
public class OrderItemPK implements Serializable {
   @ManyToOne
   @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id" )
    private Product product;

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof OrderItemPK that)) return false;

        return Objects.equals(getOrder(), that.getOrder()) && Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getOrder());
        result = 31 * result + Objects.hashCode(getProduct());
        return result;
    }
}
