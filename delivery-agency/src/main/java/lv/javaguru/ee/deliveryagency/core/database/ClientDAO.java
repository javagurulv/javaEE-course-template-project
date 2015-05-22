package lv.javaguru.ee.deliveryagency.core.database;

import lv.javaguru.ee.deliveryagency.core.domain.Client;
import org.hibernate.LockOptions;

public interface ClientDAO extends CRUDOperationDAO<Client, Long> {

    Client getById(Long clientId, LockOptions lockOptions);

}
