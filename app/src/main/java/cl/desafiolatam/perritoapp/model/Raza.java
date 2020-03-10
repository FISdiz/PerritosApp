package cl.desafiolatam.perritoapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Raza {
    private String status;
    private Map<String, List> message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, List> getMessage() {
        return message;
    }

    public void setMessage(Map<String, List> message) {
        this.message = message;
    }

    public Raza(String status, Map<String, List> message) {
        this.status = status;
        this.message = message;

    }
}
