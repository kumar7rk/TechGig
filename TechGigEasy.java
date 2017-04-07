package TechGig;

import icsV1dot1.Time;

public class TechGigEasy {

	public static void main(String[] args) {
		int input1 = 5;
		int input2 = 1;
		int[] input3 = {9,10};
		int res = GetJumpCount(input1,input2,input3);
		System.out.println(res);

	}
	public static int GetJumpCount(int input1, int input2, int[] input3) {
		int res = 0;
		int count = 0;
		for (int i = 0; i < input3.length; i++) {
			int jump = 0;
			while (jump<input3[i]) {
				count++;
				jump+=input1;
				if (jump>=input3[i]) {
					res = count;
					break;
				}
				else
					jump -=input2;
			}
		}
		return res;
	}

}
