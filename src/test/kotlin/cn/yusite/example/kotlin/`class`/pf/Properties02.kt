package cn.yusite.example.kotlin.`class`.pf

import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class TestSubject {

    fun method(){
        println("TestSubject method")
    }
}

public class MyTest {

    lateinit var subject: TestSubject

    @Before
    fun before() {
        subject = TestSubject()
    }
    @Test
    fun test() {
        subject.method() // 直接解引用
    }

    @Test
    fun test1() {
        println("test1 method")
        var myTest = MyTest()
        myTest.before()
        if (myTest::subject.isInitialized) {
            println(myTest.subject)
        }
    }


}
