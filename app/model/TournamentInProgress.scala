package toomler
package model

import scala.util.Random

class TournamentInProgress private (matchs: List[Match], aGame: Game, aRound: Int = 1) extends BaseTournament {
  val game = aGame
  val round = aRound
}

object TournamentInProgress {

  def apply(game: Game, teams: List[Team]) = {

    val matchs: List[Match] = Random.shuffle(teams).grouped(2).map { group => group match {
        case List(a, b) => Some(Match(a,b))
        case _          => None
      }
    }.toList.flatten

    new TournamentInProgress(matchs, game)
  }

}
