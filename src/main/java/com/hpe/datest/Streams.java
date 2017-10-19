package com.hpe.datest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    /**
     * my practice with java.util.stream in java8
     * 
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squareNums);

        class User {
            public User() {
            }

            public User(String userId, String username, String password) {
                super();
                this.userId = userId;
                this.username = username;
                this.password = password;
            }

            private String userId;
            private String username;
            private String password;

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }
        }

        // initial User list
        List<User> list = new ArrayList<User>() {
            private static final long serialVersionUID = 1L;
            {
                add(new User("1", "aaaa", "pwd123"));
                add(new User("2", "bbbb", "pwd123"));
                add(new User("3", "cccc", "pwd123"));
            }
        };

        // turn User list to Map<String, User>
        Map<String, User> map = list.stream().collect(Collectors.toMap(User::getUserId, v -> v));
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
