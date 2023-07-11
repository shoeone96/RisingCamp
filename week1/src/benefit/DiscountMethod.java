package benefit;

public class DiscountMethod implements BenefitMethod {
    @Override
    public int calculate(int price, float rate) {
        return (int) (price * (1 - rate));
    }
    @Override
    public void form(int price, float rate){
        System.out.println("결제 방식: "
                + "할인 결제 방식" + "\n"
                + "결제 금액: " + calculate(price, rate));
    }

}
