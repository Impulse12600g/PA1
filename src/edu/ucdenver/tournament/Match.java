package edu.ucdenver.tournament;

import javax.sound.sampled.Line;
import java.time.LocalDateTime;
import java.util.List;

public class Match {
    private LocalDateTime dateTime;
    private int scoreTeamA;
    private int scoreTeamB;
    LineUp lineupA;
    LineUp lineupB;

    Match(LocalDateTime dateTime, Team teamA, Team teamB){
        this.dateTime=dateTime;
        lineupA = new LineUp(teamA);
        lineupB = new LineUp(teamB);
    }
    public LineUp getTeamA(){return lineupA;}
    public LineUp getTeamB(){return lineupB;}


    public boolean isUpcoming(){
        return dateTime.isEqual(LocalDateTime.now()) || dateTime.isAfter(LocalDateTime.now());
    }
    public void addPlayer(Player player, Team team){


    }
    public List<Referee> getReferees(){

        return null;//fixme
    }
    public void addReferee(Referee referee){
    }
    public void setMatchScore(int  scoreTeamA, int scoreTeamB){
        this.scoreTeamA = scoreTeamA;
        this.scoreTeamB =scoreTeamB;
    }
}
