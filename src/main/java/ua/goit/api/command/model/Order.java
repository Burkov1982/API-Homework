package ua.goit.api.command.model;

public class Order {
    private long id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;
    private OrderStatus orderStatus;
    private boolean complete;

    public Order() {
    }

    public Order(int id, int petId, int quantity, String shipDate,
                 String status, OrderStatus orderStatus, boolean complete) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
        this.orderStatus = orderStatus;
        this.complete = complete;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return String.format("Id: %d \n PetId: %d \n Quantity: %d \n ShipDate: %s \n" +
                "Status: %s \n OrderStatus: %s \n Complete: %s \n", id, petId, quantity, shipDate, status, orderStatus,
                complete);

    }
}
