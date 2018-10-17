package bowling
import scala.collection._


case class Bowling(rolls: List[Frame]){

    def getRolls(): List[Frame] = this.rolls


    // Creates the list of rolls
    def roll(roll1: Int, roll2: Int, rolls: List[Frame]): Bowling = {

            val newFrame: Frame = new Frame(roll1, roll2)
            val newRolls: List[Frame] = newFrame :: rolls
            val newBowling: Bowling = new Bowling(newRolls)
            newBowling

    }


    // Calculates the score given the list of rolls
    def getScore(rolls: List[Frame], score: Int, bonus: Int): Int = {

        if (rolls.isEmpty){
            score
        }
        else{
            val currentFrame: Frame = rolls.head
            val roll1: Int = currentFrame.getRoll1()
            val roll2: Int = currentFrame.getRoll2()

            // If spare
            val currentScore: Int = if (bonus == 1){
                2*roll1 + roll2 + score
            }
            // If strike
            else if (bonus == 2){
                2*roll1 + 2*roll2 + score
            }
            // If double strike
            else if (bonus == 3){
                3*roll1 + 2*roll2 + score
            }
            // If normal
            else {
                 roll1 + roll2 + score
            }

            val newBonus: Int = getBonus(roll1, roll2)
            val newRolls: List[Frame] = rolls.tail
            if (newBonus == 2 && bonus == 2 || bonus == 3 && newBonus == 2){
                getScore(newRolls, currentScore, 3)
            }
            else getScore(newRolls, currentScore, newBonus)
        }
    }

    // Retrieve the bonus
    def getBonus(roll1: Int, roll2: Int): Int = {
        // If strike
        if (roll1 == 10) 2
        // If spare
        else if (roll1+roll2 == 10) 1
        // If normal
        else 0
    }

    // To do: a main who plays a game recursively 10 times + the bonus roll
    // def play(frame: Int): Unit = {
    //     if (frame == 0){
    //         print("Game over! Your score is " + getScore())
    //     }
    //     else {
    //         roll()
    //     }
    // }



}

object Bowling {

}
