package toomler
package model

case class TournamentInProgress(p: List[Player], round: Int = 1) extends {
  val players = p
} with BaseTournament {

}
