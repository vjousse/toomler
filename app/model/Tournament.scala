package toomler
package model

case class Tournament (teams: List[Team], game: Game) {

  def start(): TournamentInProgress = TournamentInProgress(game, teams)
}
