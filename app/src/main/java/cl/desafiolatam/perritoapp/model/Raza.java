package cl.desafiolatam.perritoapp.model;

import java.util.ArrayList;

public class Raza {
    private String status;
    private ArrayList<SubRaza> message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<SubRaza> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<SubRaza> message) {
        this.message = message;
    }

    public Raza(String status, ArrayList<SubRaza> message) {
        this.status = status;
        this.message = message;

    }
}
