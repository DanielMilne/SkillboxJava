public class Main {

    public static void main(String[] args) {
        String text = "Because flawed tests and limited funding initially meant testing capacity in the US was restricted, the CDC has tested about 1,526 people in the US. Alex Azar, the US secretary of health and human services, told ABC on Sunday that 3,600 Americans had been tested in total.South Korea, by contrast, has implemented free coronavirus-testing drive-thrus and tested more than 136,000 people. The country's death rate is currently just 0.5% — 35 deaths out of a total of 6,088 reported infections. (It is constantly evolving, however, as patients' illnesses progress and as more people are diagnosed.)To be sure, the US has a much lower case count overall than either South Korea or China, so any death significantly impacts the country's fatality rate. But again, the low case count is likely due to how few people have been tested.";
        System.out.println(text);
        String[] word = text.split("(\\s|,|\\.)");
        for (int i =0; i <word.length; i++){
            System.out.println(word[i]);
        }
    }
}
