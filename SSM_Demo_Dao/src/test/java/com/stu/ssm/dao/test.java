package com.stu.ssm.dao;

import com.stu.ssm.domain.User;

import java.util.*;

public class test {

private static IUserDao userDao;
    public static void main(String[] args) throws Exception {
        String[] keyName = {"a","a","a","a","b","b","b","b","c","c","c","c"};
        String[] keyTime = {"16:35","08:13","03:14","15:33","11:59","09:25","11:11","08:42","21:20","12:15","15:05","03:39"};
        List<String> list = new Solution().alertNames(keyName, keyTime);
        for (String str: list) {
            System.out.println(str);
        }
    }
}
class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String str: keyName) {
            Integer integer = map.getOrDefault(str, 0);
            map.put(str,integer + 1);
        }
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < keyName.length;) {
            Integer integer = map.get(keyName[i]);
            if (integer < 3){
                i = i + integer;
                continue;
            }
            Arrays.sort(keyTime,i,i+integer, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.compareTo(o2)>0)
                        return 1;
                    else return -1;
                }
            });
            queue.offer(keyTime[i]);
            for (int j = 1; j < integer; j++) {
                while (!queue.isEmpty() && !isOneHour(queue.peek(), keyTime[i + j])){
                    queue.remove();
                }
                queue.offer(keyTime[i + j]);
                if (queue.size() == 3){
                    list.add(keyName[i]);
                    break;
                }
            }
//            for (int j = 1; j < integer; j++) {
//                if (isOneHour(queue.peek(), keyTime[i + j])){
//                    queue.offer(keyTime[i + j]);
//                    if (queue.size() == 3){
//                        list.add(queue.peek());
//                        break;
//                    }
//                }else {
//                    while (!isOneHour(queue.peek(), keyTime[i + j])){
//                        queue.poll();
//                    }
//                    j--;
//                }
//            }
            queue.clear();
            i = i + integer;
        }
        Collections.sort(list);
        return list;
    }

    private boolean isOneHour(String str1, String str2){
        String[] str1S = str1.split(":",2);
        String[] str2S = str2.split(":",2);
        Integer H1 = Integer.parseInt(str1S[0]);
        Integer H2 = Integer.parseInt(str2S[0]);
        Integer M1 = Integer.parseInt(str1S[1]);
        Integer M2 = Integer.parseInt(str2S[1]);
        if (H1 == H2){
            return true;
        }
        if ((H2 - H1) == 1 && M1 >= M2){
            return true;
        }
        return false;
    }
}
