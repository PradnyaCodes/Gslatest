public class Longestwordindict {

    public static void main(String[] args) {

        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge","LODGESSSS", "mODJ","" };
        String toSearch = "ODG";
        int count=0;

        for(int i=0;i< dict.length;i++){
            if (dict[i].contains(toSearch)) {
                if(dict[i].length()>count){
                    count=dict[i].length();
                }
            }
        }
        System.out.println(count);
    }
}
