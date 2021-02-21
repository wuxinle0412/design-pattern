package org.example.abstractfactory;

import org.example.abstractfactory.factory.SkinFactory;
import org.example.abstractfactory.factory.SpringSkinFactory;
import org.example.abstractfactory.product.button.Button;
import org.example.abstractfactory.product.combobox.ComboBox;
import org.example.abstractfactory.product.textfield.TextField;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 0:09
 * Description: 客户端测试类
 */
public class Client {
  public static void main(String[] args) {
    SkinFactory factory;
    Button button;
    TextField textField;
    ComboBox comboBox;

    factory = new SpringSkinFactory();
    button = factory.createButton();
    textField = factory.createTextField();
    comboBox = factory.createComboBox();

    button.display();
    textField.display();
    comboBox.display();
  }
}
