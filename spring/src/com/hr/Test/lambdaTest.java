package com.hr.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import org.apache.commons.lang.StringUtils;

public class lambdaTest {
	public static void main(String[] args) {
		String str = "123,234,345,456,567,678,678,123,234,";
		String string = StringUtils.join(new LinkedHashSet<String>(Arrays.asList(str.split(","))), ",");
		System.out.println(string);
	}
}
