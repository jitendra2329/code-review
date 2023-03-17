package com.test
import com.knoldus.CountDivisors
import  org.scalatest.flatspec.AnyFlatSpec
class CountDivisorTest extends  AnyFlatSpec {
    val countDivisor = CountDivisors

    "count divisors " should "run" in {
      val result = countDivisor.takeInput(1,10,2)
      assert(result ==  5)
    }

  "count divisors " should "not run" in {
    val result = countDivisor.takeInput(10, 100, 0)
    assert(result == 45)
  }
 }
