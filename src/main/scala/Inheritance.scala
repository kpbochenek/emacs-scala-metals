package main

trait A { def f(): String = "A.f()" }

trait B extends A { override def f(): String = "B.f()" }
trait C extends B { override def f(): String = "C.f()" }
trait D extends C { override def f(): String = "D.f()" }
