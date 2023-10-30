package cautrucdieukhien;

public class control {
	public static void main(String[] args) {
		int a = 6;
		int b = 8;
		
		if (a < b){
			System.out.println(a + " lớn hơn " + b);
		} else if (a > b) {
			System.out.println(a + " nhỏ hơn " + b);
		}else {
			System.out.println(a + " bằng " + b);
			
		
		}
		// vòng lặp for in từ số 6 đến số 8
		for (int i = a;i<=b; i++) {
			System.out.println("số hiện tại " + i);
			
		}
	}

}
