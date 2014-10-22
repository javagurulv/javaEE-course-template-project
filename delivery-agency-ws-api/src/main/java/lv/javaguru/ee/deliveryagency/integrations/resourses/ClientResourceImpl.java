package lv.javaguru.ee.deliveryagency.integrations.resourses;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import lv.javaguru.ee.deliveryagency.integrations.RestException;
import lv.javaguru.ee.deliveryagency.integrations.domain.ClientDTO;

/**
 * Created by Viktor on 19/09/2014.
 */
public class ClientResourceImpl implements ClientResource {

    private String baseWebServiceUrl;
    private Client client;


    public ClientResourceImpl(String baseWebServiceUrl) {
        this.baseWebServiceUrl = baseWebServiceUrl;
        client = ClientBuilder.newClient();
    }

    public ClientDTO createClient(Long deliveryId, ClientDTO clientDTO) throws RestException {
        try {
	        String clientUrl = baseWebServiceUrl + CREATE_CLIENT_URL.replace("{deliveryId}", deliveryId.toString());
            WebTarget target = client.target(clientUrl);
            return target.request(MediaType.APPLICATION_JSON)
                    .post(Entity.entity(clientDTO, MediaType.APPLICATION_JSON), ClientDTO.class);
        } catch (Throwable e) {
            throw new RestException(e);
        }
    }

    public ClientDTO getClient(Long deliveryId, Long clientId) throws RestException {
        try {
            String clientUrl = baseWebServiceUrl + CLIENT_URL.replace("{deliveryId}", deliveryId.toString())
                    .replace("{clientId}", clientId.toString());
            WebTarget target = client.target(clientUrl);
            return target.request(MediaType.APPLICATION_XML).get(ClientDTO.class);
        } catch (Throwable e) {
            throw new RestException(e);
        }
    }

    public ClientDTO deleteClient(Long deliveryId, Long clientId) throws RestException {
        try {
            String clientUrl = baseWebServiceUrl + CLIENT_URL.replace("{deliveryId}", deliveryId.toString())
                    .replace("{clientId}", clientId.toString());
            WebTarget target = client.target(clientUrl);
            return target.request(MediaType.APPLICATION_XML).delete(ClientDTO.class);
        } catch (Throwable e) {
            throw new RestException(e);
        }
    }

    public ClientDTO updateClient(Long deliveryId, Long clientId, ClientDTO clientDTO) throws RestException {
        try {
            String clientUrl = baseWebServiceUrl + CLIENT_URL.replace("{deliveryId}", deliveryId.toString())
                    .replace("{clientId}", clientId.toString());
            WebTarget target = client.target(clientUrl);
            return target.request(MediaType.APPLICATION_XML)
                    .put(Entity.entity(clientDTO, MediaType.APPLICATION_XML), ClientDTO.class);
        } catch (Throwable e) {
            throw new RestException(e);
        }
    }

}