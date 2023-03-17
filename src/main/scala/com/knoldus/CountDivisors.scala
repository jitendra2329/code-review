package com.knoldus
import scala.util.{Try,Success,Failure}

object CountDivisors extends App{

  def takeInput(firstNumber: Int, secondNumber: Int, divisor: Int): Int = {
    (Try(divisor == 0)) match {
      case Failure(exception) => 0
      case Success(result) => countDivisors(firstNumber,secondNumber,divisor)
    }

    Try(firstNumber <= divisor && secondNumber >= divisor) match {
      case Failure(exception) => 0
      case Success(result) => countDivisors(firstNumber, secondNumber, divisor)
    }
  }


  // function for finding the number of divisor
  private def countDivisors(firstnumber: Int, secondnumber: Int, divisor: Int): Int = {
    var count = 0
    try {
      for (index <- firstnumber to secondnumber) {
        if (index % divisor == 0) {
          count = count + 1
        }
      }
    } catch {
      case exception: ArithmeticException => {
        print(exception.getMessage)
      }
    }
    count
  }
}





