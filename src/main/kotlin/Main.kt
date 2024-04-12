package org.example


const val HERO_NAME="Madrigal"
fun main() {

    val playerlevel=4
    val hasBeFriendedBarbarians=true
    val hasAngeredBarbarians=false
    val playerClass="paladin"

    val race="gnome"
    val faction:String =when(race){
        "dwarf" ->"Keepers of the Mines"
        "gnome" -> "Tinkerers of the Undeground"
        "orc", "human" -> "Free People of the  koling Hills"
        else -> "Shadow Cabal of the Unseen Realm" //Неизвестная раса
    }

    val quest:String =when (playerlevel){
        1 -> "Meet Mr. Bubbles in the land of soft things."
        in 2..5 ->{
           val canTalkToBarbarians=!hasAngeredBarbarians && (hasBeFriendedBarbarians||playerClass=="barbarian")
           if (canTalkToBarbarians){
               "Convice the barbarians to call off their invasion"
           } else{
               "Save the town from the barbarian invasions."
           }
        }
        6 ->"Locate the enchanted sword."
        7 ->"Recover the long-lost artifact of creation."
        8->"Defeat Nogartse, bringer of death and eater of world."
        else -> "There are no quests right now."
    }
    val experincePoints=10
    val requiredExperiencePoints=10
    val levelUpStatus:String = when{
        experincePoints>requiredExperiencePoints -> "You already leveled up!"
        experincePoints==requiredExperiencePoints -> "You have enough experience to level up!"
        requiredExperiencePoints-experincePoints<20 -> "You are very close to leveling up!"
        else -> "You need more experience to level up!"
    }


}