package day4;

public class Scoreboard {
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    private boolean active;

    public Scoreboard(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = 0;
        this.score2 = 0;
        this.active = true;
    }

    public String getScore(){
        if (this.active)
            return this.score1 + "-" + score2 + "-" + team1;
        else
            return score1 + "-" + score2 + "-" + team2;
    }

    public void recordScore(int points){
        if (points == 0)
            active = !active;
        else{
            if (active)
                score1 += points;
            else
                score2 += points;
        } 
    }
}


