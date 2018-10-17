package bowling

import org.scalatest.{FunSpec, Matchers}

class BowlingSpec extends FunSpec with Matchers {

    describe("All roll") {
  describe("with 0 pin down") {
    it("give a score of 0") {
        val newBowling1: Bowling = new Bowling(List()).roll(0,0, List())
        val newBowling2: Bowling = newBowling1.roll(0,0,newBowling1.getRolls())
        val newBowling3: Bowling = newBowling2.roll(0,0,newBowling2.getRolls())
        val newBowling4: Bowling = newBowling3.roll(0,0,newBowling3.getRolls())
        val newBowling5: Bowling = newBowling4.roll(0,0,newBowling4.getRolls())
        val newBowling6: Bowling = newBowling5.roll(0,0,newBowling5.getRolls())
        val newBowling7: Bowling = newBowling6.roll(0,0,newBowling6.getRolls())
        val newBowling8: Bowling = newBowling7.roll(0,0,newBowling7.getRolls())
        val newBowling9: Bowling = newBowling8.roll(0,0,newBowling8.getRolls())
        val newBowling10: Bowling = newBowling9.roll(0,0,newBowling9.getRolls())

        val rolls: List[Frame] = newBowling10.getRolls()
        assert(newBowling10.getScore(rolls, 0, 0) == 0)
    }
  }
  describe("with strikes") {
    it("give 300") {
        val newBowling1: Bowling = new Bowling(List()).roll(10,0, List())
        val newBowling2: Bowling = newBowling1.roll(10,0,newBowling1.getRolls())
        val newBowling3: Bowling = newBowling2.roll(10,0,newBowling2.getRolls())
        val newBowling4: Bowling = newBowling3.roll(10,0,newBowling3.getRolls())
        val newBowling5: Bowling = newBowling4.roll(10,0,newBowling4.getRolls())
        val newBowling6: Bowling = newBowling5.roll(10,0,newBowling5.getRolls())
        val newBowling7: Bowling = newBowling6.roll(10,0,newBowling6.getRolls())
        val newBowling8: Bowling = newBowling7.roll(10,0,newBowling7.getRolls())
        val newBowling9: Bowling = newBowling8.roll(10,0,newBowling8.getRolls())
        val newBowling10: Bowling = newBowling9.roll(10,0,newBowling9.getRolls())
        val newBowling11: Bowling = newBowling10.roll(10,0,newBowling10.getRolls())

        val rolls: List[Frame] = newBowling11.getRolls()
        assert(newBowling11.getScore(rolls, 0, 0) == 300)
    }
  }
  describe("with 1 pin down") {
    it("give 20") {
        val newBowling1: Bowling = new Bowling(List()).roll(1,1, List())
        val newBowling2: Bowling = newBowling1.roll(1,1,newBowling1.getRolls())
        val newBowling3: Bowling = newBowling2.roll(1,1,newBowling2.getRolls())
        val newBowling4: Bowling = newBowling3.roll(1,1,newBowling3.getRolls())
        val newBowling5: Bowling = newBowling4.roll(1,1,newBowling4.getRolls())
        val newBowling6: Bowling = newBowling5.roll(1,1,newBowling5.getRolls())
        val newBowling7: Bowling = newBowling6.roll(1,1,newBowling6.getRolls())
        val newBowling8: Bowling = newBowling7.roll(1,1,newBowling7.getRolls())
        val newBowling9: Bowling = newBowling8.roll(1,1,newBowling8.getRolls())
        val newBowling10: Bowling = newBowling9.roll(1,1,newBowling9.getRolls())

        val rolls: List[Frame] = newBowling10.getRolls()
        assert(newBowling10.getScore(rolls, 0, 0) == 20)    }
  }
}

}
