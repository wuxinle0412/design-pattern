package org.example.prototype;

import java.io.Serializable;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/12 10:02
 * Description: 附件类
 */
public class Attachment implements Serializable {
  private String name;  //附件名

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void download() {
    System.out.println("下载附件，文件名为" + name);
  }

}
