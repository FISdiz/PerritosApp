package cl.desafiolatam.perritoapp.model;

import java.util.ArrayList;
import java.util.List;

public class Raza {
    private String status;
    private List<SubRaza> message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SubRaza> getMessage() {
        return message;
    }

    public void setMessage(List<SubRaza> message) {
        this.message = message;
    }

    public Raza(String status, List<SubRaza> message) {
        this.status = status;
        this.message = message;

    }
}
