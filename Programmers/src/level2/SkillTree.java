package level2;

import java.util.*;

public class SkillTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = 0;
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		String skill = "CBD";
		
		ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
		Iterator<String> it = skillTrees.iterator();

		int cnt = 0;
		while(it.hasNext()) {
			
			System.out.println(it.next().replaceAll("[^" + "A" + "]", "1") + " ");
			
//			if(skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
//				it.remove();
//			};
//			
			
			cnt++;
			if(cnt==4) break;
			
		}
//		for(int i = 0; i < skillTrees.size(); i++) {
//			System.out.print(skillTrees.get(i) + " ");
//		}
		
//		System.out.print(skillTrees.size());
	}

}
