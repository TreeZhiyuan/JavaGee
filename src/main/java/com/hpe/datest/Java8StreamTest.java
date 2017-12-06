package com.hpe.datest;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author: zhiyuan
 * @date: 2017-12-06
 * @project: javagee
 * @description: https://www.ibm.com/developerworks/cn/java/j-lo-java8streamapi/
 */

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

public class Java8StreamTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
	}

	@Test
	public void sample() {
		/*
		 * do aggregation operations with stream for list
		 */
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		List<Integer> squareNums = nums.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(squareNums);

		List<String> strings = Arrays.asList("a", "hah", "Games");
		List<String> stringsUpperCase = strings.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(stringsUpperCase);
	}

	@Test
	public void filterEmpty() {
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
	}

	@Test
	public void filterEvens() {
		Integer[] sixNums = { 1, 2, 3, 4, 5, 6 };
		Integer[] evens = Stream.of(sixNums).filter(n -> n % 2 == 0).toArray(Integer[]::new);
		for (Integer integer : evens) {
			System.out.println(integer);
		}
	}

	@Test
	public void listWithFlatMapping() {
		Stream<List<Integer>> ThreeListStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3),
				Arrays.asList(4, 5, 6));
		List<Integer> afterFlatMapping = ThreeListStream.flatMap(childList -> childList.stream())
				.collect(Collectors.toList());

		afterFlatMapping.forEach(a -> System.out.printf("this is %d\n", a));
	}

	/**
	 * 平方数
	 */
	@Test
	public void squar() {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		List<Integer> squareNums = nums.stream().map(n -> n * n).collect(Collectors.toList());
		squareNums.forEach(System.out::println);
	}

	@Test
	public void List2Array() {
		List<String> emails = new ArrayList<String>() {
			private static final long serialVersionUID = 1L;
			{
				add("767@ema.com");
				add("7607@ema.com");
				add("7617@ema.com");
				add("7627@ema.com");
				add("7637@ema.com");
			}
		};
		// emails.stream()
	}

	@Test
	public void Array2Map() {
		Map<String, Double> kvs = Arrays.asList("a:1.0", "b:2.0", "c:3.0").stream().map(elem -> elem.split(":"))
				.collect(Collectors.toMap(e -> e[0], e -> Double.parseDouble(e[1])));
		System.out.print(kvs);
	}

	@Test
	public void ObjectList2Map() {
		List<User> UserList = new ArrayList<User>() {
			private static final long serialVersionUID = 1L;
			{
				add(new User("1", "John1"));
				add(new User("2", "John2"));
				add(new User("3", "John3"));
				add(new User("4", "John4"));
			}
		};
		/*
		 * iterate Map
		 */
		System.out.println("-----------------------Mapping List<String, Object>--------------------------");
		Map<String, User> afterMaping2Object = UserList.stream().collect(Collectors.toMap(User::getUserId, c -> c));
		afterMaping2Object
				.forEach((key, value) -> System.out.printf(" %s=> %s\n", value.getUserId(), value.getUserName()));
		System.out.println("-----------------------Mapping List<String, String>--------------------------");

		Map<String, String> afterMaping = UserList.stream()
				.collect(Collectors.toMap(User::getUserId, c -> c.getUserName()));
		afterMaping
				.forEach((key, value) -> System.out.printf("value of the Map: %s, key of the Map: %s\n", value, key));
	}

	@Test
	public void ObjectList2PropertyList() {
		List<User> UserList = new ArrayList<User>() {
			private static final long serialVersionUID = 1L;
			{
				add(new User("1001", "John1"));
				add(new User("2002", "John2"));
				add(new User("3003", "John3"));
			}
		};
		/*
		 * iterate list
		 */
		Object[] names = UserList.stream().map(User::getUserName).toArray();
		for (Object name : names) {
			System.out.println(name);
		}
	}

}
