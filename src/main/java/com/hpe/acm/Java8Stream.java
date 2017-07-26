package com.hpe.acm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class User {
	public User(String userId, String userName) {
		this.setUserId(userId);
		this.setUserName(userName);
	}

	private String userId;
	private String userName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}

/**
 * java.util.stream
 * 
 * @author cuizh
 *
 */
public class Java8Stream {

	public static void main(String[] args) {
		/*
		 * do aggregation operations with stream for list
		 */
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		List<Integer> squareNums = nums.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(squareNums);

		List<String> strings = Arrays.asList("a", "hah", "Games");
		List<String> stringsUpperCase = strings.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(stringsUpperCase);

		/*
		 * Object list to Map<String, Object>
		 */
		List<String> filterLists = new ArrayList<String>() {
			private static final long serialVersionUID = 1L;
			{
				add("");
				add("a");
				add("b");
			}
		};
		List<String> afterFilterLists = filterLists.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println(afterFilterLists);
		boolean result = filterLists.contains("a");
		System.out.printf("\n%saaaaaaa\n", result);
	
		List<User> UserList = new ArrayList<User>() {
			private static final long serialVersionUID = 1L;
			{
				add(new User("1", "John1"));
				add(new User("2", "John2"));
				add(new User("3", "John3"));
			}
		};
		/*
		 * iterate Map
		 */
		Map<String, User> afterMaping = UserList.stream().collect(Collectors.toMap(User::getUserId, c -> c));
		afterMaping.forEach((key, value) -> {
			System.out.println(key);
			System.out.printf("%s%s\n", value.getUserId(), value.getUserName());
		});

		for (Map.Entry<String, User> entry : afterMaping.entrySet())
			System.out.printf(entry.getKey() + entry.getValue());
	}
}
