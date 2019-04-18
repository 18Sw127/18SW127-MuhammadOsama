class Task2 {
    public static void main(String[] args) {
        
        int num1 = 1, num2 = 2, num3 = 9;
        boolean answer;
        
        answer = (num1 > num2) || (num3 > num1);
        System.out.println(answer);
                
        answer = (num1 > num2) && (num3 > num1);
        System.out.println(answer);
    }
}