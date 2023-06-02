class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.deleteCharAt(0).insert(0, "H").append(" World!");
        System.out.println(sb);
    }
}
//    The StringBuilder object sb is created and initialized with the string "hello".
//        The deleteCharAt(0) method is called on sb to delete the character at index 0, which is 'h'.
//        The insert(0, "H") method is then called on sb to insert the character 'H' at index 0.
//        Finally, the append(" World!") method is used to append the string " World!" to the modified StringBuilder object.
//        The resulting StringBuilder object is printed using System.out.println(sb).


//output:Hello World!