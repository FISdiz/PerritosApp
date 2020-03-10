package cl.desafiolatam.perritoapp.model;

import java.util.ArrayList;

class SubRaza {
    private ArrayList<String> subRaza;
    private String raza;

    public ArrayList<String> getSubRaza() {
        return subRaza;
    }

    public void setSubRaza(ArrayList<String> subRaza) {
        this.subRaza = subRaza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public SubRaza(ArrayList<String> subRaza, String raza) {
        this.subRaza = subRaza;
        this.raza = raza;

    }
}
