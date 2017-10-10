package com.cafekotlin.dependence;

public class Postman {

    private ToDeliverCorrespondence toDeliverCorrespondence;

    public Postman() {
        this.toDeliverCorrespondence = new ToDeliverCorrespondence();
    }

    public void draftAnnualReport() {
        toDeliverCorrespondence.doTask();
    }
}
