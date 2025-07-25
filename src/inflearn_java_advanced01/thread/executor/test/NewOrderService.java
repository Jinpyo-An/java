package inflearn_java_advanced01.thread.executor.test;

import java.util.concurrent.*;

import static inflearn_java_advanced01.util.MyLogger.log;
import static inflearn_java_advanced01.util.ThreadUtils.sleep;

public class NewOrderService {

    public void order(String orderNo) throws ExecutionException, InterruptedException {
        final ExecutorService es = Executors.newFixedThreadPool(3);

        final Future<Boolean> future1 = es.submit(new InventoryWork(orderNo));
        final Future<Boolean> future2 = es.submit(new ShippingWork(orderNo));
        final Future<Boolean> future3 = es.submit(new AccountingWork(orderNo));

        if (future1.get() && future2.get() && future3.get()) {
            log("모든 주문 처리가 성공적으로 완료되었습니다.");
        } else {
            log("일부 작업이 실패했습니다.");
        }

        es.close();

    }

    static class InventoryWork implements Callable<Boolean> {

        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() throws Exception {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class ShippingWork implements Callable<Boolean> {

        private final String orderNo;

        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() throws Exception {
            log("배송 시스템 알림: "+ orderNo);
            sleep(1000);
            return true;
        }
    }

    static class AccountingWork implements Callable<Boolean> {

        private final String orderNo;

        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() throws Exception {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }
}
