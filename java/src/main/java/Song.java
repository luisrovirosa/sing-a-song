class Song {


    public static void main(String[] args) {

        String animal1 = "fly";
        String animal2 = "spider";
        String animal3 = "bird";
        String animal4 = "cat";
        String animal5 = "dog";
        String animal6 = "cow";
        String animal7 = "horse";
        String song = "There was an old lady who swallowed a " + animal1 + ".\n" +
                "I don't know why she swallowed a " + animal1 + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + animal2 + ";\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                shallowToCatchPhrase(animal2, animal1) + ";\n" +
                "I don't know why she swallowed a " + animal1 + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + animal3 + ";\n" +
                "How absurd to swallow a " + animal3 + ".\n" +
                "She swallowed the " + animal3 + " to catch the " + animal2 + ",\n" +
                "She swallowed the " + animal2 + " to catch the " + animal1 + ";\n" +
                "I don't know why she swallowed a " + animal1 + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + animal4 + ";\n" +
                "Fancy that to swallow a " + animal4 + "!\n" +
                "She swallowed the " + animal4 + " to catch the " + animal3 + ",\n" +
                "She swallowed the " + animal3 + " to catch the " + animal2 + ",\n" +
                "She swallowed the " + animal2 + " to catch the " + animal1 + ";\n" +
                "I don't know why she swallowed a " + animal1 + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + animal5 + ";\n" +
                "What a hog, to swallow a " + animal5 + "!\n" +
                "She swallowed the " + animal5 + " to catch the " + animal4 + ",\n" +
                "She swallowed the " + animal4 + " to catch the " + animal3 + ",\n" +
                "She swallowed the " + animal3 + " to catch the " + animal2 + ",\n" +
                "She swallowed the " + animal2 + " to catch the " + animal1 + ";\n" +
                "I don't know why she swallowed a " + animal1 + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + animal6 + ";\n" +
                "I don't know how she swallowed a " + animal6 + "!\n" +
                "She swallowed the " + animal6 + " to catch the " + animal5 + ",\n" +
                "She swallowed the " + animal5 + " to catch the " + animal4 + ",\n" +
                "She swallowed the " + animal4 + " to catch the " + animal3 + ",\n" +
                "She swallowed the " + animal3 + " to catch the " + animal2 + ",\n" +
                "She swallowed the " + animal2 + " to catch the " + animal1 + ";\n" +
                "I don't know why she swallowed a " + animal1 + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + animal7 + "...\n" +
                "...She's dead, of course!";

        System.out.println(song);
    }

    private static String shallowToCatchPhrase(String animalSwallowed, String animalToCatch) {
        return "She swallowed the " + animalSwallowed + " to catch the " + animalToCatch;
    }
}