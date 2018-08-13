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