package gfx

class Image(initLayer:Layer){
    // Image have at least one layer
    private var layers: List[Layer]=List(initLayer) // Layer 0 top stack
    private var background: Char=initLayer.getBackground

    // Set new Background Character
    def setBackground(bg:Char){
        background=bg
    }

    // Return Largest X-Dimension/Y-Dimension All Stacked Layers
    def maxX: Int=layers.map(_.getXmax).max
    def maxY: Int=layers.map(_.getYmax).max
    def getNumberOfLayers: Int=layers.length

    // Return Layer Number First Non-None Pixel Given Coordinate 
    def getActiveLayer(i:Int,j:Int): Int={
        layers.takeWhile(_.getPixelAt(i,j).isEmpty).length
    }

    // Return Top-Most Active Pixel Given Coordinate
    def getActivePixel(i:Int,j:Int): Option[Char]={
        val idx=getActiveLayer(i,j)
        if(idx==layers.length){
            None
        }else{
            layers(idx).getPixelAt(i,j)
        }
    }

    // Move Given Layer Top
    def moveLayerToTop(idx:Int): Unit={
        if((idx>=0)&&(idx<layers.length)){
            layers=layers(idx) :: (layers.take(idx) ++ layers.drop(idx+1))
        }
    }

    // Move Active Layer Top
    def moveActiveLayerToTop(i:Int,j:Int): Unit={
        val idx=getActiveLayer(i,j)
        moveLayerToTop(idx)
    }

    // Push New Layer Top Current Picture
    def push(layer:Layer): Unit={
        layers=layer :: layers
    }

    // Insert Layer Current Picture
    def insertLayer(i:Int,layer:Layer): Unit={
        layers=layers.take(i) ++ (layer ::  layers.drop(i))
    }

    // Removes Specified Layer From Image
    def removeLayer(i:Int): Unit={
        layers=layers.take(i) ++ layers.drop(i+1)
    }

    // Reverse Order Layers
    def reverseLayers(): Unit={
        layers=layers.reverse
    }

    // Paint Image Terminal
    def paint(): Unit={
        for(j<-maxY to 0 by -1){
            for(i<-0 to maxX){
                getActivePixel(i,j) match{
                    case None => print(background)
                    case Some(c) => print(c)
                }
            }
            println()
        }
    }
}