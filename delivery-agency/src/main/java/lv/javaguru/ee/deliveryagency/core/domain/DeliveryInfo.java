package lv.javaguru.ee.deliveryagency.core.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="deliveryInfos")
public class DeliveryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="deliveryInfoId", nullable = false)
	private Long deliveryInfoId;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "deliveryId", nullable = false)
    private Delivery delivery;

	@Column(name="desiredDeliveryDate", nullable = true)
    private Date desiredDeliveryDate;

	@Column(name="desiredDeliveryTimeFrom", nullable = true)
    private String desiredDeliveryTimeFrom;

	@Column(name="desiredDeliveryTimeTo", nullable = true)
    private String desiredDeliveryTimeTo;

	@Column(name="deliveryNotes", nullable = true)
    private String deliveryNotes;


    public Long getDeliveryInfoId() {
        return deliveryInfoId;
    }

    public void setDeliveryInfoId(Long deliveryInfoId) {
        this.deliveryInfoId = deliveryInfoId;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Date getDesiredDeliveryDate() {
        return desiredDeliveryDate;
    }

    public void setDesiredDeliveryDate(Date desiredDeliveryDate) {
        this.desiredDeliveryDate = desiredDeliveryDate;
    }

    public String getDesiredDeliveryTimeFrom() {
        return desiredDeliveryTimeFrom;
    }

    public void setDesiredDeliveryTimeFrom(String desiredDeliveryTimeFrom) {
        this.desiredDeliveryTimeFrom = desiredDeliveryTimeFrom;
    }

    public String getDesiredDeliveryTimeTo() {
        return desiredDeliveryTimeTo;
    }

    public void setDesiredDeliveryTimeTo(String desiredDeliveryTimeTo) {
        this.desiredDeliveryTimeTo = desiredDeliveryTimeTo;
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
    }
}
