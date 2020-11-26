package com.jae.princilple.ocp;

import java.awt.*;

public class Ocp {
    public static void main(String[] args) {
        //使用
        GraphicEditor graphicEditor=new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

//这是一个用于绘图的类
class GraphicEditor{
    //接收一个shap对象，根据type绘制不同的图形
    public void drawShape(Shape s){
        if (s.m_type==1)
            drawRectangle(s);
        else if (s.m_type==2)
            drawCircle(s);
    }

    private void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

}
//基类
class Shape{
    int m_type;
}
class Rectangle extends Shape{
    Rectangle(){
        super.m_type=1;
    }
}
class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}
//新增一个画三角形
//需要再这里增加代码，再main中增加代码，还得再draw中再加一个方法和判断