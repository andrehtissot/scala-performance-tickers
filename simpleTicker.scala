class SimpleTicker(start: Boolean) {
  def this() = this(false)

  var lastTick: Long = 0

  def startTick(): Unit = {
    lastTick = System.nanoTime
  }

  def echoTick(messageBefore: String,messageAfter: String,decimals: Int,decPoint: String): Unit = {
    print(messageBefore + diffTickVerbose(decimals, decPoint) + messageAfter)
    startTick()
  }

  def echoTick(messageBefore: String, messageAfter: String, decimals: Int): Unit = {
    echoTick(messageBefore, messageAfter, decimals, ".")
  }

  def echoTick(messageBefore: String, messageAfter: String): Unit = {
    echoTick(messageBefore, messageAfter, 2, ".")
  }

  def echoTick(messageBefore: String): Unit = {
    echoTick(messageBefore, "\n", 2, ".")
  }

  def diffTick(): Long = {
    System.nanoTime - lastTick
  }

  def diffTickVerbose(decimals: Int, decPoint: String): String = {
    ("%."+decimals+"f" format (diffTick().toFloat/1000000000)).replace(".", decPoint)+" sec."
  }

  def diffTickVerbose(decimals: Int): String = {
    ("%."+decimals+"f" format (diffTick().toFloat/1000000000))+" sec."
  }

  def diffTickVerbose(): String = {
    ("%.2f" format (diffTick().toFloat/1000000000))+" sec."
  }

  if(start){
    startTick
  }
}
