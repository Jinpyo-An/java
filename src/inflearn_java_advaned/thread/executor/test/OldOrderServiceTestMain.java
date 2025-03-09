package inflearn_java_advaned.thread.executor.test;

import java.util.concurrent.ExecutionException;

public class OldOrderServiceTestMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String orderNo = "Order#1234";
        final NewOrderService newOrderService = new NewOrderService();
        newOrderService.order(orderNo);
    }
}
