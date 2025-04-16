package assignment_5;

class FancyTextGame extends TextGame{

    @Override
    public boolean isPalindrome(){
        System.out.print("checking word: ");
        for(Character c:characters){
            System.out.print(c+" ");
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
        boolean result=super.isPalindrome();
        System.out.println(result ?"->palindrome!":"->not palindrome.");
        return result;
    }
}