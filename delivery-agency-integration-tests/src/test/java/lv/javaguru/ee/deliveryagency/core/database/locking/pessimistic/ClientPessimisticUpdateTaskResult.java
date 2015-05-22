package lv.javaguru.ee.deliveryagency.core.database.locking.pessimistic;

import lv.javaguru.ee.deliveryagency.core.database.locking.TaskResult;

public class ClientPessimisticUpdateTaskResult implements TaskResult {

    private boolean updatedSuccessfully;

    public ClientPessimisticUpdateTaskResult(boolean updatedSuccessfully) {
        this.updatedSuccessfully = updatedSuccessfully;
    }

    public boolean isUpdatedSuccessfully() {
        return updatedSuccessfully;
    }

}
