package tut0921.dao;

public class ScoresDao {
	
	public void nullCheck() {
		int[] scores = null;
		
		if (scores == null) {
			System.out.println("\n1. 학생 수 메뉴에서 학생 수를 먼저 등록해주세요.\n");
			return;
		}
	}
	
}
