
public class Kata {
    public static boolean nameInStr(String str, String name) {
        String sub = "";
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == name.charAt(i)) {
                    sub = sub + (str.charAt(j));
                    System.out.print(sub);
                    i++;
                    if (i == name.length())
                        break;
                }

            }
        }
        return sub.equals(name);
    }

    public static void main(String[] args) {
        nameInStr("ABCD", "BD");
    }
}
//sub = str.replaceAll("[^"+name.charAt(s)+"]" , "");
//System.out.print(sub);

   /* String sub = "";
        for (int i = 0; i < name.length(); i++) {
        for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == name.charAt(i)) {
        sub = String.valueOf(str.charAt(j));
        System.out.print(sub);
        }

        }
        }
        return sub.contains(name);
        }*/
