
object GameBuilder{
    def initialiseGame1(): Game={
        return new Game(List((3, 0), (3, 1), (3, 2)), List((4, 1, 100), (3, 3, 250)), 0, 0)
    }
}