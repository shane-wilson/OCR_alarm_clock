import org.scalatest.{Matchers, FlatSpec}

class AlarmClockSection1 extends FlatSpec with Matchers{

 behavior of "Alarm clock"

 it should "exist" ignore {

 }

}

class AlarmClockSection2 extends FlatSpec with Matchers{

  behavior of "Alarm clock"

  it should "tick every minute" ignore {

  }

  it should "beep every hour" ignore {

  }

}

class AlarmClockSection3 extends FlatSpec with Matchers{

  behavior of "Alarm clock"

  it should "wake you up at 7am" ignore {

  }

}

class AlarmClockSection4 extends FlatSpec with Matchers{

  behavior of "Alarm clock"

  it should "Reject blank input" ignore {

  }

  it should "Reject input with non numeric values" ignore {

  }

}