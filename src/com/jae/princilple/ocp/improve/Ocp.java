package com.jae.princilple.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        //使用
        GraphicEditor graphicEditor=new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

//这是一个用于绘图的类
class GraphicEditor{
    //接收一个shap对象，根据type绘制不同的图形
    public void drawShape(Shape s){
       s.draw();
    }



}

//基类
abstract class Shape{
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle(){
        super.m_type=1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle(){
        super.m_type=2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
