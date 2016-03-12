package javaRegex;

/**
 * 学习Java中常用的正则表达式的使用
 * @author Administrator
 *
 */

/**
 * 一、正则表达式: 

	1、正则表达式定义了字符串的模式；
	
	2、 正则表达式可以用来定义，编辑和处理字符串。
	
	3、 正则表达式并不限定某一种语言，但是在不同的语言中都有细微的差别；
	
	4、 Java的正则表达式和Perl的正则表达式最为相似；
	
	5、 java的正则表达式的定义主要在java.util.regex内，包含了以下三个类：
		1), Pattern类：
			pattern对象是一个正则表达式的编译表示。Pattern类没有一个公共的构造方法，，要创建一个Pattern对象，你必须首先调用其
			公共静态编译方法。该方法接受一个正则表达式作为他的参数。
		
		2), Matcher类：
			Matcher对象是对输入字符串进行解释和匹配操作的引擎，与pattern类一样，matcher也没有公共的构造方法。，你需要调用Pattern
			对象的matcher方法来获得一个matcher对象。
			
		
		3), PatternSyntaxException:
			PatternSyntaxException是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
		
二、 捕获组
		捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符分组来创建。
		例如，正则表达式(dog) 创建了单一分组，组里包含"d"，"o"，和"g"。
		捕获组是通过从左至右计算其开括号来编号。例如，在表达式（（A）（B（C））），有四个这样的组：
		((A)(B(C)))
		(A)
		(B(C))
		(C)
		可以通过调用matcher对象的groupCount方法来查看表达式有多少个分组。groupCount方法返回一个int值，表示matcher对象当前有多个捕获组。
		还有一个特殊的组（组0），它总是代表整个表达式。该组不包括在groupCount的返回值中。	


 * @author Administrator
 *
 */
public class JavaRegexExpression {

	
}
