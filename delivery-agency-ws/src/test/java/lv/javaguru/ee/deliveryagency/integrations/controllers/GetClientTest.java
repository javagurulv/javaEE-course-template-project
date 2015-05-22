package lv.javaguru.ee.deliveryagency.integrations.controllers;

import lv.javaguru.ee.deliveryagency.integrations.RestException;
import lv.javaguru.ee.deliveryagency.integrations.domain.ClientDTO;
import lv.javaguru.ee.deliveryagency.integrations.domain.DeliveryDTO;
import lv.javaguru.ee.deliveryagency.integrations.jetty.EmbeddedJettyTest;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static lv.javaguru.ee.deliveryagency.integrations.domain.builders.ClientDTOBuilder.createClientDTO;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetClientTest extends EmbeddedJettyTest {

    private Long deliveryId;


    @Before
    public void initTestData() {
        DeliveryDTO createDeliveryDTO = RestFixture.createDelivery();
        assertThat(createDeliveryDTO.getDeliveryId(), is(notNullValue()));
        this.deliveryId = createDeliveryDTO.getDeliveryId();
    }

    @Test
    public void testGetClient() {
	    ClientDTO clientDTO = createClientDTO()
			    .withFirstName("A")
			    .withLastName("B")
			    .withEmail("email")
			    .withPhone("1111")
			    .withSpecialNotes("notes").build();

	    ClientDTO createClientDTO = RestFixture.createClient(deliveryId, clientDTO);
        Long clientId = createClientDTO.getClientId();

        ClientDTO getClientDTO = RestFixture.getClient(deliveryId, clientId);
        assertThat(getClientDTO.getClientId(), is(clientId));
        assertThat(getClientDTO.getFirstName(), is("A"));
        assertThat(getClientDTO.getLastName(), is("B"));
    }

    @Test
    public void testGetClientWithWrongId() {
        try {
            RestFixture.getClient(deliveryId, Long.MAX_VALUE);
            fail();
        } catch (RestException e) {
            assertEquals(422, e.getHttpStatus());
        }
    }

}
