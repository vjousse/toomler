package toomler
package model

case class TeamSolo(player: Player) extends {
    val players = List(player)
  } with Team {

}
