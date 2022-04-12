package Furama.models;

public class Booking {
    private int idBooking;
    private String startDate;
    private String endDate;
    private int idCustomer;
    private String nameService;
    private Facility optionService;

    public Booking(int idBooking, String startDate, String endDate, int idCustomer, String nameService, Facility optionService) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.optionService = optionService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Facility getOptionService() {
        return optionService;
    }

    public void setOptionService(Facility optionService) {
        this.optionService = optionService;
    }


    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                '}';
    }
}
