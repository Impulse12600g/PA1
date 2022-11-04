package edu.ucdenver.tournament;

public class Referee {
    private String name;
    private Country country;

    Referee(String name, Country country){
        this.name = name;
        this.country = country;
    }
    public Country getCountry(){
        return country;
    }
    public String getName() {//needed to pull name from tournament add referee method
        return name;
    }

}
