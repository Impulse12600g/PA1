package edu.ucdenver.tournament;

import javax.sound.sampled.Line;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Tournament implements Serializable {
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ArrayList<Country> participatingCountries;
    private ArrayList<Team> listTeams;
    private ArrayList<Referee> listReferees;
    private ArrayList<Match> listMatches;


    public static final String filename = "./tournament.ser";//load/save double check w javi

    public Tournament(String name, LocalDateTime startDate, LocalDateTime endDate){
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
    public ArrayList<Team> getListTeams() {return listTeams;}
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

    public Team getTeam(String teamName) throws IllegalArgumentException{ // added getter for testing and setter
        for(Team t: this.listTeams){
            if((t.getName()).equals(teamName)){return t;}
        }
        throw new IllegalArgumentException("Team is not in the list");
    }

    public void addTeam(String teamName, String country){
        Team team = null;
        //LineUp lineUp = null;
        try{
            team = this.getTeam(teamName);
        } catch (IllegalArgumentException e) {
            for(Country c: participatingCountries){
                if(Objects.equals(c.getCountryName(), country))
                    this.listTeams.add(new Team(name, c));
            }

        }
        if(team != null) {
            throw new IllegalArgumentException("Team is already in the list");
        }
    }

    public Referee getReferee(String name) throws IllegalArgumentException{
        for(Referee r: this.listReferees){
            if((r.getName()).equalsIgnoreCase(name)){return r;}
        }
        throw new IllegalArgumentException("Referee is not in the list");
    }

    public void addReferee (String name, String country){
        Referee referee = null;
        try{
            referee = this.getReferee(name);
        } catch (IllegalArgumentException e){
            for(Country c: participatingCountries){
                if(Objects.equals(c.getCountryName(), country))
                    this.listReferees.add(new Referee(name, c));
            }
        }
        if(referee != null){
            throw new IllegalArgumentException("Referee is already in the list");
        }
    }


    public void addPlayer(String teamName, String playerName, int age, double height, double weight){
        // Will we need to make listOfPlayers available here? Only way I know how to do this is with that arraylist
        try{
            for(Team t : this.listTeams) {
                if(Objects.equals(teamName, t.getName())){
                    for(Player p: t.getSquad()) {
                   if ((p.getName()).equals(playerName)) {
                       throw new IllegalArgumentException("Player is already on a team");
                   }else{
                       t.addPlayer(playerName, age, height,  weight);
                   }
               }
            }
            }
        }catch (IllegalArgumentException iae){
            iae.printStackTrace();
        }
    }
    public void addMatch(LocalDateTime dateTime, Team teamAName, Team teamBName){
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
