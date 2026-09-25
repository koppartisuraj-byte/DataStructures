package Linear_Search;


import java.util.Arrays;

public class SearchInString_EnhancedLoop {
        public static void main(String[] args) {
            String name = "Suraj";
            char target = 'e';
            System.out.println(search(name, target));
            System.out.println(Arrays.toString(name.toCharArray()));
        }

        static boolean search(String str, char target){
            if (str.length() == 0){
                return false;
            }

            //tochararray is used to convert string into array for iteration purpose
            for (char ch : str.toCharArray()) {
                if (ch==target){
                    return true;
                }
            }
            return false;
        }
    }
