package Ejercicio_3;

import java.util.Date;

public class RentalOnSite extends Rental {
    private String comments;

    public RentalOnSite(Date startDate, Date endDate, Customer customer, Car car, RentalOffice rentalOffice, String comments, Promotion promotion) {
        super(startDate, endDate, customer, car, rentalOffice, promotion);
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
