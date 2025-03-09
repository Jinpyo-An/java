package inflearn_java_advaned.thread.executor.test;

import static inflearn_java_advaned.util.MyLogger.log;
import static inflearn_java_advaned.util.ThreadUtils.sleep;

public class OldOrderService {

    public void order(String orderNo) {
        final InventoryWork inventoryWork = new InventoryWork(orderNo);
        final ShippingWork shippingWork = new ShippingWork(orderNo);
        final AccountingWork accountingWork = new AccountingWork(orderNo);

        final Boolean inventoryResult = inventoryWork.call();
        final Boolean shippingResult = shippingWork.call();
        final Boolean accountingResult = accountingWork.call();

        if (inventoryResult && shippingResult && accountingResult) {
            log("모든 주문 처리가 성공적으로 완료되었습니다.");
        } else {
            log("일부 작업이 실패했습니다.");
        }
    }

    static class InventoryWork {

        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class ShippingWork {

        private final String orderNo;

        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() {
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class AccountingWork {

        private final String orderNo;

        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() {
            log("회계 시스템 업데이트: "+ orderNo);
            sleep(1000);
            return true;
        }
    }
}
