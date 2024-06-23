@main def main():Unit = println(takeHomeSalary(40,30))

def takeHomeSalary(normalHours: Double, oTHours: Double): Double= normalPay(normalHours) + oTPay(oTHours) - tax(normalPay(normalHours) + oTPay(oTHours))

def normalPay(normalHours: Double): Double = normalHours * 250

def oTPay(oTHours: Double): Double = oTHours * 85

def tax(salary: Double): Double = salary * 0.12