
object Payroll{
  def main(args:Array[String]): Unit={
    var employees: String="John Smith"
    var typeEmployee: String="Hourly"
    var hours: Int=40

    if(typeEmployee.toLowerCase=="hourly"){
      if(hours>40){
        var totalPay: Double=((hours-40)*(10.50*1.5))+(40*10.50)
        println("Name: "+employees+" \nHours worked: "+hours+" \nPaycheck: "+totalPay)
      }else{
        println("Name: "+employees+" \nHours worked: "+hours+" \nPaycheck: "+(hours*10.50))
      }
    }else{
      println("Employee is salaried")
    }
  }
}
