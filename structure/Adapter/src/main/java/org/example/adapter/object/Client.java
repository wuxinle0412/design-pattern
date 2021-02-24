package org.example.adapter.object;

import org.example.adapter.util.PropertiesUtil;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/11 11:12
 */
public class Client {
  public static void main(String[] args) throws Exception {
    ScoreOperation scoreOperation;  //针对抽象目标接口编程
    scoreOperation = (ScoreOperation) PropertiesUtil.getBean();  //读取配置文件
    int[] scores = {84, 76, 50, 69, 90, 91, 88, 96};
    int[] result;
    int score;

    System.out.println("排序结果:");
    result = scoreOperation.sort(scores);
    //遍历输出结果
    for (int i : result) {
      System.out.println(" " + i);
    }
    System.out.println();

    System.out.println("查找成绩90: ");
    score = scoreOperation.search(scores, 90);
    if (score == 1) {
      System.out.println("找到成绩90。");
    }

    score = scoreOperation.search(scores, 85);

    if (score == 1) {
      System.out.println("找到成绩85。");
    }
  }
}
