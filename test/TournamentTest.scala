import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import toomler.model._

class TournamentTest extends Specification {

  "A basic tournament" should {
    "have 2 players" in {
      Tournament(List(
        Player("Vince"),
        Player("Thib")
      )).players must have size(2)
    }
  }
}
