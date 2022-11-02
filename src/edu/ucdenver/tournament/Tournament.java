package edu.ucdenver.tournament;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Tournament implements Serializable {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;


    public static final String filename = "./tournament.ser";//load/save double check w javi

    public Tournament(String name, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;

    }
    public void loadFromFile(String fileName){

    }
    public void saveToFile(String fineName){


    }
    public void addCountry(String countryName){


    }
    public void addTeam(String name, String country){

    }
    public void addReferee (String name, String country){

    }
    public void addPlayer(String teamName, String playerName, int age, double height, double weight){

    }
    public void addMatch(LocalDate dateTime, String teamAName, String teamBName){

    }
    public void addRefereeToMatch(LocalDate dateTime, String refereeName){

    }
    public void addPlayerToMatch(LocalDate dateTime, String teamName, String playerName){

    }
    public void setMatchScore(LocalDate dateTime, int teamAScore, int teamBScore){//uml gives just variable types

    }
    public List<Match> getUpcomingMatches(){

        return null;//fixme
    }
    public List<Match> getMatchesOn(LocalDate date){

        return null;//fixme
    }
    public List<Match> getMatchesFor(){

        return null;//fixme
    }
    public List<LineUp> getMatchLineUps(){

        return null;//fixme
    }

}
