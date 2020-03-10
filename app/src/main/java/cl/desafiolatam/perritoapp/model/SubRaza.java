package cl.desafiolatam.perritoapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class SubRaza {
    private Map<String, List> subRaza;
    private String raza;

    public Map<String, List> getSubRaza() {
        return subRaza;
    }

    public void setSubRaza(Map<String, List> subRaza) {
        this.subRaza = subRaza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public SubRaza(Map<String, List> subRaza, String raza) {
        this.subRaza = subRaza;
        this.raza = raza;

    }
}
