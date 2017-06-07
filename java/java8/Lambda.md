# Lambda
1.Lambda表达式的本质只是一个"语法糖",由编译器推断并帮你转换包装为常规的代码,因此你可以使用更少的代码来实现同样的功能。

2.Lambda表达式的语法
基本语法:
(parameters) -> expression或(parameters) ->{ statements; }

3.基本的Lambda例子
* 使用for循环遍历集合:
    ```txt
    //player是一个List<String>集合
    players.forEach((player) -> System.out.print(player + "; ")); 

    players.forEach((player) ->p(player));

    private void p(String str){
        //方法
    }

    ```
* 代替匿名内部类//不支持匿名内部类里面有多个方法的情形
    ```txt
    //lam是自定义的变量名称,其是类ActionEvent的实例.
    jButton=new JButton("lambda表达式代替匿名内部类");
    jButton.addActionListener(lam->forEachBefore(lam));

    private void forEachBefore(ActionEvent lam){
        //方法
    }
    //匿名内部类的形式
    jButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                forEachBefore(e);
            }
        });
    ```
* 实现Runable接口1
    ```txt

    new Thread(()->jTextArea.setText(Thread.currentThread().getName()+",runable1")).start();

    ```
* 实现Runable接口2
    ```txt
    Runnable race2 = () -> jTextArea.setText(Thread.currentThread().getName()+",runable2");
    race2.run();

    ```
4.能够使用Lambda的依据是必须有相应的函数接口（函数接口，是指内部只有一个抽象方法的接口）。这一点跟Java是强类型语言吻合，也就是说你并不能在代码的任何地方任性的写Lambda表达式。实际上Lambda的类型就是对应函数接口的类型。Lambda表达式另一个依据是类型推断机制，在上下文信息足够的情况下，编译器可以推断出参数表的类型，而不需要显式指名。