package c1basics;


public class D2Strings {
    public String solution(String str1, String str2){

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i));
            answer.append((str2.charAt(i)));
        }
        return answer.toString();
    }
    //aaaaa bbbbb -> ababababab
    public String solution1(String str1,String str2){
      // cach 1: toCharArray()
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        String anwers = "";
            for (int i = 0; i < chars1.length; i++) {
                anwers+=chars1[i];
                anwers+=chars2[i];
            }
            //cach 2:  charAt(int i) ->   문자열 i번자 가져오는 메터드
        anwers="";
        for (int i = 0; i < str1.length(); i++) {
            anwers +=str1.charAt(i);
            anwers +=str1.charAt(i);

        }
            return anwers;
    }
}
