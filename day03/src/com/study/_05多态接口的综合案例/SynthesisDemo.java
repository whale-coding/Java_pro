package com.study._05多态接口的综合案例;

/**
 * @Classname: SynthesisDemo
 * @Date: 2024/5/21 14:11
 * @Author: 聂建强
 * @Description:
 *     拓展：面向对象思想设计一个电脑对象，可以接入2个USB设备
 *         （鼠标，键盘： 实现接入，调用独有功能，拔出）。
 *
 *     分析：
 *         （1）提供2个USB设备。（USB设备必须满足：接入和拔出的功能）
 *         （2）定义一个USB的接口（申明USB设备的规范必须是：实现接入和拔出的功能）
 *         （3）开始定义2个真实的实现类代表鼠标标和键盘
 *         （4）定义一个电脑类。
 *     小结：
 *         记住这些面向对象的综合设计案例。
 */
public class SynthesisDemo {
    public static void main(String[] args) {
        // 1.买一部电脑
        Computer c = new Computer();
        // 2.买一个鼠标
        USB xiaoMi = new Mouse("小米鼠标");
        c.install(xiaoMi);
        // 3.买一个键盘
        KeyBoard sfy = new KeyBoard("双飞燕键盘");
        c.install(sfy);
    }
}

class Computer{
    // 提供一个安装USB设备的入口
    public void install(USB usb){
        usb.connect();

        // usb.dbclick();

        // usb可能是鼠标，也可能键盘 .....
        if (usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.dbclick();
        }else if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        }
        usb.unconnect();
    }
}

// USB类：鼠标
class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    // 独有功能：双击
    public void dbclick(){
        System.out.println(name + "成功双击了");
    }

    @Override
    public void connect() {
        System.out.println(name+"成功接入了设备");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"成功拔出了设备");
    }
}

// USB类：键盘
class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    // 独有功能：按键
    public void keyDown(){
        System.out.println(name + "成功按下按键");
    }

    @Override
    public void connect() {
        System.out.println(name+"成功接入了设备");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"成功拔出了设备");
    }
}

// 定义USB的规范，必须要完成接入和拔出的功能！！
interface USB{
    void connect();  // 接入
    void unconnect();  // 拔出
}