
class Game(wall:List[(Int,Int)],coin:List[(Int,Int,Int)],startX:Int,startY:Int){
    private var gameField: Array[Array[Int]]=Array.ofDim[Int](10,10)
    private var score: Int=0
    private var positionX: Int=startX
    private var positionY: Int=startY
    
    for(x<-0 until 10;y<-0 until 10){gameField(x)(y)= -1}
    wall.foreach(x=>gameField(x._1)(x._2)=0)
    coin.foreach(x=>gameField(x._1)(x._2)=x._3)

    def DisplayField(): Unit={
        for(y<-0 until 10){
            for(x<-0 until 10){
                if((positionY==y)&&(positionX==x)){
                    print("P")
                }else if(gameField(x)(y)==0){
                    print("W")
                }else if(gameField(x)(y)== -1){
                    print(".")
                }else{
                    print("C")
                }
            }
            println()
        }
    }

    def playerPosition(): (Int,Int)=(positionX,positionY)
    def getScore(): Int=score

    def checkCoin(): Unit={

    }
    def maxScore(): Int=0

}