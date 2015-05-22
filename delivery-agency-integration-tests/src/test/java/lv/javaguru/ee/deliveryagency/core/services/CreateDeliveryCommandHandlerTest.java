package lv.javaguru.ee.deliveryagency.core.services;

import lv.javaguru.ee.deliveryagency.core.CommandExecutor;
import lv.javaguru.ee.deliveryagency.core.commands.delivery.CreateDeliveryCommand;
import lv.javaguru.ee.deliveryagency.core.commands.delivery.CreateDeliveryResult;
import lv.javaguru.ee.deliveryagency.core.database.hibernate.DatabaseHibernateTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreateDeliveryCommandHandlerTest extends DatabaseHibernateTest {

    @Autowired
    private CommandExecutor serviceExecutor;

    @Test
    public void testCommand() {
        CreateDeliveryCommand command = new CreateDeliveryCommand();
        CreateDeliveryResult commandResult = serviceExecutor.execute(command);
        assertThat(commandResult, is(notNullValue()));
        assertThat(commandResult.getDelivery(), is(notNullValue()));
        assertThat(commandResult.getDelivery().getDeliveryId(), is(notNullValue()));
    }

}
