import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import toomler.model._

class TournamentTest extends Specification {

  "A small chess tournament" should {
    val smallTournament = Tournament(List(TeamSolo(Player("Vince")), TeamSolo(Player("Thib"))), ChessGame())
    "have 2 players" in {
      smallTournament.teams must have size(2)
    }
    "start with round 1" in {
      smallTournament.start.round must equalTo(1)
    }
  }
}
