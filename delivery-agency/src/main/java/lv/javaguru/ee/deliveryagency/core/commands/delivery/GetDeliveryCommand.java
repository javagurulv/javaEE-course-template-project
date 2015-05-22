package lv.javaguru.ee.deliveryagency.core.commands.delivery;

import lv.javaguru.ee.deliveryagency.core.commands.DomainCommand;

public class GetDeliveryCommand implements DomainCommand<GetDeliveryResult> {

    private Long deliveryId;

    public GetDeliveryCommand(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }
}
