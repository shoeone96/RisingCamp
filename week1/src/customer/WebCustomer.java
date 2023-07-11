package customer;

import benefit.BenefitMethod;

public class WebCustomer extends Customer{
    @Override
    public void showCustomerInfo() {
        System.out.printf("접속 경로: Web\n이름: %s \n등급: %s%n", super.getName(), super.getGrade().name());
    }

    public WebCustomer(String name, String grade, BenefitMethod method) {
        super(name, grade, method);
    }

}
