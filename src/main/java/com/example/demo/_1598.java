package com.example.demo;/*
 * @lc app=leetcode id=1598 lang=java
 *
 * [1598] Crawler Log Folder
 */

// @lc code=start
public class _1598 {
  private String dir = "";

  public int minOperations(String[] logs) {
    for (String log : logs) {
      if (log.equals("./")) {
        continue;
      } else if (log.equals("../")) {
        final String[] split = dir.split("/");
        dir = "";
        for (int i = 0; i < split.length -1; i++) {
          dir += split[i] + "/";
        }

      } else {
        dir += log;
      }
    }
    if (dir.equals("")){
      return 0;
    }
    return dir.split("/").length;
  }
}
// @lc code=end

