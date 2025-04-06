package Ejercicio_1;

import java.time.LocalDate;

public class RentalOnSite extends Rental {
    private String comments;

    public RentalOnSite(LocalDate startDate, LocalDate endDate, Customer customer, Car car, RentalOffice rentalOffice, String comments) {
        super(startDate, endDate, customer, car, rentalOffice);
        this.setComments(comments);
    }

    public String getComments() {
        return comments;
    }

    private void setComments(String comments) {
        assert (comments != null) : "Los comentarios no son válidos";
        this.comments = comments;
    }
}
