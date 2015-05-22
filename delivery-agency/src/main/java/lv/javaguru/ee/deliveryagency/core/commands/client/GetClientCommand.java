package lv.javaguru.ee.deliveryagency.core.commands.client;

import lv.javaguru.ee.deliveryagency.core.commands.DomainCommand;

public class GetClientCommand implements DomainCommand<GetClientResult> {

    private Long deliveryId;
    private Long clientId;

    public GetClientCommand(Long deliveryId, Long clientId) {
        this.deliveryId = deliveryId;
        this.clientId = clientId;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }

    public Long getClientId() {
        return clientId;
    }
}
