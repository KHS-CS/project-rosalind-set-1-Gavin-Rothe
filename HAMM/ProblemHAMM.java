
public class R4 {
    public static void main(String[] args) {
    
        final String inputDNA1 = "GAGCCTACTAACGGGAT";
        final String inputDNA2 = "CATCGTAATGACGGCCT";
        int e = 0;
        for(int i = 0; i < inputDNA1.length(); i++){
            char c = inputDNA1.charAt(i);
            char d = inputDNA2.charAt(i);
            if(c != d) e++;
        }
        System.out.println(e);
    }
}
