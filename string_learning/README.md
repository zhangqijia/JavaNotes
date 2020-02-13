
# String.format(String format, Object... args) method 
- The locale always used is the one returned by **Locale.getDefault(Locale.Category)** with FORMAT category specified.
- String format 方法实际调用 Formatter类的 format方法。
```   
String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
```
格式化字符串语法如下：
>    %[argument_index$][flags][width][.precision]conversion
- optional **argument_index$** 表明参数在随后可变参数中的位置
- optional **flags** 表明修改输出格式，可用的flags值取决于conversion值   

- optional **width** 最小输出字符串长度，positive integer 在前面补空格，negative number 在后面补空格 

- optional **precision** For general argument types, the precision is the maximum number of characters to be written to the output.
    - For the floating-point conversions 'a', 'A', 'e', 'E', and 'f' the precision is the number of digits after the radix point. If the conversion is 'g' or 'G', then the precision is the total number of digits in the resulting magnitude after rounding.

- optional **conversion** is a character indicating how the argument should be formatted. The set of valid conversions for a given argument **depends on the argument's data type**.
    - conversion 与参数类型对应, 被分为以下几种类型

    - 
    conversion | category | description
    ---|---|---
     's', 'S'| General | If arg implements Formattable, then arg.formatTo is invoked. Otherwise, the result is obtained by invoking arg.toString(). 
    'c', 'C'| Character | The result is a Unicode character
    'd'| Numeric - integer |The result is formatted as a decimal integer
    'f'| Numeric - floating point |The result is formatted as a decimal number
    ''| Date/Time |
    ''| Percent |
    'n'| Line Separator | The result is the platform-specific line separator

> 详情参考API https://docs.oracle.com/javase/9/docs/api/java/util/Formatter.html#syntax




# String中的replace相关方法实践

- String中字符串替换方法主要有
    - 	replace(char oldChar, char newChar) ，  返回该字符串中oldChar全部替换为newChar的新字符串。
    - 	replace(CharSequence target, CharSequence replacement) ， 将该字符串中与目标字符序列匹配的每个子字符串替换为指定文字序列。
    - 	replaceAll(String regex, String replacement)， 将匹配指定正则表达式的每个子字符串替换。
    - 	replaceFirst(String regex, String replacement)，将匹配指定正则表达式的第一个子字符串替换。

- 我们用代码演示一下这四个方法的作用。
- 
```
public class App {
    public static void main(String[] args) {
        String origin = "aabbccdd,aaeeffgg,hhjjkk";
        String a = origin.replace('a', '.');
        String b = origin.replace("a", "");
        String c = origin.replaceAll("(\\w{2})[^,]*(\\w{2})", "$1****$2");
        String d = origin.replaceFirst("(\\w{2})[^,]*(\\w{2})", "$1****$2");

        System.out.println("replace char: \t" + a);
        System.out.println("replace charSequence: \t" + b);
        System.out.println("replace regex: \t" + c);
        System.out.println("replace regexFirst: \t" + d);

    }
}

// 运行结果
replace char: 	        ..bbccdd,..eeffgg,hhjjkk
replace charSequence: 	bbccdd,eeffgg,hhjjkk
replace regex: 	        aa****dd,aa****gg,hh****kk
replace regexFirst: 	aa****dd,aaeeffgg,hhjjkk
  ```