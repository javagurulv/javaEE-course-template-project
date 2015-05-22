package lv.javaguru.ee.deliveryagency.integrations.resourses;

import lv.javaguru.ee.deliveryagency.integrations.RestException;
import lv.javaguru.ee.deliveryagency.integrations.domain.DeliveryDTO;

public interface DeliveryResource {

    static final String DELIVERY_URL = "/rest/delivery";


    DeliveryDTO createDelivery(DeliveryDTO deliveryDTO) throws RestException;

    DeliveryDTO getDelivery(Long deliveryId) throws RestException;

}
