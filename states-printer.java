public class MyClass{
    public static void main(String[] args){
        int countA = 0;
        String countA1 = null;
        String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho",
"Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
"Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
"Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin",
"Wyoming"};//states array
        
        for(countA = 0; countA < states.length; countA++){
            if(String.valueOf(countA + 1).length() == 1){
                countA1 = "0" + String.valueOf(countA + 1);
            }else{
                countA1 = String.valueOf(countA + 1);
            }
            System.out.printf("%s | %s%n", countA1, states[countA]);
        }//states printer for
    }//main function
}//MyClass class
