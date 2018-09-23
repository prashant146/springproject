package com.one;

import java.util.PriorityQueue;
import java.util.Stack;

public class ConstructorBasedDI {

    private Teacher teacher;
    private Student student;

    public ConstructorBasedDI(Teacher teacher, Student student){
        this.teacher=teacher;
        this.student=student;
    }

    public void print(){
        System.out.println("BEFORE PRINTING PRINT IN ConstructorBasedDI");
        teacher.print();
        student.print();
        System.out.println("AFTER PRINTING PRINT IN ConstructorBasedDI");
    }

    public static void main(String[] args) {
        PriorityQueue todo = new PriorityQueue();
        todo.add("dishes");
        todo.add("laundry");
        todo.add("bills");
        todo.offer("bills");
        System.out.println(todo.size()+"--"+todo.poll());
        System.out.println(todo.peek()+"--"+todo.poll()+"--"+todo.poll()+"--"+todo.poll());




        String str[] = {"{{[[(())]]}}"};
        String str2[] = braces(str);
        for(String str3 : str2){
            System.out.println(str3);
        }
    }

    static String[] braces(String[] values) {

        Stack<Character> stack = new Stack<Character>();
        boolean flag = true;
        String str[] = new String[values.length];
        for(int i=0; i<values.length;i++){
            for(int j=0; j<values[i].length();j++){
                flag = true;
                if(values[i].charAt(j)=='{'||values[i].charAt(j)=='['||values[i].charAt(j)=='('){
                    stack.push(values[i].charAt(j));
                }else{
                    if(stack.empty()){
                        flag=false;
                        break;
                    }
                    Character ch = stack.pop();
                    if((values[i].charAt(j)=='}'&&ch!='{')||(values[i].charAt(j)==']'&&ch!='[')
                ||(values[i].charAt(j)==')'&&ch!='(')){
                        flag = false;
                        break;

                    }


                }
            }
            if(!stack.empty() || flag==false){
                str[i] = "NO";
            }else{
                str[i] = "YES";
            }
        }

        return str;

    }
}
