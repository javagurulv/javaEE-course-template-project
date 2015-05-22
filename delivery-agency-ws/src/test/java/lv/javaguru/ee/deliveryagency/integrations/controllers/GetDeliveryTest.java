package lv.javaguru.ee.deliveryagency.integrations.controllers;

import lv.javaguru.ee.deliveryagency.integrations.RestException;
import lv.javaguru.ee.deliveryagency.integrations.domain.DeliveryDTO;
import lv.javaguru.ee.deliveryagency.integrations.jetty.EmbeddedJettyTest;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetDeliveryTest extends EmbeddedJettyTest {

    @Test
    public void testGetDelivery() {
        DeliveryDTO deliveryDTO = new DeliveryDTO();
        DeliveryDTO createdDeliveryDTO = RestFixture.createDelivery(deliveryDTO);
        assertThat(createdDeliveryDTO.getDeliveryId(), is(notNullValue()));

        DeliveryDTO getDeliveryDTO = RestFixture.getDelivery(createdDeliveryDTO.getDeliveryId());
        assertThat(getDeliveryDTO.getDeliveryId(), is(notNullValue()));
    }

    @Test
    public void testGetDelivery_Failed() {
        try {
            RestFixture.getDelivery(Long.MAX_VALUE);
            fail();
        } catch (RestException e) {
            assertEquals(422, e.getHttpStatus());
        }
    }

}
