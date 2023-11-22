package VtigerPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
@Test(dataProvider = "getData")
public void readData(String Name,String model,int qty,int price)
{
System.out.println(Name+"-"+model+" "+qty+"  "+price+"----- ");
}
@DataProvider
public Object[][] getData()
{                                     //row coloumn
Object [][] data=new Object[3][4];//3 diff set of 4 details	
data[0][0]="samsung";
data[0][1]="ABo";
data[0][2]=12;
data[0][3]=19098;

data[1][0]="oppo";
data[1][1]="cgo";
data[1][2]=19;
data[1][3]=10098;

data[2][0]="vivo";
data[2][1]="uyy";
data[2][2]=8;
data[2][3]=8000;


return data;
}
}
