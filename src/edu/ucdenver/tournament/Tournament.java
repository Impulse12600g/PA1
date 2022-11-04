package edu.ucdenver.tournament;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tournament implements Serializable {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Country> participatingCountries;
    private ArrayList<Team> listTeams;
    private ArrayList<Referee> listReferees;
    private ArrayList<Match> listMatches;


    public static final String filename = "./tournament.ser";//load/save double check w javi

    public Tournament(String name, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;

        // temporary initial assignment until we decide what to do with these
        //FIXME
        this.participatingCountries = new ArrayList<>();
        this.listTeams = new ArrayList<>();
        this.listReferees = new ArrayList<>();
        this.listMatches = new ArrayList<>();
    }

    // Temporary getters for array lists /////////////////////////////////////////
    // FIXME
    public ArrayList<Country> getParticipatingCountries(){return participatingCountries;}
    public ArrayList<Team> getListTeams()
    {return listTeams;}
    public ArrayList<Referee> getListReferees(){return listReferees;}
    public ArrayList<Match> getListMatches(){return listMatches;}

    /////////////////////////////////////////////////////////////////////////////


    public void loadFromFile(String fileName){ //TODO add file operations
        try{
            File file = new File(fileName);
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String string;
            while((string = reader.readLine()) != null){
                // Do something with the file here
                System.out.println("Doing file stuff");
            }
            reader.close();
        } catch(Exception e){
            System.out.println("File does not exist");
            e.printStackTrace();
        }

    }
    public void saveToFile(String fineName){ //TODO finish file manipulation
        String things = "PLACEHOLDER"; // figure out what to write to file
        try{
            FileWriter writer = new FileWriter(fineName, false);
            writer.write(things);
            writer.close();
            System.out.println("Successfully overwritten file");
        } catch(IOException e){
            e.printStackTrace();
        }

    }
    public Country getCountry(String countryName) throws IllegalArgumentException{
        Country country;
        for(Country c: this.participatingCountries){
            if((c.getCountryName()).equalsIgnoreCase(countryName)){return c;}
        }
        throw new IllegalArgumentException("Country is not participating");
    }

    public void addCountry(String countryName){
        Country country = null;
        try{country = this.getCountry(countryName);}
        catch(IllegalArgumentException iae){
            this.participatingCountries.add(new Country(countryName));
        }
        if(country != null){
            throw new IllegalArgumentException("Country is already in the list");
        }
    }

    public void addTeam(String name, Country country){
        this.listTeams.add(new Team(name, country));
    }
    public void addReferee (String name, Country country){
        this.listReferees.add(new Referee(name, country));
    }
    public void addPlayer(String teamName, String playerName, int age, double height, double weight){
        // Will we need to make listOfPlayers available here? Only way I know how to do this is with that arraylist
    }
    public void addMatch(LocalDate dateTime, Team teamAName, Team teamBName){
        this.listMatches.add(new Match(dateTime, teamAName, teamBName));
    }
    public void addRefereeToMatch(LocalDate dateTime, String refereeName){

    }
    public void addPlayerToMatch(LocalDate dateTime, String teamName, String playerName){

    }
    public void setMatchScore(LocalDate dateTime, int teamAScore, int teamBScore){//uml gives just variable types

    }
    public List<Match> getUpcomingMatches(){

        return listMatches;
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
