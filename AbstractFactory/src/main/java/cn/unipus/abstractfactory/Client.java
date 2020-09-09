package cn.unipus.abstractfactory;

import cn.unipus.abstractfactory.factory.SkinFactory;
import cn.unipus.abstractfactory.factory.impl.SpringSkinFactory;
import cn.unipus.abstractfactory.product.Button;
import cn.unipus.abstractfactory.product.ComboBox;
import cn.unipus.abstractfactory.product.TextField;

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
