## JavaScript

主要用于开发交互式的Web页面

| 语言       | 作用 | 说明         |
| ---------- | ---- | ------------ |
| HTML       | 结构 | 描述页面结构 |
| CSS        | 样式 | 美化页面     |
| JavaScript | 行为 | 提升用户体验 |

- [x] ### 特点

  1. 脚本语言

  2. 可以跨平台

  3. 支持面向对象

     

### JS与ECMA的区别

ECMA：指的式ecma发布的浏览器脚本语言的 `标准`

JS：是网景公司在Navigator 2.0浏览器中内置的`脚本语言`

Jscript：是微软公司在internet explorer 3.0浏览器中内置与javascript相近的语言

### 浏览器

浏览器内核：排版引擎、JavaScript引擎

排版引擎： 负责将取得的网页内容进行解析和处理

JavaScript引擎：解析JavaScript语言，通过执行代码来实现网页的交互效果

###  编写JavaScript时，注意语法规则

1. 严格区分大小写
2. 对空格、换行、缩进不敏感
3. 后面的分号可以省略

### JavaScript引入方式

1. 嵌入式： 就是使用<script>标签包裹JavaScript代码

   <script>
       JavaScript语句
   </script>

   2. 外链式： 将代码保存在一个单独的文件夹中，用“.js”作为扩展名
   3. 行内式

### 常用输出语句

1. alert（）：用于弹出一个警告框
2. console.log () :用于在浏览器的控制台输出内容
3. document.write():用于在HTML文档中输出内容

### 注释（不运行）

1. 单行注释 ：“ // “（快捷键：ctrl+1）
2. 多行注释  ：” /*  */ “（快捷键：ctrl+shift+1）

### 数据与运算

1. 程序会按照 先乘除后加减 规则运算，括号优先运算
2. 比较大小：成立 truealse、不成立 false     注（ alert（ 22 ==22）；）
3. 字符串：“  ”、'   '
4. 加号只要有一边是字符串就是拼接（括号优先运算）

### if...else

用于需要根据比较的结果，来执行不同的代码。

if （22 > 33）{

alert ( true);

}  else {

alert ( flase);

}

###  使用变量保存数据

使用  **var**  关键字来声明变量	

#### 函数的返回值

prompt（）

// 出现一个窗口显示：请输入你的名字，将这个赋值给name

var name = prompt（ “ 请你输入你的名字 ”）；

//  弹出一个警告框显示：你的名字是+name

alert（“  你的名字是：”   + name ）；

