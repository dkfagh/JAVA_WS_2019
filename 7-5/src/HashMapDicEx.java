import java.util.*;

public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		Scanner s = new Scanner(System.in);
		
//		while(true) {
//			System.out.print("ã�� ���� �ܾ��?");
//			String eng = s.next();
//			if(eng.equals("exit")) {
//				System.out.println("�����մϴ�...");
//				break;
//			}
//			String kor = dic.get(eng);
//			if(kor == null)
//				System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
//			else
//				System.out.println(kor);
//		}
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(dic.get(name));
		}
		s.close();
	}
}