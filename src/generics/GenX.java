package generics;


import java.util.ArrayList;
import java.util.List;

public class GenX {

	public static void main(String[] args) {
	List<String> theList = new ArrayList<>();
	;
	theList.listIterator();
	
     YaBasic<String> yaBasic = new YaBasic<>();
     
	System.out.println(yaBasic.getName("Rayvon"));
	}

}
