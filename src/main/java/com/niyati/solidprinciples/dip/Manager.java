package com.niyati.solidprinciples.dip;

public class Manager {
    IWorker worker;

    public Manager(IWorker worker) {
        this.worker = worker;
    }

    public String manage() {
        return worker.work();
    }
}
