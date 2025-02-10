# StackOverflowError in Scala
This example demonstrates a common error in Scala: a StackOverflowError caused by unintended infinite recursion.  The `add` method in the `MyClass` class creates a new `MyClass` instance, and if you call the `add` method recursively without a base case, it can lead to a stack overflow.

**How to reproduce:**
1. Compile and run `MyClass.scala`
2. Observe the `StackOverflowError`

**Solution:**
The `MyClassSolution.scala` file shows how to fix this bug by adding a base case to prevent infinite recursion or using alternative approaches such as using a loop or tail recursion.