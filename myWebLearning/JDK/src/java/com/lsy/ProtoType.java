package com.lsy;

class CopyProto implements Cloneable{

    private String name;

    private String sex;

    private Integer age;

    public Object copy(){
        CopyProto copy = null;
        try {
            copy = (CopyProto) super.clone();
        }catch (Throwable th){
            th.printStackTrace();
        }
        return copy;
    }

    public void display(){
        System.out.println("姓名：" + name);
        System.out.println("性别:" + sex);
        System.out.println("年龄:" + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

public class ProtoType {

    public static void main(String[] args) {
        CopyProto copyProto = new CopyProto();
        copyProto.setName("刘晟源");
        copyProto.setAge(26);
        copyProto.setSex("man");
        CopyProto copy1 = (CopyProto)copyProto.copy();
        copyProto.display();
        copy1.display();
        System.out.println(copyProto==copy1);
    }

}
