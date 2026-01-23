public class R3{
public static void main(String[] args){
 String dna = "AAAACCCGGT";
 String rna = "";
 for(int i = 0; i < dna.length(); i++){
            char c = dna.charAt(i);

            if (c == 'A') rna += 'T';
            if (c == 'C') rna += 'G';
            if (c == 'G') rna += 'C';
            if (c == 'T') rna += 'A';
        }
        
String reverseRna = "";
for (int i = rna.length() - 1; i >= 0; i--) {
            reverseRna += rna.charAt(i);
        }
    
 System.out.println(reverseRna);
}
}
