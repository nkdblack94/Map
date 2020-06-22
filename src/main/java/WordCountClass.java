import java.util.TreeMap;

public class WordCountClass {
    public static void main(String[] args) {
        String document = "Long Biên. Tháng 7. Trăng tròn bóng " +
                "Sông Hồng dè xẻn gió sang ngang " +
                "Trận địa bên cầu thao thức sóng " +
                "Mâm pháo quầng đêm vợi ánh vàng " +
                "Mây nước lung linh hình pháo thủ " +
                "Chong chong mắt đượm dáng rồng bay " +
                "Lì vai tiếp đạn em quên ngủ " +
                "Giặc cháy tầng không lửa sáng ngày";

        System.out.println(document);
        TreeMap<String, Integer> result = new TreeMap<String, Integer>();
        String[] keyWord = document.toUpperCase().split(" ");

        for (int i = 0; i < keyWord.length; i++){
            keyWord[i] = keyWord[i].replace(",", "");
            keyWord[i] = keyWord[i].replace(".", "");
            keyWord[i] = keyWord[i].replace("?", "");
            keyWord[i] = keyWord[i].replace("!", "");
            String key = keyWord[i];
            if (result.containsKey(key)){
                result.put(key, result.get(key) + 1);
            } else {
                result.put(key, 1);
            }
        }
        System.out.println(result);
    }
}
