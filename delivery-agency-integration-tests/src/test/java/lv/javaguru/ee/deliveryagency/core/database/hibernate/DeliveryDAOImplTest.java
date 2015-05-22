package lv.javaguru.ee.deliveryagency.core.database.hibernate;

import lv.javaguru.ee.deliveryagency.core.domain.Delivery;
import org.junit.Test;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeliveryDAOImplTest extends DatabaseHibernateTest {

    @Test
    public void testCreate() {
	    doInTransaction(new TransactionCallbackWithoutResult() {
		    @Override
		    protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
			    Delivery delivery = new Delivery();
			    assertThat(delivery.getDeliveryId(), is(nullValue()));
			    deliveryDAO.create(delivery);
			    assertThat(delivery.getDeliveryId(), is(notNullValue()));
		    }
	    });
    }

}
