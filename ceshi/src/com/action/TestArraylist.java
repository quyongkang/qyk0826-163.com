package com.action;

import java.util.Arrays;
import java.util.List;

public class TestArraylist {
	public static void main(String[] args) {
		final Integer PAGE_SIZE = 4;
		List<Long> datas = Arrays.asList(new Long[] { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L });
		// 总记录数量
		Integer totalcount = datas.size();
		// 分多少次处理
		Integer requestcount = totalcount / PAGE_SIZE;
		for (int i = 0; i < requestcount; i++) {
			Integer fromIndex = i * PAGE_SIZE;
			int toIndex = Math.min(totalcount, (i + 1) * PAGE_SIZE);
			List<Long> subList = datas.subList(fromIndex, toIndex);
			System.out.println(subList);
			if(toIndex == totalcount){
				break;
			}
		}
	}

}
