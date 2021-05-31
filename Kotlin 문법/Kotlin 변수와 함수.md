# Kotlin 변수와 함수

---

### [변수 선언]

```kotlin
val data1 : Int = 10        //초기화 하면 더이상 변경할 수 없는 변수
val data2 = 20              //초기화 하면 더이상 변경할 수 없는 변수
var data3 = 30              //언제든지 값을 변경할 수 있는 변수
```

* 변수는 선언과 동시에 값을 초기화해야 한다.
* 단, 예외로 함수 내에서는 변수 선언과 동시에 초기화하지 않아도 에러가 발생하지 않는다.
    하지만 변수를 이용하려면 초기화 해야한다.  

---

### [함수 선언]

```kotlin
fun sum(a: Int, b: Int) : Int {
    return a+b
}

fun printHello() : Unit {
    println("Hello World!")
    
    fun printHi() {
        println("Hi!")
    }

    printHi()
}
```

* 함수의 매개변수 (a,b) 는 무조건 val로 적용된다.
* 반환 값이 없을 때는 Unit으로 명시하거나 생략한다.
* 코틀린에서는 함수 내에서 함수를 정의할 수도 있다. 이렇게 정의된 함수는 외부에서 호출할 수 없다.  
  
  
  

```kotlin
fun some(a: Int, b: Int) : Int = a+b

fun some2(a: Int, b: Int) = a+b
```

* 짧게 작성하는 경우 함수의 영역을 나타내는 중괄호를 생략할 수 있다. (단일 표현 함수)
* 단일 표현 함수는 반환 타입을 생략하면 컴파일러가 유추해서 정한다.  
  

  
  
```kotlin
fun some(a: Int, b: String) {
    println("some(a: Int, b: String)")
}

fun some(a: Int, b: Int) {
    println("some(a: Int, b: Int)")
}
```

* 함수 오버로딩 기능을 제공한다.  
---
