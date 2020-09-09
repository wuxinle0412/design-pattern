package cn.unipus.builder;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 0:13
 * Description: 游戏角色类，充当复杂产品类
 */
public class Actor {
  private String type;  //角色类型
  private String sex;   //性别
  private String face;  //脸型
  private String costume; //服装
  private String hairstyle;  //发型

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getFace() {
    return face;
  }

  public void setFace(String face) {
    this.face = face;
  }

  public String getCostume() {
    return costume;
  }

  public void setCostume(String costume) {
    this.costume = costume;
  }

  public String getHairstyle() {
    return hairstyle;
  }

  public void setHairstyle(String hairstyle) {
    this.hairstyle = hairstyle;
  }
}
