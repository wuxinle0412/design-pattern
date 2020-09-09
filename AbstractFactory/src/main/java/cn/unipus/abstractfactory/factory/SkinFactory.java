package cn.unipus.abstractfactory.factory;

import cn.unipus.abstractfactory.product.Button;
import cn.unipus.abstractfactory.product.ComboBox;
import cn.unipus.abstractfactory.product.TextField;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 0:01
 * Description: 界面皮肤工厂接口，充当抽象工厂
 */
public interface SkinFactory {
  Button createButton();
  TextField createTextField();
  ComboBox createComboBox();
}
