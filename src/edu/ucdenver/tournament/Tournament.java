package edu.ucdenver.tournament;

import java.time.LocalDate;

public class Tournament {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public Tournament(String name, LocalDate startDate, LocalDate endDate){

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
    //getUpcomingMatches():List<Match>
    //getMatchesOn(LocalDate): List<Match>
    //getMatchesFor(String teamName): List<Match>
    //getMachLineUps(LocalDate): List<LineUp>

}
