```scala
class MyClass(val value: Int) {
  def add(other: MyClass): MyClass = {
    new MyClass(this.value + other.value)
  }
  //Fixed add method
  def addSafe(other: MyClass): MyClass = {
if (other.value == 0) this
else new MyClass(this.value + other.value)
}

  //Using loop to prevent recursion
  def addLoop(other: MyClass): MyClass = {
    var sum = this.value
    var current = other
    while(current.value != 0){
      sum += current.value
      current = new MyClass(0)
    }
    new MyClass(sum)
  }
}
```