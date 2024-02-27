package org.Composition;

import java.util.List;

public class University {

public List<College> colleges;

University(List<College> colleges)
{
this.colleges=colleges;
}

public List<College> getTotalCollegesInUniversity()
{
	
	return colleges;
}



}
