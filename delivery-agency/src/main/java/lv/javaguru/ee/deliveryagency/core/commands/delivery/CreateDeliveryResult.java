package lv.javaguru.ee.deliveryagency.core.commands.delivery;

import lv.javaguru.ee.deliveryagency.core.commands.DomainCommandResult;
import lv.javaguru.ee.deliveryagency.core.domain.Delivery;

public class CreateDeliveryResult implements DomainCommandResult {

    private Delivery delivery;

    public CreateDeliveryResult(Delivery delivery) {
        this.delivery = delivery;
    }

    public Delivery getDelivery() {
        return delivery;
    }

}
