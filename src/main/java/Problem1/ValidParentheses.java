package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        boolean valid = true;
        int counter1 = 0;//{
        int counter2 = 0;//}
        int counter3 = 0;//(
        int counter4 = 0;//)
        int counter5 = 0;//[
        int counter6 = 0;//]
        // !!! must use ArrayStack or LinkedListStack from problem 1
        if(str == null){
            return true;
        }
        ArrayStack <String> stack = new ArrayStack<String>(str.length());
        String [] split = str.split("");
        if(str.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            stack.push(split[i]);
        }
        for (int i = 0; i < str.length(); i++) {
            String check = stack.pop();
            if(check.equals("}")){
                counter1++;
            }else if(check.equals("{")){
                counter2++;
                if(counter2 > counter1){
                    valid = false;
                }
            }else if(check.equals(")")){
                counter3++;
            }else if(check.equals("(")){
                counter4++;
                if(counter4 > counter3){
                    valid = false;
                }
            }else if(check.equals("]")){
                counter5++;
            }else if(check.equals("[")){
                counter6++;
                if(counter6 > counter5){
                    valid = false;
                }
            }else{
                valid = false;
            }
        }
        if((counter1 != counter2) || (counter3 != counter4) || (counter5 != counter6)){
            valid = false;
        }
        return valid;
    }
}
