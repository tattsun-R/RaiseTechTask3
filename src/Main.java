import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vo.：バンドのメンバーを紹介しますね。");

        Map<String, String> memberMap1 = new LinkedHashMap<>();
        memberMap1.put("Keyboard", "増田　次郎");
        memberMap1.put("Bass", "滝山　四郎");
        memberMap1.put("Drums", "青山　三郎");
        memberMap1.put("Guitar", "松本　一郎");

        for (Map.Entry<String, String> entry : memberMap1.entrySet()) {
            System.out.println(entry.getKey() + "！" + entry.getValue()+"！");
        }

        Map<String, String> memberMap2 = null;
        try {
            System.out.println(memberMap2.get("Vocal"));
        } catch (NullPointerException e) {
            System.out.println("Gu.：Vocalっていつも自分だけ紹介してもらえないよね。");
        }


    }
}