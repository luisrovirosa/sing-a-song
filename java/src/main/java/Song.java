import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Song {


    public static void main(String[] args) {

        String animal1 = "fly";
        String animal2 = "spider";
        String animal3 = "bird";
        String animal4 = "cat";
        String animal5 = "dog";
        String animal6 = "cow";
        String animal7 = "horse";
        Map<String, String> animalRhyme = Map.of(
                "fly", "I don't know why she swallowed a fly - perhaps she'll die!",
                "spider", "That wriggled and wiggled and tickled inside her.",
                "bird", "How absurd to swallow a bird.",
                "cat", "Fancy that to swallow a cat!",
                "dog", "What a hog, to swallow a dog!",
                "cow", "I don't know how she swallowed a cow!",
                "horse", "...She's dead, of course!");
        String song = thereWasAnOldLadyWhoSwallowedA(animal1) + ".\n" +
                iDontKnow(animal1) +

                thereWasAnOldLadyWhoSwallowedA(animal2) + ";\n" +
                animalRhyme.get(animal2) + "\n" +
                shallowToCatchPhrases(new String[]{animal2, animal1}) +
                iDontKnow(animal1) +

                thereWasAnOldLadyWhoSwallowedA(animal3) + ";\n" +
                animalRhyme.get(animal3) + "\n" +
                shallowToCatchPhrases(new String[]{animal3, animal2, animal1}) +
                iDontKnow(animal1) +

                thereWasAnOldLadyWhoSwallowedA(animal4) + ";\n" +
                animalRhyme.get(animal4) + "\n" +
                shallowToCatchPhrases(new String[]{animal4, animal3, animal2, animal1}) +
                iDontKnow(animal1) +

                thereWasAnOldLadyWhoSwallowedA(animal5) + ";\n" +
                animalRhyme.get(animal5) + "\n" +
                shallowToCatchPhrases(new String[]{animal5, animal4, animal3, animal2, animal1}) +
                iDontKnow(animal1) +

                thereWasAnOldLadyWhoSwallowedA(animal6) + ";\n" +
                animalRhyme.get(animal6) + "\n" +
                shallowToCatchPhrases(new String[]{animal6, animal5, animal4, animal3, animal2, animal1}) +
                iDontKnow(animal1) +

                thereWasAnOldLadyWhoSwallowedA(animal7) + "...\n" +
                animalRhyme.get(animal7);

        System.out.println(song);
    }

    private static String iDontKnow(String animal1) {
        return "I don't know why she swallowed a " + animal1 + " - perhaps she'll die!\n\n";
    }

    private static String thereWasAnOldLadyWhoSwallowedA(String animal1) {
        return "There was an old lady who swallowed a " + animal1;
    }

    private static String shallowToCatchPhrases(String[] animals) {
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < animals.length - 2; i++) {
            response.append(shallowToCatchPhrase(animals[i], animals[i + 1])).append(",\n");
        }
        response.append(shallowToCatchPhrase(animals[animals.length - 2], animals[animals.length - 1])).append(";\n");

        return response.toString();
    }

    private static String shallowToCatchPhrase(String animalSwallowed, String animalToCatch) {
        return "She swallowed the " + animalSwallowed + " to catch the " + animalToCatch;
    }
}