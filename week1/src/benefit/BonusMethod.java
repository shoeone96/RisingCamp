package benefit;

public class BonusMethod implements BenefitMethod {
    @Override
    public int calculate(int price, float rate) {
        return (int) (price * rate);
    }


    @Override
    public void form(int price, float rate) {
        System.out.println("결제 방식: "
                + "할인 결제 방식" + "\n"
                + "보너스: " + calculate(price, rate)+ "\n"
                + "결제 금액: " + price );
    }
}
