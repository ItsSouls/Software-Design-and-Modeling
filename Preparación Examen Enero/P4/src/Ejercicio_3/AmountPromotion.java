package Ejercicio_3;

public class AmountPromotion implements Promotion {
    private int amount;

    public AmountPromotion(int amount) {
        this.amount = amount;
    }

    @Override
    public int applyDiscount(int price) {
        return Math.max(price - amount, 0);
    }
}
