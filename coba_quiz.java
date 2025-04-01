package week_4;

import java.util.Scanner;

public class coba_quiz{
    private static String[] questions = {
        "Siapa peringkat pertama klasemen liga korupsi Indonesia?",
        "Tanggal berapa IHSG menutup penjualan pasarnya?",
        "Siapa presiden Indonesia terkorup berdasarkan OCCRP?",
        "Siapa CEO Tesla?",
        "Berapa jumlah provinsi di Indonesia saat ini?",
        "Apa mata uang resmi Jepang?",
        "Siapa penemu lampu pijar?",
        "Dimana letak Menara Eiffel?",
        "Siapa yang menulis novel 'Laskar Pelangi'?",
        "Berapa hasil dari 12 × 12?"
    };

    private static String[][] choices = {
        {"A. Indonesia", "B. Nigeria", "C. Afghanistan", "D. Somalia"},
        {"A. 31 Desember", "B. 1 Januari", "C. 15 Agustus", "D. 17 Agustus"},
        {"A. Soekarno", "B. Suharto", "C. Jokowi", "D. SBY"},
        {"A. Mark Zuckerberg", "B. Jeff Bezos", "C. Elon Musk", "D. Bill Gates"},
        {"A. 34", "B. 37", "C. 38", "D. 40"},
        {"A. Ringgit", "B. Yen", "C. Won", "D. Yuan"},
        {"A. Nikola Tesla", "B. Thomas Edison", "C. Albert Einstein", "D. Alexander Graham Bell"},
        {"A. London", "B. Paris", "C. New York", "D. Roma"},
        {"A. Andrea Hirata", "B. Pramoedya Ananta Toer", "C. Tere Liye", "D. Habiburrahman El Shirazy"},
        {"A. 100", "B. 124", "C. 144", "D. 169"}
    };

    private static char[] correctAnswers = {'C', 'A', 'B', 'C', 'C', 'B', 'B', 'B', 'A', 'C'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to Quiziezz!");
        System.out.println("Choose the correct answer by typing A, B, C, or D.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Pertanyaan " + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < choices[i].length; j++) {
                System.out.println(choices[i][j]);
            }
            System.out.print("Jawaban Anda: ");
            char answer = scanner.next().toUpperCase().charAt(0);

            if (answer == correctAnswers[i]) {
                System.out.println("Benar!\n");
                score += 10; // Skor bertambah 10 untuk jawaban benar
            } else {
                System.out.println("Salah! Jawaban yang benar adalah " + correctAnswers[i] + ".\n");
            }
        }

        System.out.println("Quiz selesai!");
        System.out.println("Skor akhir Anda: " + score + " / 100");

        scanner.close();
    }
}
