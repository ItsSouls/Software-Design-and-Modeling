package Ejercicio_2;

import java.util.Date;
import java.util.List;

public class SubstituteState implements CarState {
    @Override
    public boolean isAvailableToRent() {
        return false;
    }

    @Override
    public void updateStatus(Car car, Date backToServiceDate) {
        // 
    }
    @Override
    public String toString() {
        return "Coche de sustitución";
    }
}
