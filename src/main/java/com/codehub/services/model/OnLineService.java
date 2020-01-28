package com.codehub.services.model;

public class OnLineService extends Service{
    private int durationInMinutes;
    private int costPerMinute;

    public OnLineService(String description,
                         int durationInMinutes, int costPerMinute) {
        super.setDescription(description);
        this.durationInMinutes = durationInMinutes;
        this.costPerMinute = costPerMinute;
    }

    @Override
    public int getTotalPrice() {
        return durationInMinutes*costPerMinute;
    }

}
