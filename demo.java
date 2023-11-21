class calculator{
    int a = 5;
    int b= 20;
    public int multiply(){
        n1 nump1 = new n1();
        n2 nump2 = new n2();
        int r = nump1.p1() * nump2.p2();
        return r;
    }
}
class n1{
    int number1 = 100;
    public int p1(){
        return number1;
    }
}
class n2{
    int number2 = 990;
    public int p2(){
        return number2;
    }
}
class demoo{
    public static void main(String b[]){
        int num1 =5;
        int num2 = 10;
        calculator calc = new calculator();
        int result = calc.multiply();
        System.out.println(result);
        
    }
}