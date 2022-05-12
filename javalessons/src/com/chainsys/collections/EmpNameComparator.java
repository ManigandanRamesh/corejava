package com.chainsys.collections;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<EmpComparable> {
	@Override
	int compare(EmpComparable o1,EmpComparable o2) {
		int result=0;
		result=Integer.compare(this.getID(),other.getID());
		return result;
	}

}
