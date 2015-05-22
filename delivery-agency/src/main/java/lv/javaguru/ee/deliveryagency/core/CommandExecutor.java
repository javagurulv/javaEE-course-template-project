package lv.javaguru.ee.deliveryagency.core;

import lv.javaguru.ee.deliveryagency.core.commands.DomainCommand;
import lv.javaguru.ee.deliveryagency.core.commands.DomainCommandResult;

public interface CommandExecutor {

    <T extends DomainCommandResult> T execute(DomainCommand<T> domainCommand);

}
