package toomler
package model

case class Tournament (teams: List[Team], game: Game) extends BaseTournament {

  def start(): TournamentInProgress = new TournamentInProgress(teams, game)
}
