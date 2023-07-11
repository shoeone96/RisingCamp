
import benefit.BenefitMethod;
import benefit.BonusMethod;
import benefit.DiscountMethod;
import customer.Customer;
import customer.MobileCustomer;
import customer.WebCustomer;

public class Main {
    public static void main(String[] args) {
        BenefitMethod method1 = new BonusMethod();
        BenefitMethod method2 = new DiscountMethod();

        Customer web = new WebCustomer("이름6", "GOLD", method2);
        Customer mobile = new MobileCustomer("이름7", "BRONZE", method1);
        System.out.println("================");
        web.showCustomerInfo();
        web.calculatePrice(10000);
        System.out.println("================");
        mobile.showCustomerInfo();
        mobile.calculatePrice(10000);
        System.out.println("================");
    }
}
