import math.{sqrt,pow}

object MyApp extends App{
  val p1 = Point(2,3)
  val p2 = Point(3,6)
  val p3 = p1.add(p2)
  val p4 = p1.move(3,5)
  val p5=p1.distance(p2)
  val p6 = p1.inverse()

   
    println(p1)
    println(p2)
    print("Add two points ->")
    println(p3)
    print("move a point ->")
    println(p4)
    print("Get the reverse cordinates ->")
    println(p5)
    print("Get the distance of two points ->")
    println(p6)

}

case class Point(a:Int,b:Int){
  def x:Int = a
  def y:Int = b

  def add(p:Point)=Point(this.x+p.x,this.y+p.y)

  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

  def distance(p: Point):Double =sqrt(pow(this.x-p.x,2)+pow(this.y-p.y,2))

  def inverse()=Point(this.y,this.x)

}