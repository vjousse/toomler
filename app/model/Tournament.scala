package toomler
package model

case class Tournament (p: List[Player]) extends {
  val players = p
} with BaseTournament {

  def start(): TournamentInProgress = new TournamentInProgress(p)
}
