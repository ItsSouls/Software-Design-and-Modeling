package Ejercicio_3;

public class PercentagePromotion implements Promotion {
    private float percentage;

    public PercentagePromotion(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public int applyDiscount(int price) {
        return (int) (price * (1 - percentage / 100));
    }
}
