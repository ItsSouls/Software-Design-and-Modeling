package Ejercicio_2;

import java.util.Date;
import java.util.List;

public class InService implements CarState {
    @Override
    public void updateStatus(Car car, Date backToServiceDate) {
        car.setState(new OutOfServiceState());
        car.setBackToServiceDate(backToServiceDate);

        for (Car carSustituto : car.getRentalOffice().getCarsList()) {
            if (carSustituto.getModel().equals(car.getModel())) {
                if (carSustituto.getState().isAvailableToRent()) {
                    carSustituto.setState(new SubstituteState());
                    car.setCarSustituto(carSustituto);
                    return;
                }
            }
        }
    }

    @Override
    public boolean isAvailableToRent() {
        return true;
    }

    @Override
    public String toString() {
        return "En servicio";
    }
}
