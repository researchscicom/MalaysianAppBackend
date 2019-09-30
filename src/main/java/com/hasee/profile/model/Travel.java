package com.hasee.profile.model;

import javax.persistence.*;

@Entity
@Table(name = "Travel")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nickname;
    String arrivingFrom;
    String arrivalAirport;
    String arrivingFlight;
    String purposeOfTravel;
    String durationOfStay;
    String commercialGood;
    String currencyExceedingValue;
    String liveAnimalOrPlant;
    String derivatives;
    String firearms;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArrivingFrom() {
        return arrivingFrom;
    }

    public void setArrivingFrom(String arrivingFrom) {
        this.arrivingFrom = arrivingFrom;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivingFlight() {
        return arrivingFlight;
    }

    public void setArrivingFlight(String arrivingFlight) {
        this.arrivingFlight = arrivingFlight;
    }

    public String getPurposeOfTravel() {
        return purposeOfTravel;
    }

    public void setPurposeOfTravel(String purposeOfTravel) {
        this.purposeOfTravel = purposeOfTravel;
    }

    public String getDurationOfStay() {
        return durationOfStay;
    }

    public void setDurationOfStay(String durationOfStay) {
        this.durationOfStay = durationOfStay;
    }

    public String getCommercialGood() {
        return commercialGood;
    }

    public void setCommercialGood(String commercialGood) {
        this.commercialGood = commercialGood;
    }

    public String getCurrencyExceedingValue() {
        return currencyExceedingValue;
    }

    public void setCurrencyExceedingValue(String currencyExceedingValue) {
        this.currencyExceedingValue = currencyExceedingValue;
    }

    public String getLiveAnimalOrPlant() {
        return liveAnimalOrPlant;
    }

    public void setLiveAnimalOrPlant(String liveAnimalOrPlant) {
        this.liveAnimalOrPlant = liveAnimalOrPlant;
    }

    public String getDerivatives() {
        return derivatives;
    }

    public void setDerivatives(String derivatives) {
        this.derivatives = derivatives;
    }

    public String getFirearms() {
        return firearms;
    }

    public void setFirearms(String firearms) {
        this.firearms = firearms;
    }
}
