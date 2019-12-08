

public class RationalStatement extends Polinom{
    private int[] array2;

    public RationalStatement(){
        super();
        array2 = new int[3];
    }


    public RationalStatement(int n1, int n2){
        super(n1);
        array2 = new int[n2];
    }


    public int getArray(int nArray, int n) {
        if (nArray == 1) {
            if (array.length > n && n >= 0)
                return array[n];
            return -1;
        } else {
            if (array2.length > n && n >= 0)
                return array2[n];
            return -1;
        }
    }


    public void setArray(int nArray, int n, int data){
        if(nArray==1){
            if(array.length>n && n>=0)
                array[n] = data;
        } else if(nArray==2 && array2.length>n && n>=0 ){
                array2[n] = data;
        }
    }


    public String toString(int nArray){
        StringBuilder result = new StringBuilder();
        if(nArray==1){
        for(int i=0; i<array.length; i++){
            result.append(Integer.toString(array[i])).append("x^").append(Integer.toString(array.length - 1 - i));
        }
        return result.toString();}
        else{
            for(int i=0; i<array2.length; i++){
                result.append(Integer.toString(array2[i])).append("x^").append(Integer.toString(array2.length - 1 - i));
            }
            return result.toString();
        }
    }

    @MyAnnotation
    @Override
    public String toString(){

        String result = "";

        for(int i=0; i<array.length; i++){
                result = new StringBuilder().append(result).append(Integer.toString(array[i])).append("x^").append(Integer.toString(array.length - 1 - i)).toString();
            }
        result = result + " / ";
        for(int i=0; i<array2.length; i++){
            result = new StringBuilder().append(result).append(Integer.toString(array2[i])).append("x^").append(Integer.toString(array2.length - 1 - i)).toString();
        }

        return result;
    }







}
