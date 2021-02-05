package demo.Testng.Demo.qsp;

import org.testng.annotations.DataProvider;

public class DemoDataProvider {
@DataProvider
public static String[][] demo(){
	String[][]str=new String [3][2];
	str[0][0]="userA";
    str[0][1]="A";
    str[1][0]="userA";
    str[1][1]="A";
    str[2][0]="userA";
    str[2][1]="A";
	return str;
}
}
