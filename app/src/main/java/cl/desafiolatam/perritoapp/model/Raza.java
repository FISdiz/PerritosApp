package cl.desafiolatam.perritoapp.model;


import java.util.List;
import java.util.Map;

public class Raza {
    private String status;
    private Map<String, List<String>> message;

    public Raza(String status, Map<String, List<String>> message) {
        this.status = status;
        this.message = message;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, List<String>> getMessage() {
        return message;
    }

    public void setMessage(Map<String, List<String>> message) {
        this.message = message;
    }
}
