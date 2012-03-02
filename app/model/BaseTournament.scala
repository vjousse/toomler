package toomler
package model

trait BaseTournament {

  val teams: List[Team]
  val game: Game

  require(teams.length >= 2)
  require(teams.length % game.numberOfPlayers == 0)

}
