public class MainClass {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return Json.value(input).toString();
    }
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String moves = stringToString(line);
            
            boolean ret = new Solution().judgeCircle(moves);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}