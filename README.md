# Try to use everything !!!

# hello-world
Hello everyone!
This is my first repository in Github.
Glad to meet you!

- String replace相关方法实践 https://github.com/zhangqijia/hello-world/blob/master/string_learning/README.md

# Java advanced features

## Variable length arguments
- variable parameters must be the last one
```java
public void doThis(String str, double ... x){}  //ok

public void doThis( double ... x, String str ){} // illegal !!!

```
## Static import

```java
import static java.util.Math.squrt;

class A{ 
    public void test(){ squrt(123);} 
}
```
## inner class 
1. Member(nested)
2. anonymous class  
3. Local
    - is as class defined in ta block of program code
    ```java
    public MyInterface getSomething(){
        class LocalClass implements MyInterface{  
        // implementation of methods defined in MyInterface 
       }   
       return new LocalClass(); 
   }
    ```
4. Static 


## comparable and comparator 

## function object
- it holds no data fields and simply contains a single compare method
```java
class AgeComparator implements Comparator<Person> { 
    public int compare(Person a, Person b) {
            return a.age - b.age;     
    } 
}
```
