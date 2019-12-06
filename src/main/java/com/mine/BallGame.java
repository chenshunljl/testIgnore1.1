package com.mine;

import javax.swing.*;
import java.awt.*;

public class BallGame extends JFrame {
    //获取两张图片
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    //画窗口
   public void paint(Graphics graphics) {
        graphics.drawImage(ball, 100, 100, null);
        graphics.drawImage(desk,0,0,null);
    }

    //打开窗口
    void launchFrame() {
        this.setSize(300, 300);
        this.setLocation(200, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BallGame().launchFrame();
    }


}
