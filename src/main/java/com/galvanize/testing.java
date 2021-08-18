package com.galvanize;

class ContinueWithLabelDemo {
    public static void main(String[] args) {

        String searchMe = "Canada is one of the best countries in the world to live in. First, Canada has an\n" +
                "excellent health care system. All Canadians have access to medical services at a reasonable\n" +
                "price. Second, Canada has a high standard of education. Students are taught by well‐trained\n" +
                "teachers and are encouraged to continue studying at university. Finally, Canada's cities are clean\n" +
                "and efficiently managed. Canadian cities have many parks and sub lots of space for people to live. As\n" +
                "a result, Canada is a desirable place to live. ";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() -
                substring.length();

        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}





