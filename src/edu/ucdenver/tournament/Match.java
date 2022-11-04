package edu.ucdenver.tournament;

import javax.sound.sampled.Line;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Match {
    private LocalDate dateTime;
    private int scoreTeamA;
    private int scoreTeamB;
    Team teamA;
    Team teamB;
    private ArrayList<Referee> matchReferees;

    Match(LocalDate dateTime, Team teamA, Team teamB){
        this.dateTime=dateTime;
        this.teamA = teamA;
        this.teamB = teamB;

    }
    public LineUp getTeamA(){ //TODO not sure this is correct
        LineUp lineUp = new LineUp(teamA);
        try{
            lineUp.getTeam();
            return lineUp;
        } catch(Exception e){
            throw new IllegalArgumentException("Lineup does not exist");
        }

    }
    public LineUp getTeamB(){ //TODO not sure this is correct
        LineUp lineUp = new LineUp(teamB);
        try{
            lineUp.getTeam();
            return lineUp;
        } catch(Exception e){
            throw new IllegalArgumentException("Lineup does not exist");
        }
    }
    public boolean isUpcoming(){
        // return true if dateTime is today or in the future, false if the date has passed
        return dateTime.equals(LocalDate.now()) || dateTime.isBefore(LocalDate.now());

    }
    public void addPlayer(Player player, Team team){
        // TODO
        // Not sure how to implement this yet
        // uses Lineup to add players from player class?
    }
    public List<Referee> getReferees(){
        return matchReferees;
    }
    public void addReferee(Referee referee){
        this.matchReferees.add(referee);
    }
    public void setMatchScore(int  scoreTeamA, int scoreTeamB){
        this.scoreTeamA = scoreTeamA;
        this.scoreTeamB = scoreTeamB;
    }

}
