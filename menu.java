import java.util.*;

class menu {
    public static void option(int x) {
        int z;
        System.out.println("\t\tWelcome to Our Book Shop.");
        System.out.println("\tFor Main Course Books, Press 0.");
        System.out.println("\tFor Literature Books, Press 1,");
        System.out.println("\tFor Story Books, Press 2.");
        System.out.print("\tEnter Your Choice:");
        Scanner SC = new Scanner(System.in);
        z = SC.nextInt();
        if (z < 0 || z >= 3) {
            System.out.println("\t\tEnter Correct Value.");
            option(x);
        }
        switch (z) {
            case 0:
                Maincourse();
                break;
            case 1:
                Literature();
                break;
            case 2:
                Story();
                break;
        }
    }

    public static void Maincourse() {
        int standard, language;
        Scanner SC = new Scanner(System.in);
        System.out.println("\n\t\tWelcome to Main Course Book Section.");
        System.out.println("\n\tWhich Class Books?"
                + "\n\tFor 1-5, Press 0."
                + "\n\tFor 6-10, Press 1.");
        System.out.print("\tEnter Your Choice:");
        standard = SC.nextInt();
        if (standard >= 2 || standard < 0) {
            System.out.println("\n\tEnter Correct Value.");
            Maincourse();
        }
        System.out.println("\n\tWhich Language?"
                + "\n\tFor English, Press 0."
                + "\n\tFor Hindi, Press 1.");
        System.out.print("\tEnter Your Choice:");
        language = SC.nextInt();
        if (language >= 2 || language < 0) {
            System.out.println("\n\tEnter Correct Value.");
            Maincourse();
        }
        switch (standard) {
            case 0:
                switch (language) {
                    case 0:
                        one_five_books_english();
                        break;
                    case 1:
                        one_five_books_hindi();
                        break;
                }
                break;
            case 1:
                switch (language) {
                    case 0:
                        six_ten_books_english();
                        break;
                    case 1:
                        six_ten_books_hindi();
                        break;
                }
                break;
        }

    }

    public static void Literature() {
        int language, author;
        Scanner SC = new Scanner(System.in);
        System.out.println("\n\t\tWelcome to Literature Book Section.");
        System.out.println("\tWhich Language?"
                + "\n\tFor English, Press 0."
                + "\n\tFor Hindi, Press 1."
                + "\n\tFor Others, Press 2.");
        System.out.print("\tEnter Your Choice:");
        language = SC.nextInt();
        if (language >= 3 || language < 0) {
            System.out.println("\tEnter Correct Value.");
            Literature();
        }
        System.out.println("\n\tWhich Author?"
                + "\n\tFor Indian, Press 0."
                + "\n\tFor Aboard, Press 1.");
        System.out.print("\tEnter Your Choice:");
        author = SC.nextInt();
        if (author >= 2 || author < 0) {
            System.out.println("\tEnter Correct Value");
            Literature();
        }
        switch (language) {
            case 0:
                switch (author) {
                    case 0:
                        literature_english_indian();
                        break;
                    case 1:
                        literature_english_aboard();
                        break;
                }
                break;
            case 1:
                switch (author) {
                    case 0:
                        literature_hindi_indian();
                        break;
                    case 1:
                        literature_hindi_aboard();
                        break;
                }
                break;
            case 2:
                System.out.println("\tSorry We Don't Deal in Other Languages");
                break;
        }
    }

    public static void Story() {
        int standard, language;
        Scanner SC = new Scanner(System.in);
        System.out.println("\n\t\tWelcome to Story Book Section.");
        System.out.println("\tWhich Class Books?"
                + "\n\tFor 1-5, Press 0."
                + "\n\tFor 6-10, Press 1.");
        System.out.print("\tEnter Your Choice:");
        standard = SC.nextInt();
        if (standard >= 2 || standard < 0) {
            System.out.println("\tEnter Correct Value.");
            Story();
        }
        System.out.println("\\ntWhich Language?"
                + "\n\tFor English, Press 0."
                + "\n\tFor Hindi, Press 1.");
        System.out.print("\tEnter Your Choice:");
        language = SC.nextInt();
        if (language >= 2 || language < 0) {
            System.out.println("\tEnter Correct Value.");
            Story();
        }
        switch (standard) {
            case 0:
                switch (language) {
                    case 0:
                        story_one_five_english();
                        break;
                    case 1:
                        story_one_five_hindi();
                        break;
                }
                break;
            case 1:
                switch (language) {
                    case 0:
                        story_six_ten_english();
                        break;
                    case 1:
                        story_six_ten_hindi();
                        break;
                }
                break;
        }
    }

    public static void story_six_ten_hindi() {
        System.out.println("\n\tWelcome to Class 6-10 Story Books (Hindi)");
        int key, cost;
        System.out.println("\tBooks\t\t\tCost\t\t\tKey"
                + "\n\tThe Lottery\t\tRs.580\t\t\t0"
                + "\n\tThe Tell\t\tRs.575\t\t\t1"
                + "\n\tAn Artist\t\tRs.550\t\t\t2"
                + "\n\tA Journey\t\tRs.625\t\t\t3"
                + "\n\tQuestions\t\tRs.599\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            literature_hindi_aboard();
        }
        switch (key) {
            case 0:
                cost = 580;
                quantity(cost);
                break;
            case 1:
                cost = 575;
                quantity(cost);
                break;
            case 2:
                cost = 550;
                quantity(cost);
                break;
            case 3:
                cost = 625;
                quantity(cost);
                break;
            case 4:
                cost = 599;
                quantity(cost);
        }

    }

    public static void story_six_ten_english() {
        System.out.println("\n\tWelcome to Class 6-10 Story Books (English)");
        int key, cost;
        System.out.println("\tBooks\t\t\tCost\t\t\tKey"
                + "\n\tThe Lottery\t\tRs.560\t\t\t0"
                + "\n\tThe Tell\t\tRs.565\t\t\t1"
                + "\n\tAn Artist\t\tRs.540\t\t\t2"
                + "\n\tA Journey\t\tRs.600\t\t\t3"
                + "\n\tQuestions\t\tRs.575\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            literature_hindi_aboard();
        }
        switch (key) {
            case 0:
                cost = 560;
                quantity(cost);
                break;
            case 1:
                cost = 565;
                quantity(cost);
                break;
            case 2:
                cost = 540;
                quantity(cost);
                break;
            case 3:
                cost = 600;
                quantity(cost);
                break;
            case 4:
                cost = 575;
                quantity(cost);
        }
    }

    public static void story_one_five_hindi() {
        System.out.println("\n\tWelcome to Class 1-5 Story Books (Hindi)");
        int key, cost;
        System.out.println("\tBooks\t\t\tCost\t\t\tKey"
                + "\n\tThe Lottery\t\tRs.580\t\t\t0"
                + "\n\tThe Tell\t\tRs.575\t\t\t1"
                + "\n\tAn Artist\t\tRs.550\t\t\t2"
                + "\n\tA Journey\t\tRs.625\t\t\t3"
                + "\n\tQuestions\t\tRs.599\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            literature_hindi_aboard();
        }
        switch (key) {
            case 0:
                cost = 580;
                quantity(cost);
                break;
            case 1:
                cost = 575;
                quantity(cost);
                break;
            case 2:
                cost = 550;
                quantity(cost);
                break;
            case 3:
                cost = 625;
                quantity(cost);
                break;
            case 4:
                cost = 599;
                quantity(cost);
        }
    }

    public static void story_one_five_english() {
        System.out.println("\n\tWelcome to Class 1-5 Story Books (English)");
        int key, cost;
        System.out.println("\tBooks\t\t\tCost\t\t\tKey"
                + "\n\tThe Lottery\t\tRs.560\t\t\t0"
                + "\n\tThe Tell\t\tRs.565\t\t\t1"
                + "\n\tAn Artist\t\tRs.540\t\t\t2"
                + "\n\tA Journey\t\tRs.600\t\t\t3"
                + "\n\tQuestions\t\tRs.575\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            literature_hindi_aboard();
        }
        switch (key) {
            case 0:
                cost = 560;
                quantity(cost);
                break;
            case 1:
                cost = 565;
                quantity(cost);
                break;
            case 2:
                cost = 540;
                quantity(cost);
                break;
            case 3:
                cost = 600;
                quantity(cost);
                break;
            case 4:
                cost = 575;
                quantity(cost);
        }
    }

    public static void literature_hindi_aboard() {
        int key, cost;
        System.out.println("\n\tWelcome to Hindi Literature (Aboard)");
        System.out.println("\tBooks\t\t\tCost\t\t\tKey"
                + "\n\tMahatma Gandhi\t\tRs.525\t\t\t0"
                + "\n\tR.K Narayan\t\tRs.550\t\t\t1"
                + "\n\tGitanjali\t\tRs.500\t\t\t2"
                + "\n\tHarshad Mehta\t\tRs.595\t\t\t3"
                + "\n\tSundar Pichai\t\tRs.599\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            literature_hindi_aboard();
        }
        switch (key) {
            case 0:
                cost = 525;
                quantity(cost);
                break;
            case 1:
                cost = 550;
                quantity(cost);
                break;
            case 2:
                cost = 500;
                quantity(cost);
                break;
            case 3:
                cost = 595;
                quantity(cost);
                break;
            case 4:
                cost = 599;
                quantity(cost);
        }
    }

    public static void literature_hindi_indian() {
        int key, cost;
        System.out.println("\n\tWelcome to Hindi Literature (Indian)");
        System.out.println("\tBooks\t\t\tCost\t\t\tKey"
                + "\n\tMahatma Gandhi\t\tRs.450\t\t\t0"
                + "\n\tR.K Narayan\t\tRs.500\t\t\t1"
                + "\n\tGitanjali\t\tRs.450\t\t\t2"
                + "\n\tHarshad Mehta\t\tRs.525\t\t\t3"
                + "\n\tSundar Pichai\t\tRs.575\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            literature_hindi_indian();
        }
        switch (key) {
            case 0:
                cost = 450;
                quantity(cost);
                break;
            case 1:
                cost = 500;
                quantity(cost);
                break;
            case 2:
                cost = 450;
                quantity(cost);
                break;
            case 3:
                cost = 525;
                quantity(cost);
                break;
            case 4:
                cost = 575;
                quantity(cost);
        }
    }

    public static void literature_english_aboard() {
        int key, cost;
        System.out.println("\n\tWelcome to English Literature (Aboard)");
        System.out.println("\tBooks\t\t\tCost\t\t\tKey"
                + "\n\tMahatma Gandhi\t\tRs.530\t\t\t0"
                + "\n\tR.K Narayan\t\tRs.575\t\t\t1"
                + "\n\tGitanjali\t\tRs.495\t\t\t2"
                + "\n\tHarshad Mehta\t\tRs.585\t\t\t3"
                + "\n\tSundar Pichai\t\tRs.598\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            literature_english_aboard();
        }
        switch (key) {
            case 0:
                cost = 530;
                quantity(cost);
                break;
            case 1:
                cost = 575;
                quantity(cost);
                break;
            case 2:
                cost = 495;
                quantity(cost);
                break;
            case 3:
                cost = 585;
                quantity(cost);
                break;
            case 4:
                cost = 598;
                quantity(cost);
        }
    }

    public static void literature_english_indian() {
        int key, cost;
        System.out.println("\n\tWelcome to English Literature (Indian)");
        System.out.println("\tBooks\t\t\tCost\t\t\tKey"
                + "\n\tMahatma Gandhi\t\tRs.475\t\t\t0"
                + "\n\tR.K Narayan\t\tRs.525\t\t\t1"
                + "\n\tGitanjali\t\tRs.490\t\t\t2"
                + "\n\tHarshad Mehta\t\tRs.575\t\t\t3"
                + "\n\tSundar Pichai\t\tRs.595\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            literature_english_indian();
        }
        switch (key) {
            case 0:
                cost = 475;
                quantity(cost);
                break;
            case 1:
                cost = 525;
                quantity(cost);
                break;
            case 2:
                cost = 490;
                quantity(cost);
                break;
            case 3:
                cost = 575;
                quantity(cost);
                break;
            case 4:
                cost = 595;
                quantity(cost);
        }
    }

    public static void one_five_books_english() {
        int key, cost;
        System.out.println("\n\tWelcome to Class 1-5 Maincourse Books (English)");
        System.out.println("\tSubject\t\t\tCost\t\t\tKey"
                + "\n\tMaths\t\t\tRs.250\t\t\t0"
                + "\n\tEnglish\t\t\tRs.200\t\t\t1"
                + "\n\tScience\t\t\tRs.225\t\t\t2"
                + "\n\tHindi\t\t\tRs.200\t\t\t3"
                + "\n\tG.K\t\t\tRs.150\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            one_five_books_english();
        }
        switch (key) {
            case 0:
                cost = 250;
                quantity(cost);
                break;
            case 1:
                cost = 200;
                quantity(cost);
                break;
            case 2:
                cost = 225;
                quantity(cost);
                break;
            case 3:
                cost = 200;
                quantity(cost);
                break;
            case 4:
                cost = 150;
                quantity(cost);
        }
    }

    public static void one_five_books_hindi() {
        int key, cost;
        System.out.println("\n\tWelcome to Class 1-5 Maincourse Books (Hindi)");
        System.out.println("\tSubject\t\t\tCost\t\t\tKey"
                + "\n\tMaths\t\t\tRs.250\t\t\t0"
                + "\n\tEnglish\t\t\tRs.200\t\t\t1"
                + "\n\tScience\t\t\tRs.225\t\t\t2"
                + "\n\tHindi\t\t\tRs.200\t\t\t3"
                + "\n\tG.K\t\t\tRs.150\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.println("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.print("\tEnter Correct Value.");
            one_five_books_hindi();
        }
        switch (key) {
            case 0:
                cost = 250;
                quantity(cost);
                break;
            case 1:
                cost = 200;
                quantity(cost);
                break;
            case 2:
                cost = 225;
                quantity(cost);
                break;
            case 3:
                cost = 200;
                quantity(cost);
                break;
            case 4:
                cost = 150;
                quantity(cost);
        }
    }

    public static void six_ten_books_english() {
        int key, cost;
        System.out.println("\n\tWelcome to Class 6-10 Maincourse Books (English)");
        System.out.println("\tSubject\t\t\tCost\t\t\tKey"
                + "\n\tMaths\t\t\tRs.350\t\t\t0"
                + "\n\tEnglish\t\t\tRs.300\t\t\t1"
                + "\n\tChemistry\t\tRs.250\t\t\t2"
                + "\n\tPhysics\t\t\tRs.250\t\t\t3"
                + "\n\tBiology\t\t\tRs.250\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            six_ten_books_english();
        }
        switch (key) {
            case 0:
                cost = 350;
                quantity(cost);
                break;
            case 1:
                cost = 300;
                quantity(cost);
                break;
            case 2:
                cost = 250;
                quantity(cost);
                break;
            case 3:
                cost = 250;
                quantity(cost);
                break;
            case 4:
                cost = 250;
                quantity(cost);
        }
    }

    public static void six_ten_books_hindi() {
        int key, cost;
        System.out.println("\n\tWelcome to Class 6-10 Maincourse Books (Hindi)");
        System.out.println("\tSubject\t\t\tCost\t\t\tKey"
                + "\n\tMaths\t\t\tRs.350\t\t\t0"
                + "\n\tEnglish\t\t\tRs.300\t\t\t1"
                + "\n\tChemistry\t\tRs.250\t\t\t2"
                + "\n\tPhysics\t\t\tRs.250\t\t\t3"
                + "\n\tBiology\t\t\tRs.250\t\t\t4");
        Scanner SC = new Scanner(System.in);
        System.out.print("\tEnter Your Choice:");
        key = SC.nextInt();
        if (key >= 5 || key < 0) {
            System.out.println("\tEnter Correct Value.");
            six_ten_books_hindi();
        }
        switch (key) {
            case 0:
                cost = 350;
                quantity(cost);
                break;
            case 1:
                cost = 300;
                quantity(cost);
                break;
            case 2:
                cost = 250;
                quantity(cost);
                break;
            case 3:
                cost = 250;
                quantity(cost);
                break;
            case 4:
                cost = 250;
                quantity(cost);
        }
    }

    public static void quantity(int cost) {
        int number;
        int quantity = 0;
        System.out.println("\n\tWelcome to Quantity Section."
                + "\n\tEnter The Number of Quantity of Book?");
        System.out.print("\tEnter Your Choice:");
        Scanner SC = new Scanner(System.in);
        number = SC.nextInt();
        if (number >= 6 || number < 0) {
            System.out.println("Enter Less Quantity.");
            quantity(cost);
        }
        quantity = quantity + number;
        System.out.println("\tTotal Number of Books = " + quantity);
        int amount = cost * quantity;
        System.out.println("\tTotal Amount:" + amount);
        billing(quantity, amount);
    }

    public static void billing(int quantity, int amount) {
        int paid, more, x = 0;
        Scanner SC = new Scanner(System.in);
        System.out.println("\n\tWelcome to Billing Section.");
        System.out.println("\t\tBook Shop"
                + "\n\tBilling Counter"
                + "\n\tTotal Number of Books: " + quantity
                + "\n\tAmount: " + amount);
        int price = (amount * 10) / 100;
        int price1 = amount - price;
        System.out.println("\tPrice After Discount:" + price1);
        System.out.println("\tPaid?"
                + "\n\tYes, Press 0"
                + "\n\tNo, Press 1");
        System.out.print("Enter Your Choice:");
        paid = SC.nextInt();
        if (paid >= 2 || paid < 0) {
            System.out.println("\tEnter Correct Value.");
            billing(quantity, amount);
        }
        switch (paid) {
            case 0:
                System.out.println("\n\tThanks For Buying");
                System.out.println("\tDo You Want to Purchase more?"
                        + "\n\tIf Yes, Press 0"
                        + "\n\tIf No, Press 1");
                System.out.print("\tEnter Your Choice:");
                more = SC.nextInt();
                if (more >= 2 || more < 0) {
                    System.out.println("\tEnter Correct Value");
                    billing(quantity, amount);
                }
                switch (more) {
                    case 0:
                        option(x);
                        break;
                    case 1:
                        System.out.println("\tOK, Thanks For Visting, Visit Again!");
                }
                break;
            case 1:
                System.out.println("\n\tPay it!");
                billing(quantity, amount);
        }
    }

    public static void main(String[] args) {
        int y = 0;
        menu obj1 = new menu();
        menu.option(y);
    }
}
