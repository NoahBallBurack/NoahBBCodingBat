public class Runner {

    public static void main(String[] args) {
        System.out.println(icyHot(5, 20));
        int[] x={1, 9, 5, 9, 10, 9};
        System.out.println(arrayCount9(x));
        System.out.println(extraEnd("Fart"));
        int[] y ={7,4,6,2};
        System.out.println(makeEnds(y));
        System.out.println(answerCell(false, false, true));
        System.out.println(roundSum(10, 5, 7));
        System.out.println(xyBalance("aaxbby"));
        System.out.println(equalIsNot("This is notnot"));
        int[] z={1,4,2,4};
        System.out.println(only14(z));
        int[] q={1,1,1,2,1};
        System.out.println(canBalance(q));
    }


    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100)) {
            return true;
        } else {
            return false;
        }
    }

    public static int arrayCount9(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                sum += 1;
            }
        }
        return sum;
    }

    public static String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        String newString = last2;
        newString += last2;
        newString += last2;
        return newString;
    }

    public static int[] makeEnds(int[] nums) {
        int[] newArray = new int[2];
        newArray[0] = nums[0];
        newArray[1] = nums[nums.length - 1];
        return newArray;
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && !isMom) {
            return false;
        } else {
            return true;
        }
    }

    public static int roundSum(int a, int b, int c) {
        int newA = round10(a);
        int newB = round10(b);
        int newC = round10(c);
        int sum = newA + newB + newC;
        return sum;
    }

    public static int round10(int num) {
        int lastDigit = num % 10;
        int newNum = 0;
        if (lastDigit >= 5) {
            newNum = num + (10 - lastDigit);
        } else {
            newNum = num - lastDigit;
        }
        return newNum;
    }

    public static boolean xyBalance(String str) {
        boolean currentValue = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("x")) {
                currentValue = false;
            }
            if (str.substring(i, i + 1).equals("y")) {
                currentValue = true;
            }
        }
        return currentValue;
    }

    public static boolean equalIsNot(String str) {
        int notCount=0;
        int isCount=0;
        for(int i=0;i<str.length();i++){
            if(str.substring(i,i+1).equals("t")&&str.substring(i-1,i).equals("o")&&str.substring(i-2,i-1).equals("n")){
                notCount++;
            }
            if(str.substring(i,i+1).equals("s")&&str.substring(i-1,i).equals("i")){
                isCount++;
            }
        }
        if(isCount==notCount){
            return true;
        }else{
            return false;
        }
    }

    public static boolean only14(int[] nums) {
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=1&&nums[i]!=4){
                return false;
            }
        }
        return true;
    }

    public static boolean canBalance(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            leftSum+=nums[i];
            rightSum=0;
            for(int j=nums.length-1;j>i;j--){
                rightSum+=nums[j];
            }
            if(rightSum==leftSum){
                return true;
            }
        }
        return false;
    }

}
