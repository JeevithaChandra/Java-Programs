package multiple.instance.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataInMIDS {
	ArrayList<ArrayList<String>> pos = new ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<String>> neg = new ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<String>> DATA = new ArrayList<ArrayList<String>>();
	ArrayList<String> RULEPOS = new ArrayList<String>();
	ArrayList<String> RULENEG = new ArrayList<String>();
	Map<String,String> RULE_BAGS = new HashMap<String,String>();
	ArrayList<String> bagnames = new ArrayList<>();
	ArrayList<Integer> bags_pos_neg = new ArrayList<Integer>();
	String result="";
	
	int no_of_pos_bags=0;
	int no_of_neg_bags=0;	
	int no_of_bags = 0;
	int[][] M;
	int s=0;//number of instances
	int k=0;//number of features
	
	
}
// Wanted to see how branches work. That is why i am modifying this file.
//working on the issue53

// Testing bag info added
package multiple.instance.ds;

import java.util.ArrayList;

public class DataInTestBag {
	ArrayList<ArrayList<String>> DATA = new ArrayList<ArrayList<String>>();
	int no_of_bags = 0;
	ArrayList<String> bagnames = new ArrayList<>();
	ArrayList<String> classes = new ArrayList<>();
	ArrayList<String> predicted_classes = new ArrayList<>();
	
	int s=0;//number of instances
	int k=0;//number of features
}
