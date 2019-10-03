package cn.designdemo.structural.facade;

public class Test {

    public static void main(String[] args) {

        PointsGift pointsGift = new PointsGift("唐老鸭娃娃");

        GiftExchangeService giftExchangeService = new GiftExchangeService();
        //因为没有spring整合，只能通过setter的方式去注入
        /*giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setShippingService(new ShippingService());*/

        giftExchangeService.giftExchange(pointsGift);

    }

}
