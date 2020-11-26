package com.jae.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {

    //基本数据类型
    public String name;
    //引用类型的属性
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }
    //完成深拷贝实现
//    方式一 --clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep=null;
        deep=super.clone();
        //完成对基本数据类型属性和字符串的克隆
        //对引用类型的属性进行单独处理
                //先将已存在的deep（已经做好基本数据类型和字符串的拷贝）赋值成当前要拷贝的对象类型（DeepCloneTarget）
        DeepProtoType deepProtoType=(DeepProtoType)deep;
        //在deepProtoType中，将deepCloneableTargetz这个属性调用它自己自带的clone
        // 方法（对自己本身的属性进行了克隆的方法）
        deepProtoType.deepCloneableTarget=
                (DeepCloneableTarget)deepCloneableTarget.clone();

        return deepProtoType;
    }

    //    方式二：通过独享序列化实现深拷贝（推荐）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos=null;
        ObjectOutput oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try{
            //序列化操作
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流的方式输出
            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepProtoType copy=(DeepProtoType)ois.readObject();
            return copy;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //关闭打开的流
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                e2.printStackTrace();
                System.out.println(e2.getMessage());
            }
        }
    }
}
