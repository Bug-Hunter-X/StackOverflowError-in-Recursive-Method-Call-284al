```scala
class MyClass(val value: Int) {
  def add(other: MyClass): MyClass = {
    new MyClass(this.value + other.value) //Error: this will lead to a StackOverflowError if you call add recursively.
  }
}
```