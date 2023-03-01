package itmo.blps.mommy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPurchaseKey implements Serializable {
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "purchase_id")
    private Integer purchaseId;
}
