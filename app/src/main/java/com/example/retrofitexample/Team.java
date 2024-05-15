package com.example.retrofitexample;

public class Team {
    private String strTeam;
    private String strTeamBadge;

    // Constructor
    public Team(String strTeam, String strTeamBadge) {
        this.strTeam = strTeam;
        this.strTeamBadge = strTeamBadge;
    }

    // Getters
    public String getStrTeam() {
        return strTeam;
    }

    public String getStrTeamBadge() {
        return strTeamBadge;
    }
}