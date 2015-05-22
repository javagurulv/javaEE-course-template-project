package lv.javaguru.ee.deliveryagency.core.commands.client;

import lv.javaguru.ee.deliveryagency.core.commands.DomainCommand;

public class DeleteClientCommand implements DomainCommand<DeleteClientResult> {

    private Long deliveryId;
    private Long clientId;


    public DeleteClientCommand(Long deliveryId, Long clientId) {
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
