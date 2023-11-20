package DataStructures.medium;

public class ZigzagConversion {
    public static void main(String[] args) {
        ZigzagConversion z = new ZigzagConversion();
        System.out.println(z.convert("RENUKESWARCHINTAISINDMM",5));
    }
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder sb =new StringBuilder();
        int step = (numRows -1) * 2;
        for(int i=0;i<numRows;i++){

            for(int j=i;j<s.length()-1;j+=step){
                sb.append(s.charAt(j));
                if(i!=0 && i<numRows-1 && (j+step-2*i)< s.length()){
                    sb.append(s.charAt(j+step-2*i));
                }
            }
        }
        return sb.toString();
    }
}
