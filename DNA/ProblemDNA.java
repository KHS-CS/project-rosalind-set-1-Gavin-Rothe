public class DNA_prob1
{
    public static void main(String[] args){
        
        String dna = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        int A = 0, C = 0, G = 0, T = 0;

        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);

            if (c == 'A') A++;
            if (c == 'C') C++;
            if (c == 'G') G++;
            if (c == 'T') T++;
        }

        System.out.println(A + " " + C + " " + G + " " + T);
    }
    }
