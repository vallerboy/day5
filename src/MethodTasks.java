public class MethodTasks {



    // Zadanie 5
    public boolean isPita(int a, int b, int c){
        return a * a + b * b == c * c;
    }

    // Zadanie 6
    public int sum(int a){
        int sum = 0;

        //256
        while(a != 0){
            sum += a % 10;
            a /= 10;
        }

        return sum;
    }


    //Zadanie6a
    public int sumWithChar(int a){
        String stringOfA = String.valueOf(a);

        int sum = 0;

        for (int i = 0; i < stringOfA.length(); i++) {
             char number = stringOfA.charAt(i);
             sum += Character.getNumericValue(number);
        }
        return sum;
    }

    public boolean isSquare(int a){
        return Math.sqrt(a) % 1 == 0;
    }


    public boolean isPrimeNumber(int a){

        for(int i = 3; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                return false;
            }
        }

        return true;
    }

    public int getDeviders(int a) {

        int sum = 0;
        for(int i = 1; i <= a/2; i++){
            if(a % i == 0){
                sum++;
            }
        }

        return sum;
    }

    public int getMaxDividers(){
        int max = 0;
        int number = 0;

        for(int i = 2; i <= 10000; i++){
            int dividers = getDeviders(i);
            if(dividers > max){
                max = dividers;
                number = i;
            }
        }
        return number;
    }

}
