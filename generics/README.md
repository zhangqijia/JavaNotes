# Generics
- mismatched generic types spotted at compile time

## Bounded Types
```
class Stats<T extends Number>{
    ...
}
```
- parameter type T must be a subclass of Number 

## Wildcard type 
```java
class Stats<T extends Number>{
    T[] nums;

    boolean sameAverage(Stats<?> ob){
        return null;
    }
}
```
- Wildcard in `Stats<?>` allows comparison to **any Stats object** 

### An upper bound
- `<? extends X>`

### A lower bound
- `<? super X>`

## Generic class
```java
class Stats<T extends Number>{
    T[] nums;

    boolean sameAverage(Stats<?> ob){
        return null;
    }
}
```
## Generic constructor
```java
class Example{
    <T extends Number> Example(T num){
    }
}
```
## Generic method
```java
class Example{
    static <T, V extends T> boolean isIn(T x, V[] y){
        return null;
    }
}
```
## Generic interface
```
interface MinT<T extends Comparable<T>>{
    T min();
}

class MinTImpl<T extends Comparable<T>> implement MinT<T>{
    ...
}
```

## Generic classes hierarchies
- Generic classes can form part of a class hierarchy.
- Type arguments must be passed up hierarchy by all subclasses.

# Generic Restrictions
1. Type parameter cannot be instantiated because they don't exist at **run time**.
```java
class Gen<T> {
    T ob; 
    Gen() { ob = new T();  // illegal! } 
   }
}
```
2. Static members cannot use type parameters declared by the enclosing class 
```
class Gen<T> { 
    static T ob; // illegal!
    static T getob() { ... // illegal!
```
3. 