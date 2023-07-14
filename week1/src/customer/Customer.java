package customer;

import benefit.BenefitMethod;

public abstract class Customer {
    private String name;
    private Grade grade;
    private BenefitMethod benefitMethod;
    private int bonus;

    public Customer(String name, String grade, BenefitMethod method) {
        this.name = name;
        this.grade = Grade.setGrade(grade);
        this.benefitMethod = method;
        this.bonus = 0;
    }

    public abstract void showCustomerInfo();

    public void calculatePrice(int price) {
        this.benefitMethod.form(price, grade.getRate());
    }

    public String getName() {
        return name;
    }


    public boolean equals(Customer customer){
        return this.name.equals(customer.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
