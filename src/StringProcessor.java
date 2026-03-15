public class StringProcessor implements Processor<String> {

    @Override
    public String process(String input) {
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }

        return output;
    }
    
}
