package org.programus.learning;

import org.programus.learning.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
  @Bean
  public Game game() throws InstantiationException, IllegalAccessException {
    return new BaseBallGame(randomTeam(), randomTeam());
  }

  @Bean
  public Team randomTeam() throws IllegalAccessException, InstantiationException {
    Class[] teamClasses = new Class[] {
        Avengers.class,
        JusticeLeague.class,
        SuicideSquad.class
    };

    Class cls = teamClasses[(int) (Math.random() * teamClasses.length)];
    return (Team) cls.newInstance();
  }
}
