package org.programus.learning.entities;

public class BaseBallGame implements Game {
  private Team homeTeam;
  private Team awayTeam;

  public BaseBallGame() {}

  public BaseBallGame(Team homeTeam, Team awayTeam) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
  }

  @Override
  public void setHomeTeam(Team team) {
    homeTeam = team;
  }

  @Override
  public Team getHomeTeam() {
    return homeTeam;
  }

  @Override
  public void setAwayTeam(Team team) {
    awayTeam = team;
  }

  @Override
  public Team getAwayTeam() {
    return awayTeam;
  }

  @Override
  public String playGame() {
    return Math.random() > 0.5 ? "Home win: " + getHomeTeam().getName() : "Away win: " + getAwayTeam().getName();
  }
}
