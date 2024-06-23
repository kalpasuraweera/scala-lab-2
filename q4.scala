@main def main():Unit = println(profit(24))

def profit(ticketPrice: Double): Double = totalIncome(numAttendees(ticketPrice), ticketPrice) - totalExpenses(numAttendees(ticketPrice))

def totalIncome(numAttendees:Int, ticketPrice: Double):Double = numAttendees*ticketPrice

def totalExpenses(numAttendees: Int):Double = performanceCost() + attendeeCost(numAttendees)

def numAttendees(ticketPrice: Double): Int = (180 - 4 * ticketPrice).toInt

def performanceCost(): Double = 500

def attendeeCost(numAttendees: Int): Double = 3 * numAttendees