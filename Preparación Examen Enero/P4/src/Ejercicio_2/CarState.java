package Ejercicio_2;

import java.util.Date;
import java.util.List;

public interface CarState {
    void updateStatus(Car car, Date backToServiceDate);
    boolean isAvailableToRent();
    @Override
    public abstract String toString();
}
