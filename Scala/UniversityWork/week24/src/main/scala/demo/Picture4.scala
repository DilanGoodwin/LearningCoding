package demo

object Picture4{
    import gfx.Layer
    import gfx.Image

    def main(args: Array[String]): Unit={
        val zero: Layer=new Layer(40,20,'0')
        val one: Layer=new Layer(50,15,'1')
        val two: Layer=new Layer(40,20,'2')

        zero.setXY(20,5)
        zero.startWriting()
        zero.square(7)

        one.setXY(23,8)
        one.startWriting()
        one.square(7)

        two.setXY(17,2)
        two.startWriting()
        two.square(7)
        
        val p: Image=new Image(one)
        p.push(zero)
        p.push(two)
        p.moveLayerToTop(1)
        p.paint()
    }
}