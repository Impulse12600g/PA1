package edu.ucdenver.tournament;

import javax.sound.sampled.Line;
import java.time.LocalDate;
import java.util.List;

public class Match {
    private LocalDate dateTime;
    private int scoreTeamA;
    private int scoreTeamB;
    Team teamA;
    Team teamB;

    Match(LocalDate dateTime, Team teamA, Team teamB){
        this.dateTime=dateTime;
        this.teamA = teamA;
        this.teamB = teamB;

    }
    public LineUp getTeamA(){
        return null;
    }
    public LineUp getTeamB(){

        return null;//fixme
    }
    public boolean isUpcoming(){

        return false;//fixme
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
