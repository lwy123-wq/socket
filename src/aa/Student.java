package aa;


class Student{
    int num;
    int Class;
    char sex;
    int age;
    String name;
    //构造方法
    public Student(int num, int Class, char sex, int age, String name) {
        this.num=num;
        this.Class=Class;
        this.sex=sex;
        this.age=age;
        this.name=name;
    }
    public Student() {
        this(1001,1,'F',20,"TZSD");

    }
    //定义方法（成员方法），获取学号，获取性别，获取姓名，获取年龄，修改年龄
    public int getNum(){
        return this.num;
    }
    public int getclass(){
        return this.Class;
    }
    public char getSex(){
        return this.sex;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toStirng(){
        return this.name+"  "+this.sex+"  "+this.age+"  "+this.num+"  "+this.Class;
    }
}
class StudentTest{
    public static void main(String[] args){
        Student stu=new Student();
        Student stu1=new Student(1005,2,'M',20,"ZS");
        System.out.println(stu.toStirng());
        String str=stu1.toString();
        System.out.println(str);
        stu1.setAge(25);
        System.out.println(stu1.toString());
    }
}



