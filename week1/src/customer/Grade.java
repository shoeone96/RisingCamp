package customer;

public enum Grade {
    BRONZE(0.1f), SILVER(0.2f), GOLD(0.3f);
    private final float rate;
    Grade(float rate) {
        this.rate = rate;
    }

    public static Grade setGrade(String grade) {
        if (grade.equals("BRONZE")) return BRONZE;
        if (grade.equals("SILVER")) return SILVER;
        return GOLD;
    }

    public float getRate() {
        return this.rate;
    }
}
