# scala-performance-tickers
Little Scala classes to test performace.
<br />
##SimpleTicker
Useful to test how code performs.

####Can be used like:
```scala
val ticker: SimpleTicker = new SimpleTicker()
ticker.startTick()
//Do whatever it's needed
println("Took "+ticker.diffTick()+" nanoseconds!")
```
####Or just:
```scala
val ticker: SimpleTicker = new SimpleTicker(true)
//Do whatever it's needed
ticker.echoTick("Took ")
```
<br />
##Ticker
Like SimpleTicker, but extended to handle memory and track progress within loops nicely.

####Simple use for time and memory:
```scala
val ticker: Ticker = new Ticker(true)
//Do whatever it's needed
ticker.echoTick("Took ")
ticker.echoMemory("Used ")
```
