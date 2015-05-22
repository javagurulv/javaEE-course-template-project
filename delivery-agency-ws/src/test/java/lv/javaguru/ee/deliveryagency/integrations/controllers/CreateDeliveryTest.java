package lv.javaguru.ee.deliveryagency.integrations.controllers;

import lv.javaguru.ee.deliveryagency.integrations.domain.DeliveryDTO;
import lv.javaguru.ee.deliveryagency.integrations.jetty.EmbeddedJettyTest;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreateDeliveryTest extends EmbeddedJettyTest {

    @Test
    public void testCreateDelivery() {
        DeliveryDTO deliveryDTO = new DeliveryDTO();
        DeliveryDTO createdDeliveryDTO = RestFixture.createDelivery(deliveryDTO);
        assertThat(createdDeliveryDTO.getDeliveryId(), is(notNullValue()));
    }

}
