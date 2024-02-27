package org.Composition;
import java.util.ArrayList;
import java.util.List;

public class CompositionExample {

	public static void main(String[] args) {
		
		College c1=new College("SSIT","Tumkur");
		College c2=new College("RVCE","Bangalore");
		College c3=new College("Jaychamendra College of Engineering","Mysore");
		
		List<College> college=new ArrayList<College>();
		
		college.add(c1);
		college.add(c2);
		college.add(c3);
		
		University university=new University(college);
		List<College> colleges=university.getTotalCollegesInUniversity();
		
		for(College cg:colleges) {
			
			System.out.println("Name:"+cg.name);
			System.out.println("Address:"+cg.address+"\n");
		}
		
		
		

	}

}
