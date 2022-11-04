package edu.ucdenver.tournament;

import javax.imageio.IIOException;
import javax.sound.sampled.Line;
import java.time.LocalDateTime;
import java.util.List;

public class Match {
    private LocalDateTime dateTime;
    private int scoreTeamA;
    private int scoreTeamB;
    LineUp lineupA;
    LineUp lineupB;
    Team teamA;
    Team teamB;

    Match(LocalDateTime dateTime, Team teamA, Team teamB){
        this.dateTime=dateTime;
        this.teamA = teamA;
        this.teamB = teamB;
        lineupA = new LineUp(teamA);
        lineupB = new LineUp(teamB);
    }
    public LineUp getTeamA(){return lineupA;}
    public LineUp getTeamB(){return lineupB;}


    public boolean isUpcoming(){
        return dateTime.isEqual(LocalDateTime.now()) || dateTime.isAfter(LocalDateTime.now());
    }
    public void addPlayer(Player player, Team team){
        // team -> Lineup team
        // player -> player to add
        // check which team to add to
        // check if player is on team with LineUp listOfPlayers list
        // add if not
        // throw exception if player is in it\
        LineUp l = new LineUp(team);
        // check if team A
        if(l.getTeam() == this.teamA){lineupA.addPlayer(player);}
        // Check if team B
        if(l.getTeam() == this.teamB){lineupB.addPlayer(player);}
        else{throw new IllegalArgumentException("Player is already on team");}
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
