package toomler
package model

import scala.util.Random

case class TournamentInProgress(teams: List[Team], game: Game, round: Int = 1) extends BaseTournament {
  val matches: List[Match] = teams.grouped(game.numberOfPlayers) map { group => Match(group) } toList
}
